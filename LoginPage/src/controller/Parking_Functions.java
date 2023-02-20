
package controller;
import Driver_info.GetandSet_Customers_info;
import Database_Connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import viewer.Main_Form;

public class Parking_Functions {
    
    public void Store_Hashed_password(GetandSet_Customers_info user_info) {
        try {
            
            Connection db_connect = ConnectDB.Connect_to_DB();
            String sql_cmd = "INSERT INTO admin_table (username, password) values (?,?)";
            PreparedStatement PS = db_connect.prepareStatement(sql_cmd);
            PS.setString(1, user_info.getRegistered_username());
            PS.setString(2, user_info.getHashed_pw());
            PS.executeUpdate();

        } 
        catch (Exception ex) {
            Logger.getLogger(Parking_Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Add(GetandSet_Customers_info user_info) {
        
        try {
             
            Connection db_connect = ConnectDB.Connect_to_DB();
            String sql_cmd = "INSERT INTO drivers_info (car_brand, plate_number, time_in, time_out, payment, date) values (?,?,?,?,?,?)";
            PreparedStatement PS = db_connect.prepareStatement(sql_cmd);
       
            PS.setString(1, user_info.getCar_Brand());
            PS.setString(2, user_info.getPlate_Number());
            PS.setString(3, user_info.getTime_IN());
            PS.setString(4, user_info.getTime_OUT());
            PS.setInt(5, user_info.getCash());
            PS.setString(6, user_info.getDate());
           
            PS.executeUpdate();
            JOptionPane.showMessageDialog(null, "Details has been added successfully!");
           
        } 
        catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Error! Please try again!");
            
        }
    }
    
    public void Update(GetandSet_Customers_info user_info) {
        try {
            
            Connection db_connect = ConnectDB.Connect_to_DB();
            String sql_cmd = "UPDATE drivers_info SET  plate_number = ?, car_brand = ?, time_in = ?, time_out = ?, payment = ?, date = ? WHERE driver_ID = ?";
            PreparedStatement PS = db_connect.prepareStatement(sql_cmd);
            PS.setString(1, user_info.getPlate_Number());
            PS.setString(2, user_info.getCar_Brand());
            PS.setString(3, user_info.getTime_IN());
            PS.setString(4, user_info.getTime_OUT());
            PS.setInt(5, user_info.getCash());
            PS.setString(6, user_info.getDate());
            PS.setInt(7, user_info.getDriver_id());
            PS.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully!");
        }
        catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Error! Please try again!");
        }
        
        
    }
    
    public GetandSet_Customers_info Search(int driver_id) {
         GetandSet_Customers_info Plate_num_info = new GetandSet_Customers_info();
        try {
           
            Connection db_connect = ConnectDB.Connect_to_DB();
            String sql_cmd = "SELECT * FROM drivers_info WHERE driver_ID = ?";
            PreparedStatement PS = db_connect.prepareStatement(sql_cmd);
            PS.setInt(1, driver_id);
            ResultSet res = PS.executeQuery();
            if(res.next()) {
                Plate_num_info.setPlate_Number(res.getString("plate_number"));
                Plate_num_info.setCar_Brand(res.getString("car_brand"));
                Plate_num_info.setTime_IN(res.getString("time_in"));
                Plate_num_info.setTime_OUT(res.getString("time_out"));
                Plate_num_info.setCash(res.getInt("payment"));
                Plate_num_info.setDate(res.getString("date"));
                
            }
           
        } 
        catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Error! Please try again!");
        }
        
      return Plate_num_info;
        
    }
    
     public void Delete(GetandSet_Customers_info user_info) {
        try {
            Connection db_connect = ConnectDB.Connect_to_DB();
            String sql_cmd = "DELETE FROM drivers_info WHERE driver_ID = ?";
            PreparedStatement PS = db_connect.prepareStatement(sql_cmd);
            PS.setInt(1, user_info.getDriver_id());
            JOptionPane.showMessageDialog(null, "Deleted Successfully!");
            PS.executeUpdate();
            
            
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error! Please try again!");
        }
            
     }
     
     public void Check_Duplicate_PlateNum (GetandSet_Customers_info user_info) {
        
     }
    
    public List<GetandSet_Customers_info> list() {
        
        List<GetandSet_Customers_info> list = new ArrayList<>();
            
        
        try {
            Connection db_connect = ConnectDB.Connect_to_DB();
            String sql_cmd = "SELECT * FROM drivers_info";
            PreparedStatement PS = db_connect.prepareStatement(sql_cmd);
            ResultSet res = PS.executeQuery();
            while(res.next()) {
                GetandSet_Customers_info var = new GetandSet_Customers_info();
                var.setDriver_id(res.getInt("driver_ID"));
                var.setCar_Brand(res.getString("car_brand"));
                var.setPlate_Number(res.getString("plate_number"));
                var.setTime_IN(res.getString("time_in"));
                var.setTime_OUT(res.getString("time_out"));
                var.setCash(res.getInt("payment"));
                var.setDate(res.getString("date"));
                list.add(var);
                
            }
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error! Please try again!");
        }
        return list;
        
        
    }
    
}


package controller;

import Driver_info.GetandSet_Customers_info;
import java.util.List;

public interface Parking_Interface {
    public void Password_Hash(GetandSet_Customers_info user_info);
    public void Add(GetandSet_Customers_info user_info);
    public void Update(GetandSet_Customers_info user_info);
    public void Delete(GetandSet_Customers_info user_info);
    public void Check_Duplicate_PlateNum(GetandSet_Customers_info user_info);
    public GetandSet_Customers_info Search(int driver_id);
    public List<GetandSet_Customers_info> list();
    
    
}

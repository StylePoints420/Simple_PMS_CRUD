
package Driver_info;


public class GetandSet_Customers_info {
    
    private String Car_Brand;
    private String Plate_Number;
    private String Time_IN;
    private String Time_OUT;
    private int Cash;
    private String registered_username;
    private String registered_pw;
    private String date;
    private int Driver_id;

    public int getDriver_id() {
        return Driver_id;
    }

    public void setDriver_id(int Driver_id) {
        this.Driver_id = Driver_id;
    }

    public String getRegistered_pw() {
        return registered_pw;
    }

    public void setRegistered_pw(String registered_pw) {
        this.registered_pw = registered_pw;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHashed_pw() {
        return registered_pw;
    }

    public void setHashed_pw(String registered_pw) {
        this.registered_pw = registered_pw;
    }
    
    public String getCar_Brand() {
        return Car_Brand;
    }

    public void setCar_Brand(String Car_Brand) {
        this.Car_Brand = Car_Brand;
    }

    public String getPlate_Number() {
        return Plate_Number;
    }

    public void setPlate_Number(String Plate_Number) {
        this.Plate_Number = Plate_Number;
    }

    public String getTime_IN() {
        return Time_IN;
    }

    public void setTime_IN(String Time_IN) {
        this.Time_IN = Time_IN;
    }

    public String getTime_OUT() {
        return Time_OUT;
    }

    public void setTime_OUT(String Time_OUT) {
        this.Time_OUT = Time_OUT;
    }

    public int getCash() {
        return Cash;
    }

    public void setCash(int Cash) {
        this.Cash = Cash;
    }

    public String getRegistered_username() {
        return registered_username;
    }

    public void setRegistered_username(String registered_username) {
        this.registered_username = registered_username;
    }

   
    
}

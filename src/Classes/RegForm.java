
package Classes;


public class RegForm {
    
    private int class_Room_Id ;
    private String class_Room_Number;
    private String location;
    private String seat_Capacity;

    public RegForm(int class_Room_Id, String class_Room_Number, String location, String seat_Capacity) {
        this.class_Room_Id = class_Room_Id;
        this.class_Room_Number = class_Room_Number;
        this.location = location;
        this.seat_Capacity = seat_Capacity;
    }

    public int getClass_Room_Id() {
        return class_Room_Id;
    }

    public void setClass_Room_Id(int class_Room_Id) {
        this.class_Room_Id = class_Room_Id;
    }

    public String getClass_Room_Number() {
        return class_Room_Number;
    }

    public void setClass_Room_Number(String class_Room_Number) {
        this.class_Room_Number = class_Room_Number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSeat_Capacity() {
        return seat_Capacity;
    }

    public void setSeat_Capacity(String seat_Capacity) {
        this.seat_Capacity = seat_Capacity;
    }
    
    

    
    
   
    
}

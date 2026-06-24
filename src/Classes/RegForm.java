
package Classes;


public class RegForm {
    
    private int classroom_id;
    private String room_no;
    private String location;
    private String seat_Capacity;

    public RegForm(int classroom_id, String room_no, String location, String seat_Capacity) {
        this.classroom_id = classroom_id;
        this.room_no = room_no;
        this.location = location;
        this.seat_Capacity = seat_Capacity;
    }

    public int getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(int classroom_id) {
        this.classroom_id = classroom_id;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
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

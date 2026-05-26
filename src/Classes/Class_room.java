package Classes;

public class Class_room {
    private int id;
    private String room_no;
    private String location;
    private String seating_capacity;

    public Class_room(int id, String room_no, String location, String seating_capacity) {
        this.id = id;
        this.room_no = room_no;
        this.location = location;
        this.seating_capacity = seating_capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSeating_capacity() {
        return seating_capacity;
    }

    public void setSeating_capacity(String seating_capacity) {
        this.seating_capacity = seating_capacity;
    }
    
}

package Classes;

public class Tutor {
    private String staffNo;
    private String firstName;
    private String lastName;
    private String address;
    private String dateEmployed;
    private String email;

    public Tutor(String staffNo, String firstName, String lastName, String address, String dateEmployed, String email) {
        this.staffNo = staffNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateEmployed = dateEmployed;
        this.email = email;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateEmployed() {
        return dateEmployed;
    }

    public void setDateEmployed(String dateEmployed) {
        this.dateEmployed = dateEmployed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


package Classes;

public class StudentDetails {
    private int id;
    private String student_id;
    private String s_name;
    private String address;
    private String qualification;

    public StudentDetails(int id, String student_id, String s_name, String address, String qualification) {
        this.id = id;
        this.student_id = student_id;
        this.s_name = s_name;
        this.address = address;
        this.qualification = qualification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}

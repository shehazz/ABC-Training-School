
package Classes;


public class Course {
    private int id;
    private String courseCode;
    private String courseName;
    private String courseDes;
    private String level;
    private String staffNo;
    private float courseFee;

    public Course(int id, String courseCode, String courseName, String courseDes, String level, String staffNo, float courseFee) {
        this.id = id;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseDes = courseDes;
        this.level = level;
        this.staffNo = staffNo;
        this.courseFee = courseFee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDes() {
        return courseDes;
    }

    public void setCourseDes(String courseDes) {
        this.courseDes = courseDes;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public float getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(float courseFee) {
        this.courseFee = courseFee;
    }


}

   
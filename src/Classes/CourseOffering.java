package Classes;

public class CourseOffering {

    private int id;
    private String offeringNo;
    private String startDate;
    private String tuitionFee;
    private String courseCode;
    private String classroomNo;

    // The required 6-argument constructor that matches your Java layout
    public CourseOffering(int id, String offeringNo, String startDate, String tuitionFee, String courseCode, String classroomNo) {
        this.id = id;
        this.offeringNo = offeringNo;
        this.startDate = startDate;
        this.tuitionFee = tuitionFee;
        this.courseCode = courseCode;
        this.classroomNo = classroomNo;
    }

    public CourseOffering() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOfferingNo() {
        return offeringNo;
    }

    public void setOfferingNo(String offeringNo) {
        this.offeringNo = offeringNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(String tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getClassroomNo() {
        return classroomNo;
    }

    public void setClassroomNo(String classroomNo) {
        this.classroomNo = classroomNo;
    }
    
}

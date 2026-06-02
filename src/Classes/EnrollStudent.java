
package Classes;

public class EnrollStudent {
    private int Student_ID;
    private int Offering_No;
    private String Enrollment_Date;
    private String Grade;

    public EnrollStudent(int Student_ID, int Offering_No, String Enrollment_Date, String Grade) {
        this.Student_ID = Student_ID;
        this.Offering_No = Offering_No;
        this.Enrollment_Date = Enrollment_Date;
        this.Grade = Grade;
    }

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int Student_ID) {
        this.Student_ID = Student_ID;
    }

    public int getOffering_No() {
        return Offering_No;
    }

    public void setOffering_No(int Offering_No) {
        this.Offering_No = Offering_No;
    }

    public String getEnrollment_Date() {
        return Enrollment_Date;
    }

    public void setEnrollment_Date(String Enrollment_Date) {
        this.Enrollment_Date = Enrollment_Date;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
    
}

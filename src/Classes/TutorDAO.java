package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TutorDAO {

    private Connection con;

    public TutorDAO() {
        this.con = new DBConnection().dbConn();
    }

    private void ensureConnection() throws SQLException {
        if (this.con == null || this.con.isClosed()) {
            this.con = new DBConnection().dbConn();
            if (this.con == null) {
                throw new SQLException("Database connection is not established. Please check if your MySQL server is running.");
            }
        }
    }

    public List<Tutor> getAllTutors() throws SQLException {
        ensureConnection();
        List<Tutor> list = new ArrayList<>();
        String sql = "SELECT * FROM tutor";
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String staffNo = rs.getString("StaffNo");
                String fullName = rs.getString("TName");
                String firstName = "";
                String lastName = "";
                if (fullName != null) {
                    int firstSpace = fullName.trim().indexOf(' ');
                    if (firstSpace >= 0) {
                        firstName = fullName.trim().substring(0, firstSpace);
                        lastName = fullName.trim().substring(firstSpace + 1);
                    } else {
                        firstName = fullName;
                    }
                }
                String address = rs.getString("Address");
                String email = rs.getString("Email");
                String dateEmployed = rs.getString("DateOfEmployment");
                
                list.add(new Tutor(staffNo, firstName, lastName, address, dateEmployed, email));
            }
        }
        return list;
    }

    public void addTutor(Tutor tutor) throws SQLException {
        ensureConnection();
        boolean hasStaffNo = tutor.getStaffNo() != null && !tutor.getStaffNo().trim().isEmpty();
        String sql = hasStaffNo
                ? "INSERT INTO tutor (StaffNo, TName, Address, Email, DateOfEmployment) VALUES (?, ?, ?, ?, ?)"
                : "INSERT INTO tutor (TName, Address, Email, DateOfEmployment) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            int index = 1;
            if (hasStaffNo) {
                ps.setInt(index++, Integer.parseInt(tutor.getStaffNo()));
            }
            ps.setString(index++, getFullName(tutor));
            ps.setString(index++, tutor.getAddress());
            ps.setString(index++, tutor.getEmail());
            ps.setString(index, tutor.getDateEmployed());
            ps.executeUpdate();

            if (!hasStaffNo) {
                try (ResultSet keys = ps.getGeneratedKeys()) {
                    if (keys.next()) {
                        tutor.setStaffNo(String.valueOf(keys.getInt(1)));
                    }
                }
            }
        }
    }

    public void updateTutor(String oldStaffNo, Tutor tutor) throws SQLException {
        ensureConnection();
        String sql = "UPDATE tutor SET StaffNo = ?, TName = ?, Address = ?, Email = ?, DateOfEmployment = ? WHERE StaffNo = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(tutor.getStaffNo()));
            ps.setString(2, getFullName(tutor));
            ps.setString(3, tutor.getAddress());
            ps.setString(4, tutor.getEmail());
            ps.setString(5, tutor.getDateEmployed());
            ps.setInt(6, Integer.parseInt(oldStaffNo));
            ps.executeUpdate();
        }
    }

    public void deleteTutor(String staffToDelete) throws SQLException {
        ensureConnection();
        String sql = "DELETE FROM tutor WHERE StaffNo = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(staffToDelete));
            ps.executeUpdate();
        }
    }

    private String getFullName(Tutor tutor) {
        return (tutor.getFirstName() + " " + tutor.getLastName()).trim();
    }
}

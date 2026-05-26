package Frames;

import Classes.DBConnection;
import Classes.Class_room;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Classroom extends javax.swing.JFrame {
    
    Connection con = new DBConnection().dbConn();
    DefaultTableModel model = new DefaultTableModel(new String[]{"Id", "Room No", "Location", "Seating Capacity"}, 0);    

    public Classroom() {
        initComponents();
        jTable1.setModel(model);
        setDefault();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtroom_no = new javax.swing.JTextField();
        txtlocation = new javax.swing.JTextField();
        txts_capacity = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblr_no = new javax.swing.JLabel();
        lbllocation = new javax.swing.JLabel();
        lbls_capacity = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(204, 0, 51));

        jLabel1.setText("Room Number");

        jLabel2.setText("Location");

        jLabel3.setText("Seating Capacity");

        btnSave.setText("Save");
        btnSave.addActionListener(this::btnSaveActionPerformed);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(this::btnUpdateActionPerformed);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(this::btnCancelActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room No", "Location", "Seating Capacity"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblr_no.setForeground(new java.awt.Color(204, 0, 51));

        lbllocation.setForeground(new java.awt.Color(204, 0, 51));

        lbls_capacity.setForeground(new java.awt.Color(204, 0, 51));

        btnClear.setText("Clear");
        btnClear.addActionListener(this::btnClearActionPerformed);

        btnSearch.setText("Search");
        btnSearch.addActionListener(this::btnSearchActionPerformed);

        jButton1.setText("Assign Class Room");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Class Room Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(550, 550, 550))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(btnSave)
                        .addGap(48, 48, 48)
                        .addComponent(btnUpdate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblr_no, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtroom_no, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtlocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbllocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(148, 148, 148))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear)
                                .addGap(60, 60, 60)
                                .addComponent(btnSearch)
                                .addGap(59, 59, 59)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txts_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbls_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txts_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtroom_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbllocation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblr_no, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbls_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear)
                    .addComponent(btnSearch)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        loadSelectedData();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchData();
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Classroom().setVisible(true));
    }
    
    private void saveData() {
        String rNo = txtroom_no.getText().trim();
        String location = txtlocation.getText().trim();
        String sCapacity = txts_capacity.getText().trim();


        if (!validateAllCourseData(rNo, location, sCapacity, false, 0)) {
            return;
        }

        try {

            // If Validation Pass, Registered Student
            String query = "INSERT INTO classroom(room_no, location, seating_capacity) VALUES (?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, rNo);
            pst.setString(3, location);
            pst.setString(4, sCapacity);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Registered Successfully!");
            pst.close();
            clearData();
            setDefault();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "DB Error: " + e.getMessage());
        }
    }
    
    private ArrayList<Class_room> getCourseList(String query) {

        //Create a list to store all course objects
        ArrayList<Class_room> CourseList = new ArrayList<>();

        //Declare database tools
        PreparedStatement pst;
        ResultSet rs;

        try {
            //Prepare SQL Query safely
            pst = con.prepareStatement(query);

            //Execute query and get results from database
            rs = pst.executeQuery();

            //Loop through each row in ResultSet
            while (rs.next()) {

                //Create CourseDetails object for each row
                Class_room classroom = new Class_room(
                        rs.getInt("id"),
                        rs.getString("room_no"),
                        rs.getString("location"),
                        rs.getString("seating_capacity")
                );

                CourseList.add(classroom);

            }
            //Close ResultSet (free memory)
            rs.close();

            //Close PreparedStatement
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return CourseList;

    }
    
    //Set data to table
    private void setClassTableData(String query) {

        //Clear exiting table data (avoid duplicates)
        model.setRowCount(0);

        //Get course list from database
        ArrayList<Class_room> courses = getCourseList(query);

        //Loop through each course in List
        for (Class_room classroom : courses) {

            //Add each student as a row in JTable
            model.addRow(new Object[]{
                classroom.getId(),
                classroom.getRoom_no(),
                classroom.getLocation(),
                classroom.getSeating_capacity()
            });
        }

    }
    
    private void setDefault() {
        String query = "SELECT * FROM classroom";

        setClassTableData(query);

    }
    
    //Load selected row data
    private void loadSelectedData() {

        //Get the selected row index from JTable
        //If user clicked first row -> 0
        //If nothing selected -> -1
        int row = jTable1.getSelectedRow();

        //Get student id from column 1 and set to text field
        txtroom_no.setText(model.getValueAt(row, 2).toString());
        txtlocation.setText(model.getValueAt(row, 3).toString());
        txts_capacity.setText(model.getValueAt(row, 4).toString());
    }
    
    private void updateData() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to Update", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int id = (int) model.getValueAt(selectedRow, 0);
        String rNo = txtroom_no.getText().trim();
        String location = txtlocation.getText().trim();
        String sCapacity = txts_capacity.getText().trim();

        if (!validateAllCourseData(rNo, location, sCapacity, false, 0)) {
            return;
        }
        
        try {

            String query = "UPDATE classroom SET room_no=?, location=?, seating_capacity=? WHERE id=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, rNo);
            pst.setString(3, location);
            pst.setString(4, sCapacity);
            pst.setInt(5, id);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Updated Successfully!");
            pst.close();
            clearData();
            setDefault();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "DB Error: " + e.getMessage());
        }
    }
    
    private void deleteData() {

        //check if exactly one row is selected in JTable
        if (jTable1.getSelectedRowCount() == 1) {

            //Get selected row index
            int index = jTable1.getSelectedRow();

            //Get selected name from column 2 (For confirmation message)
            String name = (String) model.getValueAt(index, 2);

            //Show Confirmaion dialog box
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to delete " + name + "?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION
            );

            //If user clicks yes
            if (confirm == JOptionPane.YES_OPTION) {

                try {

                    //SQL query to delete course by id
                    String query = "DELETE FROM classroom WHERE id = ?";

                    //Prepare Statement
                    PreparedStatement pst = con.prepareStatement(query);

                    //
                    pst.setString(1, model.getValueAt(index, 0).toString());

                    //Execute Delete
                    pst.execute();

                    //
                    JOptionPane.showMessageDialog(this, "Deleted Successfully");

                    //Refresh table
                    setDefault();

                    //pst close
                    pst.close();

                } catch (Exception e) {
                    //show error message
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                }

            } else {
                //If no row selected
                JOptionPane.showMessageDialog(this, "Please select a row to delete");
            }
            setDefault();

        }
    }
    
    //Clear data
    private void clearData() {
        txtroom_no.setText("");
        txtlocation.setText("");
        txts_capacity.setText("");

        jTable1.clearSelection();
        clearErrorLabels();
    }
    
    //Search Data
    private void searchData() {

        //Get text from search field
        String room_no = txtroom_no.getText().trim();
        String location = txtlocation.getText().trim();
        String seating_capacity = txts_capacity.getText().trim();

        //If search box is empty -> load all data
        if (room_no.isEmpty() && location.isEmpty() && seating_capacity.isEmpty()) {
            setDefault();
            return;     //stop here
        }

        //search query
        String query = "SELECT * FROM classroom WHERE 1=1";

        if (!room_no.isEmpty()) {
            query += " AND st_no LIKE '%" + room_no + "%'";
        }
        if (!location.isEmpty()) {
            query += " AND st_name LIKE '%" + location + "%'";
        }
        if (!seating_capacity.isEmpty()) {
            query += " AND co_name LIKE '%" + seating_capacity + "%'";
        }

        //Load filtered data
        setClassTableData(query);
    }
    
    private void clearErrorLabels() {
        lblr_no.setVisible(false);
        lbllocation.setVisible(false);
        lbls_capacity.setVisible(false);
    }

    private boolean validateAllCourseData(String rNo, String location, String sCapacity, boolean isUpdateMode, int currentId) {
        clearErrorLabels();
        boolean isValid = true;
        
        // Check Empty Fields
        if (rNo.equals("")) {
            lblr_no.setText("Please enter a Room Number!");
            lblr_no.setVisible(true);
            isValid = false;
        }
        if (location.equals("")) {
            lbllocation.setText("Please enter a class location!");
            lbllocation.setVisible(true);
            isValid = false;
        }
        if (sCapacity.trim().isEmpty()) {
            lbls_capacity.setText("Please enter a seat capacity!");
            lbls_capacity.setVisible(true);
            isValid = false;
        }
        
        if (!isValid) {
            return false;
        }
        
        
        //Check, match the Student No Format
        String roomNoPattern = "ST-\\d{4}";

        if (!rNo.trim().toUpperCase().matches(roomNoPattern)) {
            lblr_no.setText("Invalid Room Number Format! \nEx: C-0001");
            lblr_no.setVisible(true);
            txtroom_no.selectAll();
            txtroom_no.requestFocus();
            isValid = false;
        }

        if (!isValid) {
            return false;
        }
        
        // Duplicate Check
        try {
            String query = "SELECT id FROM classroom WHERE st_no = ?";
            if (isUpdateMode) {
                query += " AND id != ?";
            }

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, rNo.trim().toUpperCase());
            if (isUpdateMode) {
                pst.setInt(2, currentId);
            }

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                lblr_no.setText(rNo +" is already exists!.\nPlease use a unique Room No");
                lblr_no.setVisible(true);
                txtroom_no.requestFocus();
                txtroom_no.selectAll();
                rs.close();
                pst.close();
                isValid = false;
            }

            rs.close();
            pst.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "DB Error: " + e.getMessage());
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbllocation;
    private javax.swing.JLabel lblr_no;
    private javax.swing.JLabel lbls_capacity;
    private javax.swing.JTextField txtlocation;
    private javax.swing.JTextField txtroom_no;
    private javax.swing.JTextField txts_capacity;
    // End of variables declaration//GEN-END:variables
}

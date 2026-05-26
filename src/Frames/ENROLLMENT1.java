package Frames;

import Classes.DBConnection;
import Classes.EnrollStudent;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

  

    public class ENROLLMENT1 extends javax.swing.JFrame {

        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ENROLLMENT1.class.getName());
        Connection con = new DBConnection().dbConn();
        DefaultTableModel model = new DefaultTableModel(new String[]{"Student ID", "Offering No", "Enrollment Date","Grade",}, 0);

        public ENROLLMENT1() {
            initComponents();
            setDefault();
            tabale.setModel(model);
            
            jButton3.setText("UPDATE");
            jButton3.addActionListener(this::jButton3ActionPerformed);
            
           
            jButton5.setText("DELETE");
            jButton5.addActionListener(this::jButton5ActionPerformed);
            
            jButton6.setText("CLEAR");
            jButton6.addActionListener(this::jButton6ActionPerformed);
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jToolBar1 = new javax.swing.JToolBar();
        jToolBar2 = new javax.swing.JToolBar();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        StudentID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        OfferingNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Grade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabale = new javax.swing.JTable();

        jButton4.setText("jButton4");

        jToolBar1.setRollover(true);

        jToolBar2.setRollover(true);

        jButton7.setText("jButton7");

        jLabel1.setText("jLabel1");

        jLabel4.setText("jLabel4");

        jScrollPane3.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" ENROLLMENT SYSTEM ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Student ID:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Offering No: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText(" Enrollment Date:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Grade (Optional): ");

        jButton1.setText("ENROLL STUDENT");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton3.setText("UPDATE");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton5.setText("DELETE");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jButton6.setText("CLEAR");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OfferingNo)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(StudentID)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Date)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
            .addComponent(Grade)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OfferingNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Grade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Search");

        tabale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabaleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabale);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InsertData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabaleMouseClicked
       loadSelectedCourse();
    }//GEN-LAST:event_tabaleMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         UpdateData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DeleteData();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Clear();
    }//GEN-LAST:event_jButton6ActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
                logger.log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> new ENROLLMENT1().setVisible(true));
        }

        private void InsertData() {

    String studentIDStr = StudentID.getText().trim();
    String offeringNoStr = OfferingNo.getText().trim();
    String enrollDateStr = Date.getText().trim();
    String gradeStr = Grade.getText().trim();

   
    if (studentIDStr.isEmpty() || offeringNoStr.isEmpty() || enrollDateStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please include all mandatory information!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    PreparedStatement pstmt = null;
    String sql = "INSERT INTO Enrollment (Student_ID, Offering_No, Enrollment_Date, Grade) VALUES (?, ?, ?, ?)";

    try {
       
        int studentID = Integer.parseInt(studentIDStr);
        int offeringNo = Integer.parseInt(offeringNoStr);

        
        if (studentID <= 0 || offeringNo <= 0) {
            JOptionPane.showMessageDialog(this, "Student ID and Offering No must be positive numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); 
        
        java.util.Date parsedDate = sdf.parse(enrollDateStr);
        java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());

       
        pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, studentID);
        pstmt.setInt(2, offeringNo);
        pstmt.setDate(3, sqlDate);

        if (gradeStr.isEmpty()) {
            pstmt.setNull(4, java.sql.Types.VARCHAR);
        } else {
            pstmt.setString(4, gradeStr);
        }

        int rowsInserted = pstmt.executeUpdate();

        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Student registered successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

           
            StudentID.setText("");
            OfferingNo.setText("");
            Date.setText("");
            Grade.setText("");
        }

    } catch (NumberFormatException numEx) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for ID and Offering No!", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (java.text.ParseException dateEx) {
        
        JOptionPane.showMessageDialog(this, "Invalid date or format! Please enter a valid date in YYYY-MM-DD format.", "Date Error", JOptionPane.ERROR_MESSAGE);
    } catch (java.sql.SQLException ex) {
        
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (pstmt != null) {
                pstmt.close();
                setDefault(); 
            }
        } catch (java.sql.SQLException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
        private ArrayList<EnrollStudent> getEnrollmentList(String query) {
            ArrayList<EnrollStudent> EnrollmentList = new ArrayList<>();

            PreparedStatement pst;
            ResultSet rs;

            try {
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();

                while (rs.next()) {

                    EnrollStudent ENR = new EnrollStudent(
                            rs.getInt("Student_ID"),
                            rs.getInt("Offering_No"),
                            rs.getString("Enrollment_Date"),
                            rs.getString("Grade")
                    );
                    EnrollmentList.add(ENR);

                }

                rs.close();

                pst.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error" + e.getMessage());

            }
            return EnrollmentList;
        }

        private void EnrollmentDetails(String query) {
            model.setRowCount(0);
            ArrayList<EnrollStudent> Enrollment = getEnrollmentList(query);

            for (EnrollStudent ENR : Enrollment) {
                model.addRow(new Object[]{
                    ENR.getStudent_ID(),
                    ENR.getOffering_No(),
                    ENR.getEnrollment_Date(),
                    ENR.getGrade()
                });

            }
        }

    

    private void setDefault() {
        String query = "SELECT * from enrollment";
       EnrollmentDetails(query);
    }
    
    private void loadSelectedCourse() {
        int row = tabale.getSelectedRow();
        
        if (row == -1) {
        return; 
    }
        
        StudentID.setText(model.getValueAt(row, 0).toString());
        OfferingNo.setText(model.getValueAt(row, 1).toString());
        Date.setText(model.getValueAt(row, 2).toString());
        Object gradeValue = model.getValueAt(row, 3);
        Grade.setText(gradeValue != null ? gradeValue.toString() : "");
        
        
    
    }
    
    private void UpdateData() {
    String studentIDStr = StudentID.getText().trim();
    String offeringNoStr = OfferingNo.getText().trim();
    String enrollDateStr = Date.getText().trim();
    String gradeStr = Grade.getText().trim();

   
    if (studentIDStr.isEmpty() || offeringNoStr.isEmpty() || enrollDateStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a record from the table to update!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    PreparedStatement pstmt = null;
   
    String sql = "UPDATE Enrollment SET Enrollment_Date = ?, Grade = ? WHERE Student_ID = ? AND Offering_No = ?";

    try {
     
        int studentID = Integer.parseInt(studentIDStr);
        int offeringNo = Integer.parseInt(offeringNoStr);

      
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); 
        
        java.util.Date parsedDate = sdf.parse(enrollDateStr);
        java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());

        pstmt = con.prepareStatement(sql);
        
      
        pstmt.setDate(1, sqlDate);

        
        if (gradeStr.isEmpty()) {
            pstmt.setNull(2, java.sql.Types.VARCHAR);
        } else {
            pstmt.setString(2, gradeStr);
        }

        pstmt.setInt(3, studentID);
        pstmt.setInt(4, offeringNo);

        int rowsUpdated = pstmt.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Enrollment updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

          
            StudentID.setText("");
            OfferingNo.setText("");
            Date.setText("");
            Grade.setText("");
        } else {
            
            JOptionPane.showMessageDialog(this, "Record not found in the database!", "Update Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException numEx) {
        JOptionPane.showMessageDialog(this, "Invalid ID or Offering No format!", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (java.text.ParseException dateEx) {
        JOptionPane.showMessageDialog(this, "Invalid date format! Please use YYYY-MM-DD.", "Date Error", JOptionPane.ERROR_MESSAGE);
    } catch (java.sql.SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (pstmt != null) {
                pstmt.close();
                setDefault(); 
            }
        } catch (java.sql.SQLException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
    
    private void DeleteData() {
    String studentIDStr = StudentID.getText().trim();
    String offeringNoStr = OfferingNo.getText().trim();

    
    if (studentIDStr.isEmpty() || offeringNoStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a record from the table to delete!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    int dialogResult = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete this enrollment record?", 
            "Warning", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE);
            
    if (dialogResult != JOptionPane.YES_OPTION) {
        return;
    }

    PreparedStatement pstmt = null;
    
    String sql = "DELETE FROM Enrollment WHERE Student_ID = ? AND Offering_No = ?";

    try {
        int studentID = Integer.parseInt(studentIDStr);
        int offeringNo = Integer.parseInt(offeringNoStr);

        pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, studentID);
        pstmt.setInt(2, offeringNo);

        int rowsDeleted = pstmt.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Enrollment record deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            
            StudentID.setText("");
            OfferingNo.setText("");
            Date.setText("");
            Grade.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Record not found in the database!", "Delete Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException numEx) {
        JOptionPane.showMessageDialog(this, "Invalid ID or Offering No format!", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (java.sql.SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (pstmt != null) {
                pstmt.close();
                setDefault(); 
            }
        } catch (java.sql.SQLException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
    
 


private void Clear() {                                         
    StudentID.setText("");
    OfferingNo.setText("");
    Date.setText("");
    Grade.setText("");
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Grade;
    private javax.swing.JTextField OfferingNo;
    private javax.swing.JTextField StudentID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable tabale;
    // End of variables declaration//GEN-END:variables
}

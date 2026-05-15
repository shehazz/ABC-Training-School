package Frames;

import Classes.DBConnection;
import Classes.StudentDetails;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.sql.ResultSet;

public class MainFrame extends javax.swing.JFrame {

    Connection con = new DBConnection().dbConn();
    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "First Name", "Last Name"}, 0);

    public MainFrame() {
        initComponents();
        tbMain.setModel(model);
        setDefault();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfFname = new javax.swing.JTextField();
        tfLname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIns = new javax.swing.JButton();
        btnUpd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMain = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("AB Training School");

        tfFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFnameActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("First Name :");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Last Name :");

        btnIns.setText("Insert");
        btnIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsActionPerformed(evt);
            }
        });

        btnUpd.setText("Update");
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        tbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMain);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(174, 174, 174))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfLname, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnIns)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpd))
                            .addComponent(tfFname, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnDel)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIns)
                    .addComponent(btnUpd)
                    .addComponent(btnDel)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFnameActionPerformed

    private void btnInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsActionPerformed
        insertData();
    }//GEN-LAST:event_btnInsActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        updateStudent();
    }//GEN-LAST:event_btnUpdActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        deleteStudent();
    }//GEN-LAST:event_btnDelActionPerformed

    private void tbMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMainMouseClicked
        loadSelectedStudents();
    }//GEN-LAST:event_tbMainMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearSelection();
    }//GEN-LAST:event_btnClearActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void insertData() {
        String firstName = tfFname.getText().trim();
        String lastName = tfLname.getText().trim();

        String query = "INSERT INTO student (first_name,last_name) VALUES (?,?)";

        try {

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, firstName);
            pst.setString(2, lastName);

            pst.executeUpdate();

            System.out.println("Student Added Successfuly..!");
            
            pst.close();

        } catch (Exception e) {
        }
    }

    private ArrayList<StudentDetails> getStudentList(String query) {

        ArrayList<StudentDetails> studentlist = new ArrayList<>();

        PreparedStatement pst;
        ResultSet rs;

        try {

            pst = con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {

                StudentDetails student = new StudentDetails(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name")
                );

                studentlist.add(student);

            }

            rs.close();

            pst.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Error" + e.getMessage());

        }

        return studentlist;

    }

    private void setStudentsDetails(String query) {

        model.setRowCount(0);

        ArrayList<StudentDetails> students = getStudentList(query);

        for (StudentDetails student : students) {

            model.addRow(new Object[]{
                student.getId(),
                student.getFirst_name(),
                student.getLast_name()
            });
        }

    }

    private void setDefault() {

        String query = "SELECT * FROM student";

        setStudentsDetails(query);
    }

    private void loadSelectedStudents() {

        int row = tbMain.getSelectedRow();

        tfFname.setText(model.getValueAt(row, 1).toString());

        tfLname.setText(model.getValueAt(row, 2).toString());
    }

    private void updateStudent() {

        if (tbMain.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please Select a row to Update",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);

            return;
        }

        if (tbMain.getSelectedRowCount() == 1) {

            int index = tbMain.getSelectedRow();

            String fName = tfFname.getText().trim();
            String lName = tfLname.getText().trim();

            try {
                String query = "UPDATE student SET first_name=?, last_name=? WHERE id=?";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, fName);
                pst.setString(2, lName);

                pst.setString(3, model.getValueAt(index, 0).toString());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Details Updated..!");

                setDefault();

                pst.close();
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(this, e.getMessage());
                
            }

        } else {
            
            JOptionPane.showMessageDialog(this, "Please Select a row");
        }
    }
    
    private void deleteStudent() {
        
        if (tbMain.getSelectedRowCount() == 1) {
            
            int index = tbMain.getSelectedRow();
            
            String name = (String) model.getValueAt(index, 1);
            
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to delete " + name + "?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (confirm == JOptionPane.YES_OPTION) {
                
                try {
                    String query = "DELETE FROM student WHERE id=?";
                    
                    PreparedStatement pst = con.prepareStatement(query);
                    
                    pst.setString(1, model.getValueAt(index, 0).toString());
                    
                    pst.executeUpdate();
                    
                    setDefault();
                    
                    pst.close();
                    
                } catch (Exception e) {
                    
                    JOptionPane.showMessageDialog(this, "Error" + e.getMessage());
                    
                }
            }
        } else {
            
            JOptionPane.showMessageDialog(this, "Please Select a row to Delete");
            
        }
    }
    
    private void clearSelection() {
        
        tfFname.setText(null);
        tfLname.setText(null);
        tbMain.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnIns;
    private javax.swing.JButton btnUpd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMain;
    private javax.swing.JTextField tfFname;
    private javax.swing.JTextField tfLname;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Classes.DBConnection;
import Classes.RegForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class class_room extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(class_room.class.getName());
    Connection con = new DBConnection().dbConn();
    DefaultTableModel model = new DefaultTableModel(new String[]{"Class Room ID", "Class Room Number", "Location", "Seat Capacity"}, 0);

    /**
     * Creates new form RegFormGUI
     */
    public class_room() {
        initComponents();
        tf_DetailView.setModel(model);
        setDefault();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_location = new javax.swing.JTextField();
        tf_classrooomnumber = new javax.swing.JTextField();
        insertBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_DetailView = new javax.swing.JTable();
        clearBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_seatcapacity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Location");

        jLabel2.setText("Class Room Number");

        tf_location.addActionListener(this::tf_locationActionPerformed);

        insertBtn.setBackground(new java.awt.Color(204, 255, 204));
        insertBtn.setText("Insert");
        insertBtn.addActionListener(this::insertBtnActionPerformed);

        updateBtn.setBackground(new java.awt.Color(204, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(this::updateBtnActionPerformed);

        deleteBtn.setBackground(new java.awt.Color(255, 153, 153));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(this::deleteBtnActionPerformed);

        tf_DetailView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Seat Capacity"
            }
        ));
        tf_DetailView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_DetailViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tf_DetailView);

        clearBtn.setBackground(new java.awt.Color(204, 204, 204));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(this::clearBtnActionPerformed);

        jLabel3.setText("Seat Capacity");

        tf_seatcapacity.addActionListener(this::tf_seatcapacityActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CLASSROOM ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_classrooomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_location, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_seatcapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(226, 226, 226))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_seatcapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGap(133, 133, 133))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_classrooomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_locationActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        updateNames();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        insertData();

    }//GEN-LAST:event_insertBtnActionPerformed

    private void tf_DetailViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_DetailViewMouseClicked
        loadSelectedNames();
    }//GEN-LAST:event_tf_DetailViewMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        deleteNames();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearSelection();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void tf_seatcapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_seatcapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_seatcapacityActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new class_room().setVisible(true));
    }

    private void insertData() {
        String classroomnumber = tf_classrooomnumber.getText().trim();
        String location = tf_location.getText().trim();

        String seatcapacity = tf_seatcapacity.getText().trim();

        if (location.isEmpty() || classroomnumber.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No Fields Detected.Please Fill all Fields",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        String query = "INSERT INTO classroom (class_Room_Number,location,seat_Capacity) VALUES (?,?,?)";

        try {

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, classroomnumber);
            pst.setString(2, location);
            pst.setString(3, seatcapacity);

            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Added Successfully");
            setDefault();
            pst.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private ArrayList<RegForm> getRegList(String quary) {

        ArrayList<RegForm> RegForm = new ArrayList<>();

        PreparedStatement pst;
        ResultSet rs;

        try {
            pst = con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {

                RegForm student = new RegForm(
                        rs.getInt("class_Room_Id"),
                        rs.getString("class_Room_Number"),
                        rs.getString("location"),
                        rs.getString("seat_Capacity")
                );
                RegForm.add(student);
            }
            return RegForm;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
        }
        return null;

    }

    private void setRegList(String query) {

        model.setRowCount(0);

        ArrayList<RegForm> RegForm = getRegList(query);

        for (RegForm reg : RegForm) {
            model.addRow(new Object[]{
                reg.getClass_Room_Id(),
                reg.getClass_Room_Number(),
                reg.getLocation(),
                reg.getSeat_Capacity()

            });
        }
    }

    private void setDefault() {
        String query = "SELECT * FROM classroom";

        setRegList(query);
    }

    private void loadSelectedNames() {

        int row = tf_DetailView.getSelectedRow();

        tf_classrooomnumber.setText(model.getValueAt(row, 1).toString());
        tf_location.setText(model.getValueAt(row, 2).toString());
        tf_seatcapacity.setText(model.getValueAt(row, 3).toString());

    }

    private void updateNames() {

        if (tf_DetailView.getSelectedRowCount() != 1) {

            JOptionPane.showMessageDialog(this,
                    "Please Select a row First",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        if (tf_DetailView.getSelectedRowCount() == 1) {

            int index = tf_DetailView.getSelectedRow();

            String location = tf_classrooomnumber.getText().trim();
            String classroomnumber = tf_location.getText().trim();

            String seatcapacity = tf_seatcapacity.getText().trim();

            String query = "UPDATE classroom SET class_Room_Number = ?,location = ?,seat_Capacity = ? WHERE class_Room_Id = ? ";

            try {
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, classroomnumber);
                pst.setString(2, location);
                pst.setString(3, seatcapacity);
                pst.setString(4, model.getValueAt(index, 0).toString());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Student Updated Successfully");

                setDefault();

                pst.close();

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
            }
        } else {

            JOptionPane.showMessageDialog(this, "Please Select a Row");
        }
    }

    private void deleteNames() {

        if (tf_DetailView.getSelectedRowCount() == 1) {

            int index = tf_DetailView.getSelectedRow();

            String name = (String) model.getValueAt(index, 2);

            int conform = JOptionPane.showConfirmDialog(this, "Are You Sure about Delete this data",
                    "Comform Delete",
                    JOptionPane.YES_NO_OPTION);

            if (conform == JOptionPane.YES_OPTION) {

                try {

                    String query = "DELETE FROM classroom WHERE class_Room_Id =?";

                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, model.getValueAt(index, 0).toString());

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Data Deleted Succussfully");

                    setDefault();

                    pst.close();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
                }
            }
        } else {

            JOptionPane.showMessageDialog(this, "Please Select a row First");
        }
    }

    private void clearSelection() {

        tf_DetailView.clearSelection();

        tf_location.setText(null);

        tf_classrooomnumber.setText(null);

        tf_seatcapacity.setText(null);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tf_DetailView;
    private javax.swing.JTextField tf_classrooomnumber;
    private javax.swing.JTextField tf_location;
    private javax.swing.JTextField tf_seatcapacity;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}

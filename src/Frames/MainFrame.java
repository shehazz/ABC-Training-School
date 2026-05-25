package Frames;

import Classes.DBConnection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Classes.CourseOffering;

public class MainFrame extends javax.swing.JFrame {

    Connection con = new DBConnection().dbConn();
    DefaultTableModel model = new DefaultTableModel(new String[]{"id", "Batch_No", "Start Date", "Course", "Tuition Fee", "Class Allocation"}, 0);

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());

    public MainFrame() {
        if (con == null) {
            con = new DBConnection().dbConn();
        }

        initComponents();

        tblAddBatch.setModel(model);

        setDefault();

        populateCourseComboBox();
        setupComboBoxListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfBatchNo = new javax.swing.JTextField();
        tfStartDate = new javax.swing.JTextField();
        tfTuitFee = new javax.swing.JTextField();
        tfClassAlloc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddBatch = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cbxSelectCourse = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("New Batch Entry");

        jLabel1.setText("Batch Number");

        jLabel2.setText("Select Course");

        jLabel3.setText("Starting Date");

        jLabel4.setText("Tuition Fee");

        jLabel5.setText("Classroom Allocation");

        tfBatchNo.addActionListener(this::tfBatchNoActionPerformed);

        tfStartDate.addActionListener(this::tfStartDateActionPerformed);

        tblAddBatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAddBatchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAddBatch);

        jButton1.setText("Add");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Update");

        jButton3.setText("Remove");

        jButton4.setText("Search");

        jButton5.setText("Clear");

        cbxSelectCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(574, 574, 574))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jButton1)
                .addGap(98, 98, 98)
                .addComponent(jButton2)
                .addGap(98, 98, 98)
                .addComponent(jButton3)
                .addGap(92, 92, 92)
                .addComponent(jButton4)
                .addGap(92, 92, 92)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(83, 83, 83)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfStartDate)
                        .addComponent(cbxSelectCourse, 0, 280, Short.MAX_VALUE))
                    .addComponent(tfBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTuitFee)
                    .addComponent(tfClassAlloc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(tfTuitFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxSelectCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfClassAlloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Batch", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insertData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfBatchNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBatchNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBatchNoActionPerformed

    private void tfStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStartDateActionPerformed

    private void tblAddBatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddBatchMouseClicked
        loadSelectedBatches();
    }//GEN-LAST:event_tblAddBatchMouseClicked

    public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }

    public void insertData() {
        String batchNo = tfBatchNo.getText().trim();
        String course = (String) cbxSelectCourse.getSelectedItem();
        String startDate = tfStartDate.getText().trim();
        String tuitFee = tfTuitFee.getText().trim();
        String classAlloc = tfClassAlloc.getText().trim();

        String query = "INSERT INTO course_offering (offering_no, start_date, tuition_fee, course_code, class_room_no) VALUES (?,?,?,?,?)";

        try {

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, batchNo);
            pst.setString(2, startDate);
            pst.setString(3, tuitFee);
            pst.setString(4, course);
            pst.setString(5, classAlloc);

            pst.execute();
            JOptionPane.showMessageDialog(this, "New Batch Started Successfully");
            setDefault();
            pst.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ArrayList<CourseOffering> getBatchList(String query) {
        ArrayList<CourseOffering> batchList = new ArrayList<>();
        PreparedStatement pst;
        ResultSet rs;

        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                // Updated to use the EXACT database column names from your screenshot
                CourseOffering batch = new CourseOffering(
                        rs.getInt("id"),
                        rs.getString("offering_no"),
                        rs.getString("start_date"),
                        rs.getString("tuition_fee"),
                        rs.getString("course_code"),
                        rs.getString("class_room_no")
                );
                batchList.add(batch);
            }

            rs.close();
            pst.close();

        } catch (Exception e) {
            e.printStackTrace(); // Never leave catch blocks completely empty while debugging!
        }
        return batchList;
    }

    private void setDefault() {

        String query = "SELECT * FROM course_offering";

        setBatchDetails(query);
    }
    
    private void loadSelectedBatches() {
        
        int row = tblAddBatch.getSelectedRow();
        
        cbxSelectCourse.setSelectedItem(model.getValueAt(row, 3).toString());
                
        tfBatchNo.setText(model.getValueAt(row, 1).toString());
        
        tfStartDate.setText(model.getValueAt(row, 2).toString());
        
        tfTuitFee.setText(model.getValueAt(row, 4).toString());
        
        tfClassAlloc.setText(model.getValueAt(row, 5).toString());
    }

    private void setBatchDetails(String query) {

        model.setRowCount(0);

        ArrayList<CourseOffering> batch = getBatchList(query);

        for (CourseOffering batches : batch) {
            model.addRow(new Object[]{
                batches.getId(),
                batches.getOfferingNo(),
                batches.getStartDate(),
                batches.getCourseCode(),
                batches.getTuitionFee(),
                batches.getClassroomNo()
            });
        }
    }

    public void populateCourseComboBox() {
        String query = "SELECT course_code FROM course";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            cbxSelectCourse.removeAllItems();
            cbxSelectCourse.addItem("Select");
            while (rs.next()) {
                cbxSelectCourse.addItem(rs.getString("course_code"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void setupComboBoxListener() {
        cbxSelectCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCourse = (String) cbxSelectCourse.getSelectedItem();

                // If "Select" or empty is chosen, clear the fields
                if (selectedCourse == null || selectedCourse.equals("Select")) {
                    tfTuitFee.setText("");
                    tfBatchNo.setText("");
                    return;
                }

                // 1. Automatically update the Batch Number text field with the course prefix
                // This leaves room for you to type a batch identifier or number right next to it
                tfBatchNo.setText(selectedCourse + "-");

                // 2. Query the database to fetch the tuition fee
                String query = "SELECT tuition_fee FROM course WHERE course_code = ?";
                try {
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setString(1, selectedCourse);
                    ResultSet rs = pstmt.executeQuery();

                    if (rs.next()) {
                        double fee = rs.getDouble("tuition_fee");
                        tfTuitFee.setText(String.valueOf(fee));
                    }
                    rs.close();
                    pstmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSelectCourse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAddBatch;
    private javax.swing.JTextField tfBatchNo;
    private javax.swing.JTextField tfClassAlloc;
    private javax.swing.JTextField tfStartDate;
    private javax.swing.JTextField tfTuitFee;
    // End of variables declaration//GEN-END:variables
}

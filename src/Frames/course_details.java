
package Frames;
import Classes.Course;
import java.sql.Connection;
import Classes.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class course_details extends javax.swing.JFrame {
    Connection con = new DBConnection().dbConn();
    DefaultTableModel model = new DefaultTableModel (new String[] {"ID","Course Code","Course Name","Course Description","Level","Tutor","Course Fee"},0);
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(course_details.class.getName());

    
    public course_details() {
        initComponents();
        jTable1.setModel(model);
        setDefault();
        loadTutor();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfCoCode = new javax.swing.JTextField();
        tfCoDesc = new javax.swing.JTextField();
        tfCoName = new javax.swing.JTextField();
        tfLevel = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonUp = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        lblCoDes = new javax.swing.JLabel();
        lblCoName = new javax.swing.JLabel();
        jButDelete = new javax.swing.JButton();
        jButtClear = new javax.swing.JButton();
        jButSearch = new javax.swing.JButton();
        lblLevel = new javax.swing.JLabel();
        jLabCoFee = new javax.swing.JLabel();
        tfCoFees = new javax.swing.JTextField();
        lblCoFee = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Course ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Details"));

        jLabel2.setText("Course Code");

        jLabel3.setText("Course Name");

        jLabel4.setText("Course Description");

        jLabel5.setText("Level");

        jLabel6.setText("Tutor");

        tfCoDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCoDescFocusLost(evt);
            }
        });
        tfCoDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCoDescKeyReleased(evt);
            }
        });

        tfCoName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCoNameFocusLost(evt);
            }
        });
        tfCoName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCoNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCoNameKeyTyped(evt);
            }
        });

        tfLevel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLevelFocusLost(evt);
            }
        });
        tfLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfLevelKeyReleased(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Tutor", "Amodh", "Dasula" }));

        jButtonUp.setText("UPDATE");
        jButtonUp.addActionListener(this::jButtonUpActionPerformed);

        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(this::jButtonAddActionPerformed);

        lblCoDes.setForeground(new java.awt.Color(255, 0, 0));
        lblCoDes.setText(" ");

        lblCoName.setForeground(new java.awt.Color(255, 0, 0));
        lblCoName.setText(" ");

        jButDelete.setText("DELETE");
        jButDelete.addActionListener(this::jButDeleteActionPerformed);

        jButtClear.setText("CLEAR");
        jButtClear.addActionListener(this::jButtClearActionPerformed);

        jButSearch.setText("SEARCH");
        jButSearch.addActionListener(this::jButSearchActionPerformed);

        lblLevel.setForeground(new java.awt.Color(255, 0, 0));
        lblLevel.setText(" ");

        jLabCoFee.setText("Course Fee");

        tfCoFees.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCoFeesFocusLost(evt);
            }
        });
        tfCoFees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCoFeesKeyReleased(evt);
            }
        });

        lblCoFee.setForeground(new java.awt.Color(255, 0, 0));
        lblCoFee.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jButtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCoFee, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                                        .addComponent(jLabCoFee, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfCoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfCoName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCoDes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(lblCoName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCoCode, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCoFees, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCoCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(lblCoName)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoDes)
                    .addComponent(lblLevel))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCoFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabCoFee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCoFee)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfCoName, tfLevel});

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course Code", "Course Name", "Course Description", "Level", "Tutor", "Course Fee"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
       insertData();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        loadSelectedCourse();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpActionPerformed
       updateCourse();
    }//GEN-LAST:event_jButtonUpActionPerformed

    private void jButtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtClearActionPerformed
        clearData();
    }//GEN-LAST:event_jButtClearActionPerformed

    private void jButDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDeleteActionPerformed
        deleteStudent();
    }//GEN-LAST:event_jButDeleteActionPerformed

    private void jButSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSearchActionPerformed
        searchCourse();
    }//GEN-LAST:event_jButSearchActionPerformed

    private void tfCoNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCoNameFocusLost
        isValidate();
    }//GEN-LAST:event_tfCoNameFocusLost

    private void tfCoNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCoNameKeyReleased
        isValidate();
    }//GEN-LAST:event_tfCoNameKeyReleased

    private void tfCoDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCoDescFocusLost
        isValidate();
    }//GEN-LAST:event_tfCoDescFocusLost

    private void tfCoDescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCoDescKeyReleased
        isValidate();
    }//GEN-LAST:event_tfCoDescKeyReleased

    private void tfLevelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLevelFocusLost
        isValidate();
    }//GEN-LAST:event_tfLevelFocusLost

    private void tfLevelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLevelKeyReleased
        isValidate();
    }//GEN-LAST:event_tfLevelKeyReleased

    private void tfCoNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCoNameKeyTyped
        updateCourseNo();
    }//GEN-LAST:event_tfCoNameKeyTyped

    private void tfCoFeesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCoFeesKeyReleased
        isValidate();
    }//GEN-LAST:event_tfCoFeesKeyReleased

    private void tfCoFeesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCoFeesFocusLost
        isValidate();
    }//GEN-LAST:event_tfCoFeesFocusLost

    
    public static void main(String args[]) {
       
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

       
        java.awt.EventQueue.invokeLater(() -> new course_details().setVisible(true));
    }

    private void insertData() {
        String courseCode = tfCoCode.getText().trim();
        String courseName = tfCoName.getText().trim();
        String courseDes = tfCoDesc.getText().trim();
        String level = tfLevel.getText().trim();
        String selectedStaffNo = jComboBox1.getSelectedItem().toString();
        float courseFee = Float.parseFloat(tfCoFees.getText().trim());
       
              isDuplicate(courseCode,courseName,courseDes,level,selectedStaffNo,courseFee);
              String query = "INSERT into course(course_code,course_name,description,level,staff_no,course_fee) VALUES (?,?,?,?,?,?)";

            try {
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, courseCode);
                pst.setString(2, courseName);
                pst.setString(3, courseDes);
                pst.setString(4, level);
                pst.setString(5, selectedStaffNo);
                pst.setFloat(6, courseFee);
           
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Course is added Succesfully");
                pst.close();

            } catch (Exception e) {
                 JOptionPane.showMessageDialog(this, e.getMessage());
            }
        setDefault();
    }
    
    private boolean isCourseExists(String courseName) {
        boolean exists = false;
        try {
            String query = "SELECT staff_no FROM course WHERE staff_no = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, courseName);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                exists = true;
            }
            pst.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return exists;
    }
    private void loadTutor() {

        try {
            String query = "SELECT DISTINCT staff_no FROM tutor";
            ResultSet rs = con.createStatement().executeQuery(query);

            jComboBox1.removeAllItems();
            jComboBox1.addItem("Select Tutor No");

            while (rs.next()) {
                jComboBox1.addItem(rs.getString("staff_no"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
     
    }
    
    private ArrayList<Course> getCoursetList(String query) {

        ArrayList<Course> coursetList = new ArrayList<>();

        PreparedStatement pst;
        ResultSet rs;

        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {

                Course course = new Course(
                        rs.getInt("course_id"),
                        rs.getString("course_code"),
                        rs.getString("course_name"),
                        rs.getString("description"),
                        rs.getString("level"),
                        rs.getString("staff_no"),
                        rs.getFloat("course_fee")
                );

                coursetList.add(course);

            }

            rs.close();
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return coursetList;

    }

    private void setCourseTableData(String query) {

        model.setRowCount(0);
        ArrayList<Course> cources = getCoursetList(query);

        for (Course course : cources) {

            model.addRow(new Object[]{
                course.getId(),
                course.getCourseCode(),
                course.getCourseName(),
                course.getCourseDes(),
                course.getLevel(),
                course.getStaffNo(),
                course.getCourseFee()
            });
        }

    }

    private void setDefault() {
        String query = "SELECT * FROM course";

        setCourseTableData(query);

    }

    private void loadSelectedCourse() {

        int row = jTable1.getSelectedRow();

        tfCoCode.setText(model.getValueAt(row, 1).toString());
        tfCoName.setText(model.getValueAt(row, 2).toString());
        tfCoDesc.setText(model.getValueAt(row, 3).toString());
        tfLevel.setText(model.getValueAt(row, 4).toString());
        String tableStaffNo = model.getValueAt(row, 5).toString(); 
        jComboBox1.setSelectedItem(tableStaffNo);
        tfCoFees.setText(model.getValueAt(row, 6).toString());
    }
    
    private void updateCourse() {

        if (jTable1.getSelectedRowCount() != 1) {

            JOptionPane.showMessageDialog(
                    this, "Please select a row to update",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
            return;

        }
        if (jTable1.getSelectedRowCount() == 1) {

            int index = jTable1.getSelectedRow();
            
            String courseCode = tfCoCode.getText().trim();
            String courseName = tfCoName.getText().trim();
            String courseDes = tfCoDesc.getText().trim();
            String level = tfLevel.getText().trim();
            String selectedStaffNo = jComboBox1.getSelectedItem().toString();
            float courseFee = Float.parseFloat(tfCoFees.getText().trim());
           

            String query = "UPDATE course set course_code =? , course_name =?, description =? , level =?, staff_no =? , course_fee =? WHERE course_id =? ";

            try {
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, courseCode);
                pst.setString(2, courseName);
                pst.setString(3, courseDes);
                pst.setString(4, level);
                pst.setString(5, selectedStaffNo);
                pst.setFloat(6, courseFee);

                pst.setString(7, model.getValueAt(index, 0).toString());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Course Updated Successfully");

                setDefault();

                pst.close();

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }

        } else {

            JOptionPane.showMessageDialog(this, "Please select arow to update");

        }

        setDefault();

    }

    private void deleteStudent() {

        if (jTable1.getSelectedRowCount() == 1) {

            int index = jTable1.getSelectedRow();

            String name = (String) model.getValueAt(index, 1);

            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to delete " + name + "?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {

                try {

                    String query = "DELETE FROM course WHERE course_id = ?";

                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, model.getValueAt(index, 0).toString());
                    pst.execute();
                    JOptionPane.showMessageDialog(this, "Course Deleted Successfully");

                    setDefault();
                    pst.close();

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                }

            }

        } else {

            JOptionPane.showMessageDialog(this, "Please select arow to delete");
        }
    }
    
    private void clearData(){
            
            tfCoCode.setText("");
            tfCoName.setText("");
            tfCoDesc.setText("");
            tfLevel.setText("");
            jComboBox1.setSelectedIndex(0);
            tfCoFees.setText("");
            
            jTable1.clearSelection();
            
    }
    
    private void searchCourse() {

        String searchTerm = tfCoCode.getText().trim();

               if (searchTerm.isEmpty()) {
                setDefault();
                return;     
        }

         String query = "SELECT * FROM course WHERE "
                + "course_code LIKE '%" + searchTerm + "%' ";
               
            setCourseTableData(query);
    }
   
   public boolean isValidate() {
        if (tfCoName.getText().isEmpty()) {
            lblCoName.setText("Can not be Empty.");
            jButtonAdd.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^[A-Z][a-z]*( [A-Z][a-z]*)*$", tfCoName.getText())) {
            lblCoName.setText("Enter Valid Course Name (Ex: Cookery)");
            jButtonAdd.setEnabled(false);
            return false;
        } else {
            lblCoName.setText("");
            jButtonAdd.setEnabled(true);
        }

        
        if (tfCoDesc.getText().isEmpty()) {
            lblCoDes.setText("Can not be Empty.");
            jButtonAdd.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^[a-zA-Z0-9\\s\\.,\\-\\(\\)!?]{10,250}$", tfCoDesc.getText())) {
            lblCoDes.setText("Enter Valid Description");
            jButtonAdd.setEnabled(false);
            return false;
        } else {
            lblCoDes.setText("");
            jButtonAdd.setEnabled(true);
        }

        if (tfLevel.getText().isEmpty()) {
            lblLevel.setText("Can not be Empty.");
            jButtonAdd.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^\\d+\\s?(levels|Levels)$", tfLevel.getText().trim())) {
            lblLevel.setText("Enter Valid Level (eg : 4 Levels)");
            jButtonAdd.setEnabled(false);
            return false;
        } else {
            lblLevel.setText("");
            jButtonAdd.setEnabled(true);
        }
        
        if (tfCoFees.getText().isEmpty()) {
            lblCoFee.setText("Can not be Empty.");
            jButtonAdd.setEnabled(false);
            return false;
        } else if (!Pattern.matches("^\\d+(\\.\\d{1,2})?$", tfCoFees.getText().trim())) {
            lblCoFee.setText("Enter Valid Course Fee");
            jButtonAdd.setEnabled(false);
            return false;
        } else {
            lblCoFee.setText("");
            jButtonAdd.setEnabled(true);
        }
        
      return false;
    }

    private boolean isDuplicate(String courseCode, String courseName, String courseDes, String level, String staffNo,Float courseFee) {
        boolean exists = false;
        String checkQuery = "SELECT COUNT(*) FROM course WHERE course_code=? AND course_name=? AND description=? AND level=? AND staff_no=? AND course_fee=?";
        try (PreparedStatement pstCheck = con.prepareStatement(checkQuery)) {
            
                   
            pstCheck.setString(1, courseCode);
            pstCheck.setString(2, courseName);
            pstCheck.setString(3, courseDes);
            pstCheck.setString(4, level);
            pstCheck.setString(5, staffNo);
            pstCheck.setFloat(6,courseFee);
           
            ResultSet rs = pstCheck.executeQuery();
            if (rs.next()) {
                exists = rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            System.out.println("Check Error: " + e.getMessage());
        }
        return exists;
    }
    
     private void updateCourseNo() {
        String courseName = tfCoName.getText().trim();

        if (courseName.isEmpty()) {
            tfCoName.setText("");
            return;
        }

        String[] words = courseName.split(" ");
        StringBuilder prefix = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                prefix.append(Character.toUpperCase(word.charAt(0)));
            }
        }

        int nextId = 1;
        try {
            String query = "SELECT COUNT(*) FROM course";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nextId = rs.getInt(1) + 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

        tfCoCode.setText(String.format("%s%04d", prefix.toString(), nextId));
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButDelete;
    private javax.swing.JButton jButSearch;
    private javax.swing.JButton jButtClear;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonUp;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabCoFee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCoDes;
    private javax.swing.JLabel lblCoFee;
    private javax.swing.JLabel lblCoName;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JTextField tfCoCode;
    private javax.swing.JTextField tfCoDesc;
    private javax.swing.JTextField tfCoFees;
    private javax.swing.JTextField tfCoName;
    private javax.swing.JTextField tfLevel;
    // End of variables declaration//GEN-END:variables
}

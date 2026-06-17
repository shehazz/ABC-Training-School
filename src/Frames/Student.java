package Frames;

import Classes.DBConnection;
import Classes.StudentDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Student extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Student.class.getName());
    Connection con = new DBConnection().dbConn();
    DefaultTableModel model = new DefaultTableModel(new String[]{"Subject", "Grade"}, 0);
    DefaultTableModel model1 = new DefaultTableModel(new String[]{"ID", "Student ID", "Student Name", "Address", "Qualifiacation"}, 0);

    public Student() {
        initComponents();
        subTable.setModel(model);
        Stu_Table.setModel(model1);
        loadcomboboxoption();
        loadSearchCombo();
        loadsubject("selected");
        setupTableGradeListener();
        setDefault();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Stu_Table = new javax.swing.JTable();
        cmbSearch = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFstu_name = new javax.swing.JTextField();
        LBL_address_error2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFstu_id = new javax.swing.JTextField();
        LBL_address_error1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFstu_address = new javax.swing.JTextField();
        LBL_address_error3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSubjectCount = new javax.swing.JLabel();
        LBL_qulification_error = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        subTable = new javax.swing.JTable();
        cmbQualification = new javax.swing.JComboBox<>();
        LBL_address_error4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ABC Training School");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        Stu_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Stu_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stu_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Stu_Table);

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student ID", "Student Name " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(cmbSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Name");

        LBL_address_error2.setForeground(new java.awt.Color(255, 0, 0));
        LBL_address_error2.setText(" ");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student ID");

        TFstu_id.setEditable(false);
        TFstu_id.setText("STU-1001");

        LBL_address_error1.setForeground(new java.awt.Color(255, 0, 0));
        LBL_address_error1.setText(" ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Address");

        LBL_address_error3.setForeground(new java.awt.Color(255, 0, 0));
        LBL_address_error3.setText(" ");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Qualification");

        lblSubjectCount.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        lblSubjectCount.setText("Select a qualification above");

        LBL_qulification_error.setForeground(new java.awt.Color(255, 0, 0));
        LBL_qulification_error.setText(" ");

        jToggleButton1.setText("ADD");
        jToggleButton1.addActionListener(this::jToggleButton1ActionPerformed);

        jButton1.setText("UPDATE");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setText("DELETE");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton3.setText("CLEAR");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        subTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(subTable);

        cmbQualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbQualification.addItemListener(this::cmbQualificationItemStateChanged);

        LBL_address_error4.setForeground(new java.awt.Color(255, 0, 0));
        LBL_address_error4.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFstu_name, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_address_error2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFstu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_address_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFstu_address, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_address_error3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblSubjectCount, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LBL_qulification_error, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbQualification, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(LBL_address_error4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(245, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFstu_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(LBL_address_error2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFstu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(LBL_address_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFstu_address, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cmbQualification)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBL_address_error3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_qulification_error, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubjectCount, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addComponent(LBL_address_error4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(414, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 1286, 1286, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 750, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        insertstudent();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            updatestudent();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            deletestudent();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            clearfield();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbQualificationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbQualificationItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selected = (String) cmbQualification.getSelectedItem();

            if (selected != null) {
                model.setRowCount(0); // Clear previous subjects

                // 2. Only load if a valid qualification is picked
                if (!selected.equals("-- Select Qualification --")) {
                    loadsubject(selected);
                    lblSubjectCount.setText("Subjects Loaded: " + model.getRowCount());
                } else {
                    lblSubjectCount.setText("Select a qualification above");
                }
            }
        }
    }//GEN-LAST:event_cmbQualificationItemStateChanged

    private void Stu_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stu_TableMouseClicked
        loadselectstudent();
    }//GEN-LAST:event_Stu_TableMouseClicked

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        
    }//GEN-LAST:event_jButton2KeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Student().setVisible(true));
    }

    public void loadcomboboxoption() {
        cmbQualification.removeAllItems();
        cmbQualification.addItem("-- Select Qualification --");
        cmbQualification.addItem("O/L");
        cmbQualification.addItem("A/L - Physical Science");
        cmbQualification.addItem("A/L - Biological Science");
        cmbQualification.addItem("A/L - Commerce");
        cmbQualification.addItem("A/L - Arts");
        cmbQualification.addItem("A/L - Technology");
        cmbQualification.addItem("Diploma");
        cmbQualification.addItem("Degree");

        String selected = (String) cmbQualification.getSelectedItem();
        loadsubject(selected);
    }

    public void loadsubject(String selected) {
        switch (selected) {
            case "O/L":
                model.addRow(new Object[]{"Mathematics", ""});
                model.addRow(new Object[]{"Science", ""});
                model.addRow(new Object[]{"English", ""});
                model.addRow(new Object[]{"History", ""});
                model.addRow(new Object[]{"Commerce", ""});
                model.addRow(new Object[]{"Religion", ""});
                model.addRow(new Object[]{"ICT", ""});
                break;

            case "A/L - Physical Science":
                model.addRow(new Object[]{"Combined Maths", ""});
                model.addRow(new Object[]{"Physics", ""});
                model.addRow(new Object[]{"Chemistry", ""});
                model.addRow(new Object[]{"Biology", ""});
                model.addRow(new Object[]{"eneral English", ""});
                break;

            case "A/L - Biological Science":
                model.addRow(new Object[]{"Biology", ""});
                model.addRow(new Object[]{"Chemistry", ""});
                model.addRow(new Object[]{"Physics", ""});
                model.addRow(new Object[]{"General English", ""});
                break;

            case "A/L - Commerce":
                model.addRow(new Object[]{"Business Studies", ""});
                model.addRow(new Object[]{"Accounting", ""});
                model.addRow(new Object[]{"Economics", ""});
                model.addRow(new Object[]{"General English", ""});
                break;

            case "A/L - Arts":
                model.addRow(new Object[]{"History", ""});
                model.addRow(new Object[]{"Geography", ""});
                model.addRow(new Object[]{"Political Science", ""});
                model.addRow(new Object[]{"Literature", ""});
                model.addRow(new Object[]{"General English", ""});
                break;

            case "A/L - Technology":
                model.addRow(new Object[]{"Engineering Technology", ""});
                model.addRow(new Object[]{"Science for Technology", ""});
                model.addRow(new Object[]{"ICT", ""});
                model.addRow(new Object[]{"General English", ""});
                break;
            case "Diploma":
                model.addRow(new Object[]{"IT Fundamentals", ""});
                model.addRow(new Object[]{"Networking", ""});
                model.addRow(new Object[]{"Database Systems", ""});
                break;

            case "Degree":
                model.addRow(new Object[]{"Software Engineering", ""});
                model.addRow(new Object[]{"Data Structures", ""});
                model.addRow(new Object[]{"Operating Systems", ""});
                model.addRow(new Object[]{"Computer Networks", ""});
                break;
        }
    }

    public void setupTableGradeListener() {
        // Listen for changes made inside the subTable
        model.addTableModelListener(new javax.swing.event.TableModelListener() {

            public void tableChanged(javax.swing.event.TableModelEvent e) {
                // Check if the change was an UPDATE to a cell
                if (e.getType() == javax.swing.event.TableModelEvent.UPDATE) {
                    int row = e.getFirstRow();
                    int column = e.getColumn();

                    // Column 1 is the "Marks(0-100)" column
                    if (column == 1) {
                        try {
                            Object marksValue = model.getValueAt(row, 1);

                            if (marksValue != null && !marksValue.toString().trim().isEmpty()) {
                                int marks = Integer.parseInt(marksValue.toString().trim());

                                // Validate mark range (0-100)
                                if (marks >= 0 && marks <= 100) {
                                    String grade = calGrade(marks);

                                    // Temporarily remove listener to prevent infinite loop
                                    model.removeTableModelListener(this);

                                    model.setValueAt(grade, row, 2); // Set the Grade

                                    model.addTableModelListener(this); // Re-attach
                                } else {
                                    javax.swing.JOptionPane.showMessageDialog(null, "Please enter a value between 0 and 100");
                                    model.setValueAt("", row, 1);
                                }
                            }
                        } catch (NumberFormatException ex) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Please enter a valid numeric mark");

                            model.removeTableModelListener(this);
                            model.setValueAt("", row, 1);
                            model.setValueAt("", row, 2);
                            model.addTableModelListener(this);
                        }
                    }
                }
            }
        });
    }

    public String calGrade(int marks) {
        if (marks >= 75) {
            return "A";
        } else if (marks >= 55) {
            return "B";
        } else if (marks >= 35) {
            return "C";
        } else {
            return "F";
        }
    }

    private void insertstudent() {
        String stName = TFstu_name.getText().trim();
        String stID = TFstu_id.getText().trim();
        String staddress = TFstu_address.getText().trim();
        String stqualification = cmbQualification.getSelectedItem().toString();

        String query = "INSERT INTO `student`(student_id, s_name, address, qualification) VALUES (?,?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, stID);
            pst.setString(2, stName);
            pst.setString(3, staddress);
            pst.setString(4, stqualification);

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(this, "Student is Added");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
    }

    private ArrayList<StudentDetails> getstudentlist(String query) {

        ArrayList<StudentDetails> studentlist = new ArrayList<>();

        PreparedStatement pst;
        ResultSet rs;

        try {
            pst = con.prepareStatement(query);

            rs = pst.executeQuery();

            while (rs.next()) {
                StudentDetails student = new StudentDetails(
                        rs.getInt("id"),
                        rs.getString("student_id"),
                        rs.getString("s_name"),
                        rs.getString("address"),
                        rs.getString("qualification")
                );
                studentlist.add(student);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }

        return studentlist;
    }

    private void setstudent(String query) {
        model1.setRowCount(0);

        ArrayList<StudentDetails> studentdetails = getstudentlist(query);

        for (StudentDetails student : studentdetails) {
            model1.addRow(new Object[]{
                student.getId(),
                student.getStudent_id(),
                student.getS_name(),
                student.getAddress(),
                student.getQualification()
            });
        }
    }

    private void setDefault() {
        String query = "SELECT * FROM student";
        setstudent(query);
    }

    private void loadselectstudent() {
        int row = Stu_Table.getSelectedRow();
        TFstu_name.setText(model1.getValueAt(row, 1).toString());
        TFstu_id.setText(model1.getValueAt(row, 2).toString());
        TFstu_address.setText(model1.getValueAt(row, 3).toString());
        cmbQualification.setSelectedItem(model1.getValueAt(row, 4).toString());
    }

    private void updatestudent() {
        int selectedRow = Stu_Table.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this,
                    "Please select a row to update",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String name = TFstu_name.getText().trim();
        String id = TFstu_id.getText().trim();
        String address = TFstu_address.getText().trim();
        String qualification = cmbQualification.getSelectedItem().toString();

        // Get the primary key (id column 0) from the selected row
        String primaryKey = model1.getValueAt(selectedRow, 0).toString();

        String query = "UPDATE student SET student_id=?, s_name=?, address=?, qualification=? WHERE id=?";

        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, address);
            pst.setString(4, qualification);
            pst.setString(5, primaryKey);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Student Updated Successfully");
            setDefault();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void deletestudent() {
        int selectedRow = Stu_Table.getSelectedRow();

        // Check if a row is selected
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this,
                    "Please select a row to delete",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get student name from column 2 (for confirm message)
        String name = model1.getValueAt(selectedRow, 2).toString();

        // Show confirmation dialog
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete " + name + "?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Get primary key from column 0
            String primaryKey = model1.getValueAt(selectedRow, 0).toString();

            String query = "DELETE FROM student WHERE id = ?";

            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, primaryKey);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Student Deleted Successfully");
                setDefault();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }
    
    private void loadSearchCombo() {
    cmbSearch.removeAllItems();
    cmbSearch.addItem("-- Search By --");
    cmbSearch.addItem("Student ID");
    cmbSearch.addItem("Student Name");
    }
    
    private void searchStudent() {
    String searchterm = tfSearch.getText().trim();
    String searchBy   = cmbSearch.getSelectedItem().toString();

    // If search box is empty, load all students
    if (searchterm.isEmpty()) {
        setDefault();
        return;
    }

    String query;

    switch (searchBy) {
        case "Student ID":
            query = "SELECT * FROM student WHERE student_id LIKE '%" + searchterm + "%'";
            break;

        case "Student Name":
            query = "SELECT * FROM student WHERE s_name LIKE '%" + searchterm + "%'";
            break;

        default:
            // "-- Search By --" or anything else, search all columns
            query = "SELECT * FROM student WHERE "
                    + "student_id LIKE '%" + searchterm + "%' OR "
                    + "s_name LIKE '%" + searchterm + "%'";
                   
            break;
    }

    setstudent(query);
}
    private void clearfield() {
    TFstu_name.setText("");
    TFstu_id.setText("");
    TFstu_address.setText("");
    cmbQualification.setSelectedItem("-- Select Qualification --");
    Stu_Table.clearSelection();
    model.setRowCount(0);
    lblSubjectCount.setText("Select a qualification above");
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_address_error1;
    private javax.swing.JLabel LBL_address_error2;
    private javax.swing.JLabel LBL_address_error3;
    private javax.swing.JLabel LBL_address_error4;
    private javax.swing.JLabel LBL_qulification_error;
    private javax.swing.JTable Stu_Table;
    private javax.swing.JTextField TFstu_address;
    private javax.swing.JTextField TFstu_id;
    private javax.swing.JTextField TFstu_name;
    private javax.swing.JComboBox<String> cmbQualification;
    private javax.swing.JComboBox<String> cmbSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblSubjectCount;
    private javax.swing.JTable subTable;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}

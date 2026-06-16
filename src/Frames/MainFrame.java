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
import java.util.regex.Pattern;

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

        tutor1 = new Frames.tutor();
        tutor2 = new Frames.tutor();
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
        btnAddBatch = new javax.swing.JButton();
        btnUpdateBatch = new javax.swing.JButton();
        btnRemoveBatch = new javax.swing.JButton();
        btnSearchBatch = new javax.swing.JButton();
        btnClearBatch = new javax.swing.JButton();
        cbxSelectCourse = new javax.swing.JComboBox<>();
        lblbatchNo = new javax.swing.JLabel();
        lblstDate = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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

        btnAddBatch.setText("Add");
        btnAddBatch.addActionListener(this::btnAddBatchActionPerformed);

        btnUpdateBatch.setText("Update");
        btnUpdateBatch.addActionListener(this::btnUpdateBatchActionPerformed);

        btnRemoveBatch.setText("Remove");
        btnRemoveBatch.addActionListener(this::btnRemoveBatchActionPerformed);

        btnSearchBatch.setText("Search");

        btnClearBatch.setText("Clear");
        btnClearBatch.addActionListener(this::btnClearBatchActionPerformed);

        cbxSelectCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        lblbatchNo.setText("jLabel19");
        lblbatchNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblbatchNoKeyReleased(evt);
            }
        });

        lblstDate.setText("jLabel20");
        lblstDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblstDateKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(574, 574, 574))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btnAddBatch)
                        .addGap(98, 98, 98)
                        .addComponent(btnUpdateBatch)
                        .addGap(98, 98, 98)
                        .addComponent(btnRemoveBatch)
                        .addGap(92, 92, 92)
                        .addComponent(btnSearchBatch)
                        .addGap(92, 92, 92)
                        .addComponent(btnClearBatch))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(83, 83, 83)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblstDate, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblbatchNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addComponent(tfBatchNo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addComponent(cbxSelectCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(133, 133, 133)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblbatchNo)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblstDate)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBatch)
                    .addComponent(btnUpdateBatch)
                    .addComponent(btnRemoveBatch)
                    .addComponent(btnSearchBatch)
                    .addComponent(btnClearBatch))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Batch", jPanel3);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Course ");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Details"));

        jLabel13.setText("Course Code");

        jLabel14.setText("Course Name");

        jLabel15.setText("Course Description");

        jLabel16.setText("Level");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCoFee, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCoDesc)
                                    .addComponent(tfCoName)
                                    .addComponent(jComboBox1, 0, 280, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabCoFee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCoDes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblCoName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCoCode, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCoFees, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(91, 91, 91))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfCoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCoCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(lblCoName)
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfCoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoDes)
                    .addComponent(lblLevel))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCoFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabCoFee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCoFee)
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jTabbedPane1.addTab("Add Course", jPanel1);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel4.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tutor list", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel6.setToolTipText("Tutor list");

        jTable2.setBackground(new java.awt.Color(102, 102, 102));
        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tutor details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Staff No");

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("First Name");

        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Address");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Last Name");

        jTextField4.addActionListener(this::jTextField4ActionPerformed);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Date employed");

        jTextField5.addActionListener(this::jTextField5ActionPerformed);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Email");

        jTextField6.addActionListener(this::jTextField6ActionPerformed);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Tutor", jPanel4);

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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1350, 730);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBatchActionPerformed
        insertData();
    }//GEN-LAST:event_btnAddBatchActionPerformed

    private void tblAddBatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddBatchMouseClicked
        loadSelectedBatches();
    }//GEN-LAST:event_tblAddBatchMouseClicked

    private void tfStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStartDateActionPerformed

    private void tfBatchNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBatchNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBatchNoActionPerformed

    private void tfCoDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCoDescFocusLost
//        isValidate();
    }//GEN-LAST:event_tfCoDescFocusLost

    private void tfCoDescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCoDescKeyReleased
//        isValidate();
    }//GEN-LAST:event_tfCoDescKeyReleased

    private void tfCoNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCoNameFocusLost
//        isValidate();
    }//GEN-LAST:event_tfCoNameFocusLost

    private void tfCoNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCoNameKeyReleased
//        isValidate();
    }//GEN-LAST:event_tfCoNameKeyReleased

    private void tfCoNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCoNameKeyTyped
//        updateCourseNo();
    }//GEN-LAST:event_tfCoNameKeyTyped

    private void tfLevelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLevelFocusLost
//        isValidate();
    }//GEN-LAST:event_tfLevelFocusLost

    private void tfLevelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLevelKeyReleased
//        isValidate();
    }//GEN-LAST:event_tfLevelKeyReleased

    private void jButtonUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpActionPerformed
//        updateCourse();
    }//GEN-LAST:event_jButtonUpActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        insertData();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDeleteActionPerformed
//        deleteStudent();
    }//GEN-LAST:event_jButDeleteActionPerformed

    private void jButtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtClearActionPerformed
//        clearData();
    }//GEN-LAST:event_jButtClearActionPerformed

    private void jButSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSearchActionPerformed
//        searchCourse();
    }//GEN-LAST:event_jButSearchActionPerformed

    private void tfCoFeesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCoFeesFocusLost
//        isValidate();
    }//GEN-LAST:event_tfCoFeesFocusLost

    private void tfCoFeesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCoFeesKeyReleased
//        isValidate();
    }//GEN-LAST:event_tfCoFeesKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//        loadSelectedCourse();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnClearBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearBatchActionPerformed
        clearSelections();
    }//GEN-LAST:event_btnClearBatchActionPerformed

    private void btnUpdateBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBatchActionPerformed
        updateBatch();
    }//GEN-LAST:event_btnUpdateBatchActionPerformed

    private void btnRemoveBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveBatchActionPerformed
        deleteStudent();
    }//GEN-LAST:event_btnRemoveBatchActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void lblbatchNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblbatchNoKeyReleased
        isValidate();
    }//GEN-LAST:event_lblbatchNoKeyReleased

    private void lblstDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblstDateKeyReleased
        isValidate();
    }//GEN-LAST:event_lblstDateKeyReleased

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
            
            if (isDuplicate(stNo, stName, coName)) {
            JOptionPane.showMessageDialog(this, "This student record already exists for this course!", "Duplicate Entry", JOptionPane.ERROR_MESSAGE);
            return; // Stop the execution
        }

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
    
    private boolean isDuplicate(String stNo, String name, String course) {
        boolean exists = false;
        String checkQuery = "SELECT COUNT(*) FROM st_registration WHERE st_no = ? AND st_name = ? AND co_name = ?";

        try (PreparedStatement pstCheck = con.prepareStatement(checkQuery)) {
            pstCheck.setString(1, stNo);
            pstCheck.setString(2, name);
            pstCheck.setString(3, course);

            ResultSet rs = pstCheck.executeQuery();
            if (rs.next()) {
                exists = rs.getInt(1) > 0; // Returns true if count is more than 0
            }
        } catch (Exception e) {
            System.out.println("Check Error: " + e.getMessage());
        }
        return exists;
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

    private void updateBatch() {

        if (tblAddBatch.getSelectedRowCount() != 1) {

            JOptionPane.showMessageDialog(this, "Please Select a row to Update!");

            return;

        }

        if (tblAddBatch.getSelectedRowCount() == 1) {

            int index = tblAddBatch.getSelectedRow();

            String batchNo = tfBatchNo.getText().trim();
            String stDate = tfStartDate.getText().trim();
            String courseCode = (String) cbxSelectCourse.getSelectedItem();
            String tuitFee = tfTuitFee.getText().trim();
            String clsAlloc = tfClassAlloc.getText().trim();

            try {
                String query = "UPDATE course_offering SET offering_no=?, start_date=?, tuition_fee=?, course_code=?, class_room_no=? WHERE id=?";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, batchNo);
                pst.setString(2, stDate);
                pst.setString(3, tuitFee);
                pst.setString(4, courseCode);
                pst.setString(5, clsAlloc);
                pst.setString(6, model.getValueAt(index, 0).toString());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Course Updated");

                setDefault();

                pst.close();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e.getMessage());

            }
        } else {

            JOptionPane.showMessageDialog(this, "Please Select a row to Update!");
        }
    }

    private void deleteStudent() {

        if (tblAddBatch.getSelectedRowCount() == 1) {

            int index = tblAddBatch.getSelectedRow();

            String coName = (String) model.getValueAt(index, 1);

            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete" + coName + "?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    String query = "DELETE FROM course_offering WHERE id = ?";

                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, model.getValueAt(index, 0).toString());

                    pst.execute();

                    setDefault();

                    pst.close();

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select a row to Delete!");
        }
    }

    private void clearSelections() {
        tfBatchNo.setText(null);
        tfStartDate.setText(null);
        tfCoFees.setText(null);
        tfClassAlloc.setText(null);

        cbxSelectCourse.setSelectedIndex(-1);

        tblAddBatch.clearSelection();

    }
    
    public boolean isValidate() {

        if (tfBatchNo.getText().isEmpty()) {
            lblbatchNo.setText("Can not be Empty.");
            return false;
        } else if (!Pattern.matches("[0-9]{1,2}", tfBatchNo.getText())) {
            lblbatchNo.setText("Ex:SWD-003");
            return false;
        } else {
            lblbatchNo.setText("");
        }

        if (tfStartDate.getText().isEmpty()) {
            lblstDate.setText("Can not be Empty.");
            return false;
        } else if (!Pattern.matches("[a-zA-Z0-9\\s]{3,100}", tfStartDate.getText())) {
            lblstDate.setText("Ex: 2026-07-25");
            return false;
        } else {
            lblstDate.setText("");
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBatch;
    private javax.swing.JButton btnClearBatch;
    private javax.swing.JButton btnRemoveBatch;
    private javax.swing.JButton btnSearchBatch;
    private javax.swing.JButton btnUpdateBatch;
    private javax.swing.JComboBox<String> cbxSelectCourse;
    private javax.swing.JButton jButDelete;
    private javax.swing.JButton jButSearch;
    private javax.swing.JButton jButtClear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonUp;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabCoFee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblCoDes;
    private javax.swing.JLabel lblCoFee;
    private javax.swing.JLabel lblCoName;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblbatchNo;
    private javax.swing.JLabel lblstDate;
    private javax.swing.JTable tblAddBatch;
    private javax.swing.JTextField tfBatchNo;
    private javax.swing.JTextField tfClassAlloc;
    private javax.swing.JTextField tfCoCode;
    private javax.swing.JTextField tfCoDesc;
    private javax.swing.JTextField tfCoFees;
    private javax.swing.JTextField tfCoName;
    private javax.swing.JTextField tfLevel;
    private javax.swing.JTextField tfStartDate;
    private javax.swing.JTextField tfTuitFee;
    private Frames.tutor tutor1;
    private Frames.tutor tutor2;
    // End of variables declaration//GEN-END:variables
}

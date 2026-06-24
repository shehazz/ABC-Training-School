
package Frames;

import Classes.Tutor;
import Classes.TutorDAO;
import Validation.TutorValidator;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tharusha
 */
public class tutor extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(tutor.class.getName());
    private static final String[] TABLE_COLUMNS = {
        "Staff Number", "Full Name", "Address", "Email", "Date Employed"
    };

    private DefaultTableModel tableModel;
    private TutorDAO tutorDAO;
    private String selectedStaffNo = null;
    private int selectedTableRow = -1;

    /**
     * Creates new form tutor
     */
    public tutor() {
        initComponents();
        configureWindow();
        setupTable();
        wireButtons();
        loadTutorsFromDatabase();
    }

    private TutorDAO getTutorDAO() {
        if (tutorDAO == null) {
            tutorDAO = new TutorDAO();
        }
        return tutorDAO;
    }

    private void wireButtons() {
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));
        jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));
        jButton4.addActionListener(evt -> jButton4ActionPerformed(evt));
    }

    private void configureWindow() {
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(1280, 720);
        setLocationRelativeTo(null);
    }

    private void setupTable() {
        tableModel = new DefaultTableModel(new Object[][]{}, TABLE_COLUMNS) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1.setModel(tableModel);
        jTable1.setBackground(Color.WHITE);
        jTable1.setForeground(Color.BLACK);
        jTable1.setGridColor(new Color(180, 180, 180));
        jTable1.setSelectionBackground(new Color(184, 207, 229));
        jTable1.setSelectionForeground(Color.BLACK);
        jTable1.setRowHeight(28);
        jTable1.setShowGrid(true);
        jTable1.setFillsViewportHeight(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setBackground(new Color(220, 220, 220));
        jTable1.getTableHeader().setForeground(Color.BLACK);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        if (jTable1.getColumnModel().getColumnCount() >= 5) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
        }
    }

    private boolean isStaffNoInTable(String staffNo) {
        String normalized = normalizeStaffNo(staffNo);
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            Object value = tableModel.getValueAt(i, 0);
            if (value != null && normalizeStaffNo(value.toString()).equals(normalized)) {
                return true;
            }
        }
        return false;
    }

    private void addTutorRowToTable(Tutor t) {
        tableModel.addRow(new Object[]{
            t.getStaffNo(),
            t.getFirstName() + " " + t.getLastName(),
            t.getAddress(),
            t.getEmail(),
            t.getDateEmployed()
        });
    }

    private void loadSelectedRowIntoForm(int selectedRow) {
        selectedTableRow = selectedRow;
        selectedStaffNo = normalizeStaffNo(String.valueOf(tableModel.getValueAt(selectedRow, 0)));
        setFieldValues(
                selectedStaffNo,
                String.valueOf(tableModel.getValueAt(selectedRow, 1)),
                String.valueOf(tableModel.getValueAt(selectedRow, 2)),
                String.valueOf(tableModel.getValueAt(selectedRow, 3)),
                String.valueOf(tableModel.getValueAt(selectedRow, 4))
        );
    }

    /** Field layout: jTextField5=Address, jTextField4=Email, jTextField6=Date employed */
    private String getStaffNo() {
        return jTextField1.getText().trim();
    }

    private String getFullName() {
        return jTextField2.getText().trim();
    }

    private String getAddress() {
        return jTextField5.getText().trim();
    }

    private String getEmail() {
        return jTextField4.getText().trim();
    }

    private String getDateEmployed() {
        return jTextField6.getText().trim();
    }

    private void setFieldValues(String staffNo, String fullName,
                                String address, String email, String dateEmployed) {
        jTextField1.setText(staffNo);
        jTextField2.setText(fullName);
        jTextField5.setText(address);
        jTextField4.setText(email);
        jTextField6.setText(dateEmployed);
    }

    private void clearFields() {
        setFieldValues("", "", "", "", "");
        jTable1.clearSelection();
        selectedStaffNo = null;
        selectedTableRow = -1;
    }

    private void loadTutorsFromDatabase() {
        try {
            tableModel.setRowCount(0);
            for (Tutor t : getTutorDAO().getAllTutors()) {
                addTutorRowToTable(t);
            }
            jTable1.repaint();
        } catch (SQLException e) {
            // Table still works with ADD without database
             System.out.println("Check Error: " + e.getMessage());
        }
    }

    private void updateTableRow(int row, Tutor tutor) {
        tableModel.setValueAt(tutor.getStaffNo(), row, 0);
        tableModel.setValueAt(tutor.getFirstName() + " " + tutor.getLastName(), row, 1);
        tableModel.setValueAt(tutor.getAddress(), row, 2);
        tableModel.setValueAt(tutor.getEmail(), row, 3);
        tableModel.setValueAt(tutor.getDateEmployed(), row, 4);
        jTable1.repaint();
    }

    private Tutor buildTutorFromForm() {
        String full = getFullName();
        String first = full.contains(" ") ? full.substring(0, full.indexOf(' ')) : full;
        String last = full.contains(" ") ? full.substring(full.indexOf(' ') + 1) : "";
        return new Tutor(
                normalizeStaffNo(getStaffNo()),
                first,
                last,
                getAddress(),
                getDateEmployed(),
                normalizeEmail(getEmail())
        );
    }

    private void showDatabaseError(String message, SQLException e) {
        String details = e.getMessage() != null ? e.getMessage() : e.toString();
        if (e.getErrorCode() == 1062) {
            details = "A record with this Staff No or Email already exists.";
        }
        JOptionPane.showMessageDialog(this, message + "\n" + details,
                "Database Error", JOptionPane.ERROR_MESSAGE);
        logger.log(java.util.logging.Level.SEVERE, message, e);
    }

    private boolean validateForm(boolean requireStaffNo) {
        String[][] checks = {
            {"fullname", getFullName()},
            {"address", getAddress()},
            {"dateemployed", getDateEmployed()},
            {"email", getEmail()}
        };
        if (requireStaffNo || !getStaffNo().isEmpty()) {
            String error = TutorValidator.getValidationError("staffno", getStaffNo());
            if (!error.isEmpty()) {
                JOptionPane.showMessageDialog(this, error, "Validation Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        for (String[] check : checks) {
            String error = TutorValidator.getValidationError(check[0], check[1]);
            if (!error.isEmpty()) {
                JOptionPane.showMessageDialog(this, error, "Validation Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    private String normalizeStaffNo(String staffNo) {
        return staffNo.trim().toUpperCase();
    }

    private String normalizeEmail(String email) {
        return email.trim().toLowerCase();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tutor list", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setToolTipText("Tutor list");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setGridColor(new java.awt.Color(180, 180, 180));
        jTable1.setSelectionBackground(new java.awt.Color(184, 207, 229));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Staff Number", "Full Name", "Address", "Email", "Date Employed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tutor details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Staff No");

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Full Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Address");

        jTextField4.addActionListener(this::jTextField4ActionPerformed);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Date employed");

        jTextField5.addActionListener(this::jTextField5ActionPerformed);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");

        jTextField6.addActionListener(this::jTextField6ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ADD");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("UPDATE");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("DELETE");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("CLEAR");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
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
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        loadSelectedRowIntoForm(selectedRow);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // ADD button
        if (!validateForm(false)) {
            return;
        }
        Tutor tutor = buildTutorFromForm();
        if (!tutor.getStaffNo().isEmpty() && isStaffNoInTable(tutor.getStaffNo())) {
            JOptionPane.showMessageDialog(this,
                    "A tutor with Staff No " + tutor.getStaffNo() + " is already in the table.",
                    "Duplicate Staff No",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            getTutorDAO().addTutor(tutor);
            loadTutorsFromDatabase();
            clearFields();
            JOptionPane.showMessageDialog(this, "Tutor added to database.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            showDatabaseError("Database save failed.", e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // UPDATE button
        if (selectedTableRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a tutor from the table to update.",
                    "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!validateForm(true)) {
            return;
        }
        Tutor tutor = buildTutorFromForm();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (i != selectedTableRow
                    && normalizeStaffNo(tableModel.getValueAt(i, 0).toString()).equals(tutor.getStaffNo())) {
                JOptionPane.showMessageDialog(this,
                        "Another tutor already uses Staff No " + tutor.getStaffNo() + ".",
                        "Duplicate Staff No",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        String oldStaffNo = selectedStaffNo;
        try {
            getTutorDAO().updateTutor(oldStaffNo, tutor);
            loadTutorsFromDatabase();
            clearFields();
            JOptionPane.showMessageDialog(this, "Tutor updated in database.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            showDatabaseError("Database update failed.", e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // DELETE button
        if (selectedTableRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a tutor from the table to delete.",
                    "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this,
                "Delete tutor " + selectedStaffNo + "?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }
        String staffToDelete = selectedStaffNo;
        try {
            getTutorDAO().deleteTutor(staffToDelete);
            loadTutorsFromDatabase();
            clearFields();
            JOptionPane.showMessageDialog(this, "Tutor deleted from database.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            showDatabaseError("Database delete failed.", e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // CLEAR button
        clearFields();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
    }//GEN-LAST:event_jTextField6ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new tutor().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}

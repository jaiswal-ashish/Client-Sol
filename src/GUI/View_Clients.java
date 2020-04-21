package GUI;

import java.sql.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class View_Clients extends javax.swing.JFrame {
    public View_Clients() {
        initComponents();
        setLocationRelativeTo(null);
        t1KeyReleased(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Clients");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Enter Name:");

        t1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
        });

        rTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client ID", "Name", "Gender", "DOB", "Country", "Language"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rTable.getTableHeader().setReorderingAllowed(false);
        rTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rTableMouseClicked(evt);
            }
        });
        rTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rTablePropertyChange(evt);
            }
        });
        rTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(rTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rTableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_rTableKeyReleased

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
        try {
            // TODO add your handling code here:
            javax.swing.table.DefaultTableModel dtm = ( javax.swing.table.DefaultTableModel) rTable.getModel();
            int rc = dtm.getRowCount();
            while(rc--!=0){
                dtm.removeRow(0);
            }
            String n = t1.getText();
            db.dbConnect.getClient.setString(1, "%"+n+"%");
            ResultSet rs = db.dbConnect.getClient.executeQuery();
            while(rs.next()){
                Vector r = new Vector();
                r.add(rs.getInt("cid"));
                r.add(rs.getString("name"));
                r.add(rs.getString("gender"));
                r.add(rs.getDate("dob"));
                r.add(rs.getString("country"));
                r.add(rs.getString("language"));
                dtm = ( javax.swing.table.DefaultTableModel) rTable.getModel();
                dtm.addRow(r);
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);        }
    }//GEN-LAST:event_t1KeyReleased

    private void rTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rTableMouseClicked
        // TODO add your handling code here:
        int ri = rTable.getSelectedRow();
        if(ri!=-1){
            int id = (Integer)rTable.getValueAt(ri, 0);
            String name = (String)rTable.getValueAt(ri, 1);
            String gender = (String)rTable.getValueAt(ri, 2);
            java.util.Date dob = (java.util.Date) rTable.getValueAt(ri, 3);
            String country = (String)rTable.getValueAt(ri, 4);
//            String address = (String)rTable.getValueAt(ri, 5);
            String language = (String)rTable.getValueAt(ri, 5);
            try {
                ResultSet rs = db.dbConnect.st.executeQuery("select * from cl_info1 where cid ='"+id+"'");
                if(rs.next()){
                    String age=rs.getString("age");
                String ssn=rs.getString("ssn");
                String contact=rs.getString("contact");
                String ms=rs.getString("mstatus");
//                   System.out.println(rs.getString(1));
                   new Client_Details(id, name, gender, dob, country, language,age,ssn,contact,ms).setVisible(true);
                   dispose();
                }
                
            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null, ex);
                ex.printStackTrace();
            }
//            System.out.println(id+" "+name+" "+gender+" "+dob+" "+country+" "+address+" "+language);
        }
    }//GEN-LAST:event_rTableMouseClicked

    private void rTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rTablePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_rTablePropertyChange

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rTable;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}

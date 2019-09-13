package GUI;

import java.sql.*;
import java.util.StringTokenizer;
import java.util.*;
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
        g2 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();
        d = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        c = new javax.swing.JComboBox<>();
        n = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        a = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        l2 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        l3 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        l4 = new javax.swing.JCheckBox();
        g1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cid = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Clients");
        setLocation(new java.awt.Point(0, 0));

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
                "Client ID", "Name", "Gender", "DOB", "Country", "Address", "Language"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
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

        buttonGroup1.add(g2);
        g2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        g2.setText("Female");
        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(g3);
        g3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        g3.setText("Other");
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel3.setText("Client Id");

        c.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "England", "Spain", "Sri Lanka", "Greece" }));
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        n.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        n.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        a.setColumns(20);
        a.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        a.setRows(5);
        jScrollPane2.setViewportView(a);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel4.setText("Gender:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel5.setText("DOB:");

        l1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        l1.setText("Hindi");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel6.setText("Country:");

        l2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        l2.setText("English");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel7.setText("Address:");

        l3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        l3.setText("Spanish");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel8.setText("Language:");

        l4.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        l4.setText("French");

        buttonGroup1.add(g1);
        g1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        g1.setSelected(true);
        g1.setText("Male");

        jButton1.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel9.setText("Name:");

        cid.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        cid.setText("-------");

        jButton2.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l1)
                                .addGap(18, 18, 18)
                                .addComponent(l2)
                                .addGap(18, 18, 18)
                                .addComponent(l3)
                                .addGap(18, 18, 18)
                                .addComponent(l4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(g1)
                                        .addGap(28, 28, 28)
                                        .addComponent(g2)
                                        .addGap(31, 31, 31)
                                        .addComponent(g3)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(n, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cid)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(g1)
                                    .addComponent(g2)
                                    .addComponent(g3))
                                .addGap(29, 29, 29))
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(l1)
                    .addComponent(l2)
                    .addComponent(l3)
                    .addComponent(l4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g2ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g3ActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

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
                r.add(rs.getString("address"));
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
            String address = (String)rTable.getValueAt(ri, 5);
            String language = (String)rTable.getValueAt(ri, 6);
            
            cid.setText(id + "");
            n.setText(name);
            if(gender.equalsIgnoreCase("Male"))
                g1.setSelected(true);
            else if(gender.equalsIgnoreCase("Female"))
                g2.setSelected(true);
            else
                g3.setSelected(true);
            d.setDate(dob);
            c.setSelectedItem(country);
            a.setText(address);
            l1.setSelected(false);
            l2.setSelected(false);
            l3.setSelected(false);
            l4.setSelected(false);
//            System.out.println(language);
            if(language!=null){
                StringTokenizer st = new StringTokenizer(language, ",");
                while(st.hasMoreTokens()){
                    String s = st.nextToken();
                    if(s.equalsIgnoreCase("Hindi"))
                        l1.setSelected(true);
                    else if(s.equalsIgnoreCase("English"))
                        l2.setSelected(true);
                    else if(s.equalsIgnoreCase("Spanish"))
                        l3.setSelected(true);
                    else
                        l4.setSelected(true);
                }
            }
        }
    }//GEN-LAST:event_rTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = n.getText();
        String gender;
        if(g1.isSelected())
            gender = g1.getText();
        else if(g2.isSelected())
            gender = g2.getText();
        else
            gender = g3.getText();
        java.util.Date dt = d.getDate();
        String country = (String)c.getSelectedItem();
        String address = a.getText();
        String language = "";
        if(l1.isSelected())
            language += l1.getText() + ",";
        if(l2.isSelected())
            language += l2.getText() + ",";
        if(l3.isSelected())
            language += l3.getText() + ",";
        if(l4.isSelected())
            language += l4.getText() + ",";
        if(!language.equals("")){
            language = language.substring(0, language.length()-1);
        }
        if((d!=null) && !name.equals("") && !address.equals("")){
            int id = Integer.parseInt(cid.getText());
            java.sql.Date dob = new java.sql.Date(dt.getTime());
            try{
                db.dbConnect.updateClient.setString(1, name);
                db.dbConnect.updateClient.setString(2, gender);
                db.dbConnect.updateClient.setDate(3, dob);
                db.dbConnect.updateClient.setString(4, country);
                db.dbConnect.updateClient.setString(5, address);
                db.dbConnect.updateClient.setString(6, language);
                db.dbConnect.updateClient.setInt(7, id);
                db.dbConnect.updateClient.executeUpdate();
                t1KeyReleased(null);
                JOptionPane.showMessageDialog(null,"Updated Successfully!!");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        } else
            JOptionPane.showMessageDialog(null, "Fill complete form");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int r=JOptionPane.showConfirmDialog(null,"Do u really wanna delete?", "Deletion Confirmation", JOptionPane.YES_NO_OPTION);
        if(r==JOptionPane.YES_OPTION){
            int id=Integer.parseInt(cid.getText());
             try{
            db.dbConnect.st.executeUpdate("delete from  cl_info1 where cid="+id );
            JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
            t1KeyReleased(null);
            cid.setText("");
            n.setText("");
            a.setText("");
            d.setDate(null);
            g1.setSelected(true);
            l1.setSelected(false);
            l2.setSelected(false);
            l3.setSelected(false);
            l4.setSelected(false);
            c.setSelectedIndex(0);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rTablePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_rTablePropertyChange

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> c;
    private javax.swing.JLabel cid;
    private com.toedter.calendar.JDateChooser d;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox l1;
    private javax.swing.JCheckBox l2;
    private javax.swing.JCheckBox l3;
    private javax.swing.JCheckBox l4;
    private javax.swing.JTextField n;
    private javax.swing.JTable rTable;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CRM;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Brij kishore sharma
 */
public class Leads extends javax.swing.JFrame {


    public Leads() { super("LEADS");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        newlead = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        tf3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setMaximumSize(new java.awt.Dimension(731, 519));
        setMinimumSize(new java.awt.Dimension(731, 519));
        setPreferredSize(new java.awt.Dimension(731, 519));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl.setBackground(new java.awt.Color(0, 0, 0));
        tbl.setForeground(new java.awt.Color(255, 255, 255));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lead ID", "Name", "Birth Date (YYYYMMDD)", "Gender", "Phone Number", "Email id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setResizable(false);
            tbl.getColumnModel().getColumn(1).setResizable(false);
            tbl.getColumnModel().getColumn(2).setResizable(false);
            tbl.getColumnModel().getColumn(2).setPreferredWidth(110);
            tbl.getColumnModel().getColumn(3).setResizable(false);
            tbl.getColumnModel().getColumn(4).setResizable(false);
            tbl.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 719, 212));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 236, 123, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Birthdate");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 277, 123, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 319, 123, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 367, 123, 36));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 421, 123, 36));
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 239, 123, 36));
        getContentPane().add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 277, 123, 36));
        getContentPane().add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 367, 123, 36));
        getContentPane().add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 421, 123, 36));

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 322, 85, 35));

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 375, -1, 35));

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 428, 85, 35));

        newlead.setBackground(new java.awt.Color(0, 0, 0));
        newlead.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        newlead.setForeground(new java.awt.Color(255, 255, 255));
        newlead.setText("Add new lead");
        newlead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newleadActionPerformed(evt);
            }
        });
        getContentPane().add(newlead, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 281, 149, 35));

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 281, 85, 35));
        getContentPane().add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 319, 123, 35));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Leads");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 322, 85, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lead Id");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 236, 99, 36));

        lb1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 236, 187, 36));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CRM/images/B.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
       frame = new JFrame("Cancel");
       if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to cancel","Cancel",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
            new Mainpg().setVisible(true);
            this.setVisible(false);
       }
    }//GEN-LAST:event_cancelActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void newleadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newleadActionPerformed
        // TODO add your handling code here:
        String name= tf1.getText();
        String bd= tf2.getText();
        String gender= tf3.getText();
        String phnum= tf4.getText();
        String email=tf5.getText();
         if(phnum.length()==10){
        try{
        connectionclass obj = new connectionclass();
        String q= "insert into leads(name,birthdate,gender,phone,email) values('"+name+"','"+bd+"','"+gender+"','"+phnum+"','"+email+"')";
        int aa = obj.stn.executeUpdate(q);
        if(aa==1){
            tf1.setText("");
            tf2.setText(""); 
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            JOptionPane.showMessageDialog(null,"Your data inserted successfully"); 
           
            this.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null, "Please ! Enter carefully");
        this.setVisible(true);
        }
        }
        catch(Exception ee){
        ee.printStackTrace();
        }}
        else {
        JOptionPane.showMessageDialog(null, "Number not in format ! Please Check ! ");
        }
    }//GEN-LAST:event_newleadActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
        int selectedrow = tbl.getSelectedRow();
        lb1.setText(tbModel.getValueAt(selectedrow, 0).toString());
        tf1.setText(tbModel.getValueAt(selectedrow, 1).toString());
        tf2.setText(tbModel.getValueAt(selectedrow, 2).toString());
        tf3.setText(tbModel.getValueAt(selectedrow, 3).toString());
        tf4.setText(tbModel.getValueAt(selectedrow, 4).toString());
        tf5.setText(tbModel.getValueAt(selectedrow, 5).toString());
    }//GEN-LAST:event_tblMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String lid= lb1.getText();
        String name= tf1.getText();
        String bd= tf2.getText();
        String gender= tf3.getText();
        String phnum= tf4.getText();
        String email=tf5.getText();
         if(phnum.length()==10){
        try{
        connectionclass obj = new connectionclass();
        String q1= "Select * from leads ";
        String q= "update leads set name='"+name+"', birthdate = '"+bd+"',gender = '"+gender+"',phone = '"+phnum+"',email='"+email+"' where id='"+lid+"'";
        int aa = obj.stn.executeUpdate(q);
        if(aa==1){
            tf1.setText("");
            tf2.setText(""); 
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            JOptionPane.showMessageDialog(null,"Your data updated successfully"); 
           
            this.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null, "Please ! Enter carefully");
        this.setVisible(true);
        }
        ResultSet rest= obj.stn.executeQuery(q1);
        DefaultTableModel tbModel1 = (DefaultTableModel)tbl.getModel();
        tbModel1.setRowCount(0);
        while (rest.next()){
            String leadid = String.valueOf(rest.getInt("id"));//conversion due to int value 
            String name1 = rest.getString("name");
            String bd1 = rest.getString("birthdate");
            String gender1 = rest.getString("gender");
            String phnum1 = rest.getString("phone");
            String email1 = rest.getString("email");
            String tbData[]={leadid,name1,bd1,gender1,phnum1,email1};
            DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
            
            tbModel.addRow(tbData);
        }}
        catch(Exception ee){
        ee.printStackTrace();
        }}
        else {
        JOptionPane.showMessageDialog(null, "Number not in format ! Please Check ! ");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
                connectionclass obj = new connectionclass();
        String q= "Select * from leads ";
        ResultSet rest= obj.stn.executeQuery(q);
        DefaultTableModel tbModel1 = (DefaultTableModel)tbl.getModel();
            tbModel1.setRowCount(0);
        while (rest.next()){
            String leadid = String.valueOf(rest.getInt("id"));//conversion due to int value 
            String name = rest.getString("name");
            String bd = rest.getString("birthdate");
            String gender = rest.getString("gender");
            String phnum = rest.getString("phone");
            String email = rest.getString("email");
            //string array for store data in jtable
            String tbData[]={leadid,name,bd,gender,phnum,email};
            DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
//            tbModel.setRowCount(0);
            //add string array data into table
            tbModel.addRow(tbData);
            }}
                catch(Exception ee){
                    ee.printStackTrace();
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(lb1.getText());
        try {
        connectionclass obj = new connectionclass();
        String q= "delete from leads where id='"+id+"' ";
        String q1= "delete from interactions where leadid='"+id+"' ";
//        String q1= "delete from participants where pid = '"+id+"'";
//        int res1 =obj.stn.executeUpdate(q1);
        int res = obj.stn.executeUpdate(q);
        obj.stn.executeUpdate(q1);
        if(res==1){
            JOptionPane.showMessageDialog(null,"Data successfully deleted");
            this.setVisible(false);
            new Leads().setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null, "data not successfully deleted");
        }
        }
        catch(Exception ee){
        ee.printStackTrace();
        }
    }//GEN-LAST:event_deleteActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Leads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leads().setVisible(true);
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JButton newlead;
    private javax.swing.JButton reset;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

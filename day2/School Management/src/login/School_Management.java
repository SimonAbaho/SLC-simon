/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import main.Main;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import joption1.jMessagePane;
import main.Main1;
import main.Main2;
import message.MessagePane;


/**
 *
 * @author Moin
 */
public class School_Management extends javax.swing.JFrame {

    /**
     * Creates new form School_Management
     */
    public School_Management() {
        initComponents();
        connect();
         this.setLocationRelativeTo(null);
         
         
    }
    
    //instance variable for database
    PreparedStatement pr;
    Connection con;
    ResultSet rs;
    Statement stmt;
    //instance variable for mouse drag
    int xMouse;
    int yMouse;
    
    //this method connectivity with database
    public void connect(){
        try {
            
        String uHost = "jdbc:derby://localhost:1527/School Management";
        String uName = "moin";
        String uPass = "akhtar";
        con = DriverManager.getConnection(uHost, uName, uPass);
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             
        } catch (SQLException ex) {
             error.Error er = new error.Error();
             er.displayPane("Start NetBeans Server");
        }
        finally{
                try{pr.close();rs.close();}
                catch(Exception e){
                
                }
        
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jclose = new javax.swing.JLabel();
        jmini = new javax.swing.JLabel();
        framedrag = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/icon.png")));
        setLocation(new java.awt.Point(450, 130));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Develop By:");

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CoreTechTechnologies");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 505, -1, 20));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setName("Name");
        jTextField2.setSelectionColor(new java.awt.Color(0, 204, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 340, 40));
        jTextField2.getAccessibleContext().setAccessibleDescription("");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 340, 40));

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 340, 40));

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/close.png"))); // NOI18N
        jclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jcloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jcloseMouseReleased(evt);
            }
        });
        getContentPane().add(jclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 5, 26, 26));

        jmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/mini.png"))); // NOI18N
        jmini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jminiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jminiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jminiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jminiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jminiMouseReleased(evt);
            }
        });
        getContentPane().add(jmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 5, 24, 26));

        framedrag.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        framedrag.setForeground(new java.awt.Color(255, 255, 255));
        framedrag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        framedrag.setText("<html>\n<span style=\"text-shadow: 0 1px 0 #ccc,\n               0 2px 0 #c9c9c9,\n               0 3px 0 #bbb,\n               0 4px 0 #b9b9b9,\n               0 5px 0 #aaa,\n               0 6px 1px rgba(0,0,0,.1),\n               0 0 5px rgba(0,0,0,.1),\n               0 1px 3px rgba(0,0,0,.3),\n               0 3px 5px rgba(0,0,0,.2),\n               0 5px 10px rgba(0,0,0,.25),\n               0 10px 10px rgba(0,0,0,.2),\n               0 20px 20px rgba(0,0,0,.15); box-shadow:red 2px 2px \">\nLogin Form\n</span>\n<html>");
        framedrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                framedragMouseDragged(evt);
            }
        });
        framedrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                framedragMousePressed(evt);
            }
        });
        getContentPane().add(framedrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 453, 23));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/jlogin.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //Search data from database
         try {
                String sql = "select * from LOGIN where USER_NAME=? and PASSWORD=?";
                pr =  con.prepareStatement(sql);
                pr.setString(1,jTextField2.getText().trim().toLowerCase());
                pr.setString(2, jPasswordField1.getText().trim());
                rs = pr.executeQuery();
            if (rs.next()){
                String name = jTextField2.getText().trim().toLowerCase();
                String pass = jPasswordField1.getText().trim().toLowerCase();
                
                if("moin".equals(name) && "akhtar".equals(pass)){
               
                    jMessagePane jm = new jMessagePane();
                    jm.displayPane(null, null);
              
               pr.close();
               rs.close();
               String sql1 = "insert into MOIN.LOGIN_DETAIL (NAME,DATE) values(?,?)";
               pr = con.prepareStatement(sql1);
               pr.setString(1, jTextField2.getText().trim().toLowerCase());
               pr.setDate(2, Date.valueOf(LocalDate.now()));
               pr.execute();
               pr.close();
               new Main().setVisible(true);
               this.dispose();}
                else{
                MessagePane ms = new MessagePane();
                ms.displayPane("Login Successfully");
              
                pr.close();
               rs.close();
               String sql1 = "insert into MOIN.LOGIN_DETAIL (NAME,DATE) values(?,?)";
               pr = con.prepareStatement(sql1);
               pr.setString(1, jTextField2.getText().trim().toLowerCase());
               pr.setDate(2, Date.valueOf(LocalDate.now()));
               pr.execute();
               pr.close();
               new Main1().setVisible(true);
               this.dispose();
                }
            }
            else {
            error.Error er = new error.Error();
             er.displayPane("<html><font size=\"1.5\">Incorrect User or Password</font></html>");
            }
            
            jTextField2.setText(null);
            jPasswordField1.setText(null);
            }
         catch (SQLException ex) {
              
        }finally{
                try{pr.close();rs.close();}
                catch(Exception e){
                
                }
        
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
      
    }//GEN-LAST:event_jButton1KeyPressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        //use keyevent for textfield
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            //Search data from database
         try {
                String sql = "select * from LOGIN where USER_NAME=? and PASSWORD=?";
                pr =  con.prepareStatement(sql);
                pr.setString(1,jTextField2.getText().trim().toLowerCase());
                pr.setString(2, jPasswordField1.getText().trim());
                rs = pr.executeQuery();
            if (rs.next()){
                String name = jTextField2.getText().trim().toLowerCase();
                String pass = jPasswordField1.getText().trim().toLowerCase();
                
                if("moin".equals(name) && "akhtar".equals(pass)){
               
                    jMessagePane jm = new jMessagePane();
                    jm.displayPane(null, null);
              
               pr.close();
               rs.close();
               String sql1 = "insert into MOIN.LOGIN_DETAIL (NAME,DATE) values(?,?)";
               pr = con.prepareStatement(sql1);
               pr.setString(1, jTextField2.getText().trim().toLowerCase());
               pr.setDate(2, Date.valueOf(LocalDate.now()));
               pr.execute();
               pr.close();
                new Main().setVisible(true);
               this.dispose();}
                else{
                MessagePane ms = new MessagePane();
                ms.displayPane("Login Successfully");
              
                
               
               pr.close();
               rs.close();
               String sql1 = "insert into MOIN.LOGIN_DETAIL (NAME,DATE) values(?,?)";
               pr = con.prepareStatement(sql1);
               pr.setString(1, jTextField2.getText().trim().toLowerCase());
               pr.setDate(2, Date.valueOf(LocalDate.now()));
               pr.execute();
               pr.close();
               new Main2().setVisible(true);
               this.dispose();
                }
            }
            else {
            error.Error er = new error.Error();
             er.displayPane("<html><font size=\"1.5\">Incorrect User or Password</font></html>");
            }
            
            jTextField2.setText(null);
            jPasswordField1.setText(null);
            }
         catch (SQLException ex) {
              
        }finally{
                try{pr.close();rs.close();}
                catch(Exception e){
                
                }
        
        }}
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseClicked
        // close jframe
        System.exit(0);
    }//GEN-LAST:event_jcloseMouseClicked

    private void jcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseEntered
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/closehover.png"));
        jclose.setIcon(ii);
    }//GEN-LAST:event_jcloseMouseEntered

    private void jcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseExited
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/close.png"));
        jclose.setIcon(ii);
    }//GEN-LAST:event_jcloseMouseExited

    private void jcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMousePressed
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/closeclick.png"));
        jclose.setIcon(ii);
    }//GEN-LAST:event_jcloseMousePressed

    private void jcloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseReleased
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/closehover.png"));
        jclose.setIcon(ii);
    }//GEN-LAST:event_jcloseMouseReleased

    private void jminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMouseClicked
        // this is use for minimize
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jminiMouseClicked

    private void jminiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMouseEntered
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/minihover.png"));
        jmini.setIcon(ii);
    }//GEN-LAST:event_jminiMouseEntered

    private void jminiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMouseExited
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/mini.png"));
        jmini.setIcon(ii);
    }//GEN-LAST:event_jminiMouseExited

    private void jminiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMousePressed
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/miniclick.png"));
        jmini.setIcon(ii);
    }//GEN-LAST:event_jminiMousePressed

    private void jminiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMouseReleased
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/minihover.png"));
        jmini.setIcon(ii);
    }//GEN-LAST:event_jminiMouseReleased

    private void framedragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_framedragMouseDragged
        //set screen
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y - yMouse);
    }//GEN-LAST:event_framedragMouseDragged

    private void framedragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_framedragMousePressed
        //set mouse pressed screen
        xMouse  = evt.getX();
        yMouse  = evt.getY();
    }//GEN-LAST:event_framedragMousePressed

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
            java.util.logging.Logger.getLogger(School_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(School_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(School_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(School_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new School_Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel framedrag;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jclose;
    private javax.swing.JLabel jmini;
    // End of variables declaration//GEN-END:variables
}

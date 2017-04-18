/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Addmission;

import com.sun.glass.events.KeyEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import message.MessagePane;


/**
 *
 * @author Engr.Awais
 */
public class SearchAdmission extends javax.swing.JFrame {

    /**
     * Creates new form SearchAdmission
     */
    public SearchAdmission() {
        initComponents();
        this.setLocationRelativeTo(null);
        connect();
        
    }

    // instance variable for databse connectivity
     Connection con;
     Statement stmt;
     ResultSet rs;
     PreparedStatement pr;
     //instance variable for mouse drag
     int xMouse;
     int yMouse;
     
    //connect method create for connectivity from database
   public void connect(){
        String uHost="jdbc:derby://localhost:1527/School Management";
        String uName="moin";
        String uPass="akhtar";
        
         try {
             //make connection from database by username and password and database path
             con = DriverManager.getConnection(uHost, uName, uPass);
             stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             //this query get data from database 
             String sql = "Select * from MOIN.ADMISSION";
             rs = stmt.executeQuery(sql);
             rs.last();
                String id =  rs.getString("ID");
                String name = rs.getString("NAME");
                String f_name= rs.getString("F_NAME");
                String email= rs.getString("EMAIL");
                String tele = rs.getString("TELEPHONE");
                String cell = rs.getString("CELL_NO");
                String address = rs.getString("ADDRESS");
                String clas =  rs.getString("CLASS");
                String country =    rs.getString("COUNTRY");
                String city =  rs.getString("CITY");
                String birth =  rs.getString("DATE_OF_BIRTH");
                String occu =  rs.getString("OCCUPATION");
                String date =  rs.getString("ADDMISSION_DATE");
                String gender = rs.getString("GENDER");
                String amount = rs.getString("AMOUNT");
                //this byte variable get image from database
                byte[] bt = rs.getBytes("PHOTO");
                ImageIcon format = new ImageIcon(bt);
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                String data = df.format(new Date());
                jDate.setText(data);
                
                
                jID.setText(id);
                
                jName.setText(name);
                
                jF_name.setText(f_name);
                
                jOccupation.setText(occu);
                
                jDateOfBirth.setText(birth);
                
                jGender.setText(gender);
                
                jAddress.setText(address);
                
                jCell.setText(cell);
                
                jAmount.setText("Rs. "+amount);
               
                jClass.setText(clas);
                
                jEmail.setText(email);
                
                jCity.setText(city);
                
                jDateOfBirth.setText(date);
                
                jPicture2.setIcon(format);
         } catch (SQLException ex) {
             javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
         }finally{
        try{ rs.close(); pr.close();}
        catch(Exception e){
         }
        }
    
    }
   //this method print jpanel which i want to print out
 public void printWork(){
     PrinterJob pj = PrinterJob.getPrinterJob();
     pj.setJobName(" Opt De Solver Printing ");
    pj.setPrintable((Graphics pg, PageFormat pf, int pageNum) -> {
         if(pageNum > 0)
             return Printable.NO_SUCH_PAGE;
         
         Graphics2D g2 = (Graphics2D)pg;
         g2.translate(pf.getImageableX(), pf.getImageableY());
         //this jpanel variable name which will be print out
         jPanel2.print(g2);
         return Printable.PAGE_EXISTS;
     });
     if(pj.printDialog() == false)
         return;
     try
     {
         pj.print();
     }
     catch(PrinterException xcp)
     {
         xcp.printStackTrace(System.err);
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

        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        textNum6 = new javax.swing.JLabel();
        textNum5 = new javax.swing.JLabel();
        textNum8 = new javax.swing.JLabel();
        jCell = new javax.swing.JLabel();
        jClass = new javax.swing.JLabel();
        jAddress = new javax.swing.JLabel();
        jCity = new javax.swing.JLabel();
        jOccupation = new javax.swing.JLabel();
        jDateOfBirth = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        textNum = new javax.swing.JLabel();
        textNum2 = new javax.swing.JLabel();
        textNum1 = new javax.swing.JLabel();
        textNum4 = new javax.swing.JLabel();
        jID = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jF_name = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JLabel();
        text_Fname = new javax.swing.JLabel();
        textNAME = new javax.swing.JLabel();
        textID = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPicture2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        textNAME2 = new javax.swing.JLabel();
        textNAME3 = new javax.swing.JLabel();
        textNAME6 = new javax.swing.JLabel();
        textNAME7 = new javax.swing.JLabel();
        textNAME8 = new javax.swing.JLabel();
        textNAME9 = new javax.swing.JLabel();
        jDate = new javax.swing.JLabel();
        jAmount = new javax.swing.JLabel();
        textNum7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jclose = new javax.swing.JLabel();
        jmini = new javax.swing.JLabel();
        framedrag = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Admission");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/login/img/icon.png")));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(734, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Search By ID");

        jTextField1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        textNum6.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textNum6.setText("Occupation:");

        textNum5.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textNum5.setText("Date of Birth:");

        textNum8.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textNum8.setText("Gender:");

        jCell.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jCell.setText("Cell No#");

        jClass.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jClass.setText("Class:");

        jAddress.setFont(new java.awt.Font("Nyala", 1, 10)); // NOI18N
        jAddress.setText("Address:");

        jCity.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jCity.setText("City");

        jOccupation.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jOccupation.setText("Occupation:");

        jDateOfBirth.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jDateOfBirth.setText("Date of Birth:");

        jGender.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jGender.setText("Gender:");

        textNum.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textNum.setText("Cell No#");

        textNum2.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textNum2.setText("Class:");

        textNum1.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textNum1.setText("Address:");

        textNum4.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textNum4.setText("City");

        jID.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jID.setForeground(new java.awt.Color(204, 0, 51));
        jID.setText("ID");

        jName.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jName.setText("Name:");

        jF_name.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jF_name.setText("Father Name:");

        jEmail.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jEmail.setText("Email:");

        textEmail.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textEmail.setText("Email:");

        text_Fname.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        text_Fname.setText("Father Name:");

        textNAME.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textNAME.setText("Name:");

        textID.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textID.setForeground(new java.awt.Color(204, 0, 51));
        textID.setText("ID");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));

        jPicture2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPicture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/webcam.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPicture2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPicture2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));

        textNAME2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        textNAME2.setText("Parents Singnature");

        textNAME3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        textNAME3.setText("Principal Sign & Stamp");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(textNAME2)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(textNAME3)
                        .addGap(28, 28, 28))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(textNAME2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(textNAME3)
                .addGap(20, 20, 20))
        );

        textNAME6.setFont(new java.awt.Font("Traditional Arabic", 1, 10)); // NOI18N
        textNAME6.setText("B-27 Gulshan Block 5");

        textNAME7.setFont(new java.awt.Font("Traditional Arabic", 1, 10)); // NOI18N
        textNAME7.setText("Email: MoinAkhtar00@gmail.com     Contact# 03412281694");

        textNAME8.setFont(new java.awt.Font("Traditional Arabic", 1, 10)); // NOI18N
        textNAME8.setText("Web: Www.KarachiSecondarySchool.com");

        textNAME9.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        textNAME9.setText("Date");

        jDate.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jDate.setText("Date");

        jAmount.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jAmount.setText("Amount");

        textNum7.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        textNum7.setText("Amount");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNAME6)
                            .addComponent(textNAME7)
                            .addComponent(textNAME8, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNum)
                            .addComponent(textNum2)
                            .addComponent(textNum5)
                            .addComponent(textEmail)
                            .addComponent(text_Fname)
                            .addComponent(textNAME)
                            .addComponent(textID)
                            .addComponent(textNum6)
                            .addComponent(textNum4)
                            .addComponent(textNum8)
                            .addComponent(textNAME9)
                            .addComponent(textNum1)
                            .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNum7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jF_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jOccupation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jClass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDate))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textID)
                            .addComponent(jID))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNAME)
                            .addComponent(jName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_Fname)
                            .addComponent(jF_name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textEmail)
                            .addComponent(jEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNum)
                            .addComponent(jCell))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNum2)
                            .addComponent(jClass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNum5)
                            .addComponent(jDateOfBirth))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNum8)
                            .addComponent(jGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNum6)
                            .addComponent(jOccupation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNum4)
                            .addComponent(jCity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNum7)
                            .addComponent(jAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNum1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNAME9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(textNAME6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNAME7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNAME8)))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Search Admission");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/school3.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 51));
        jLabel15.setText("Karachi Secondary School");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel13)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/Print_24x24.png"))); // NOI18N
        jButton1.setText("Print Slip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/sidebar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addComponent(jLabel4))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 736, 640));

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
        getContentPane().add(jclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 5, 26, 26));

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
        getContentPane().add(jmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 5, 24, 26));

        framedrag.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        framedrag.setForeground(new java.awt.Color(255, 255, 255));
        framedrag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        framedrag.setText("<html>\n<span style=\"text-shadow: 0 1px 0 #ccc,\n               0 2px 0 #c9c9c9,\n               0 3px 0 #bbb,\n               0 4px 0 #b9b9b9,\n               0 5px 0 #aaa,\n               0 6px 1px rgba(0,0,0,.1),\n               0 0 5px rgba(0,0,0,.1),\n               0 1px 3px rgba(0,0,0,.3),\n               0 3px 5px rgba(0,0,0,.2),\n               0 5px 10px rgba(0,0,0,.25),\n               0 10px 10px rgba(0,0,0,.2),\n               0 20px 20px rgba(0,0,0,.15); box-shadow:red 2px 2px \">\nSearch Admission\n</span>\n<html>");
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
        getContentPane().add(framedrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 734, 23));

        jLabel23.setFont(new java.awt.Font("Traditional Arabic", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("+256704277679");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 680, -1, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 153));
        jLabel22.setText("Contact#");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, -1, -1));

        jLabel21.setFont(new java.awt.Font("Traditional Arabic", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("CoreTechTechnologies");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 681, -1, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("Develop By");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 681, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/menu/b1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 734, 27));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/menu/t1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 734, 35));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/menu/bc2.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setPreferredSize(new java.awt.Dimension(736, 731));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 734, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
         try {
             //this query search data from database
            String sql = "Select * from ADMISSION where ID=?";
            pr = con.prepareStatement(sql);
            pr.setString(1,jTextField1.getText());
            rs = pr.executeQuery();
            if(rs.next()){
               String id =  rs.getString("ID");
               String name = rs.getString("NAME");
               String f_name= rs.getString("F_NAME");
               String email= rs.getString("EMAIL");
               String tele = rs.getString("TELEPHONE");
               String cell = rs.getString("CELL_NO");
               String address = rs.getString("ADDRESS");
               String clas =  rs.getString("CLASS");
               String city =  rs.getString("CITY");
               String birth =  rs.getString("DATE_OF_BIRTH");
               String occu =  rs.getString("OCCUPATION");
               String date =  rs.getString("ADDMISSION_DATE");
               String gender =  rs.getString("GENDER");
               String amount =  rs.getString("AMOUNT");
               //get image from database
               byte[] bt = rs.getBytes("PHOTO");
               ImageIcon format = new ImageIcon(bt);
               jID.setText(id);
                
                jName.setText(name);
                
                jF_name.setText(f_name);
                
                jOccupation.setText(occu);
                
                jDateOfBirth.setText(birth);
                
                jGender.setText(gender);
                
                jAddress.setText(address);
                
                jCell.setText(cell);
                
                jAmount.setText("Rs. "+ amount);
                
                jClass.setText(clas);
                
                jEmail.setText(email);
                
                jCity.setText(city);
                
                jDate.setText(date);
                
                jPicture2.setIcon(format);
               
            }
            
            
        } catch (SQLException ex) {
        }finally{
        try{ rs.close(); pr.close();}
        catch(Exception e){
         }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //invoke method 
       jButton1.setVisible(false);
        this.dispose();
        this.printWork();
        MessagePane ms = new MessagePane();
        ms.displayPane("Printing Slip");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
          //i am using char datatype for get getkeychar from textfield and creating an if statement
        char num=evt.getKeyChar();
        if(!(Character.isDigit(num)|| (num==KeyEvent.VK_BACKSPACE) || num==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseClicked
        // close jframe
        this.dispose();

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
        this.setState(SearchAdmission.ICONIFIED);

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
            java.util.logging.Logger.getLogger(SearchAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchAdmission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel framedrag;
    private javax.swing.JLabel jAddress;
    private javax.swing.JLabel jAmount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jCell;
    private javax.swing.JLabel jCity;
    private javax.swing.JLabel jClass;
    private javax.swing.JLabel jDate;
    private javax.swing.JLabel jDateOfBirth;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jF_name;
    private javax.swing.JLabel jGender;
    private javax.swing.JLabel jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jName;
    private javax.swing.JLabel jOccupation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jPicture2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jclose;
    private javax.swing.JLabel jmini;
    private javax.swing.JLabel textEmail;
    private javax.swing.JLabel textID;
    private javax.swing.JLabel textNAME;
    private javax.swing.JLabel textNAME2;
    private javax.swing.JLabel textNAME3;
    private javax.swing.JLabel textNAME6;
    private javax.swing.JLabel textNAME7;
    private javax.swing.JLabel textNAME8;
    private javax.swing.JLabel textNAME9;
    private javax.swing.JLabel textNum;
    private javax.swing.JLabel textNum1;
    private javax.swing.JLabel textNum2;
    private javax.swing.JLabel textNum4;
    private javax.swing.JLabel textNum5;
    private javax.swing.JLabel textNum6;
    private javax.swing.JLabel textNum7;
    private javax.swing.JLabel textNum8;
    private javax.swing.JLabel text_Fname;
    // End of variables declaration//GEN-END:variables
}

 package pkgfinal;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
 
public class NewStudent extends javax.swing.JFrame {
 
    public NewStudent() {
        d();
        this.setSize(988, 560);
    }
    int sno,dd,mm,yy,dda,mma,yya;
    String nm,fnm,mnm,cno,add,month,dob,montha,doa,cla;
         @SuppressWarnings("unchecked")
     private void d() {

        jScrollBar1 = new JScrollBar();
        jLabel32 = new JLabel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        name = new JTextField();
        fname = new JTextField();
        mname = new JTextField();
        contact = new JTextField();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        address = new JTextField();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jComboBox2 = new JComboBox<>();
        jComboBox3 = new JComboBox<>();
        jComboBox4 = new JComboBox<>();
        jComboBox5 = new JComboBox<>();
        jComboBox6 = new JComboBox<>();
        jComboBox7 = new JComboBox<>();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jButton1 = new JButton();
        jButton3 = new JButton();
        jLabel1 = new JLabel();
        schno = new JTextField();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jLabel14 = new JLabel();
        jLabel20 = new JLabel();
        jLabel18 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel25 = new JLabel();
        jLabel31 = new JLabel();
        jLabel33 = new JLabel();
        jLabel26 = new JLabel();
        jLabel34 = new JLabel();

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel32.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NewEntry");
        setBackground(new java.awt.Color(51, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 3, 36))); // 
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(16, 54, 59, 26);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jLabel3.setText("DOB :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(16, 171, 73, 25);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jLabel4.setText("Date of Admission :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(443, 56, 140, 23);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jLabel5.setText("Class of Admission :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(443, 92, 128, 26);

        name.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(202, 54, 149, 27);

        fname.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jPanel1.add(fname);
        fname.setBounds(202, 92, 149, 27);

        mname.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        jPanel1.add(mname);
        mname.setBounds(202, 125, 149, 27);

        contact.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jPanel1.add(contact);
        contact.setBounds(136, 215, 305, 27);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jLabel6.setText("Contact No.(s) :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(16, 218, 102, 21);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jLabel7.setText("Address :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(16, 260, 60, 21);

        address.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jPanel1.add(address);
        address.setBounds(136, 260, 305, 27);

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jLabel8.setText("Father's/Guardian Name:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(16, 96, 168, 19);

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jLabel9.setText("Mother's Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(16, 128, 100, 21);

        jComboBox1.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(202, 170, 50, 27);

        jComboBox2.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(260, 170, 95, 27);

        jComboBox3.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(361, 170, 80, 27);

        jComboBox4.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(570, 50, 60, 27);

        jComboBox5.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(639, 54, 99, 27);

        jComboBox6.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox6);
        jComboBox6.setBounds(748, 54, 90, 27);

        jComboBox7.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // 
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nursery", "LKG", "UKG", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox7);
        jComboBox7.setBounds(575, 92, 90, 27);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(510, 130, 0, 0);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rec.png"))); // 
        jPanel1.add(jLabel11);
        jLabel11.setBounds(530, 130, 220, 200);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 63, 862, 352);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // 
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(366, 426, 93, 37);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // 
        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(752, 474, 120, 37);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // 
        jLabel1.setText("Scholar No. :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 14, 121, 28);

        schno.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // 
        getContentPane().add(schno);
        schno.setBounds(149, 11, 74, 34);

        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // 
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(366, 474, 93, 37);

        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // 
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(35, 474, 75, 37);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel14.setText("jLabel10");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(590, 0, 350, 170);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel20.setText("jLabel10");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, 0, 300, 170);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel18.setText("jLabel10");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(-50, 120, 540, 510);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel22.setText("jLabel10");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(270, 360, 300, 170);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel23.setText("jLabel10");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(0, 360, 300, 170);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel27.setText("jLabel10");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(570, 370, 300, 170);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel28.setText("jLabel10");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(570, 370, 300, 170);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel29.setText("jLabel10");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(570, 370, 300, 170);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel30.setText("jLabel10");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(570, 370, 300, 170);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel15.setText("jLabel10");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(300, 0, 350, 170);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel16.setText("jLabel10");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(590, 0, 350, 170);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel17.setText("jLabel10");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(590, 0, 350, 170);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel25.setText("jLabel10");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(600, 150, 300, 170);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel31.setText("jLabel10");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(600, 210, 300, 170);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel33.setText("jLabel10");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(600, 370, 300, 170);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel26.setText("jLabel10");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(-30, 160, 300, 170);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // 
        jLabel34.setText("jLabel10");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(-30, 160, 300, 170);

        pack();
    }// 

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//
        // :
    }//

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {// 
        // :
    }//

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//
        // :
        
        try{
            sno = Integer.parseInt(schno.getText());
            nm = name.getText();
            fnm = fname.getText();
            mnm = mname.getText();
            cno = contact.getText();
            add = address.getText();
            dd = Integer.parseInt((String) jComboBox1.getSelectedItem());
            mm = 1;
            month = (String)jComboBox2.getSelectedItem();
                    switch (month)
                            {
                                case "January"  : mm = 1;
                                break;
                                case "February" : mm = 2;
                                break;
                                case "March"    : mm = 3;
                                break;
                                case "April"    : mm = 4;
                                break;
                                case "May"      : mm = 5;
                                break;
                                case "June"     : mm = 6;
                                break;
                                case "July"     : mm = 7;
                                break;
                                case "August"   : mm = 8;
                                break;
                                case "September": mm = 9;
                                break;
                                case "October"  : mm = 10;
                                break;
                                case "November" : mm = 11;
                                break;
                                case "December" : mm = 12;
                                break;
                            }
            yy = Integer.parseInt((String) jComboBox3.getSelectedItem());
            dob = yy+"/"+mm+"/"+dd ;
            dda = Integer.parseInt((String) jComboBox4.getSelectedItem());
            mma = 1;
            montha = (String)jComboBox5.getSelectedItem();
                    switch (montha)
                            {
                                case "January"  : mma = 1;
                                break;
                                case "February" : mma = 2;
                                break;
                                case "March"    : mma = 3;
                                break;
                                case "April"    : mma = 4;
                                break;
                                case "May"      : mma = 5;
                                break;
                                case "June"     : mma = 6;
                                break;
                                case "July"     : mma = 7;
                                break;
                                case "August"   : mma = 8;
                                break;
                                case "September": mma = 9;
                                break;
                                case "October"  : mma = 10;
                                break;
                                case "November" : mma = 11;
                                break;
                                case "December" : mma = 12;
                                break;
                            }
            yya = Integer.parseInt((String) jComboBox6.getSelectedItem());
            doa = yya+"/"+mma+"/"+dda ;
            cla = (String) jComboBox7.getSelectedItem();

            
                try{
                    Class.forName("com.mysql.jdbc.Driver");

                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                                 "root",
                                                                 "");

                    Statement stmt = con.createStatement();
                    
                    String check = "Select * from StdRec where SchNo = '" +sno+"'|| Name ='"+nm+"'";
                    
                    ResultSet rs = stmt.executeQuery(check);
                    
                    if(!rs.next())
                    {
                        if(nm.isEmpty()||fnm.isEmpty()||mnm.isEmpty()||cno.isEmpty()||add.isEmpty())
                        {
                            JOptionPane.showMessageDialog(this,"Please fill all the entries","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        {
                            String query = "insert into StdRec values (" +sno+ ",'" +nm+ "','" +fnm+ "','" +mnm+"','" +dob+ "','" +cno+ "','" +add+ "','" +doa+"','" +cla+"')";

                            stmt.executeUpdate(query);

                            JOptionPane.showMessageDialog(this, "Successfully Entered");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Scholar Number already exists" +"\n" +"Please Enter another Scholar Number","Error",JOptionPane.ERROR_MESSAGE);
                        schno.setText("");
                    }
                }catch(ClassNotFoundException | SQLException e){ JOptionPane.showMessageDialog(this,e);}
        }catch(NumberFormatException e){JOptionPane.showMessageDialog(this, "Please enter a valid Scholar Number");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//
        // :
        new AdminLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//
        // :
        schno.setText("");
        name.setText("");
        fname.setText("");
        mname.setText("");
        contact.setText("");
        address.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
        jComboBox7.setSelectedIndex(0);
       
    } 
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
     } 
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     } 
    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
     } 
    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
     } 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         new StudentHome().setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable()  {
            public void run()
            {
            new NewStudent().setVisible(true);
            }
            });
    }

     private JTextField address;
    private JTextField contact;
    private JTextField fname;
    private JButton jButton1;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JComboBox<String> jComboBox3;
    private JComboBox<String> jComboBox4;
    private JComboBox<String> jComboBox5;
    private JComboBox<String> jComboBox6;
    private JComboBox<String> jComboBox7;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JScrollBar jScrollBar1;
    private JTextField mname;
    private JTextField name;
    private JTextField schno;
 }

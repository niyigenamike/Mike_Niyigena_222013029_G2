 
package pkgfinal;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin extends javax.swing.JFrame {
    String id1;
    
    public AdminLogin() {
        design();
    }
    public AdminLogin(String id) throws Exception
    {
    	design(); 
     id1 = id;
    }
    
    @SuppressWarnings("unchecked")
     private void design() {

        jLabel1 = new JLabel();
        jLabel2 = new  JLabel();
        StrID = new  JTextField();
        StrPass = new  JPasswordField();
        jButton1 = new  JButton();
        jButton2 = new  JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new  JLabel();
        StrAdp = new  JPasswordField();
        jLabel3 = new  JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setMinimumSize(new java.awt.Dimension(560, 555));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setText("Enter ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 190, 33);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel2.setText("Enter Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 190, 34);

        StrID.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        getContentPane().add(StrID);
        StrID.setBounds(200, 30, 290, 40);

        StrPass.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        getContentPane().add(StrPass);
        StrPass.setBounds(200, 90, 290, 40);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 220, 110, 37);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jButton2.setText("Forgot Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 220, 141, 29);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 360, 110, 37);

        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton5.setText("SignUp");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(180, 360, 130, 37);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); 
 
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.jpg"))); 
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 0, 580, 570);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
         id1 = StrID.getText();  
        String pass = StrPass.getText();
        String adpass = StrAdp.getText(); // 
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                         "root",
                                                         "");
            
            Statement stmt = con.createStatement();
            
            String query = "Select * from adminlogin where ID = '" +id1+ "' and Password = '" +pass+ "'";
            
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next())
            {
                new AdminHomePage().setVisible(true);
                this.dispose();        StrID.setText("");
        StrPass.setText("");
        StrAdp.setText("");

            }
                else
                JOptionPane.showMessageDialog(this, "Incorrect ID/Password");
                 
            StrID.setText("");
            StrPass.setText("");
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this,e);}
        
        }
         
    
 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
                  JOptionPane.showMessageDialog(this,"Thank You For Using" + "\n"
                                        + "Created By :-" + "\n"
                                        + "MIKE" + "\n"
                                         );
         System.exit(0);

    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
         new ForgotPass().setVisible(true);
        this.dispose();
    } 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) { 
         new AdminSignUp().setVisible(true);
        this.dispose();
    } 
    private void StrAdpActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

     private  JPasswordField StrAdp;
    private  JTextField StrID;
    private  JPasswordField StrPass;
    private  JButton jButton1;
    private  JButton jButton2;
    private  JButton jButton3;
    private  JButton jButton5;
    private  JLabel jLabel1;
    private  JLabel jLabel2;
    private  JLabel jLabel3;
    private JLabel jLabel6;
 }

 package pkgfinal;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ChangeAdminPass extends javax.swing.JFrame {

    
    public ChangeAdminPass() {
        initialise();
    }

     @SuppressWarnings("unchecked")
     private void initialise() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        newp = new JPasswordField();
        renewp = new JPasswordField();
        txtid = new JTextField();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Admin Password");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jLabel1.setText("Enter ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(36, 87, 196, 22);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jLabel2.setText("Enter New Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(36, 137, 196, 26);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jLabel3.setText("Re-enter New Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(36, 188, 218, 28);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 237, 183, 37);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(18, 362, 75, 37);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(347, 362, 81, 37);

        newp.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        getContentPane().add(newp);
        newp.setBounds(299, 133, 143, 34);

        renewp.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        getContentPane().add(renewp);
        renewp.setBounds(299, 185, 143, 34);

        txtid.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(299, 81, 143, 34);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 500, 430);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -10, 500, 430);

        pack();
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
         String id = txtid.getText();
        String npass = newp.getText();
        String rnpass = renewp.getText();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                         "root",
                                                         "");
            Statement stmt = con.createStatement();
            
            String query = "Select * from adminlogin where ID = '"  +id+ "'";
            
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next())
            {
                if (npass.equals(rnpass))
                {
                    String update = "update adminlogin set Password = '" +npass+ "' where ID = '" +id+ "'";
                    stmt.executeUpdate(update);
                    JOptionPane.showMessageDialog(this, "Password Changed Successfully");
                    new AdminLogin().setVisible(true);
                    this.dispose();
                }
            }
            
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this,"passwords are not same");}
    } 
    private void txtidActionPerformed(java.awt.event.ActionEvent evt) { 
     } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
         new ForgotPass().setVisible(true);
        this.dispose();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
                   JOptionPane.showMessageDialog(this,"Thank You For Using" + "\n"
                                        + "Created By :-" + "\n"
                                        + "Sanidhya Teni" + "\n"
                                        + "Mahasvin Raj Mittal" + "\n"
                                        + "Aatmik Jain");
         System.exit(0);
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
            java.util.logging.Logger.getLogger(ChangeAdminPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeAdminPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeAdminPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeAdminPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeAdminPass().setVisible(true);
            }
        });
    }

     private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPasswordField newp;
    private JPasswordField renewp;
    private JTextField txtid;
 }

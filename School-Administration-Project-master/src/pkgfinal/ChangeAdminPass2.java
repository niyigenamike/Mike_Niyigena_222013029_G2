 
package pkgfinal;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 public class ChangeAdminPass2 extends javax.swing.JFrame {

     
    public ChangeAdminPass2() {
    	design();
    }

     
    @SuppressWarnings("unchecked")
     private void design() {

        txtid = new JTextField();
        renewp = new JPasswordField();
        newp = new JPasswordField();
        jButton3 = new JButton();
        jButton2 = new JButton();
        jButton1 = new JButton();
        jLabel3 = new JLabel();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Admin Password");
        setMinimumSize(new java.awt.Dimension(450, 435));
        setResizable(false);
        getContentPane().setLayout(null);

        txtid.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(290, 10, 143, 34);

        renewp.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        getContentPane().add(renewp);
        renewp.setBounds(290, 110, 143, 34);

        newp.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        getContentPane().add(newp);
        newp.setBounds(290, 60, 143, 34);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 240, 81, 37);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 240, 75, 37);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 240, 183, 37);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Re-enter New Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 218, 28);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Enter New Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 196, 26);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Enter ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 196, 22);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 0, 420);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); //  
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 500, 430);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 170, 34, 14);

        pack();
    } 
    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {// 
     } 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// 
          JOptionPane.showMessageDialog(this,"Thank You For Using" + "\n"
                                        + "Created By :-" + "\n"
                                        + "Sanidhya Teni" + "\n"
                                        + "Mahasvin Raj Mittal" + "\n"
                                        + "Aatmik Jain");
         System.exit(0);
    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// 
         new AdminHomePage().setVisible(true);
        this.dispose();
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// 
         String id = txtid.getText();
        String npass = newp.getText();
        String rnpass = renewp.getText();
        if(id.isEmpty()||npass.isEmpty()||rnpass.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please fill all the Entries","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                "root",
                "mysql");
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
                    new AdminHomePage().setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Password did not match","Error",JOptionPane.ERROR_MESSAGE);
                    newp.setText("");
                    renewp.setText("");
                }
            }
            else
            {
               JOptionPane.showMessageDialog(this,"id not found","Error",JOptionPane.ERROR_MESSAGE); 
            }
            }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e,"Error",JOptionPane.ERROR_MESSAGE);}
        }    
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
            java.util.logging.Logger.getLogger(ChangeAdminPass2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeAdminPass2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeAdminPass2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeAdminPass2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeAdminPass2().setVisible(true);
            }
        });
    }

     private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPasswordField newp;
    private JPasswordField renewp;
    private JTextField txtid;
 }

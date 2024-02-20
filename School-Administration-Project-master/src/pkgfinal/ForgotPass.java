 package pkgfinal;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 
public class ForgotPass extends javax.swing.JFrame {
 
    public ForgotPass() {
       
        d();
        jLabel2.setVisible(false);
        txtcode.setVisible(false);
        jButton2.setVisible(false);
    }
    double a = Math.random();
    double Gcode = Math.round(a*10000);
     
    @SuppressWarnings("unchecked")
     private void d() {

        jLabel3 = new JLabel();
        jLabel1 = new JLabel();
        txtid = new JTextField();
        jButton1 = new JButton();
        jLabel2 = new JLabel();
        txtcode = new JPasswordField();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jLabel6 = new JLabel();
        txtAdp = new JPasswordField();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forgot Admin Password\n");
        setMinimumSize(new java.awt.Dimension(405, 425));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jLabel1.setText("Enter ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 148, 38);

        txtid.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        getContentPane().add(txtid);
        txtid.setBounds(210, 30, 186, 34);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jButton1.setText("Get Code");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 150, 109, 37);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jLabel2.setText("Enter Code :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 210, 109, 22);

        txtcode.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtcode);
        txtcode.setBounds(190, 210, 183, 34);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jButton2.setText("Submit");
        jButton2.setMinimumSize(new java.awt.Dimension(500, 370));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 300, 93, 37);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 350, 75, 37);

        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(310, 350, 81, 37);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); //  
        jLabel6.setText("Enter Admin Password :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 100, 220, 30);

        txtAdp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtAdp);
        txtAdp.setBounds(260, 100, 130, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 0, 410);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled1.png"))); //  
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 470, 420);

        pack();
    }//  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// 
         String id = txtid.getText();
        String adpass = txtAdp.getText();
        if(adpass.equals("1234"))
        {try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                         "root",
                                                         " ");
            
            Statement stmt = con.createStatement();
            
            String query = "Select ID from adminlogin where ID = '" + id + "'";
            
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next())
                    {
                        JOptionPane.showMessageDialog(this, Gcode + "\n" + "Please Enter This Code");
                        jLabel2.setVisible(true);
                        txtcode.setVisible(true);
                        jButton2.setVisible(true);
                    }
            else
            {
                JOptionPane.showMessageDialog(this, "Incorrect ID");
                txtid.setText("");
                txtAdp.setText("");
            }
                    
        }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e);}
            jButton2.enable(true);
        }
        else
                {
                 JOptionPane.showMessageDialog(this, "Incorrect Admin Password");
                  txtid.setText("");
                  txtAdp.setText("");
                }
       
    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// 
         double code = Double.parseDouble(txtcode.getText());
        if (code==Gcode)
        {
            new ChangeAdminPass().setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Enter correct Code");
            txtcode.setText("");
        }
        
    } 
    private void txtcodeActionPerformed(java.awt.event.ActionEvent evt) {//G
     } 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//
         new AdminLogin().setVisible(true);
        this.dispose();
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//
                JOptionPane.showMessageDialog(this,"Thank You For Using");
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
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPass().setVisible(true);
            }
        });
    }

     private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPasswordField txtAdp;
    private JPasswordField txtcode;
    private JTextField txtid;
 }

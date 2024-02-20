package pkgfinal;

import java.sql.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminSignUp extends javax.swing.JFrame {

    public AdminSignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        name = new JTextField();
        ID = new JTextField();
        Password = new JPasswordField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jLabel4 = new JLabel();
        jLabel6 = new JLabel();
        StrAdp = new JPasswordField();
        jLabel7 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Admin Sign Up");
        setMinimumSize(new java.awt.Dimension(565, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24));
        jLabel1.setText("Enter ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 160, 149, 37);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24));
        jLabel2.setText("Enter Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 210, 149, 30);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24));
        jLabel3.setText("Enter Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 125, 28);

        name.setFont(new java.awt.Font("Monotype Corsiva", 2, 24));
        getContentPane().add(name);
        name.setBounds(250, 120, 296, 34);

        ID.setFont(new java.awt.Font("Monotype Corsiva", 2, 24));
        getContentPane().add(ID);
        ID.setBounds(250, 160, 296, 37);

        Password.setFont(new java.awt.Font("Monotype Corsiva", 2, 24));
        getContentPane().add(Password);
        Password.setBounds(250, 210, 297, 37);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24));
        jButton1.setText("SignUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 400, 99, 37);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 350, 75, 37);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 24));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 350, 71, 37);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 36));
        jLabel4.setText("New Admin Sign Up");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(113, 0, 305, 41);

        StrAdp.setForeground(new java.awt.Color(255, 255, 255));
        StrAdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrAdpActionPerformed(evt);
            }
        });
        getContentPane().add(StrAdp);
        StrAdp.setBounds(250, 260, 300, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminnew.png")));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-6, 0, 570, 450);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("NOW you can sign up okay");
        String nm = name.getText();
        String id = ID.getText();
        String pass = Password.getText();
        String adpass = StrAdp.getText();
        if (nm.isEmpty() || id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the Entries", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Password field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/schooladmin", "root", "");
                    Statement stmt = con.createStatement();
                    String query = "insert into AdminLogin(Name,ID,Password) values('" + nm + "','" + id + "','" + pass + "')";
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(this, "You are now an Admin");
                    new AdminHomePage().setVisible(true);
                    this.dispose();
                } catch (ClassNotFoundException | SQLException e) {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(this, "Error");
                }
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Thank You For Using\nCreated By :-\nNIYIGENA MIKE\n\n");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        new AdminLogin().setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSignUp().setVisible(true);
            }
        });
    }

    private JTextField ID;
    private JPasswordField Password;
    private JPasswordField StrAdp;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JTextField name;
}

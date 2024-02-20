package pkgfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class hhh extends javax.swing.JFrame {

    public hhh() {
        initComponents();
    }

    String stud_id, course, marks;

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new JLabel();
        StudId = new JTextField();
        jButton2 = new JButton();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        Course = new JTextField();
        jLabel3 = new JLabel();
        Marks = new JTextField();
        jButton3 = new JButton();
        jButton4 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Marks");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 20));
        jLabel1.setText("Student ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(23, 29, 96, 26);

        StudId.setFont(new java.awt.Font("Monotype Corsiva", 2, 20));
        getContentPane().add(StudId);
        StudId.setBounds(137, 27, 200, 30);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 20));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 470, 69, 33);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Add Marks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 3, 24)));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 20));
        jLabel2.setText("Course :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 60, 24);

        Course.setFont(new java.awt.Font("Monotype Corsiva", 2, 20));
        jPanel1.add(Course);
        Course.setBounds(120, 60, 200, 30);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 20));
        jLabel3.setText("Marks :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 100, 47, 24);

        Marks.setFont(new java.awt.Font("Monotype Corsiva", 2, 20));
        jPanel1.add(Marks);
        Marks.setBounds(120, 100, 110, 30);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 20));
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 150, 81, 33);

        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 2, 20));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(120, 150, 69, 33);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 80, 350, 200);

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//
     //   new Home().setVisible(true);
        this.dispose();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//
        stud_id = StudId.getText();
        course = Course.getText();
        marks = Marks.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                    "root",
                    "");
            Statement stmt = con.createStatement();

            if (stud_id.isEmpty() || course.isEmpty() || marks.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all the entries", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String query = "insert into marks (stud_id, course, marks) values('" + stud_id + "','" + course + "','" + marks + "')";

                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Successfully Entered");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//
        StudId.setText("");
        Course.setText("");
        Marks.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hhh().setVisible(true);
            }
        });
    }

    private JTextField Course;
    private JTextField Marks;
    private JTextField StudId;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
}

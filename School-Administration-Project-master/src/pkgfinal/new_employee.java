 package pkgfinal;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class new_employee extends javax.swing.JFrame {
 
    public new_employee() {
        initComponents();
    }
    String tid,nm,cno,add,post,dob,dept,month,sal;
    int dd,mm,yy;
     
    @SuppressWarnings("unchecked")
     private void initComponents() {

        jLabel29 = new JLabel();
        jLabel1 = new JLabel();
        Tid = new JTextField();
        jButton2 = new JButton();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        Name = new JTextField();
        jLabel3 = new JLabel();
        jComboBox3 = new JComboBox<>();
        jComboBox4 = new JComboBox<>();
        jComboBox5 = new JComboBox<>();
        jLabel4 = new JLabel();
        Cno = new JTextField();
        jLabel5 = new JLabel();
        Add = new JTextField();
        jLabel7 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel8 = new JLabel();
        jComboBox6 = new JComboBox<>();
        jLabel9 = new JLabel();
        Sal = new JTextField();
        jLabel6 = new JLabel();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton6 = new JButton();
        jLabel16 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel25 = new JLabel();
        jLabel30 = new JLabel();
        jLabel32 = new JLabel();
        jLabel31 = new JLabel();

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel29.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NewTeacher");
        setMinimumSize(new java.awt.Dimension(740, 535));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jLabel1.setText("Employee ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(23, 29, 96, 26);

        Tid.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        getContentPane().add(Tid);
        Tid.setBounds(137, 27, 59, 30);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 470, 69, 33);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 3, 24))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 60, 24);

        Name.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jPanel1.add(Name);
        Name.setBounds(120, 60, 220, 30);

       
        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jLabel4.setText("Contact No.(s) :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 190, 108, 24);

        Cno.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        Cno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnoActionPerformed(evt);
            }
        });
        jPanel1.add(Cno);
        Cno.setBounds(120, 190, 212, 30);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jLabel5.setText("Address :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 250, 64, 24);

        Add.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jPanel1.add(Add);
        Add.setBounds(120, 240, 212, 30);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jLabel7.setText("Gender :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 100, 93, 24);

        jComboBox1.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Femal" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(120, 100, 150, 30);

        
 
        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jLabel9.setText("Salary :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 330, 53, 24);

        Sal.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jPanel1.add(Sal);
        Sal.setBounds(120, 330, 110, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/record.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 30, 600, 320);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 80, 700, 376);

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(640, 470, 65, 33);

        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(440, 470, 69, 33);

        jButton6.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jButton6.setText("Submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(210, 470, 81, 33);

        jLabel16.setText("jLabel10");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 280, 540, 300);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel22.setText("jLabel10");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(560, 0, 300, 170);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel23.setText("jLabel10");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(260, 0, 300, 170);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel24.setText("jLabel10");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(560, 160, 300, 170);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel26.setText("jLabel10");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(590, 360, 300, 170);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel27.setText("jLabel10");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(0, 360, 300, 170);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel28.setText("jLabel10");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(0, 190, 300, 170);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel25.setText("jLabel10");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(300, 360, 300, 170);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel30.setText("jLabel10");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(0, 0, 300, 170);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel32.setText("jLabel10");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(0, 60, 300, 170);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel31.setText("jLabel10");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(710, 320, 300, 170);

        pack();
    } 
    private void CnoActionPerformed(java.awt.event.ActionEvent evt) {//      
    	} 
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//
         new TeacherHome().setVisible(true);
        this.dispose();
    } 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// 
          JOptionPane.showMessageDialog(this,"Thank You For Using");
        System.exit(0);
    } 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//
         tid = Tid.getText();
        if(tid.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter the Teacher ID","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            nm = Name.getText();
            dept = (String)jComboBox1.getSelectedItem();
            dd = Integer.parseInt((String)jComboBox3.getSelectedItem());
            month = (String)jComboBox4.getSelectedItem();
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
            yy = Integer.parseInt((String) jComboBox5.getSelectedItem());
            dob = yy+"/"+mm+"/"+dd ;
            cno = Cno.getText();
            add = Add.getText();
            post = (String)jComboBox6.getSelectedItem();
            sal = Sal.getText();
            
                try{
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                             "root",
                                                             "");
                Statement stmt = con.createStatement();
                
                String check = "Select * from employee where Tid = '" +tid+"'";
                    
                ResultSet rs = stmt.executeQuery(check);

                if(rs.next())
                {
                    JOptionPane.showMessageDialog(this,"Employee ID already exists" +"\n" +"Please Enter another Teacher ID","Error",JOptionPane.ERROR_MESSAGE);
                    Tid.setText("");
                }
                else
                {
                    if(nm.isEmpty()||cno.isEmpty()||add.isEmpty()||sal.isEmpty())
                    {
                        JOptionPane.showMessageDialog(this,"Please fill all the entries","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        String query = "insert into employee values('" +tid+ "','" +nm+ "','" +dept+ "','" +dob+ "','" +cno+ "','" +add+ "','" +post+ "','" +sal+"')";

                        stmt.executeUpdate(query);
                        JOptionPane.showMessageDialog(this, "Successfully Entered");
                    }
                }
            }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e);}
            
        }
    } 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//
         Tid.setText("");
        Name.setText("");
        Cno.setText("");
        Add.setText("");
        Sal.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
    } 
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//
     } 
    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {// 
     } 
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//
     } 
    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {// 
     } 
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {// 
     } 
    public static void main(String args[]) {
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_employee().setVisible(true);
            }
        });
    }

     private JTextField Add;
    private JTextField Cno;
    private JTextField Name;
    private JTextField Sal;
    private JTextField Tid;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton6;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox3;
    private JComboBox<String> jComboBox4;
    private JComboBox<String> jComboBox5;
    private JComboBox<String> jComboBox6;
    private JLabel jLabel1;
    private JLabel jLabel16;
    private JLabel jLabel2;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
 }

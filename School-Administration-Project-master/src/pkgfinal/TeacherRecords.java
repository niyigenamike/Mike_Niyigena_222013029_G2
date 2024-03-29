 package pkgfinal;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class TeacherRecords extends javax.swing.JFrame {
 
    public TeacherRecords() {
        d();
        Name.setEnabled(false);
        Dept.setEnabled(false);
        ddob.setEnabled(false);
        mdob.setEnabled(false);
        ydob.setEnabled(false);
        Cno.setEnabled(false);
        Add.setEnabled(false);
        Post.setEnabled(false);
        Sal.setEnabled(false);
    }
    
   
    @SuppressWarnings("unchecked")
     private void d() {

        jButton7 = new JButton();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jLabel1 = new JLabel();
        Tid = new JTextField();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        Name = new JTextField();
        jLabel3 = new JLabel();
        ddob = new JComboBox<>();
        mdob = new JComboBox<>();
        ydob = new JComboBox<>();
        jLabel4 = new JLabel();
        Cno = new JTextField();
        jLabel5 = new JLabel();
        Add = new JTextField();
        jLabel7 = new JLabel();
        Dept = new JComboBox<>();
        jLabel8 = new JLabel();
        Post = new JComboBox<>();
        jLabel9 = new JLabel();
        Sal = new JTextField();
        jLabel11 = new JLabel();
        jLabel23 = new JLabel();
        jLabel33 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jLabel22 = new JLabel();
        jLabel24 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();
        jLabel32 = new JLabel();
        jLabel34 = new JLabel();
        jLabel35 = new JLabel();

        jButton7.setText("jButton7");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel25.setText("jLabel10");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel26.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teachers' Records");
        setMinimumSize(new java.awt.Dimension(630, 570));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel1.setText("Teacher ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(23, 27, 90, 26);

        Tid.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        getContentPane().add(Tid);
        Tid.setBounds(120, 30, 49, 27);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 2, 24))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(6, 27, 60, 24);

        Name.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jPanel1.add(Name);
        Name.setBounds(114, 29, 280, 27);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel3.setText("DOB :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 100, 44, 21);

        ddob.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        ddob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(ddob);
        ddob.setBounds(120, 100, 48, 27);

        mdob.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        mdob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(mdob);
        mdob.setBounds(180, 100, 99, 27);

        ydob.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        ydob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1956", "1957", "1958", "1959", "1960", "1961", "1960", "1962", "19603", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995" }));
        jPanel1.add(ydob);
        ydob.setBounds(290, 100, 72, 27);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel4.setText("Contact No.(s) :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(6, 145, 102, 21);

        Cno.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        Cno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnoActionPerformed(evt);
            }
        });
        jPanel1.add(Cno);
        Cno.setBounds(114, 142, 200, 27);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel5.setText("Address :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(6, 183, 60, 21);

        Add.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jPanel1.add(Add);
        Add.setBounds(114, 180, 200, 27);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel7.setText("Department :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(6, 62, 88, 21);

        Dept.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        Dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Physics", "Chemistry", "Maths", "Biology", "I.P.", "C.S.", "English", "Hindi", "French", "Sanskrit", "Economics", "B.S.", "Accounts", "Psychology", "History", "Political Science", "Geography", "P.E.", "Arts", "Music", "Dance", " " }));
        jPanel1.add(Dept);
        Dept.setBounds(114, 62, 135, 27);

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel8.setText("Position :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 220, 70, 21);

        Post.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        Post.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOD", "Teacher" }));
        jPanel1.add(Post);
        Post.setBounds(120, 220, 82, 27);

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel9.setText("Salary :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 260, 49, 21);

        Sal.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jPanel1.add(Sal);
        Sal.setBounds(120, 260, 120, 27);

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled24.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(180, -10, 420, 370);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel23.setText("jLabel10");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(290, -110, 300, 170);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel33.setText("jLabel10");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(180, -110, 300, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 110, 600, 330);

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Get Records");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 70, 120, 29);

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 490, 80, 29);

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(470, 490, 80, 29);

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(230, 490, 90, 29);

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 0, 102));
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(150, 460, 100, 29);

        jButton6.setBackground(new java.awt.Color(255, 255, 153));
        jButton6.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 0, 102));
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(270, 460, 90, 29);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel22.setText("jLabel10");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(360, 0, 300, 170);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel24.setText("jLabel10");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(610, 160, 300, 170);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel27.setText("jLabel10");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(500, 310, 300, 170);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel28.setText("jLabel10");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(370, 370, 300, 170);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel29.setText("jLabel10");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(70, 370, 300, 170);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel30.setText("jLabel10");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(0, 370, 300, 170);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel31.setText("jLabel10");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(0, 210, 300, 170);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel32.setText("jLabel10");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(60, 0, 300, 170);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel34.setText("jLabel10");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(0, 0, 300, 170);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel35.setText("jLabel10");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(0, 60, 300, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        Date dob;
        String tid,nm,dept,cno,add,post,sal,dd,mm,yy,month;
        tid = Tid.getText();
        if(tid.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter the Teacher ID","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                             "root",
                                                             "");
                Statement stmt = con.createStatement();
                
                
                String query = "Select * from TeacherRec where Tid = '" +tid+ "'";

                ResultSet rs = stmt.executeQuery(query);

                Tid.setEnabled(false);

                if(rs.next())
                {
                    nm = rs.getString("Name");
                    dept = rs.getString("Dept");
                    dob = rs.getDate("DOB");
                    cno = rs.getString("Cno");
                    add = rs.getString("Address");
                    post = rs.getString("Position");
                    sal = rs.getString("Salary");
                    Name.setText(nm);
                    Cno.setText(cno);
                    Add.setText(add);
                    Sal.setText(sal);
                    Dept.setSelectedItem(dept);
                    ddob.setSelectedIndex(dob.getDate()-1);
                    mdob.setSelectedIndex(dob.getMonth());
                    ydob.setSelectedIndex(dob.getYear()-56);
                    Post.setSelectedItem(post);
                    Name.setEnabled(true);
                    Tid.setEnabled(false);
                    Dept.setEnabled(true);
                    ddob.setEnabled(true);
                    mdob.setEnabled(true);
                    ydob.setEnabled(true);
                    Cno.setEnabled(true);
                    Add.setEnabled(true);
                    Post.setEnabled(true);
                    Sal.setEnabled(true);
                }else
                {
                    JOptionPane.showMessageDialog(this, "ID not found","ERROR",JOptionPane.ERROR_MESSAGE);
                    Tid.setText("");
                    Tid.setEnabled(true);
                }


            }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this, e,"ERROR",JOptionPane.ERROR_MESSAGE);}
        }
    }

    private void CnoActionPerformed(java.awt.event.ActionEvent evt) {//
     } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
         new TeacherHome().setVisible(true);
        this.dispose();
    } 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
          JOptionPane.showMessageDialog(this,"Thank You For Using" + "\n"
                                        + "Created By :-" + "\n"
                                        + "NIYIGENA MIKE" + "\n"
                                        );
         System.exit(0);
        
    }// 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
         Tid.setText("");
        Name.setText("");
        Cno.setText("");
        Add.setText("");
        Sal.setText("");
        Dept.setSelectedIndex(0);
        ddob.setSelectedIndex(0);
        mdob.setSelectedIndex(0);
        ydob.setSelectedIndex(0);
        Post.setSelectedIndex(0);
        Tid.setEnabled(true);
        Name.setEnabled(false);
        Dept.setEnabled(false);
        ddob.setEnabled(false);
        mdob.setEnabled(false);
        ydob.setEnabled(false);
        Cno.setEnabled(false);
        Add.setEnabled(false);
        Post.setEnabled(false);
        Sal.setEnabled(false);
    }// 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         String tid,nm,dept,deptno,cno,add,post,sal,dd,mm,yy,month,dob;
        tid = Tid.getText();
        if(tid.isEmpty())
        {
             JOptionPane.showMessageDialog(this,"Please enter the Teacher ID","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            
            nm = Name.getText();
            dept = (String) Dept.getSelectedItem();
            cno = Cno.getText();
            add= Add.getText();
            post = (String) Post.getSelectedItem();
            sal = Sal.getText();
            dd = (String)ddob.getSelectedItem();
            month = (String)mdob.getSelectedItem();
            mm = "01";                             // 
            switch (month)
                            {
                                case "January"  : mm = "01";
                                break;
                                case "February" : mm = "02";
                                break;
                                case "March"    : mm = "03";
                                break;
                                case "April"    : mm = "04";
                                break;
                                case "May"      : mm = "05";
                                break;
                                case "June"     : mm = "06";
                                break;
                                case "July"     : mm = "07";
                                break;
                                case "August"   : mm = "08";
                                break;
                                case "September": mm = "09";
                                break;
                                case "October"  : mm = "10";
                                break;
                                case "November" : mm = "11";
                                break;
                                case "December" : mm = "12";
                                break;
                            }
            yy = (String)ydob.getSelectedItem();
            dob = yy+"/"+mm+"/"+dd;
            if(nm.isEmpty()||cno.isEmpty()||add.isEmpty()||sal.isEmpty())
            {
             JOptionPane.showMessageDialog(this,"Please fill all the Entries","Error",JOptionPane.ERROR_MESSAGE);   
            }
            else
            {
                try{
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                             "root",
                                                             "");

                Statement stmt = con.createStatement();

                String query = "Update TeacherRec set Name = '" +nm+ "',Dept ='" +dept+ "',DOB ='" +dob+"',Cno ='" +cno+"', Address ='" +add+ "',Position ='" +post+ "',Salary ='" +sal+"' where Tid ='" +tid+ "'";

                stmt.executeUpdate(query);

                JOptionPane.showMessageDialog(this, "Successfully Updated","Update",JOptionPane.PLAIN_MESSAGE);    
                }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this,e,"ERROR",JOptionPane.ERROR_MESSAGE);}
            }
        }
    }// 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//
         String tid = Tid.getText();
        if(tid.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter the Teacher ID","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                             "root",
                                                             "");

                Statement stmt = con.createStatement();
                
                String check = "Select * from TeacherRec";
                        
                String query = "Delete from TeacherRec where Tid ='" +tid+"'";
                
                ResultSet rs = stmt.executeQuery(check);
                if(rs.next())
                {
                    int confirm = JOptionPane.showConfirmDialog(this,"Are you sure you want to Delete this Record","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    
                    if(confirm==JOptionPane.YES_OPTION)
                    {
                        stmt.executeUpdate(query);

                        JOptionPane.showMessageDialog(this, "Successfully Deleted","Delete",JOptionPane.PLAIN_MESSAGE);
                        Tid.setText("");
                        Name.setText("");
                        Cno.setText("");
                        Add.setText("");
                        Sal.setText("");
                        Dept.setSelectedIndex(0);
                        ddob.setSelectedIndex(0);
                        mdob.setSelectedIndex(0);
                        ydob.setSelectedIndex(0);
                        Post.setSelectedIndex(0);
                        Tid.setEnabled(true);
                        Name.setEnabled(false);
                        Dept.setEnabled(false);
                        ddob.setEnabled(false);
                        mdob.setEnabled(false);
                        ydob.setEnabled(false);
                        Cno.setEnabled(false);
                        Add.setEnabled(false);
                        Post.setEnabled(false);
                        Sal.setEnabled(false);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Teacher ID not found","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this,e,"ERROR",JOptionPane.ERROR_MESSAGE);}
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherRecords().setVisible(true);
            }
        });
    }

     private JTextField Add;
    private JTextField Cno;
    private JComboBox<String> Dept;
    private JTextField Name;
    private JComboBox<String> Post;
    private JTextField Sal;
    private JTextField Tid;
    private JComboBox<String> ddob;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    private JLabel jLabel11;
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
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JComboBox<String> mdob;
    private JComboBox<String> ydob;
 }

 package pkgfinal;
import java.sql.*;
import javax.swing.*;
import java.util.Date;
 
public class StudentRecords extends javax.swing.JFrame {

   
    public StudentRecords() {
        d();
         name.setEnabled(false);
        fname.setEnabled(false);
        mname.setEnabled(false);
        ddob.setEnabled(false);
        mdob.setEnabled(false);
        ydob.setEnabled(false);
        Cno.setEnabled(false);
        Add.setEnabled(false);
        ddoa.setEnabled(false);
        mdoa.setEnabled(false);
        ydoa.setEnabled(false);
        cAdm.setEnabled(false);
        pc.setEnabled(false);
    }
    
    
    @SuppressWarnings("unchecked")
     private void d() {

        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel1 = new JLabel();
        schno = new JTextField();
        jButton1 = new JButton();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        name = new JTextField();
        fname = new JTextField();
        mname = new JTextField();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        cAdm = new JComboBox<>();
        jLabel10 = new JLabel();
        pc = new JComboBox<>();
        ddoa = new JComboBox<>();
        mdoa = new JComboBox<>();
        ydoa = new JComboBox<>();
        ddob = new JComboBox<>();
        mdob = new JComboBox<>();
        ydob = new JComboBox<>();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        Cno = new JTextField();
        Add = new JTextField();
        jLabel11 = new JLabel();
        jLabel14 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jLabel19 = new JLabel();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel23.setText("jLabel10");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel24.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Records");
        setMinimumSize(new java.awt.Dimension(780, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jLabel1.setText("Enter Scholar No. : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(35, 25, 170, 29);
        getContentPane().add(schno);
        schno.setBounds(310, 20, 65, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Get Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(185, 72, 111, 33);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 2, 24))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 700));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 58, 26);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel3.setText("DOB :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 170, 65, 25);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel4.setText("Date of Admission :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 50, 129, 23);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel5.setText("Class of Admission :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(360, 90, 128, 26);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(200, 50, 149, 30);

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname);
        fname.setBounds(200, 90, 149, 30);

        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        jPanel1.add(mname);
        mname.setBounds(200, 130, 149, 30);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel6.setText("Contact No.(s) :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(16, 807, 102, 21);

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel7.setText("Address :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(16, 846, 60, 21);

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel8.setText("Father's/Gaurdian Name:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 90, 168, 19);

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel9.setText("Mother's Name :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 130, 110, 21);

        cAdm.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        cAdm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nursery", "LKG", "UKG", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" }));
        cAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAdmActionPerformed(evt);
            }
        });
        jPanel1.add(cAdm);
        cAdm.setBounds(500, 90, 100, 27);

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel10.setText("Present Class :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(370, 130, 106, 21);

        pc.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        pc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nursery", "LKG", "UKG", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" }));
        jPanel1.add(pc);
        pc.setBounds(500, 130, 100, 30);

        ddoa.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        ddoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(ddoa);
        ddoa.setBounds(500, 50, 50, 27);

        mdoa.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        mdoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(mdoa);
        mdoa.setBounds(560, 50, 110, 27);

        ydoa.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        ydoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));
        jPanel1.add(ydoa);
        ydoa.setBounds(680, 50, 70, 27);

        ddob.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        ddob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(ddob);
        ddob.setBounds(200, 170, 50, 27);

        mdob.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        mdob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(mdob);
        mdob.setBounds(260, 170, 90, 27);

        ydob.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        ydob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        jPanel1.add(ydob);
        ydob.setBounds(360, 170, 70, 27);

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel12.setText("Contact No. :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 210, 120, 21);

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel13.setText("Address :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 250, 70, 21);
        jPanel1.add(Cno);
        Cno.setBounds(200, 210, 230, 30);

        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add);
        Add.setBounds(200, 250, 330, 30);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 34, 720, 0);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 30, 420, 280);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 110, 770, 320);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 510, 69, 33);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(500, 510, 65, 33);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(220, 450, 87, 33);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 0, 102));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(380, 450, 79, 33);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Monotype Corsiva", 2, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 0, 102));
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(300, 510, 69, 33);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel19.setText("jLabel10");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(300, 0, 300, 166);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel25.setText("jLabel10");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(600, 0, 300, 166);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel26.setText("jLabel10");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(0, 430, 300, 166);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel27.setText("jLabel10");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(300, 430, 300, 166);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel28.setText("jLabel10");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(600, 410, 300, 166);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel29.setText("jLabel10");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(660, 160, 300, 166);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel30.setText("jLabel10");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(700, 280, 300, 166);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel31.setText("jLabel10");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(0, 0, 300, 166);

        pack();
    } 
    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//
     } 
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {// 
     }// 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// 
         try{
            int sno = Integer.parseInt(schno.getText());
            Date d = new Date();
            try{
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                             "root",
                                                             "");

                Statement stmt = con.createStatement();
                
                String query = "Select * from StdRec where SchNo ="+sno;

                ResultSet rs = stmt.executeQuery(query);

                schno.setEnabled(false);
                
                int classno = 0;
                if (rs.next())
                {
                    String nm = rs.getString("Name");
                    String fnm = rs.getString("FatherName");
                    String mnm = rs.getString("MotherName");
                    Date dob = rs.getDate("DOB");
                    String cno = rs.getString("Cno");
                    String add = rs.getString("Address");
                    Date doa = rs.getDate("DOA");
                    String coa = rs.getString("COA");
                    switch(coa)
                    {
                        case "Nursery" : classno = -3;
                        break;
                        case "LKG" : classno = -2;
                        break;
                        case "UKG" : classno = -1;
                        break;
                        case "I" : classno = 1;
                        break;
                        case "II" : classno = 2;
                        break;
                        case "III" : classno = 3;
                        break;
                        case "IV" : classno = 4;
                        break;
                        case "V" : classno = 5;
                        break;
                        case "VI" : classno = 6;
                        break;
                        case "VII" : classno = 7;
                        break;
                        case "VIII" : classno = 8;
                        break;
                        case "IX" : classno = 9;
                        break;
                        case "X" : classno = 10;
                        break;
                        case "XI" : classno = 11;
                        break;
                        case "XII" : classno = 12;
                        break;
                    }

                    String pclass = "";
                    int pclassno;
                    if (d.getMonth()<4)
                        pclassno = d.getYear()-doa.getYear()+classno-1;
                    else
                        pclassno = d.getYear()-doa.getYear()+classno;
                    switch(pclassno)
                    {
                        case -3 : pclass = "Nursery";
                        break;
                        case -2 : pclass = "LKG";
                        break;
                        case -1 : pclass = "UKG";
                        break;
                        case 1 : pclass = "I";
                        break;
                        case 2 : pclass = "II";
                        break;
                        case 3 : pclass = "III";
                        break;
                        case 4 : pclass = "IV";
                        break;
                        case 5 : pclass = "V";
                        break;
                        case 6 : pclass = "VI";
                        break;
                        case 7 : pclass = "VII";
                        break;
                        case 8 : pclass = "VIII";
                        break;
                        case 9 : pclass = "IX";
                        break;
                        case 10 : pclass = "X";
                        break;
                        case 11 : pclass = "XI";
                        break;
                        case 12 : pclass = "XII";
                        break;
                    }
                    name.setText(nm);
                    fname.setText(fnm);
                    mname.setText(mnm);
                    ddob.setSelectedIndex(dob.getDate()-1);
                    mdob.setSelectedIndex(dob.getMonth());
                    ydob.setSelectedIndex(dob.getYear()-95);
                    Cno.setText(cno);
                    Add.setText(add);
                    ddoa.setSelectedIndex(doa.getDate()-1);
                    mdoa.setSelectedIndex(doa.getMonth());
                    ydoa.setSelectedIndex(doa.getYear()-103);
                    cAdm.setSelectedItem(coa);
                    pc.setSelectedItem(pclass);
                    name.setEnabled(true);
                    fname.setEnabled(true);
                    mname.setEnabled(true);
                    ddob.setEnabled(true);
                    mdob.setEnabled(true);
                    ydob.setEnabled(true);
                    Cno.setEnabled(true);
                    Add.setEnabled(true);
                    ddoa.setEnabled(true);
                    mdoa.setEnabled(true);
                    ydoa.setEnabled(true);
                    cAdm.setEnabled(true);
                    pc.setEnabled(true);
                }else
                {
                    JOptionPane.showMessageDialog(this, "id not found","ERROR",JOptionPane.ERROR_MESSAGE);
                    schno.setEnabled(true);
                    schno.setText("");
                }

            }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this,e,"ERROR",JOptionPane.ERROR_MESSAGE);}

        }catch(NumberFormatException e){JOptionPane.showMessageDialog(this, "Please enter a valid Scholar Number","Error",JOptionPane.ERROR_MESSAGE);}
    }//
 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// 
         new StudentHome().setVisible(true);
        this.dispose();
    }//

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// 
                  JOptionPane.showMessageDialog(this,"Thank You For Using" + "\n"
                                        + "Created By :-" + "\n"
                                        + "NIYIGENA MIKE" + "\n"
                                        + " " + "\n"
                                        + " ");
         System.exit(0);
    }//G

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// 
         String sno = schno.getText();
        if(sno.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter the Scholar Number","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String nm = name.getText();
            String fnm = fname.getText();
            String mnm = mname.getText();
            String dobd = (String) ddob.getSelectedItem();
            String dobm = (String) mdob.getSelectedItem();
            String doby = (String) ydob.getSelectedItem();
            int m = 1;  //  
            switch (dobm)
                            {
                                case "January"  : m = 1;
                                break;
                                case "February" : m = 2;
                                break;
                                case "March"    : m = 3;
                                break;
                                case "April"    : m = 4;
                                break;
                                case "May"      : m = 5;
                                break;
                                case "June"     : m = 6;
                                break;
                                case "July"     : m = 7;
                                break;
                                case "August"   : m = 8;
                                break;
                                case "September": m = 9;
                                break;
                                case "October"  : m = 10;
                                break;
                                case "November" : m = 11;
                                break;
                                case "December" : m = 12;
                                break;
                            }
            String dob = doby +"/"+m+"/"+dobd;
            System.out.println(m+"");    
            String cno = Cno.getText();
            String add = Add.getText();
            String doad = (String) ddoa.getSelectedItem();
            String doam = (String) mdoa.getSelectedItem();
            String doay = (String) ydoa.getSelectedItem();
            int mm = 1;
            switch(doam)
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
            String doa = doay +"/"+mm+"/"+doad;
            String coa = (String) cAdm.getSelectedItem();
            if(nm.isEmpty()||fnm.isEmpty()||mnm.isEmpty()||cno.isEmpty()||add.isEmpty())
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

                String query = "Update StdRec set Name = '" +nm+ "', FatherName = '" +fnm+ "', MotherName = '" +mnm+ "', DOB = '" +dob+ "', Cno = '" +cno+ "', Address = '" +add+ "', DOA = '" +doa+ "', COA = '" +coa+ "' where SchNo ="+sno;

                stmt.executeUpdate(query);

                JOptionPane.showMessageDialog(this, "Successfully Updated");    
                }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this,e,"ERROR",JOptionPane.ERROR_MESSAGE);}
            }        
        }
    }// 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
         
        String sno = schno.getText();
        if(sno.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter the Scholar Number","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try{

                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin",
                                                             "root",
                                                             "");

                Statement stmt = con.createStatement();
                
                String check = "Select * from StdRec";
                
                String query = "Delete from StdRec where SchNo =" +sno;
                
                ResultSet rs = stmt.executeQuery(check);
                
                if (rs.next())
                {
                    int confirm = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this Record","Confirm Delete",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION)
                    {
                        stmt.executeUpdate(query);

                        JOptionPane.showMessageDialog(this, "Successfully Deleted");    

                        schno.setText("");
                        name.setText("");
                        fname.setText("");
                        mname.setText("");
                        ddob.setSelectedIndex(0);
                        mdob.setSelectedIndex(0);
                        ydob.setSelectedIndex(0);
                        Cno.setText("");
                        Add.setText("");
                        ddoa.setSelectedIndex(0);
                        mdoa.setSelectedIndex(0);
                        ydoa.setSelectedIndex(0); 
                        cAdm.setSelectedIndex(0);
                        schno.setEnabled(true);
                        name.setEnabled(false);
                        fname.setEnabled(false);
                        mname.setEnabled(false);
                        ddob.setEnabled(false);
                        mdob.setEnabled(false);
                        ydob.setEnabled(false);
                        Cno.setEnabled(false);
                        Add.setEnabled(false);
                        ddoa.setEnabled(false);
                        mdoa.setEnabled(false);
                        ydoa.setEnabled(false);
                        cAdm.setEnabled(false);
                        pc.setEnabled(false);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"ID not found","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                }catch(ClassNotFoundException | SQLException e){JOptionPane.showMessageDialog(this,e,"ERROR",JOptionPane.ERROR_MESSAGE);}
        }
    }//

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//        // 
        schno.setText("");
        name.setText("");
        fname.setText("");
        mname.setText("");
        ddob.setSelectedIndex(0);
        mdob.setSelectedIndex(0);
        ydob.setSelectedIndex(0);
        Cno.setText("");
        Add.setText("");
        ddoa.setSelectedIndex(0);
        mdoa.setSelectedIndex(0);
        ydoa.setSelectedIndex(0); 
        cAdm.setSelectedIndex(0);
        schno.setEnabled(true);
        name.setEnabled(false);
        fname.setEnabled(false);
        mname.setEnabled(false);
        ddob.setEnabled(false);
        mdob.setEnabled(false);
        ydob.setEnabled(false);
        Cno.setEnabled(false);
        Add.setEnabled(false);
        ddoa.setEnabled(false);
        mdoa.setEnabled(false);
        ydoa.setEnabled(false);
        cAdm.setEnabled(false);
        pc.setEnabled(false);
    }// 

    private void cAdmActionPerformed(java.awt.event.ActionEvent evt) {//
     }// 
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {
     } 
    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//
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
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRecords().setVisible(true);
            }
        });
    }

     private JTextField Add;
    private JTextField Cno;
    private JComboBox<String> cAdm;
    private JComboBox<String> ddoa;
    private JComboBox<String> ddob;
    private JTextField fname;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel19;
    private JLabel jLabel2;
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
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JComboBox<String> mdoa;
    private JComboBox<String> mdob;
    private JTextField mname;
    private JTextField name;
    private JComboBox<String> pc;
    private JTextField schno;
    private JComboBox<String> ydoa;
    private JComboBox<String> ydob;
 }

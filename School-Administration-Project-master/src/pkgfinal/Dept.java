 package pkgfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

 
public class Dept extends javax.swing.JFrame {

     
    public Dept() {
        initComponents();
        
        
    }

     
    @SuppressWarnings("unchecked")
     private void initComponents() {

        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel2 = new JLabel();
        jButton3 = new JButton();
        jComboBox1 = new JComboBox<>();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Department details\n");
        setMinimumSize(new java.awt.Dimension(840, 540));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 450, 69, 29);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 450, 93, 29);

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        jTable1.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Department", "Date_Of_Birth", "Contact No.", "Address", "Position", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 810, 300);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel2.setText("Select Subject :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 0, 190, 50);

        jButton3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        jButton3.setText("Get Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(350, 70, 230, 40);

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maths", "Physics", "Chemistry", "Biology", "Accounts", "B.S. ", "I.P.", "C.S.", "English", "Economics", "Hindi", "Sanskrit", "French", "Science", "History", "Political Science", "Geography", "Music ", "Dance", "Arts", "E.ship", " " }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(480, 10, 228, 30);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel20.setText("jLabel10");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(570, 370, 300, 170);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel21.setText("jLabel10");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(0, 160, 300, 170);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel22.setText("jLabel10");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(300, 160, 300, 170);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel23.setText("jLabel10");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(0, 320, 300, 170);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel24.setText("jLabel10");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(0, 0, 300, 170);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel25.setText("jLabel10");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(300, 370, 300, 170);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel26.setText("jLabel10");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(580, 0, 300, 170);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel27.setText("jLabel10");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(570, 160, 300, 170);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel28.setText("jLabel10");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(300, 0, 300, 170);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel29.setText("jLabel10");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(0, 370, 300, 170);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel30.setText("jLabel10");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(570, 330, 300, 170);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); //  
        jLabel31.setText("jLabel10");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(570, 320, 300, 170);

        pack();
    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// 
         new AdminLogin().setVisible(true);
        this.dispose();
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// 
         new TeacherHome().setVisible(true);
        this.dispose();
    } 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// 
                 DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
                
                String subject= (String)jComboBox1.getSelectedItem();
        try
        {
            int count = dm.getRowCount();
            for(int i=0;i<count;i++)
            {
                dm.removeRow(0);
            }
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","");
            Statement stmt = con.createStatement();
            String sql = "select * from teacherrec where Dept!='"+subject+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                
                  String Tid = rs.getString(1);
                  String name = rs.getString(2);
                  String dept = rs.getString(3);
                  String dob = rs.getString(4);
                  String cno = rs.getString(5);
                  String address = rs.getString(6);
                  String pno = rs.getString(7);
                  String salary = rs.getString(8);
                  
                  
                 
                  
                  dm.addRow(new Object[]{Tid,name,dept,dob,cno,address,pno,salary});
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
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
            java.util.logging.Logger.getLogger(Dept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dept().setVisible(true);
            }
        });
    }

     private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
 }

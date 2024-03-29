 package pkgfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

 
public class Fees1 extends javax.swing.JFrame {

    
    public Fees1() {
    	design();
        
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
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
              String sql = "select * from stdrec";
              ResultSet rs = stmt.executeQuery(sql);
              
              while(rs.next())
              {
                  String sno = rs.getString(1);
                  String cla = rs.getString(2);
                  String ann = rs.getString(3);
                  String Tuition = rs.getString(4);
                  String Trans = rs.getString(5);
                  String Meal = rs.getString(6);
                  String Total = rs.getString(7);
                  
                  dm.addRow(new Object[]{sno,cla,ann,Tuition,Trans,Meal,Total});
              }
              
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

     
    @SuppressWarnings("unchecked")
     private void design() {

        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("students\n");
        setBackground(new java.awt.Color(102, 153, 0));
        setMinimumSize(new java.awt.Dimension(770, 540));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        jTable1.setFont(new java.awt.Font("Lucida Calligraphy", 2, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " No.", "First Name", "Second name", "Mother name", "Date ", "Fees", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAlignmentX(1.0F);
        jTable1.setAlignmentY(1.0F);
        jTable1.setEnabled(false);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(204, 0, 0));
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 2));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(30);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 190, 770, 274);

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel2.setText("Students :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(109, 63, 295, 41);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 480, 65, 29);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 480, 87, 29);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(462, 0, 0, 0);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(462, 1, 0, 0);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 10, 0, 0);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fee.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, -10, 750, 190);

        jLabel15.setText("jLabel10");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(-40, 310, 540, 300);

        jLabel16.setText("jLabel10");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(330, 290, 540, 300);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel17.setText("jLabel10");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(540, 310, 300, 160);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel19.setText("jLabel10");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(300, 0, 300, 160);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel20.setText("jLabel10");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(520, 0, 300, 160);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel21.setText("jLabel10");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(300, 160, 300, 160);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel22.setText("jLabel10");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(590, 160, 300, 160);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel23.setText("jLabel10");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(0, 410, 300, 160);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel24.setText("jLabel10");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(300, 410, 300, 160);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel25.setText("jLabel10");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(600, 410, 300, 160);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel26.setText("jLabel10");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(0, 0, 300, 160);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel27.setText("jLabel10");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(0, 160, 300, 160);

        pack();
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           new Installments().setVisible(true);
        this.dispose();
    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new AdminLogin().setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Fees1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fees1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fees1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fees1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fees1().setVisible(true);
            }
        });
    }

     private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
 }

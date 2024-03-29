 
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

 
public class annual extends javax.swing.JFrame {

    
    public annual() {
        d();
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
        try
        {
           int count =  dm.getRowCount();
           for(int i=0;i<count;i++)
           {
               dm.removeRow(0);
           }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooladmin","root","mysql");
            Statement stmt = con.createStatement();
            String sql = "select * from annual";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                
                  String cla = rs.getString(1);
                  String ann = rs.getString(2);
                  String Tuition = rs.getString(3);
                  String Trans = rs.getString(4);
                  String Meal = rs.getString(5);
                  String Total = rs.getString(6);
                  
                  dm.addRow(new Object[]{cla,ann,Tuition,Trans,Meal,Total});
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

   
    @SuppressWarnings("unchecked")
     private void d() {

        jScrollPane1 = new  JScrollPane();
        jTable1 = new  JTable();
        jLabel1 = new  JLabel();
        jButton1 = new  JButton();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new  JLabel();
        jButton2 = new  JButton();
        jLabel3 = new  JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new  JLabel();
        jLabel20 = new  JLabel();
        jLabel21 = new  JLabel();
        jLabel22 = new  JLabel();
        jLabel23 = new  JLabel();
        jLabel24 = new  JLabel();
        jLabel25 = new  JLabel();
        jLabel26 = new  JLabel();
        jLabel27 = new  JLabel();
        jLabel28 = new  JLabel();
        jLabel29 = new  JLabel();
        jLabel30 = new  JLabel();
        jLabel31 = new  JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Annual Fees\n");
        setMinimumSize(new java.awt.Dimension(930, 580));
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
                "Class", "Annual Charges", "Tuition Fees", "Transportation Charges", "Meal Charges", "Total Fees"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 184, 901, 330);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Annual Fees :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 60, 205, 41);

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(570, 520, 93, 29);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(862, 0, 0, 0);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(815, 6, 0, 0);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(629, 6, 0, 0);

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 520, 69, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fee.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 0, 750, 190);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel14.setText("jLabel10");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 300, 160);

        jLabel15.setText("jLabel10");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(-30, 290, 540, 300);

        jLabel16.setText("jLabel10");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(440, 270, 540, 300);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel20.setText("jLabel10");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(600, 0, 300, 160);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel21.setText("jLabel10");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(630, 0, 300, 160);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel22.setText("jLabel10");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(0, 160, 300, 160);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel23.setText("jLabel10");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(0, 320, 300, 160);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel24.setText("jLabel10");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(0, 420, 300, 160);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel25.setText("jLabel10");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(300, 160, 300, 160);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel26.setText("jLabel10");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(300, 400, 300, 160);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel27.setText("jLabel10");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(590, 400, 300, 160);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel28.setText("jLabel10");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(630, 160, 300, 160);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel29.setText("jLabel10");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(630, 320, 300, 160);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel30.setText("jLabel10");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(660, 420, 300, 160);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jLabel31.setText("jLabel10");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(300, 0, 300, 160);

        pack();
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new AdminLogin().setVisible(true);
        this.dispose();
    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new Installments().setVisible(true);
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
            java.util.logging.Logger.getLogger(annual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(annual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(annual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(annual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new annual().setVisible(true);
            }
        });
    }

     private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
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
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
 }

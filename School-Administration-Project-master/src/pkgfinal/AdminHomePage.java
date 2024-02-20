 
package pkgfinal;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

 
public class AdminHomePage extends javax.swing.JFrame {

     
    public AdminHomePage() {
        initialise();
        
    }

     
    @SuppressWarnings("unchecked")
     private void initialise() {

        jButton1 = new JButton();
        jButton2 = new JButton();
        jPanel1 = new JPanel();
        jButton6 = new JButton();
        jButton5 = new  JButton();
        jButton4 = new  JButton();
        jLabel16 = new  JLabel();
        jLabel17 = new  JLabel();
        jLabel18 = new  JLabel();
        jLabel19 = new  JLabel();
        jLabel20 = new  JLabel();
        jLabel21 = new  JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Home Page\n");
        setMinimumSize(new java.awt.Dimension(830, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teachers.png"))); // NOI18N
        jButton1.setText("TEACHER HOME PAGE ");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 340, 175);

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/students.png"))); // NOI18N
        jButton2.setText("STUDENT HOME PAGE");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 0, 380, 175);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)), "Admin Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 3, 24))); // NOI18N

        jButton6.setBackground(new java.awt.Color(255, 255, 153));
        jButton6.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 0, 102));
        jButton6.setText("Change Password");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 0, 102));
        jButton5.setText("Log Out");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("Exit");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 200, 410, 137);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); 
        jLabel16.setText("jLabel10");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(550, 0, 300, 170);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); //  
        jLabel17.setText("jLabel10");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(300, 0, 300, 170);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); //  
        jLabel18.setText("jLabel10");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 220, 300, 170);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); //  
        jLabel19.setText("jLabel10");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(600, 260, 300, 170);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); //  
        jLabel20.setText("jLabel10");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(300, 220, 300, 170);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); //  
        jLabel21.setText("jLabel10");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(550, 160, 300, 170);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); //  
        jLabel22.setText("jLabel10");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(0, 60, 300, 170);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); //  
        jLabel23.setText("jLabel10");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(300, 150, 300, 170);

        pack();
    } 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
         new ChangeAdminPass2().setVisible(true);
        this.dispose();
    } 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
         new AdminLogin().setVisible(true);
        this.dispose();
    } 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
          JOptionPane.showMessageDialog(this,"Thank You For Using" + "\n"
                                        + "Created By :-" + "\n"
                                        + "NIYIGENA MIKE" + "\n"
                                        );
         System.exit(0);
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new TeacherHome().setVisible(true);
        this.dispose();
    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new StudentHome().setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }

     private JButton jButton1;
    private  JButton jButton2;
    private  JButton jButton4;
    private  JButton jButton5;
    private  JButton jButton6;
    private  JLabel jLabel16;
    private  JLabel jLabel17;
    private  JLabel jLabel18;
    private  JLabel jLabel19;
    private  JLabel jLabel20;
    private  JLabel jLabel21;
    private  JLabel jLabel22;
    private  JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
 }

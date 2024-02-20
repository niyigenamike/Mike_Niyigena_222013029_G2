 package pkgfinal;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

 
public class TeacherHome extends javax.swing.JFrame {
 
    public TeacherHome() {
        w();
    }

   
    @SuppressWarnings("unchecked")
     private void w() {

        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton5 = new JButton();
        jButton4 = new JButton();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jButton12 = new JButton();
        jButton11 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton10 = new JButton();
        jLabel2 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teacher Home Page\n");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(430, 330));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teacher Home Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 3, 24), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Get Records");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(76, 111, 135, 37);

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("New Entry");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(76, 167, 131, 37);

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 0, 102));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(76, 228, 75, 37);

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("Departments");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(76, 283, 143, 37);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-30, -10, 470, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 0, 0);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 10, 10);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Teacher Home Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 3, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        jButton12.setBackground(new java.awt.Color(255, 255, 153));
        jButton12.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(102, 0, 102));
        jButton12.setText("Departments");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 153));
        jButton11.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(102, 0, 102));
        jButton11.setText("Log Out");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 153));
        jButton13.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(102, 0, 102));
        jButton13.setText("Get Records");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 153));
        jButton14.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(102, 0, 102));
        jButton14.setText("New Entry");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 153));
        jButton10.setFont(new java.awt.Font("Monotype Corsiva", 2, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 0, 102));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homes.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 2, 18)); // NOI18N
        jLabel2.setText("GO TO HOME PAGE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14)
                            .addComponent(jButton13)
                            .addComponent(jButton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)))
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 410, 300);

        pack();
    }//  
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) { 
         new AdminHomePage().setVisible(true);
        this.dispose();
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
         new Dept().setVisible(true);
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
         new TeacherRecords().setVisible(true);
        this.dispose();
    } 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
         new NewTeacher().setVisible(true);
        this.dispose();
    } 
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
         new AdminHomePage().setVisible(true);
        this.dispose();
    } 
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) { 
         new Dept().setVisible(true);
        this.dispose();
    } 
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
         
        new AdminLogin().setVisible(true);
        this.dispose();
    } 
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
         new NewTeacher().setVisible(true);
        this.dispose();
    }
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
         new TeacherRecords().setVisible(true);
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
            java.util.logging.Logger.getLogger(TeacherHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherHome().setVisible(true);
            }
        });
    }

     private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton2;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
 }

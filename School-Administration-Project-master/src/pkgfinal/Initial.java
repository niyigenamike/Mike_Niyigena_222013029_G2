 package pkgfinal;

 
public class Initial extends javax.swing.JFrame {

     
    public Initial() {
        d();
    }
 
    @SuppressWarnings("unchecked")
     private void d() {

        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Introduction\n");
        setMinimumSize(new java.awt.Dimension(630, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome.jpg"))); //  
        jButton2.setText("jButton2");
        jButton2.setAlignmentY(0.0F);
        jButton2.setMaximumSize(new java.awt.Dimension(250, 200));
        jButton2.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton2.setPreferredSize(new java.awt.Dimension(250, 200));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 630, 340);

        pack();
    }//  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Initial().setVisible(true);
            }
        });
    }

     private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
 }

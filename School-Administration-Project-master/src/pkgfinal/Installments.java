 package pkgfinal;

import javax.swing.JButton;
import javax.swing.JLabel;

 
public class Installments extends javax.swing.JFrame {

   
    public Installments() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
     private void initComponents() {

        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fee Structure\n");
        setMinimumSize(new java.awt.Dimension(520, 360));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 60, 161, 37);

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Teachers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 170, 161, 37);

         
         
       
        jButton6.setBackground(new java.awt.Color(255, 255, 153));
        jButton6.setFont(new java.awt.Font("Monotype Corsiva", 3, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 0, 102));
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(80, 270, 73, 33);

        jButton7.setBackground(new java.awt.Color(255, 255, 153));
        jButton7.setFont(new java.awt.Font("Monotype Corsiva", 3, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 0, 102));
        jButton7.setText("Log Out");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(330, 270, 99, 33);

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("FrankRuehl", 3, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Fee");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 99, 51);

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setFont(new java.awt.Font("FrankRuehl", 3, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Structure");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 0, 226, 51);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/str.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 510, 340);

        pack();
    }// 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// 
         new Fees1().setVisible(true);
        this.dispose();
    }// 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//             
        new teachers().setVisible(true);
       this.dispose();

    } 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// 
         new Fees2().setVisible(true);
        this.dispose();
    } 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// 
           new Fees4().setVisible(true);
        this.dispose();
    }//

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//           
        this.dispose();
    }// 

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// 
         new StudentHome().setVisible(true);
        this.dispose();
    }//
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// 
         new annual().setVisible(true);
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
            java.util.logging.Logger.getLogger(Installments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Installments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Installments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Installments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Installments().setVisible(true);
            }
        });
    }

     private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
 }

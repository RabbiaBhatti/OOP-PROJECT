/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TECHMEN
 */
public class loginpage extends javax.swing.JFrame {

    /**
     * Creates new form loginpage
     */
    
    public loginpage() {
        
        initComponents();
        setResizable(false);
        setTitle("SHOPPING MART");
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images_1.jfif")));
         
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        lusername = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        lpassword = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        signupbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 172, 178));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("LOGIN");

        username.setText("USERNAME:");

        password.setText("PASSWORD:");

        loginbutton.setBackground(new java.awt.Color(236, 204, 221));
        loginbutton.setText("LOGIN");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        jLabel4.setText("CREATE AN ACCOUNT?");

        signupbutton.setBackground(new java.awt.Color(255, 204, 204));
        signupbutton.setText("SIGNUP");
        signupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(username))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(password))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signupbutton)))
                .addGap(71, 71, 71))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lusername, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(lpassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lusername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(signupbutton))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        try {
            // TODO add your handling code here:
            FileReader fr =new FileReader("CustomerData.txt");
            BufferedReader br= new BufferedReader(fr);
            String frname;
            String frpass;
            
            
            while((frname =br.readLine())!=null)
            {
                 frpass=br.readLine();
                 if(lusername.getText().equals(frname) && lpassword.getText().equals(frpass))
        {
            JOptionPane.showMessageDialog(null,"Successful login!");
            dispose();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DASHBOARD().setVisible(true);
            }
        });
            
        }
                 else
        {
            JOptionPane.showMessageDialog(null,"INVALID login!");
            dispose();
        }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(loginpage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(loginpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
         
                
                
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void signupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbuttonActionPerformed
        // TODO add your handling code here:
        dispose();
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signuppage().setVisible(true);
            }
        });
       
    }//GEN-LAST:event_signupbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
                
            }
        });
        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbutton;
    public javax.swing.JPasswordField lpassword;
    public javax.swing.JTextField lusername;
    private javax.swing.JLabel password;
    private javax.swing.JButton signupbutton;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

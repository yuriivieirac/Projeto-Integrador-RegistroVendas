/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import javax.swing.JOptionPane;

/**
 *
 * @author iurya
 */
public class telaLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaLogin
     */
    public telaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessar = new javax.swing.JButton();
        jButton1Sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1usuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        jLabel3logonUsuario = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(null);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(229, 170, 90, 30);

        jButton1Sair.setText("Sair");
        jButton1Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SairActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Sair);
        jButton1Sair.setBounds(360, 170, 90, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 80, 70, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 110, 50, 17);

        jTextField1usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1usuario);
        jTextField1usuario.setBounds(260, 80, 140, 19);
        getContentPane().add(campoSenha);
        campoSenha.setBounds(260, 110, 140, 19);

        jLabel3logonUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadeadoUsuario.jpg"))); // NOI18N
        getContentPane().add(jLabel3logonUsuario);
        jLabel3logonUsuario.setBounds(50, 50, 140, 150);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PlanoFundo.jpg"))); // NOI18N
        jLabelFundoLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 490, 250);

        setSize(new java.awt.Dimension(508, 296));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1usuarioActionPerformed

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
       if(jTextField1usuario.getText().equals("admin") && campoSenha.getText().equals("1234")){
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAcessarActionPerformed
    
 else{
           JOptionPane.showMessageDialog(rootPane, "Senha ou Usuarios Invalidos!");
    
}
    }
    private void jButton1SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SairActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton1SairActionPerformed

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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JButton jButton1Sair;
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3logonUsuario;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JTextField jTextField1usuario;
    // End of variables declaration//GEN-END:variables
}

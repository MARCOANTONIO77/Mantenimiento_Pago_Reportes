
package sistemaventas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author avalos
 */

public class AccessoSistema extends javax.swing.JFrame {

  public Timer objetotimer;
    public int a;
    
    public AccessoSistema() {
        initComponents();
    }
public void IniciarSesion(){
     final String u="1209141023" ,p="elmejor"; 
        String user=txtUsuario.getText();
          String pass=this.txtContraseña.getText();
        objetotimer = new Timer(80,new claseTimer());
                        try
	                {
	                    //chekar si el usuario escrbio el nombre de usuario y pw
	                    if (txtUsuario.getText().length() > 0 && txtContraseña.getText().length() > 0 )
	                    {
	                        // Si el usuario si fue validado correctamente
	                        if(  user.equals(u) && pass.equals(p) )    //enviar datos a validar
                                    
	                        {
	                          objetotimer.start();
                                 
	                        }
	                        else
	                        {
	                            JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contrasenia no son validos.");
	                            JOptionPane.showMessageDialog(null, txtUsuario.getText()+" " +txtContraseña.getText() );
	                            txtUsuario.setText("");    //limpiar campos
	                            txtContraseña.setText("");

	                            txtUsuario.requestFocusInWindow();
	                        }

	                    }
                            else
	                    {
	                        JOptionPane.showMessageDialog(null, "Debe escribir nombre de usuario y contrasenia.\n" +
	                            "NO puede dejar ningun campo vacio");
                                txtUsuario.requestFocusInWindow();
	                    }

	                } catch (Exception e)
	                {
	                    e.printStackTrace();
	                }}

public class claseTimer implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          a=jProgressBar1.getValue();
          if (a <100){
              a++;
              jProgressBar1.setValue(a);
               }
          else{
              objetotimer.stop();
              SistemaV fr2=new SistemaV(); 
              fr2.setEnabled(true);
                fr2.show();
                 cerrar();
          }                  
          
        }
    
}
private void cerrar(){
   this.dispose(); 
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new java.awt.TextField();
        txtContraseña = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accesso al sistema");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("USUARIO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(240, 240, 240));
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 220, 30));

        txtContraseña.setBackground(new java.awt.Color(240, 240, 240));
        txtContraseña.setEchoChar('*');
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 220, 30));

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fg[1].jpg"))); // NOI18N
        jButton1.setText("ACCEDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Delete).jpg"))); // NOI18N
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, 29));

        jProgressBar1.setStringPainted(true);
        jPanel2.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 330, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INICIO SESION.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, 140));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("SISTEMA DE RESTAURANT");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel4.setText("Autor: Marco Antonio");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGIN MARCO.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 230));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
IniciarSesion();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() ==KeyEvent.VK_ENTER){ 
        IniciarSesion();}
    }//GEN-LAST:event_jButton1KeyPressed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            System.exit(0);
            
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccessoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccessoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccessoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccessoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AccessoSistema().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private java.awt.TextField txtContraseña;
    private java.awt.TextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

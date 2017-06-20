
package sistemaventas;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Conexion.ClassConection;
public class Empleados extends javax.swing.JInternalFrame {
 CallableStatement cts;
   ResultSet r;
   Connection cn;
   ClassConection conectar=new ClassConection();
    public Empleados() {
        initComponents();
        BOTONES();
        DESABILITAR();
       cn=conectar.conecion();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mantenimiento de Empleados.....");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));

        jLabel2.setText("Apellidos:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 54, -1, -1));

        jLabel3.setText("Nombres:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 92, -1, -1));

        jLabel4.setText("Sexo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 130, -1, -1));

        jLabel5.setText("Dni:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 168, -1, -1));

        jLabel6.setText("Edad:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel7.setText("Telefono:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 168, -1, -1));

        jLabel8.setText("E-mail:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 206, -1, -1));

        jTextField1.setEnabled(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 13, 71, -1));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 51, 276, -1));

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 89, 276, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "M", "F" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 127, 108, -1));
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 127, 90, -1));

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 165, 108, -1));

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 165, 100, -1));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 203, 276, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 370, 283));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User add).jpg"))); // NOI18N
        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 111, 28));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Save).jpg"))); // NOI18N
        jButton2.setText("REGISTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 47, 111, 28));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, 111, 28));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User edit).jpg"))); // NOI18N
        jButton4.setText("MODIFICAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, -1, 28));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User delete).jpg"))); // NOI18N
        jButton5.setText("ELIMINAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 164, 111, 28));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wzdelete.jpg"))); // NOI18N
        jButton6.setText("CANCELAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 203, 111, 28));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Delete).jpg"))); // NOI18N
        jButton7.setText("SALIR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 242, 111, 28));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 25, 140, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         String cod=jTextField1.getText(),ape=jTextField2.getText(),nom=jTextField3.getText();
        String sexo=this.jComboBox1.getSelectedItem().toString();
        String ed = jSpinner1.getValue().toString();
         String dni=jTextField4.getText();
         String tel=jTextField5.getText(),emil=jTextField6.getText();
        
        try {
            cts=cn.prepareCall("{call registrarEmpleados(?,?,?,?,?,?,?,?)}");
            cts.setString(1, cod);
            cts.setString(2, ape);
            cts.setString(3, nom);
            cts.setString(4, sexo);
            cts.setString (5,ed);
            cts.setString(6, dni);
            cts.setString(7, tel);
            cts.setString(8,emil);
            
            int rpta=cts.executeUpdate();
            if(rpta==1)
                JOptionPane.showMessageDialog(this,"Empleado Registrado correctamente!!","Atencion",JOptionPane.INFORMATION_MESSAGE);
          limpiar();
          BOTONES();
         DESABILITAR();
        } catch (SQLException | HeadlessException e) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, e);
        }
                  

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String cod=JOptionPane.showInputDialog("INGRESE EL DNI DE EMPLEADO A BUSCAR si decea puede editalpara modificar o eliminar el registro");
          try {
             cts=cn.prepareCall("{call buscarEmpleado(?)}");
            cts.setString(1, cod);
            r=cts.executeQuery();

            if(r.next()){
            JOptionPane.showMessageDialog(this,"Empleado  Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
            this.jTextField1.setText(r.getString(1));
            this.jTextField2.setText(r.getString(2));
            this.jTextField3.setText(r.getString(3));
            this.jComboBox1.setSelectedItem(r.getString(4).toString());
            this.jSpinner1.setValue(r.getInt(5));
            this.jTextField4.setText(r.getString(6));
            this.jTextField5.setText(r.getString(7));
            this.jTextField6.setText(r.getString(8));
         ABILITAR();
         this.jButton2.setEnabled(false);
           this.jButton1.setEnabled(false);
           this.jButton3.setEnabled(false);
           this.jButton4.setEnabled(true);
           this.jButton5.setEnabled(true);
            }else{

           JOptionPane.showMessageDialog(this,"Empleado  No Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String cod=jTextField1.getText(),ape=jTextField2.getText(),nom=jTextField3.getText();
        String sexo=this.jComboBox1.getSelectedItem().toString();
        String ed = jSpinner1.getValue().toString();
         String dni=jTextField4.getText();
         String tel=jTextField5.getText(),emil=jTextField6.getText();
        try {
            cts=cn.prepareCall("{call modificarEmpleados(?,?,?,?,?,?,?,?)}");
            cts.setString(1, cod);
            cts.setString(2, ape);
            cts.setString(3, nom);
            cts.setString(4, sexo);
            cts.setString(5, ed);
            cts.setString(6, dni);
            cts.setString(7,tel);
            cts.setString(8, emil);
            int rpta=cts.executeUpdate();
            if(rpta==1){
            JOptionPane.showMessageDialog(this, "Empleado Modificado","Aviso",JOptionPane.INFORMATION_MESSAGE);
         limpiar(); 
          DESABILITAR();
          BOTONES();
                       }else {

         JOptionPane.showMessageDialog(this, "Error al modificar","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(this, e.toString());
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          String cod=this.jTextField1.getText();
        try {
            cts=cn.prepareCall("{call eliminarEmpleado(?)}");
            cts.setString(1, cod);
            int rpta=cts.executeUpdate();

            if(rpta==1){
            JOptionPane.showMessageDialog(this, "Empleado Eliminado","Aviso",JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            DESABILITAR();
            BOTONES();
                    }else {
             JOptionPane.showMessageDialog(this, "Empleado No Eliminado","Aviso",JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(this, e.toString());
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
         if(  jTextField1.getText().length()>=5)evt.consume();
         
          if( (car<'E' || car>'E')&&(car<'0'||car>'9')) evt.consume();
 
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiar();
         try{
        
         cts=cn.prepareCall("{call Genera_num_EMPLEADOS}");
       r=cts.executeQuery();
       if (r.next())
        
          jTextField1.setText(r.getString(1));
            }catch (Exception e){} 
         ABILITAR();
        jButton2.setEnabled(true);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
             int opcion=JOptionPane.showConfirmDialog(null,"Realmente decea Salir","confirmar",JOptionPane.YES_NO_OPTION);
if(opcion==JOptionPane.YES_NO_OPTION){
dispose();
}
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       BOTONES();
        DESABILITAR();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
           if(  jTextField4.getText().length()>=8)evt.consume();
       if((car<'0' || car>'9') ) evt.consume();
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
           if(  jTextField5.getText().length()>=9)evt.consume();
       if((car<'0' || car>'9') ) evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
        if((car<'a'||car>'z')&&(car<'A'||car>'Z')&&(car<' '||car>' ')) evt.consume();
        
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
          char car=evt.getKeyChar();
        if((car<'a'||car>'z')&&(car<'A'||car>'Z')&&(car<' '||car>' ')) evt.consume();
       
    }//GEN-LAST:event_jTextField3KeyTyped

    
    public void limpiar(){
     this.jTextField1.setText("");
           this.jTextField2.setText("");
           this.jTextField3.setText(""); 
           this.jComboBox1.setSelectedIndex(0);
           this.jTextField4.setText("");
           this.jTextField5.setText("");
           this.jTextField6.setText("");
           this.jTextField1.requestFocus();}
    
      public void ABILITAR(){
          this.jTextField2.setEnabled(true);
           this.jTextField3.setEnabled(true);
           this.jComboBox1.setEnabled(true);
           this.jTextField4.setEnabled(true);
           this.jTextField5.setEnabled(true);
           this.jTextField6.setEnabled(true);
           this.jTextField2.requestFocus();
  }
   private void DESABILITAR(){
          this.jTextField2.setEnabled(false);
           this.jTextField3.setEnabled(false); 
           this.jComboBox1.setEnabled(false);
           this.jTextField4.setEnabled(false);
           this.jTextField5.setEnabled(false);
           this.jTextField6.setEnabled(false);
                  }
  private void BOTONES(){
    this.jButton2.setEnabled(false);
           this.jButton1.setEnabled(true);
           this.jButton3.setEnabled(true);
           this.jButton4.setEnabled(false);
           this.jButton5.setEnabled(false);
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}

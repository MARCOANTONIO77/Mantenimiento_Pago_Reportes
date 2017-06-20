package sistemaventas;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Conexion.ClassConection;
public final class Clientes extends javax.swing.JInternalFrame {
   Connection cn;
   CallableStatement cts;
   ResultSet r;
   ClassConection conectar=new ClassConection();
    public Clientes() {
        initComponents();
          cn=conectar.conecion();
        cargar();   
        DESABILITAR();
        BOTONES();
            }
public void cargar(){
        
         DefaultTableModel tabla= new DefaultTableModel();
       try{
         tabla.addColumn("CODIGO");
       tabla.addColumn("NOMBRES");
       tabla.addColumn("APELLIDOS");
       tabla.addColumn("SEXO");
       tabla.addColumn("DNI");
       tabla.addColumn("TELEFONO");
       tabla.addColumn("RUC");
       tabla.addColumn("E_MAIL");
       tabla.addColumn("DIRECCION");
         cts=cn.prepareCall("{call mostrarclientes}");
       r=cts.executeQuery();
       while (r.next()){
       Object dato[]=new  Object[9];
       for (int i=0; i<9; i++){
           dato[i]=r.getString(i+1);

       }
       tabla.addRow(dato);
       }
       this.jTable1.setModel(tabla);

       }catch (Exception e){}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MANTENIMIENTO DE CLIENTES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos De clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 0, 255)));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 19, -1, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 57, -1, -1));

        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 57, -1, -1));

        jLabel4.setText("Sexo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 88, -1, -1));

        jLabel5.setText("Dni:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 88, -1, -1));

        jLabel6.setText("Telefono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 126, -1, -1));

        jLabel7.setText("E_mail:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 157, -1, -1));

        jTextField1.setEnabled(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 16, 70, -1));

        jTextField2.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 54, 129, -1));

        jTextField3.setBackground(new java.awt.Color(204, 255, 204));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 54, 90, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "M", "F" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 85, -1, -1));

        jTextField4.setBackground(new java.awt.Color(204, 255, 204));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 85, 130, -1));

        jTextField5.setBackground(new java.awt.Color(204, 255, 204));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 123, 102, -1));

        jTextField6.setBackground(new java.awt.Color(204, 255, 204));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 123, 128, -1));

        jLabel8.setText("Ruc:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 126, -1, -1));

        jLabel9.setText("Direccion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 195, -1, -1));

        jTextField7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 154, 278, -1));

        jTextField8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 192, 280, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 11, 420, 272));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton3.setText("buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 91, 99, 29));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Save).jpg"))); // NOI18N
        jButton1.setText("agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 56, 99, 29));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User edit).jpg"))); // NOI18N
        jButton4.setText("modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, 99, 29));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Delete).jpg"))); // NOI18N
        jButton6.setText("salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 231, 99, 29));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User delete).jpg"))); // NOI18N
        jButton5.setText("eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 161, 99, 29));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wzdelete.jpg"))); // NOI18N
        jButton7.setText("Cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 196, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User add).jpg"))); // NOI18N
        jButton2.setText("nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, 99, 29));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 15, 140, 268));

        jTable1.setBackground(new java.awt.Color(153, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 294, 613, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cod=jTextField1.getText(),nom=jTextField2.getText(),ape=jTextField3.getText();
        String sexo=this.jComboBox1.getSelectedItem().toString();
         String dni=jTextField4.getText();
         String tel=jTextField5.getText(),ruc=jTextField6.getText(),emil=jTextField7.getText();
        String dir=jTextField8.getText();
        try {
            cts=cn.prepareCall("{call agregarcliente(?,?,?,?,?,?,?,?,?)}");
            cts.setString(1, cod);
            cts.setString(2, nom);
            cts.setString(3, ape);
            cts.setString(4, sexo);
            cts.setString(5, dni);
            cts.setString(6, tel);
            cts.setString(7,ruc);
            cts.setString(8,emil);
            cts.setString(9,dir);
            
            int rpta=cts.executeUpdate();
            if(rpta==1)
                JOptionPane.showMessageDialog(this,"Registrado correctamente!!","Atencion",JOptionPane.INFORMATION_MESSAGE);
          BOTONES();
            DESABILITAR();
            limpiar();
          cargar();
          
           
        } catch (SQLException | HeadlessException e) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, e);
        }
                  

       
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiar();
         try{
        
         cts=cn.prepareCall("{call Genera_num_CLIENTES}");
       r=cts.executeQuery();
       if (r.next())
        
          jTextField1.setText(r.getString(1));
            }catch (Exception e){} 
         ABILITAR();
         this.jButton1.setEnabled(true);
           this.jButton2.setEnabled(false);
           this.jButton3.setEnabled(false);
           this.jButton4.setEnabled(false);
           this.jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      
        String cod=JOptionPane.showInputDialog("INGRESE EL CODIGO DEL CLIENTE A BUSCAR si decea puede editalpara modificar o eliminar el registro");
          try {
             cts=cn.prepareCall("{call buscarcliente(?)}");
            cts.setString(1, cod);
            r=cts.executeQuery();

            if(r.next()){
            JOptionPane.showMessageDialog(this,"Cliente Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
            this.jTextField1.setText(r.getString(1));
            this.jTextField2.setText(r.getString(2));
            this.jTextField3.setText(r.getString(3));
            this.jComboBox1.setSelectedItem(r.getString(4).toString());
            this.jTextField4.setText(r.getString(5));
            this.jTextField5.setText(r.getString(6));
            this.jTextField6.setText(r.getString(7));
            this.jTextField7.setText(r.getString(8));
            this.jTextField8.setText(r.getString(9));
         ABILITAR();
         this.jButton1.setEnabled(false);
           this.jButton2.setEnabled(false);
           this.jButton3.setEnabled(false);
           this.jButton4.setEnabled(true);
           this.jButton5.setEnabled(true);
            }else{

           JOptionPane.showMessageDialog(this,"Cliente  No Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {JOptionPane.showMessageDialog(this, e.toString());
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    
        String cod=jTextField1.getText(),nom=jTextField2.getText(),ape=jTextField3.getText();
        String sexo=this.jComboBox1.getSelectedItem().toString();
         String dni=jTextField4.getText();
         String tel=jTextField5.getText(),ruc=jTextField6.getText(),emil=jTextField7.getText();
        String dir=jTextField8.getText();
        try {
            cts=cn.prepareCall("{call modificarcliente(?,?,?,?,?,?,?,?,?)}");
            cts.setString(1, cod);
            cts.setString(2, nom);
            cts.setString(3, ape);
            cts.setString(4, sexo);
            cts.setString(5, dni);
            cts.setString(6, tel);
            cts.setString(7,ruc);
            cts.setString(8,emil);
            cts.setString(9,dir);
            int rpta=cts.executeUpdate();
            if(rpta==1){
            JOptionPane.showMessageDialog(this, "Cliente Modificado","Aviso",JOptionPane.INFORMATION_MESSAGE);
          limpiar(); 
          DESABILITAR();
          BOTONES();
              cargar();
            }else {

         JOptionPane.showMessageDialog(this, "Error al modificar","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {JOptionPane.showMessageDialog(this, e.toString());
        }

    }//GEN-LAST:event_jButton4ActionPerformed
public void BOTONES(){
    this.jButton1.setEnabled(false);
           this.jButton2.setEnabled(true);
           this.jButton3.setEnabled(true);
           this.jButton4.setEnabled(false);
           this.jButton5.setEnabled(false);
}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        String cod=this.jTextField1.getText();
        try {
            cts=cn.prepareCall("{call eliminarcliente(?)}");
            cts.setString(1, cod);
            int rpta=cts.executeUpdate();

            if(rpta==1){
            JOptionPane.showMessageDialog(this, "cliente Eliminado","Aviso",JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            DESABILITAR();
            BOTONES();
           cargar();
            }else {
             JOptionPane.showMessageDialog(this, "cliente No Eliminado","Aviso",JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(this, e.toString());
        }

        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
       this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
      
        char car=evt.getKeyChar();
         if(  jTextField1.getText().length()>=5)evt.consume();
          if((car<'c' || car>'c') && (car<'C' || car>'C')&&(car<'0'||car>'9')) evt.consume();
 
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
         char car=evt.getKeyChar();
       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
 
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
  char car=evt.getKeyChar();
       if((car<'a' || car>'z') && (car<'A' || car>'Z')&&(car<' '||car>' ')) evt.consume();
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

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
        if ((car<'0'||car>'9'))evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
      char car=evt.getKeyChar();
           if(  jTextField6.getText().length()>=11)evt.consume();
       if((car<'0' || car>'9') ) evt.consume();
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        BOTONES();
        DESABILITAR();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
 public void limpiar(){
            this.jTextField1.setText("");
          this.jTextField2.setText("");
           this.jTextField3.setText(""); 
           this.jComboBox1.setSelectedIndex(0);
           this.jTextField4.setText("");
           this.jTextField5.setText("");
           this.jTextField6.setText("");
           this.jTextField7.setText("");
           jTextField8.setText("");
 }
         
  public void ABILITAR(){
          this.jTextField2.setEnabled(true);
           this.jTextField3.setEnabled(true);
           this.jComboBox1.setEnabled(true);
           this.jTextField4.setEnabled(true);
           this.jTextField5.setEnabled(true);
           this.jTextField6.setEnabled(true);
           this.jTextField7.setEnabled(true);
           jTextField8.setEnabled(true);
           this.jTextField2.requestFocus();
  }
   public void DESABILITAR(){
          this.jTextField2.setEnabled(false);
           this.jTextField3.setEnabled(false); 
           this.jComboBox1.setEnabled(false);
           this.jTextField4.setEnabled(false);
           this.jTextField5.setEnabled(false);
           this.jTextField6.setEnabled(false);
           this.jTextField7.setEnabled(false);
           jTextField8.setEnabled(false);
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}


package sistemaventas;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import Conexion.ClassConection;

public final class Factura extends javax.swing.JInternalFrame {
 Connection cn=null;
   CallableStatement cts=null;
   ResultSet r=null;
   String sql=null;
   ClassConection conectar=new ClassConection();
    public Factura() throws SQLException {
        initComponents();
       cn=conectar.conecion();
          Calendar cal=Calendar.getInstance();
    String fecha=cal.get(Calendar.DATE)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(cal.YEAR);
    this.jlb_fecha.setText(fecha);

       try{
        
         cts=cn.prepareCall("{call Genera_num_Factura}");
       r=cts.executeQuery();
       if (r.next())
        
          jTextField4.setText(r.getString(1));
            }catch (Exception e){} 
              }
             
public static void ajustarcolumnas(){
     TableColumn columna =null;
     for(int i=0;i<=4;i++){
         columna=jtableDetalle.getColumnModel().getColumn(i);
         if(i==0){
             columna.setPreferredWidth(6);
            
         }
         else if(i==1){
              columna.setPreferredWidth(250);
         }
          else if(i==2){
              columna.setPreferredWidth(20);
         }
         else {
            columna.setPreferredWidth(40); 
         }
     }
 }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jtf_total = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jtf_subto = new javax.swing.JTextField();
        jtf_desc = new javax.swing.JTextField();
        jtf_igv = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableDetalle = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jlb_ruc = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        JLB_codCliente = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jlb_fecha = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setIconifiable(true);
        setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Jron 13 de Diciembre N° 176");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 52, -1, -1));

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESTAURANT ANTHONY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 222, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Direccion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fecha:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 145, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Cod.Cliente:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 145, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("R.U.C.:20248454753");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 23, -1, -1));

        jLabel12.setText("FACTURA DE VENTA");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 48, -1, -1));

        jLabel13.setText("N°:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 83, -1, -1));

        jTextField4.setEnabled(false);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 80, 123, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 49, 230, 140));

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Total a Pagra:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 21, -1, -1));

        jtf_total.setEditable(false);
        jPanel4.add(jtf_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 18, 89, -1));

        jLabel24.setText("Descuento 10% :");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 21, -1, -1));

        jLabel25.setText("Subtotal:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 21, -1, -1));

        jLabel26.setText("igv:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 21, -1, -1));

        jtf_subto.setEditable(false);
        jPanel4.add(jtf_subto, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 18, 67, -1));

        jtf_desc.setEditable(false);
        jPanel4.add(jtf_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 18, 84, -1));

        jtf_igv.setEditable(false);
        jPanel4.add(jtf_igv, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 18, 69, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, 0, 1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 166, 680, 60));

        jtableDetalle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));
        jtableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO UNITARIO", "PRECIO VENTA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableDetalle);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 680, 147));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 206, 710, 240));

        jLabel5.setText("Teléfono : 957552985");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 72, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Señor(es):");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 104, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("DNI:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, -1));

        jLabel3.setText("De: Marco Antonio Vargas Mendez");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 32, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("R.U.C:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 110, -1, -1));

        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 110, 267, 19));

        jlb_ruc.setForeground(new java.awt.Color(0, 153, 153));
        jlb_ruc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jlb_ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 105, 19));

        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 140, 150, 19));

        JLB_codCliente.setForeground(new java.awt.Color(0, 153, 153));
        JLB_codCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(JLB_codCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 140, 104, 19));

        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 176, 252, 19));

        jlb_fecha.setForeground(new java.awt.Color(0, 153, 153));
        jlb_fecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jlb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 140, 79, 19));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Articulo:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 175, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Search).jpg"))); // NOI18N
        jButton2.setText("BUSCAR ...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 170, 128, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Save).jpg"))); // NOI18N
        jButton5.setText("REALIZAR VENTA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 331, 157, 44));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (User delete).jpg"))); // NOI18N
        jButton4.setText("ELIMINAR ARTICULO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 276, 157, 44));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/16 (Delete).jpg"))); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 381, 157, 44));

        jButton6.setText("CALCULAR OPERACION");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 226, 157, 44));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        BuscarArticulos bs;
        try {
            bs = new BuscarArticulos();
            SistemaV.jDesktopPane1.add(bs);
        bs.toFront();
        bs.setLocation(50,10);
        bs.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BuscarCliente bc=new BuscarCliente();
        SistemaV.jDesktopPane1.add(bc);
        bc.toFront();
        bc.setLocation(50,10);
        bc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
private void agregarfactura(){
        String nfac=jTextField4.getText();
        String fec=jlb_fecha.getText();
        String codcli=JLB_codCliente.getText();
        String ruc=jlb_ruc.getText();
        String subt=jtf_subto.getText().toString();
        String desc=jtf_desc.getText().toString();
       String igv=jtf_igv.getText().toString();
        String tot=jtf_total.getText().toString();
        
        try {
            cts=cn.prepareCall("{call InsertaFactura(?,?,?,?,?,?,?,?)}");
            cts.setString(1, nfac);
            cts.setString(2,fec);
            cts.setString(3, codcli);
            cts.setString(4,ruc);
            cts.setString(5,subt);
            cts.setString(6, desc);
            cts.setString(7,igv);
            cts.setString(8, tot);
            int opcion=cts.executeUpdate();
            if(opcion==1)
                JOptionPane.showMessageDialog(this, "factura registrado coreectamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                     
            
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(this,"Error al registrar");
        }
}
private void agregarDETALLEfactura(){
     for(int i=0;i<jtableDetalle.getRowCount();i++){
         String nfac=jTextField4.getText();
        String codpro=jtableDetalle.getValueAt(i,0).toString();
        String prod=jtableDetalle.getValueAt(i,1).toString();
        String cant=jtableDetalle.getValueAt(i,2).toString();
        String pre_u=jtableDetalle.getValueAt(i,3).toString();
        String pre_v=jtableDetalle.getValueAt(i,4).toString();
        
        try{
            cts=cn.prepareCall("{call INSERTADETALLEFACTURA(?,?,?,?,?,?)}");
            cts.setString(1, nfac);
            cts.setString(2, codpro);
            cts.setString(3, prod);
            cts.setString(4, cant);
            cts.setString(5, pre_u);
            cts.setString(6, pre_v);
            
            int opcion=cts.executeUpdate();
            if (opcion==1)
                JOptionPane.showMessageDialog(this, "Registrado correctamente!!","aviso",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al registrar"+e.getMessage());
                
        }}
}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        agregarfactura();
        agregarDETALLEfactura();
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel modelo = (DefaultTableModel) jtableDetalle.getModel();
        //ahora obtenemos la fila selccionada
        int fila_select = jtableDetalle.getSelectedRow();

        if(fila_select<0){
            // no se puede eliminar
            JOptionPane.showMessageDialog(this,"Tabla vacia o no ha seleccionado uan fila.");
        }else {
          // la eliminamos del modelo:
        modelo.removeRow(fila_select);
        }

        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
             int opcion=JOptionPane.showConfirmDialog(null,"Realmente decea Salir","confirmar",JOptionPane.YES_NO_OPTION);
if(opcion==JOptionPane.YES_NO_OPTION){
this.dispose();

}


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
         double suma=0.0;
         double subtot=0.0;
         double des=0.0;
         double igv=0.0;
         double total=0.0;
             for(int i=0;i<jtableDetalle.getRowCount();i++){
            String precio= jtableDetalle.getValueAt(i, 3).toString();
          String cantidad=jtableDetalle.getValueAt(i , 2).toString();
          int c=Integer.parseInt(cantidad);
          double p=Double.parseDouble(precio);
          suma=c*p;
             subtot+=suma;    
             des=(subtot*10)/100;
             igv=(subtot*18)/100;
             total=subtot-des;
            jtableDetalle.setValueAt(suma, i, 4);
             jtf_subto.setText(""+subtot);
             jtf_desc.setText(""+des);
             jtf_igv.setText(""+igv);
             jtf_total.setText(""+total);             
             
         }
         
         
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel JLB_codCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jlb_fecha;
    public static javax.swing.JLabel jlb_ruc;
    public static javax.swing.JTable jtableDetalle;
    private javax.swing.JTextField jtf_desc;
    private javax.swing.JTextField jtf_igv;
    public static javax.swing.JTextField jtf_subto;
    private javax.swing.JTextField jtf_total;
    // End of variables declaration//GEN-END:variables
}

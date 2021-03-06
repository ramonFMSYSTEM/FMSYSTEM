/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import Reportes.Reportes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author vitela
 */
public class frmInicio extends javax.swing.JFrame {

    /**
     * Creates new form frminicio
     */
    public frmInicio() {
        initComponents();
        this.setExtendedState(frmInicio.MAXIMIZED_BOTH);
        this.setTitle("FM System ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuPantallaInicio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuFMSystem = new javax.swing.JMenu();
        mnuproveedores = new javax.swing.JMenu();
        cutMenuIProveedores = new javax.swing.JMenuItem();
        mnuusuarios = new javax.swing.JMenu();
        jMenuIUsuarios = new javax.swing.JMenuItem();
        mnuconsultas = new javax.swing.JMenu();
        jMenuConsultasVentas = new javax.swing.JMenuItem();
        jMenuConsultasUsuarios = new javax.swing.JMenuItem();
        jMenuConsultasProductos = new javax.swing.JMenuItem();
        mnuCatalogo = new javax.swing.JMenu();
        jMenuVerCatalogo = new javax.swing.JMenuItem();
        mnuventas = new javax.swing.JMenu();
        jMenuRealizarVenta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnuInventario = new javax.swing.JMenu();
        jMenuIProductosNora = new javax.swing.JMenuItem();
        jMenuIProductosRamon = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuPantallaInicio.setBackground(new java.awt.Color(153, 153, 255));

        mnuFMSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio.png"))); // NOI18N
        mnuFMSystem.setMnemonic('f');
        mnuFMSystem.setText("System FM");
        menuBar.add(mnuFMSystem);

        mnuproveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Archivo.png"))); // NOI18N
        mnuproveedores.setMnemonic('e');
        mnuproveedores.setText("Proveedores");

        cutMenuIProveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuIProveedores.setMnemonic('t');
        cutMenuIProveedores.setText("Mantener Proveedores");
        cutMenuIProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuIProveedoresActionPerformed(evt);
            }
        });
        mnuproveedores.add(cutMenuIProveedores);

        menuBar.add(mnuproveedores);

        mnuusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        mnuusuarios.setMnemonic('h');
        mnuusuarios.setText("Usuarios");

        jMenuIUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuIUsuarios.setText("Mantener Usuarios");
        jMenuIUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIUsuariosActionPerformed(evt);
            }
        });
        mnuusuarios.add(jMenuIUsuarios);

        menuBar.add(mnuusuarios);

        mnuconsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultas.png"))); // NOI18N
        mnuconsultas.setText("Consultas");

        jMenuConsultasVentas.setText("Ventas");
        jMenuConsultasVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultasVentasActionPerformed(evt);
            }
        });
        mnuconsultas.add(jMenuConsultasVentas);

        jMenuConsultasUsuarios.setText("Usuarios");
        jMenuConsultasUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultasUsuariosActionPerformed(evt);
            }
        });
        mnuconsultas.add(jMenuConsultasUsuarios);

        jMenuConsultasProductos.setText("Productos");
        jMenuConsultasProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultasProductosActionPerformed(evt);
            }
        });
        mnuconsultas.add(jMenuConsultasProductos);

        menuBar.add(mnuconsultas);

        mnuCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Configuraciones.png"))); // NOI18N
        mnuCatalogo.setText("Catalogo");

        jMenuVerCatalogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuVerCatalogo.setText("Ver Catalogo");
        jMenuVerCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVerCatalogoActionPerformed(evt);
            }
        });
        mnuCatalogo.add(jMenuVerCatalogo);

        menuBar.add(mnuCatalogo);

        mnuventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagos.png"))); // NOI18N
        mnuventas.setText("Ventas");

        jMenuRealizarVenta.setText("Realizar venta");
        jMenuRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRealizarVentaActionPerformed(evt);
            }
        });
        mnuventas.add(jMenuRealizarVenta);

        menuBar.add(mnuventas);

        jMenu1.setText("Compras");

        jMenuItem5.setText("Compra de Materia Prima");
        jMenu1.add(jMenuItem5);

        menuBar.add(jMenu1);

        mnuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reservas.png"))); // NOI18N
        mnuInventario.setText("Inventario");
        mnuInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuInventarioMouseClicked(evt);
            }
        });

        jMenuIProductosNora.setText("Mantener Productos principales");
        jMenuIProductosNora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIProductosNoraActionPerformed(evt);
            }
        });
        mnuInventario.add(jMenuIProductosNora);

        jMenuIProductosRamon.setText("Productos2");
        jMenuIProductosRamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIProductosRamonActionPerformed(evt);
            }
        });
        mnuInventario.add(jMenuIProductosRamon);

        menuBar.add(mnuInventario);

        mnuReportes.setText("Reportes");

        jMenuItem1.setText("Reporte Venta a detalle");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem1);

        jMenuItem2.setText("Reporte de proveedores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem2);

        jMenuItem3.setText("Reporte de usuarios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem3);

        jMenuItem4.setText("Reporte de Ventas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuReportes.add(jMenuItem4);

        menuBar.add(mnuReportes);

        mnusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        mnusalir.setText("Salir");
        mnusalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnusalirMouseClicked(evt);
            }
        });
        menuBar.add(mnusalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMenuPantallaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMenuPantallaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutMenuIProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuIProveedoresActionPerformed
        // TODO add your handling code here:
        frmProveedor form =new frmProveedor();
        jMenuPantallaInicio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_cutMenuIProveedoresActionPerformed

    private void jMenuVerCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVerCatalogoActionPerformed
     
        
        
    }//GEN-LAST:event_jMenuVerCatalogoActionPerformed

    private void mnusalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnusalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mnusalirMouseClicked

    private void jMenuIUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIUsuariosActionPerformed
        frmUsuario form =new frmUsuario();
        jMenuPantallaInicio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuIUsuariosActionPerformed

    private void jMenuRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRealizarVentaActionPerformed
               frmVenta form =new frmVenta();
        jMenuPantallaInicio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuRealizarVentaActionPerformed

    private void jMenuConsultasUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultasUsuariosActionPerformed
        // TODO add your handling code here:
//        ConsultasUsuarios form =new ConsultasUsuarios();
//        jMenuConsultasUsuarios.add(form);
//        form.toFront();
//        form.setVisible(true);
//        
try {
          frmConsultasUsuarios pro= new frmConsultasUsuarios();
    frmInicio.jMenuPantallaInicio.add(pro);
    pro.toFront();
    pro.setVisible(true);
        
    } catch (Exception e) {
    }
    
    }//GEN-LAST:event_jMenuConsultasUsuariosActionPerformed

    private void jMenuConsultasVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultasVentasActionPerformed
//        // TODO add your handling code here:
//        ConsultaVentas formCV =new ConsultaVentas();
//        jMenuConsultasVentas.add(formCV);
//        formCV.toFront();
//        formCV.setVisible(true);
        try {
          frmConsultasVentas CV= new frmConsultasVentas();
    frmInicio.jMenuPantallaInicio.add(CV);
    CV.toFront();
    CV.setVisible(true);
        
    } catch (Exception e) {
    }
    }//GEN-LAST:event_jMenuConsultasVentasActionPerformed

    private void jMenuConsultasProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultasProductosActionPerformed
        // TODO add your handling code here:
//        ConsultasProductos frmCP =new ConsultasProductos();
//        jMenuConsultasProductos.add(frmCP);
//        frmCP.toFront();
//        frmCP.setVisible(true);
    try {
          frmConsultasProductos pro= new frmConsultasProductos();
    frmInicio.jMenuPantallaInicio.add(pro);
    pro.toFront();
    pro.setVisible(true);
        
    } catch (Exception e) {
    }
    }//GEN-LAST:event_jMenuConsultasProductosActionPerformed

    private void mnuInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuInventarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuInventarioMouseClicked

    private void jMenuIProductosRamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIProductosRamonActionPerformed
        // TODO add your handling code here:
        try {
          frmProducto pro= new frmProducto();
    frmInicio.jMenuPantallaInicio.add(pro);
    pro.toFront();
    pro.setVisible(true);
        
    } catch (Exception e) {
    }
        
    }//GEN-LAST:event_jMenuIProductosRamonActionPerformed

    private void jMenuIProductosNoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIProductosNoraActionPerformed
        // TODO add your handling code here:
         try {
          frmMateriaPrima proN= new frmMateriaPrima();
    frmInicio.jMenuPantallaInicio.add(proN);
    proN.toFront();
    proN.setVisible(true);
        
    } catch (Exception e) {
    }
    }//GEN-LAST:event_jMenuIProductosNoraActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try{
            Reportes reporte=new Reportes();
            try {
                reporte.ReporteVentaDetalle();
            } catch (SQLException ex) {
                Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }catch(JRException ex){
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
          try{
            Reportes reporte=new Reportes();
            try {
                reporte.ReporteProveedor();
            } catch (SQLException ex) {
                Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }catch(JRException ex){
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
          try{
            Reportes reporte=new Reportes();
            try {
                reporte.ReporteUsuario();
            } catch (SQLException ex) {
                Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }catch(JRException ex){
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
      
       try{
            Reportes reporte=new Reportes();
            try {
                reporte.ReporteVenta();
            } catch (SQLException ex) {
                Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }catch(JRException ex){
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cutMenuIProveedores;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuConsultasProductos;
    private javax.swing.JMenuItem jMenuConsultasUsuarios;
    private javax.swing.JMenuItem jMenuConsultasVentas;
    private javax.swing.JMenuItem jMenuIProductosNora;
    private javax.swing.JMenuItem jMenuIProductosRamon;
    private javax.swing.JMenuItem jMenuIUsuarios;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    public static javax.swing.JDesktopPane jMenuPantallaInicio;
    private javax.swing.JMenuItem jMenuRealizarVenta;
    private javax.swing.JMenuItem jMenuVerCatalogo;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu mnuCatalogo;
    private javax.swing.JMenu mnuFMSystem;
    private javax.swing.JMenu mnuInventario;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuconsultas;
    public static javax.swing.JMenu mnuproveedores;
    private javax.swing.JMenu mnusalir;
    private javax.swing.JMenu mnuusuarios;
    private javax.swing.JMenu mnuventas;
    // End of variables declaration//GEN-END:variables

}

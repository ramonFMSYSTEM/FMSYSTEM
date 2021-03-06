/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Presentacion;

import claseConectar.conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vitela
 */
public class frmConsultasUsuarios extends javax.swing.JInternalFrame {
 
    public frmConsultasUsuarios() {
        initComponents();
        txtEmailu.setEnabled(false);
        Cargarlistausuarios();
    }
    void Cargarlistausuarios()          
    {
        DefaultTableModel modelo= new DefaultTableModel();
        String []Titulos = {"ID USUARIO","NOMBRES","APELLIDO P.","APELLIDO M.","DIRECCIÓN","TELEFONO","EMAIL","CONTRASEÑA"};
        modelo.setColumnIdentifiers(Titulos);
         this.tablaUsuariosConsulta.setModel(modelo);
        try {
            
            String ConsultaSQL="SELECT * FROM usuario";
        
            String []registros= new String[8];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("id_usuario");
                registros[1]=rs.getString("nombre_usuario");
                registros[2]=rs.getString("apellidop_usuario");  
                registros[3]=rs.getString("apellidom_usuario");
                registros[4]=rs.getString("direccion_usuario");
                registros[5]=rs.getString("tel_usuario");
               
                registros[6]=rs.getString("email_usuario");
                registros[7]=rs.getString("contraseña_usuario");
                modelo.addRow(registros);
                                
            }
            tablaUsuariosConsulta.setModel(modelo);
            txtRegistros.setText(""+tablaUsuariosConsulta.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(frmConsultasUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtnNombre = new javax.swing.JRadioButton();
        rbtnEmail = new javax.swing.JRadioButton();
        rbtnTodo = new javax.swing.JRadioButton();
        txtEmailu = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuariosConsulta = new javax.swing.JTable();
        lblRegistros = new javax.swing.JLabel();
        txtRegistros = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta de Usuarios");

        buttonGroup1.add(rbtnNombre);
        rbtnNombre.setSelected(true);
        rbtnNombre.setText("Buscar usuario por nombre");
        rbtnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNombreActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnEmail);
        rbtnEmail.setText("Buscar usuario por Email");
        rbtnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEmailActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnTodo);
        rbtnTodo.setText("Mostrar todos los usuarios");
        rbtnTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTodoActionPerformed(evt);
            }
        });

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscar.png"))); // NOI18N
        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnEmail)
                        .addGap(24, 24, 24)
                        .addComponent(txtEmailu, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnTodo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre)))
                .addGap(26, 26, 26)
                .addComponent(btnbuscar)
                .addGap(245, 245, 245))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnEmail)
                            .addComponent(txtEmailu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnTodo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tablaUsuariosConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuariosConsulta);

        lblRegistros.setText("Cantidad de Registros");

        txtRegistros.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lblRegistros)
                        .addGap(18, 18, 18)
                        .addComponent(txtRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistros)
                    .addComponent(txtRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void rbtnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNombreActionPerformed
// TODO add your handling code here:
    if(rbtnNombre.isSelected()==true)
    {
        txtEmailu.setText("");
        txtNombre.setEnabled(true);
        txtEmailu.setEnabled(false);
       // txtnombre.setText("");
        txtNombre.requestFocus();
    }
}//GEN-LAST:event_rbtnNombreActionPerformed

private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
// TODO add your handling code here:
   String nombre=txtNombre.getText();
   String email=txtEmailu.getText();
   
   if(rbtnNombre.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"ID USUARIO","NOMBRES","APELLIDO P.","APELLIDO M.","DIRECCIÓN","TELEFONO","EMAIL","CONTRASEÑA"};
       modelo.setColumnIdentifiers(Titulos);
       this.tablaUsuariosConsulta.setModel(modelo);
       try {
            //aqui me quede
            String ConsultaSQL="SELECT * FROM usuario WHERE nombre_usuario='"+nombre+"'";
        
            String []registros= new String[8];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("id_usuario");
                registros[1]=rs.getString("nombre_usuario");
                registros[2]=rs.getString("apellidop_usuario");  
                registros[3]=rs.getString("apellidom_usuario");
                registros[4]=rs.getString("direccion_usuario");
                registros[5]=rs.getString("tel_usuario");
               
                registros[6]=rs.getString("email_usuario");
                registros[7]=rs.getString("contraseña_usuario");
                modelo.addRow(registros);
                                
            }
            tablaUsuariosConsulta.setModel(modelo);
            txtRegistros.setText(""+tablaUsuariosConsulta.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(frmConsultasUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   if(rbtnEmail.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
        String []Titulos = {"ID USUARIO","NOMBRES","APELLIDO P.","APELLIDO M.","DIRECCIÓN","TELEFONO","EMAIL","CONTRASEÑA"};
       modelo.setColumnIdentifiers(Titulos);
       this.tablaUsuariosConsulta.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM usuario WHERE email_usuario='"+email+"'";
        
            String []registros= new String[8];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
              registros[0]=rs.getString("id_usuario");
                registros[1]=rs.getString("nombre_usuario");
                registros[2]=rs.getString("apellidop_usuario");  
                registros[3]=rs.getString("apellidom_usuario");
                registros[4]=rs.getString("direccion_usuario");
                registros[5]=rs.getString("tel_usuario");
               
                registros[6]=rs.getString("email_usuario");
                registros[7]=rs.getString("contraseña_usuario");
                modelo.addRow(registros);
                                
            }
            tablaUsuariosConsulta.setModel(modelo);
            txtRegistros.setText(""+tablaUsuariosConsulta.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(frmConsultasUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
   }
   if(rbtnTodo.isSelected()==true)
   {
       Cargarlistausuarios();
   }
   
}//GEN-LAST:event_btnbuscarActionPerformed

private void rbtnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEmailActionPerformed
// TODO add your handling code here:
    if(rbtnEmail.isSelected()==true)
    {
        txtNombre.setText("");
        txtNombre.setEnabled(false);
       // cbogenero.setEnabled(false);
        txtEmailu.setEnabled(true);
        txtEmailu.requestFocus();
    }
}//GEN-LAST:event_rbtnEmailActionPerformed

private void rbtnTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTodoActionPerformed
// TODO add your handling code here:
    Cargarlistausuarios();
    txtEmailu.setText("");
    txtEmailu.setEnabled(false);
    txtNombre.setText("");
    txtNombre.setEnabled(false);
}//GEN-LAST:event_rbtnTodoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRegistros;
    private javax.swing.JRadioButton rbtnEmail;
    private javax.swing.JRadioButton rbtnNombre;
    private javax.swing.JRadioButton rbtnTodo;
    private javax.swing.JTable tablaUsuariosConsulta;
    private javax.swing.JTextField txtEmailu;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRegistros;
    // End of variables declaration//GEN-END:variables
conexion cc= new conexion();
Connection cn = cc.conectar();


}

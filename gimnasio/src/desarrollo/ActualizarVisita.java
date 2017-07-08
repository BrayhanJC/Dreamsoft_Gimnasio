/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.awt.event.KeyEvent;
import logica.DB;
import net.sf.jcarrierpigeon.WindowPosition;
import net.sf.jtelegraph.Telegraph;
import net.sf.jtelegraph.TelegraphQueue;
import net.sf.jtelegraph.TelegraphType;

/**
 *
 * @author GID
 */
public class ActualizarVisita extends javax.swing.JInternalFrame {

    /**
     * Creates new form internalEjemplo
     */
    private DB db = new DB();

    AdministrarVisita parent;
    puerta.Puerta arduino;

    public ActualizarVisita(AdministrarVisita parent) {
        this.parent = parent;
        initComponents();
    }

    public ActualizarVisita() {
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

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPriApellido = new javax.swing.JTextField();
        txtPriNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSegNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSegApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar Visitas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Primer Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Primer Apellido");

        txtPriApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPriApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriApellidoKeyReleased(evt);
            }
        });

        txtPriNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPriNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriNombreKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Segundo Nombre");

        txtSegNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSegNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSegNombreKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Segundo Apellido");

        txtSegApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSegApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSegApellidoKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Costo");

        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCostoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCostoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCosto)
                            .addComponent(txtPriApellido)
                            .addComponent(txtPriNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSegNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtSegApellido))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPriNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPriApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSegApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Visita");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/hoja.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Permite registrar una visita de un invitado e ingresar el pago.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPriNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriNombreKeyReleased
        // TODO add your handling code here:
        logica.Utilidades coso = new logica.Utilidades();
        coso.validarCamposTexto(txtPriNombre.getText(), txtPriNombre);
    }//GEN-LAST:event_txtPriNombreKeyReleased

    private void txtSegNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegNombreKeyReleased
        // TODO add your handling code here:
        logica.Utilidades coso = new logica.Utilidades();
        coso.validarCamposTexto(txtSegNombre.getText(), txtSegNombre);
    }//GEN-LAST:event_txtSegNombreKeyReleased

    private void txtPriApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriApellidoKeyReleased
        // TODO add your handling code here:
        logica.Utilidades coso = new logica.Utilidades();
        coso.validarCamposTexto(txtPriApellido.getText(), txtPriApellido);
    }//GEN-LAST:event_txtPriApellidoKeyReleased

    private void txtSegApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegApellidoKeyReleased
        // TODO add your handling code here:
        logica.Utilidades coso = new logica.Utilidades();
        coso.validarCamposTexto(txtSegApellido.getText(), txtSegApellido);
    }//GEN-LAST:event_txtSegApellidoKeyReleased

    private void txtCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyReleased
        // TODO add your handling code here:
        logica.Utilidades coso = new logica.Utilidades();
        coso.validarCampoNumericos(txtCosto.getText(), txtCosto);
    }//GEN-LAST:event_txtCostoKeyReleased

    private void txtCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            guardar();
        }
    }//GEN-LAST:event_txtCostoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
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
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtPriApellido;
    private javax.swing.JTextField txtPriNombre;
    private javax.swing.JTextField txtSegApellido;
    private javax.swing.JTextField txtSegNombre;
    // End of variables declaration//GEN-END:variables

    public void guardar() {
        // TODO add your handling code here:
        String priNombre, segNombre, priApellido, segApellido, nombres, apellidos, querySQL;
        int usuario_id = Integer.parseInt(System.getProperty("usuario_sistema"));
        priNombre = txtPriNombre.getText().trim();
        segNombre = txtSegNombre.getText().trim();
        priApellido = txtPriApellido.getText().trim();
        segApellido = txtSegApellido.getText().trim();

        if ((txtPriNombre.getText().isEmpty()) && (txtPriApellido.getText().isEmpty()) && (txtCosto.getText().isEmpty())) {
            Telegraph tele = new Telegraph("Registro De Visita", "El campo Primer Nombre, Primer Apellido y Costo son requeridos para guardar la visita", TelegraphType.NOTIFICATION_WARNING, WindowPosition.TOPRIGHT, 9000);
            TelegraphQueue q = new TelegraphQueue();
            q.add(tele);
        } else if ((txtPriNombre.getText().isEmpty()) && (txtPriApellido.getText().isEmpty())) {
            Telegraph tele = new Telegraph("Registro De Visita", "El campo Primer Nombre y Primer Apellido son requeridos para guardar la visita", TelegraphType.NOTIFICATION_WARNING, WindowPosition.TOPRIGHT, 9000);
            TelegraphQueue q = new TelegraphQueue();
            q.add(tele);
        } else if ((txtPriNombre.getText().isEmpty())) {
            Telegraph tele = new Telegraph("Registro De Visita", "El campo Primer Nombre es requerido para guardar la visita", TelegraphType.NOTIFICATION_WARNING, WindowPosition.TOPRIGHT, 9000);
            TelegraphQueue q = new TelegraphQueue();
            q.add(tele);
        } else if ((txtPriApellido.getText().isEmpty())) {
            Telegraph tele = new Telegraph("Registro De Visita", "El campo Primer Apellido es requerido para guardar la visita", TelegraphType.NOTIFICATION_WARNING, WindowPosition.TOPRIGHT, 9000);
            TelegraphQueue q = new TelegraphQueue();
            q.add(tele);
        } else if ((txtCosto.getText().isEmpty())) {
            Telegraph tele = new Telegraph("Registro De Visita", "El campo Costo es requerido para guardar la visita", TelegraphType.NOTIFICATION_WARNING, WindowPosition.TOPRIGHT, 9000);
            TelegraphQueue q = new TelegraphQueue();
            q.add(tele);
        } else if (Double.parseDouble(txtCosto.getText().substring(0, 1)) == 0) {
            Telegraph tele = new Telegraph("Validación", "No se permitern valores menores a 0", TelegraphType.NOTIFICATION_INFO, WindowPosition.TOPRIGHT, 9000);
            TelegraphQueue q = new TelegraphQueue();
            q.add(tele);
        } else {

            nombres = priNombre.concat(" ").concat(segNombre);
            apellidos = priApellido.concat(" ").concat(segApellido);

            Double costo = Double.parseDouble(txtCosto.getText());
            querySQL = String.format("INSERT INTO pago_visita(usuario_sistema_id, nombres, apellidos, costo, fecha_registro) VALUES (%s,'%s','%s',%s,now())", usuario_id, nombres, apellidos, costo);
            boolean success = db.sqlEjec(querySQL);
            txtPriNombre.setText("");
            txtSegNombre.setText("");
            txtPriApellido.setText("");
            txtSegApellido.setText("");
            txtCosto.setText("");

            System.out.println("Se realizo el registro de la visita? = " + success);
            if (success) {

                Telegraph tele = new Telegraph("Registro De Visita", "Se ha registrado Correctamente registro de la Visita", TelegraphType.NOTIFICATION_DONE, WindowPosition.TOPRIGHT, 9000);
                TelegraphQueue q = new TelegraphQueue();
                q.add(tele);
                parent.cargarVisitas();
                //PuertaController.OpenDoor();
                arduino = new puerta.Puerta();
                arduino.openDoor();

            } else {
                Telegraph tele = new Telegraph("Visita No Registrada", "No se ha registrado Correctamente el registro de la Visita", TelegraphType.NOTIFICATION_ERROR, WindowPosition.TOPRIGHT, 9000);
                TelegraphQueue q = new TelegraphQueue();
                q.add(tele);
            }
        }
    }

}

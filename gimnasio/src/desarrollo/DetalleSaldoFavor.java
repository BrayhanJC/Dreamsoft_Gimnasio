/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.table.DefaultTableModel;
import logica.DB;

/**
 *
 * @author Usuario
 */
public class DetalleSaldoFavor extends javax.swing.JInternalFrame {

    /**
     * Creates new form DetalleSaldoFavor
     */
    logica.Utilidades utilidades = new logica.Utilidades();

    private DB db = new DB();

    public DetalleSaldoFavor() {
        initComponents();
        cargarSaldoFavor();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaIngresos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Detalles Saldo a Favor");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Detalles Ajustes de Caja (Saldo a Favor)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Detalle del Saldo a Favor generado en la caja");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/hoja.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(114, 114, 114))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaIngresos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaIngresos;
    // End of variables declaration//GEN-END:variables

    private void cargarSaldoFavor() {
        CachedRowSet data;

        DefaultTableModel tableModel = new DefaultTableModel(null, new String[]{"COD.", "USUARIO", "NOMBRE SOCIO", "SALDO"});
        String sqlQuery = "SELECT s.id, sis.primer_nombre||' '||sis.primer_apellido as usuario , s.primer_nombre || ' ' ||  s.segundo_nombre || ' ' || s.primer_apellido || ' ' || s.segundo_apellido, SUM(sf.valor_caja) \n"
                + "FROM saldofavor sf, caja c , usuario_sistema sis , socio s\n"
                + "                    WHERE sf.caja_id = c.id AND sis.id = sf.usuario_sistema_id AND s.id = sf.socio_id AND c.estado = TRUE AND sf.socio_id IN (SELECT sf.socio_id\n"
                + "                    		FROM saldofavor sf, caja c\n"
                + "                    	WHERE sf.caja_id = c.id AND c.estado = TRUE\n"
                + "                    		GROUP BY sf.valor , sf.valor_caja,sf.id \n"
                + "                    	)\n"
                + "                    AND sf.caja_origen is null \n"
                + "GROUP BY sf.socio_id , sis.primer_nombre , sis.primer_apellido , s.primer_nombre , s.segundo_nombre , s.primer_apellido , s.segundo_apellido , s.id\n"
                + "HAVING SUM(sf.valor_caja) > 0";
        System.out.println("El saldo a favor es: " + sqlQuery);
        data = db.sqlDatos(sqlQuery);

        try {
            tablaIngresos = logica.Utilidades.llenarTabla(data.createCopy(), tableModel, tablaIngresos);
        } catch (SQLException ex) {
            Logger.getLogger(DetalleSaldoFavor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capapresentacion;

/**
 *
 * @author rubiw
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnCliente = new javax.swing.JMenu();
        btnVendedor = new javax.swing.JMenu();
        btnAutomovil = new javax.swing.JMenu();
        btnRegistroVenta = new javax.swing.JMenu();
        btnMantenimiento = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(24, 24, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rubiw\\Downloads\\image-removebg-preview (1).png")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(24, 24, 24));
        jMenuBar1.setMargin(new java.awt.Insets(15, 15, 15, 15));

        btnCliente.setText("Cliente");
        btnCliente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnCliente.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnCliente);

        btnVendedor.setText("Vendedor");
        btnVendedor.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnVendedor.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendedorMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnVendedor);

        btnAutomovil.setText("Automovil");
        btnAutomovil.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAutomovil.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnAutomovil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAutomovilMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnAutomovil);

        btnRegistroVenta.setText("Registro de Venta");
        btnRegistroVenta.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnRegistroVenta.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnRegistroVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroVentaMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnRegistroVenta);

        btnMantenimiento.setText("Mantenimiento");
        btnMantenimiento.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnMantenimiento.setMargin(new java.awt.Insets(3, 10, 3, 10));
        btnMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMantenimientoMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnMantenimiento);

        jMenu6.setText("Ayuda");
        jMenu6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jMenu6.setMargin(new java.awt.Insets(3, 10, 3, 10));
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        capapresentacion.Mantenimiento.frmCliente cliente = new capapresentacion.Mantenimiento.frmCliente();
        cliente.show();
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendedorMouseClicked
        capapresentacion.Mantenimiento.frmVendedor vendedor = new capapresentacion.Mantenimiento.frmVendedor();
        vendedor.show();
    }//GEN-LAST:event_btnVendedorMouseClicked

    private void btnAutomovilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutomovilMouseClicked
        capapresentacion.Mantenimiento.frmAutomovil automovil = new capapresentacion.Mantenimiento.frmAutomovil();
        automovil.show();
    }//GEN-LAST:event_btnAutomovilMouseClicked

    private void btnRegistroVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroVentaMouseClicked
        capapresentacion.Mantenimiento.frmRegistroVenta registro = new capapresentacion.Mantenimiento.frmRegistroVenta();
        registro.show();
    }//GEN-LAST:event_btnRegistroVentaMouseClicked

    private void btnMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimientoMouseClicked
        capapresentacion.Mantenimiento.frmMantenimiento mantenimiento = new capapresentacion.Mantenimiento.frmMantenimiento();
        mantenimiento.show();
    }//GEN-LAST:event_btnMantenimientoMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnAutomovil;
    private javax.swing.JMenu btnCliente;
    private javax.swing.JMenu btnMantenimiento;
    private javax.swing.JMenu btnRegistroVenta;
    private javax.swing.JMenu btnVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

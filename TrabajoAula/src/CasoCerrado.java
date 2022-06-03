
import java.awt.BorderLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class CasoCerrado extends javax.swing.JFrame {

    /**
     * Creates new form CasoCerrado
     */
    public CasoCerrado() {
        initComponents();
        
        Inicio in = new Inicio(); 
        in.setSize(720,490);
        in.setLocation(0,0);
        
        content.removeAll();
        content.add(in, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
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
        jPanel2 = new javax.swing.JPanel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JButton();
        btnDetective = new javax.swing.JButton();
        btnSospechosos = new javax.swing.JButton();
        btnCasos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1012, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("Caso Cerrado");

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        btnInicio.setBackground(new java.awt.Color(0, 102, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-outline.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnDetective.setBackground(new java.awt.Color(0, 51, 204));
        btnDetective.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-multiple.png"))); // NOI18N
        btnDetective.setText("Detective");
        btnDetective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetectiveActionPerformed(evt);
            }
        });

        btnSospechosos.setBackground(new java.awt.Color(0, 102, 255));
        btnSospechosos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file-chart.png"))); // NOI18N
        btnSospechosos.setText("Sospechosos");
        btnSospechosos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSospechososActionPerformed(evt);
            }
        });

        btnCasos.setBackground(new java.awt.Color(0, 51, 255));
        btnCasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book-open-page-variant.png"))); // NOI18N
        btnCasos.setText("Casos");
        btnCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSospechosos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCasos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(app_name))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addComponent(btnDetective, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(app_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCasos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnDetective, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSospechosos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 630));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mmmmmm.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 4, 600, 100));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 720, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        Inicio in = new Inicio(); 
        in.setSize(720,490);
        in.setLocation(0,0);
        
        content.removeAll();
        content.add(in, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnDetectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetectiveActionPerformed
        // TODO add your handling code here:
        Detectives det = new Detectives(); 
        det.setSize(720,490);
        det.setLocation(0,0);
        
        content.removeAll();
        content.add(det, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnDetectiveActionPerformed

    private void btnCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasosActionPerformed
        // TODO add your handling code here:
        Casos cas = new Casos(); 
        cas.setSize(720,490);
        cas.setLocation(0,0);
        
        content.removeAll();
        content.add(cas, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnCasosActionPerformed

    private void btnSospechososActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSospechososActionPerformed
        // TODO add your handling code here:
        Sospechosos sos= new Sospechosos(); 
        sos.setSize(720,490);
        sos.setLocation(0,0);
        
        content.removeAll();
        content.add(sos, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnSospechososActionPerformed

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
            java.util.logging.Logger.getLogger(CasoCerrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasoCerrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasoCerrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasoCerrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasoCerrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel app_name;
    private javax.swing.JButton btnCasos;
    private javax.swing.JButton btnDetective;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnSospechosos;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

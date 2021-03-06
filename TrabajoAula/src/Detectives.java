
import java.awt.event.KeyAdapter;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Detectives extends javax.swing.JPanel {
    DefaultTableModel dtm=new DefaultTableModel();
    
    TableRowSorter trs;

    /**
     * Creates new form Detectives
     */
    public Detectives() {
        initComponents();
        String[] titulo=new String[]{"No. Identificación", "Nombre y Apellido", "Años de Experiencia", "Especialidad "}; 
        dtm.setColumnIdentifiers(titulo);
        tlDetective.setModel(dtm);   
    }
    
    void agregar(){
        dtm.addRow(new Object[]{txtNide.getText(),txtNomApel.getText(),cmbExperiencia.getSelectedItem(),cmbCaso.getSelectedItem()});
    }
    
    void limpiar(){
        txtNide.setText("");
        txtNomApel.setText("");
    }
    
    void eliminar(){
        int fila=tlDetective.getSelectedRow();
        dtm.removeRow(fila);
    }
    
    void actualizar(){
        int fila=tlDetective.getSelectedRow();
        dtm.setValueAt(txtNide.getText(), fila, 0);
        dtm.setValueAt(txtNomApel.getText(), fila, 1);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tlDetective = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCaso = new javax.swing.JComboBox<>();
        txtNide = new javax.swing.JTextField();
        txtNomApel = new javax.swing.JTextField();
        cmbExperiencia = new javax.swing.JComboBox<>();
        btnguardarD = new javax.swing.JButton();
        btnBorrarD = new javax.swing.JButton();
        btnModificarD = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtConsultar = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tlDetective.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tlDetective.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlDetectiveMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tlDetective);

        jLabel1.setText("No.Identificación");

        jLabel2.setText("Nombre Y Apellido");

        jLabel3.setText("Experiencia");

        jLabel4.setText("Casos Especializado");

        cmbCaso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Casos", "Homicidios", "CiberCrimen", "Narcoticos" }));

        cmbExperiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Años de Experiencia", "Menos de 3 años", "3 a 5 años", "Mas de 5 años" }));

        btnguardarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-guardar-48.png"))); // NOI18N
        btnguardarD.setText("Guardar");
        btnguardarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarDActionPerformed(evt);
            }
        });

        btnBorrarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-eliminar-48.png"))); // NOI18N
        btnBorrarD.setText("Borrar");
        btnBorrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDActionPerformed(evt);
            }
        });

        btnModificarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-editar-archivo-48.png"))); // NOI18N
        btnModificarD.setText("Modificar");
        btnModificarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDActionPerformed(evt);
            }
        });

        jLabel5.setText("Consultar");

        txtConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbCaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomApel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNide, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnguardarD)
                        .addGap(55, 55, 55)
                        .addComponent(btnBorrarD))
                    .addComponent(btnModificarD)
                    .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomApel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(cmbExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBorrarD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguardarD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(btnModificarD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarDActionPerformed
        // TODO add your handling code here:
        agregar();
        limpiar();
        txtNide.requestFocus();
    }//GEN-LAST:event_btnguardarDActionPerformed

    private void btnBorrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_btnBorrarDActionPerformed

    private void btnModificarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_btnModificarDActionPerformed

    private void tlDetectiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlDetectiveMouseClicked
        // TODO add your handling code here:
        int fila_selecionada=tlDetective.getSelectedRow();
        txtNide.setText(tlDetective.getValueAt(fila_selecionada,0).toString());
        txtNomApel.setText(tlDetective.getValueAt(fila_selecionada,1).toString());
        int fila=fila_selecionada;
        
    }//GEN-LAST:event_tlDetectiveMouseClicked

    private void txtConsultarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarKeyTyped
        // TODO add your handling code here:
        txtConsultar.addKeyListener(new KeyAdapter(){
            @Override
        public void keyReleased(java.awt.event.KeyEvent e) {
          trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtConsultar.getText(), 1));
        } 
        }
        );
        trs=new TableRowSorter(dtm);
        tlDetective.setRowSorter(trs);
    }//GEN-LAST:event_txtConsultarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarD;
    private javax.swing.JButton btnModificarD;
    private javax.swing.JButton btnguardarD;
    private javax.swing.JComboBox<String> cmbCaso;
    private javax.swing.JComboBox<String> cmbExperiencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tlDetective;
    private javax.swing.JTextField txtConsultar;
    private javax.swing.JTextField txtNide;
    private javax.swing.JTextField txtNomApel;
    // End of variables declaration//GEN-END:variables
}

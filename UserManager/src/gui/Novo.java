/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ConnectionFactory;
import dao.UsuarioDAO;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author scheleder
 */
public class Novo extends javax.swing.JDialog {

    /**
     * Creates new form Login
     */
    public Novo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public static void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(22, 42, 57));
    }

    public static void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(33, 63, 86));
    }

    Novo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        txtMatricula = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        lbMatricula = new javax.swing.JLabel();
        lbEntrar = new javax.swing.JLabel();
        lbCancelar = new javax.swing.JLabel();
        lbSenha1 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        comboGrupo = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(272, 300));
        setMinimumSize(new java.awt.Dimension(272, 300));
        setModal(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(272, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(272, 300));

        jPanel1.setBackground(new java.awt.Color(33, 63, 86));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 370));
        jPanel1.setRequestFocusEnabled(false);

        txtMatricula.setBackground(new java.awt.Color(240, 240, 240));
        txtMatricula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyPressed(evt);
            }
        });

        lbSenha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(255, 255, 255));
        lbSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSenha.setText("Nome:");

        lbMatricula.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbMatricula.setForeground(new java.awt.Color(255, 255, 255));
        lbMatricula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMatricula.setText("Matricula");

        lbEntrar.setBackground(new java.awt.Color(33, 63, 86));
        lbEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lbEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEntrar.setText("Salvar");
        lbEntrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        lbEntrar.setOpaque(true);
        lbEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEntrarMouseExited(evt);
            }
        });

        lbCancelar.setBackground(new java.awt.Color(33, 63, 86));
        lbCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lbCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCancelar.setText("Cancelar");
        lbCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        lbCancelar.setOpaque(true);
        lbCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCancelarMouseExited(evt);
            }
        });

        lbSenha1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbSenha1.setForeground(new java.awt.Color(255, 255, 255));
        lbSenha1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSenha1.setText("E-mail:");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auditado", "Auditor", "Gestor" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        comboGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "SJP05", "SJP06", "SJP07", "SJP08", "SJP09", "Dolci", "Flexo", "Administrativo", "Almoxarifado", "Logística", "Manutenção" }));
        comboGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGrupoActionPerformed(evt);
            }
        });

        txtNome.setBackground(new java.awt.Color(240, 240, 240));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(240, 240, 240));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMatricula)
                            .addComponent(lbSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbSenha1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOVO USUÁRIO");
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 30));
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// <editor-fold defaultstate="collapsed" desc="Eventos">
    private void lbCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCancelarMouseClicked
        dispose();
    }//GEN-LAST:event_lbCancelarMouseClicked

    private void lbCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCancelarMouseEntered
        setLblColor(lbCancelar);
        lbCancelar.setForeground(Color.orange);
    }//GEN-LAST:event_lbCancelarMouseEntered

    private void lbCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCancelarMouseExited
        resetLblColor(lbCancelar);
        lbCancelar.setForeground(Color.white);
    }//GEN-LAST:event_lbCancelarMouseExited

    private void lbEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEntrarMouseEntered
        setLblColor(lbEntrar);
        lbEntrar.setForeground(Color.green);

    }//GEN-LAST:event_lbEntrarMouseEntered

    private void lbEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEntrarMouseExited
        resetLblColor(lbEntrar);
        lbEntrar.setForeground(Color.white);
    }//GEN-LAST:event_lbEntrarMouseExited

    private void lbEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEntrarMouseClicked
        salvaUser();
    }//GEN-LAST:event_lbEntrarMouseClicked

    private void txtMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }//GEN-LAST:event_txtMatriculaKeyPressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();
        this.setLocation(kordinatX, kordinatY);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        if (comboTipo.getSelectedIndex() != 0) {
            comboGrupo.setSelectedIndex(0);
        }

    }//GEN-LAST:event_comboTipoActionPerformed

    private void comboGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGrupoActionPerformed
        if (comboGrupo.getSelectedIndex() != 0) {
            comboTipo.setSelectedIndex(0);
        }
    }//GEN-LAST:event_comboGrupoActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyPressed
    // </editor-fold>

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
            java.util.logging.Logger.getLogger(Novo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Novo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Novo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Novo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Novo dialog = new Novo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Variáveis">
    private String senhaDigitada;
    private String matriculaDigitada;
    private String campo;
    private String dado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboGrupo;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCancelar;
    private javax.swing.JLabel lbEntrar;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbSenha1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void salvaUser() {
        if (txtNome.getText().isEmpty()||txtMatricula.getText().isEmpty()||txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            UsuarioDAO dao = new UsuarioDAO();
            if (dao.save(comboTipo.getSelectedItem().toString(), txtNome.getText(), txtMatricula.getText(), txtEmail.getText(), comboGrupo.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(null, comboTipo.getSelectedItem().toString() + " " + txtNome.getText() + " adicionado!");
                limpaCampos();

            } else {
                JOptionPane.showMessageDialog(null, "Inclusão falhou!");
                limpaCampos();

            }
        }
    }
// </editor-fold>

    private void limpaCampos() {
        txtMatricula.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        comboTipo.setSelectedIndex(0);
        comboGrupo.setSelectedIndex(0);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import dao.TestaConexao;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author jscheleder
 */
public class UserManager extends javax.swing.JFrame {

    public UserManager() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/users.png")).getImage());
        this.setTitle("Gestão de Usuários de Auditoria 5S");
        TestaConexao.testa();
        DefaultTableModel modeloAuditados = (DefaultTableModel) tabelaAuditados.getModel();
        tabelaAuditados.setRowSorter(new TableRowSorter(modeloAuditados));
        DefaultTableModel modeloAuditores = (DefaultTableModel) tabelaAuditores.getModel();
        tabelaAuditores.setRowSorter(new TableRowSorter(modeloAuditores));
        DefaultTableModel modeloGestores = (DefaultTableModel) tabelaGestores.getModel();
        tabelaGestores.setRowSorter(new TableRowSorter(modeloGestores));
        readUsers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JTabbedPane();
        abaAuditado = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaAuditados = new javax.swing.JTable();
        abaAuditor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAuditores = new javax.swing.JTable();
        abaGestor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGestores = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtMatricula = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btLimpar = new javax.swing.JButton();
        btSenha = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        painelPrincipal.setName(""); // NOI18N

        abaAuditado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abaAuditadoFocusGained(evt);
            }
        });
        abaAuditado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abaAuditadoMouseClicked(evt);
            }
        });
        abaAuditado.setLayout(new javax.swing.BoxLayout(abaAuditado, javax.swing.BoxLayout.LINE_AXIS));

        tabelaAuditados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "E-mail", "Tipo", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAuditados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAuditadosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaAuditados);
        if (tabelaAuditados.getColumnModel().getColumnCount() > 0) {
            tabelaAuditados.getColumnModel().getColumn(0).setResizable(false);
            tabelaAuditados.getColumnModel().getColumn(1).setResizable(false);
            tabelaAuditados.getColumnModel().getColumn(2).setResizable(false);
            tabelaAuditados.getColumnModel().getColumn(3).setResizable(false);
            tabelaAuditados.getColumnModel().getColumn(4).setResizable(false);
        }

        abaAuditado.add(jScrollPane3);

        painelPrincipal.addTab("Auditado", new javax.swing.ImageIcon(getClass().getResource("/img/ic_auditado.png")), abaAuditado); // NOI18N

        abaAuditor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abaAuditorFocusGained(evt);
            }
        });
        abaAuditor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abaAuditorMouseClicked(evt);
            }
        });
        abaAuditor.setLayout(new javax.swing.BoxLayout(abaAuditor, javax.swing.BoxLayout.LINE_AXIS));

        tabelaAuditores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "E-mail", "Tipo", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAuditores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAuditoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaAuditores);
        if (tabelaAuditores.getColumnModel().getColumnCount() > 0) {
            tabelaAuditores.getColumnModel().getColumn(0).setResizable(false);
            tabelaAuditores.getColumnModel().getColumn(1).setResizable(false);
            tabelaAuditores.getColumnModel().getColumn(2).setResizable(false);
            tabelaAuditores.getColumnModel().getColumn(3).setResizable(false);
            tabelaAuditores.getColumnModel().getColumn(4).setResizable(false);
        }

        abaAuditor.add(jScrollPane2);

        painelPrincipal.addTab("Auditor", new javax.swing.ImageIcon(getClass().getResource("/img/ic_auditor.png")), abaAuditor); // NOI18N

        abaGestor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abaGestorFocusGained(evt);
            }
        });
        abaGestor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abaGestorMouseClicked(evt);
            }
        });
        abaGestor.setLayout(new javax.swing.BoxLayout(abaGestor, javax.swing.BoxLayout.LINE_AXIS));

        tabelaGestores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "E-mail", "Tipo", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaGestores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaGestoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaGestores);
        if (tabelaGestores.getColumnModel().getColumnCount() > 0) {
            tabelaGestores.getColumnModel().getColumn(0).setResizable(false);
            tabelaGestores.getColumnModel().getColumn(1).setResizable(false);
            tabelaGestores.getColumnModel().getColumn(2).setResizable(false);
            tabelaGestores.getColumnModel().getColumn(3).setResizable(false);
            tabelaGestores.getColumnModel().getColumn(4).setResizable(false);
        }

        abaGestor.add(jScrollPane1);

        painelPrincipal.addTab("Gestor", new javax.swing.ImageIcon(getClass().getResource("/img/ic_gestor.png")), abaGestor); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMatricula.setBackground(new java.awt.Color(214, 217, 223));
        txtMatricula.setText("Matricula");
        txtMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Matricula"));
        txtMatricula.setPreferredSize(new java.awt.Dimension(250, 40));

        txtEmail.setBackground(new java.awt.Color(214, 217, 223));
        txtEmail.setText("user@berry");
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "E-mail"));
        txtEmail.setPreferredSize(new java.awt.Dimension(250, 40));

        txtNome.setBackground(new java.awt.Color(214, 217, 223));
        txtNome.setText("Nome");
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nome"));
        txtNome.setPreferredSize(new java.awt.Dimension(250, 40));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtTipo.setEditable(false);
        txtTipo.setBackground(new java.awt.Color(214, 217, 223));
        txtTipo.setText("tipo");
        txtTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Tipo"));
        txtTipo.setFocusable(false);
        txtTipo.setPreferredSize(new java.awt.Dimension(250, 40));

        txtGrupo.setEditable(false);
        txtGrupo.setBackground(new java.awt.Color(214, 217, 223));
        txtGrupo.setText("grupo");
        txtGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Grupo"));
        txtGrupo.setFocusable(false);
        txtGrupo.setPreferredSize(new java.awt.Dimension(250, 40));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btLimpar.setText("ALTERAR GRUPO");
        btLimpar.setPreferredSize(new java.awt.Dimension(180, 60));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSenha.setText("RESETAR SENHA");
        btSenha.setPreferredSize(new java.awt.Dimension(180, 60));
        btSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSenhaActionPerformed(evt);
            }
        });

        btUpdate.setText("ATUALIZAR TABELAS");
        btUpdate.setPreferredSize(new java.awt.Dimension(180, 60));
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btNovo.setText("NOVO USUÁRIO");
        btNovo.setPreferredSize(new java.awt.Dimension(180, 60));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setText("SALVA USUÁRIO");
        btSalvar.setPreferredSize(new java.awt.Dimension(180, 60));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("EXCLUIR USUÁRIO");
        btExcluir.setPreferredSize(new java.awt.Dimension(180, 60));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelPrincipal.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        alteraGrupo();

    }//GEN-LAST:event_btLimparActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpaCampos();
        Novo dialog = new Novo(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                readUsers();
            }
        });
        dialog.setVisible(true);

    }//GEN-LAST:event_btNovoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void tabelaAuditadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAuditadosMouseClicked
        txtMatricula.setText(tabelaAuditados.getValueAt(tabelaAuditados.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaAuditados.getValueAt(tabelaAuditados.getSelectedRow(), 1).toString());
        txtEmail.setText(tabelaAuditados.getValueAt(tabelaAuditados.getSelectedRow(), 2).toString());
        txtTipo.setText(tabelaAuditados.getValueAt(tabelaAuditados.getSelectedRow(), 3).toString());
        txtGrupo.setText(tabelaAuditados.getValueAt(tabelaAuditados.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tabelaAuditadosMouseClicked

    private void tabelaGestoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaGestoresMouseClicked
        txtMatricula.setText(tabelaGestores.getValueAt(tabelaGestores.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaGestores.getValueAt(tabelaGestores.getSelectedRow(), 1).toString());
        txtEmail.setText(tabelaGestores.getValueAt(tabelaGestores.getSelectedRow(), 2).toString());
        txtTipo.setText(tabelaGestores.getValueAt(tabelaGestores.getSelectedRow(), 3).toString());
        txtGrupo.setText(tabelaGestores.getValueAt(tabelaGestores.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tabelaGestoresMouseClicked

    private void tabelaAuditoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAuditoresMouseClicked
        txtMatricula.setText(tabelaAuditores.getValueAt(tabelaAuditores.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaAuditores.getValueAt(tabelaAuditores.getSelectedRow(), 1).toString());
        txtEmail.setText(tabelaAuditores.getValueAt(tabelaAuditores.getSelectedRow(), 2).toString());
        txtTipo.setText(tabelaAuditores.getValueAt(tabelaAuditores.getSelectedRow(), 3).toString());
        txtGrupo.setText(tabelaAuditores.getValueAt(tabelaAuditores.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tabelaAuditoresMouseClicked

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        limpaCampos();
        readUsers();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        deletaUser();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSenhaActionPerformed
        resetSenha();
    }//GEN-LAST:event_btSenhaActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        atualizaUser();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void abaAuditadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abaAuditadoFocusGained
        tabelaAuditados.clearSelection();
        limpaCampos();
    }//GEN-LAST:event_abaAuditadoFocusGained

    private void abaAuditorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abaAuditorFocusGained
        tabelaAuditores.clearSelection();
        limpaCampos();
    }//GEN-LAST:event_abaAuditorFocusGained

    private void abaGestorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abaGestorFocusGained
        tabelaGestores.clearSelection();
        limpaCampos();
    }//GEN-LAST:event_abaGestorFocusGained

    private void abaAuditadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abaAuditadoMouseClicked
        tabelaAuditados.clearSelection();
        limpaCampos();
    }//GEN-LAST:event_abaAuditadoMouseClicked

    private void abaAuditorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abaAuditorMouseClicked
        tabelaAuditores.clearSelection();
        limpaCampos();
    }//GEN-LAST:event_abaAuditorMouseClicked

    private void abaGestorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abaGestorMouseClicked
        tabelaGestores.clearSelection();
        limpaCampos();
    }//GEN-LAST:event_abaGestorMouseClicked

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
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaAuditado;
    private javax.swing.JPanel abaAuditor;
    private javax.swing.JPanel abaGestor;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSenha;
    private javax.swing.JButton btUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane painelPrincipal;
    private javax.swing.JTable tabelaAuditados;
    private javax.swing.JTable tabelaAuditores;
    private javax.swing.JTable tabelaGestores;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    private void readUsers() {

        boolean lendo = true;
        DefaultTableModel modeloAuditados = (DefaultTableModel) tabelaAuditados.getModel();
        modeloAuditados.setNumRows(0);
        while (lendo) {
            UsuarioDAO dao = new UsuarioDAO();
            for (Usuario user : dao.read("auditado")) {
                modeloAuditados.addRow(new Object[]{
                    user.getMatricula(),
                    user.getNome(),
                    user.getMail(),
                    user.getTipo(),
                    user.getGrupo()
                });
            }
            lendo = false;
        }
        lendo = true;
        tabelaAuditados.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabelaAuditados.getColumnModel().getColumn(1).setPreferredWidth(220);
        tabelaAuditados.getColumnModel().getColumn(2).setPreferredWidth(220);
        tabelaAuditados.getColumnModel().getColumn(3).setPreferredWidth(60);
        tabelaAuditados.getColumnModel().getColumn(4).setPreferredWidth(60);

        DefaultTableModel modeloAuditores = (DefaultTableModel) tabelaAuditores.getModel();
        modeloAuditores.setNumRows(0);
        while (lendo) {
            UsuarioDAO dao1 = new UsuarioDAO();
            for (Usuario user : dao1.read("auditor")) {
                modeloAuditores.addRow(new Object[]{
                    user.getMatricula(),
                    user.getNome(),
                    user.getMail(),
                    user.getTipo(),
                    user.getGrupo()
                });
            }
            lendo = false;
        }
        lendo = true;
        tabelaAuditores.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabelaAuditores.getColumnModel().getColumn(1).setPreferredWidth(220);
        tabelaAuditores.getColumnModel().getColumn(2).setPreferredWidth(220);
        tabelaAuditores.getColumnModel().getColumn(3).setPreferredWidth(60);
        tabelaAuditores.getColumnModel().getColumn(4).setPreferredWidth(60);

        DefaultTableModel modeloGestores = (DefaultTableModel) tabelaGestores.getModel();
        modeloGestores.setNumRows(0);
        while (lendo) {
            UsuarioDAO dao2 = new UsuarioDAO();
            for (Usuario user : dao2.read("gestor")) {
                modeloGestores.addRow(new Object[]{
                    user.getMatricula(),
                    user.getNome(),
                    user.getMail(),
                    user.getTipo(),
                    user.getGrupo()
                });
            }
            lendo = false;
        }

        tabelaGestores.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabelaGestores.getColumnModel().getColumn(1).setPreferredWidth(220);
        tabelaGestores.getColumnModel().getColumn(2).setPreferredWidth(220);
        tabelaGestores.getColumnModel().getColumn(3).setPreferredWidth(60);
        tabelaGestores.getColumnModel().getColumn(4).setPreferredWidth(60);

    }

    /*private int pegaTipo(String mTipo) {
        switch (mTipo) {
            case "Auditado":
                return 0;
            case "Auditor":
                return 1;
            case "Gestor":
                return 2;
            default:
                return 0;
        }
    }*/
    private String pegaGrupo(int value) {
        switch (value) {
            case 0:
                return "SJP05";
            case 1:
                return "SJP06";
            case 2:
                return "SJP07";
            case 3:
                return "SJP08";
            case 4:
                return "SJP09";
            case 5:
                return "Dolci";
            case 6:
                return "Flexo";
            case 7:
                return "Administrativo";
            case 8:
                return "Almoxarifado";
            case 9:
                return "Logística";
            case 10:
                return "Manutenção";
            default:
                return "";
        }
    }

    /*
    private void login() {
        if (ConnectionFactory.USER.equals(txtUsuarioDigitado.getText()) && ConnectionFactory.PASS.equals(txtSenhaDigitada.getText())) {
            txtUsuarioDigitado.setText("");
            txtSenhaDigitada.setText("");
            System.err.println("Senha Correta!");
            txtSenhaDigitada.setVisible(false);
            txtUsuarioDigitado.setVisible(false);
            btEntrar.setVisible(false);            
            readUsers();
        } else {
            System.err.println("Dados incorretos! - User: " + txtUsuarioDigitado.getText() + " Pass: " + txtSenhaDigitada.getText());
            txtUsuarioDigitado.setText("Usuário");
            txtSenhaDigitada.setText("Senha");
            JOptionPane.showMessageDialog(null, "Dados incorretos!");
            btEntrar.requestFocus();
                               
        }
    }*/
    private void limpaCampos() {
        txtMatricula.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtTipo.setText("");
        txtGrupo.setText("");
    }

    private void deletaUser() {
        //confirma antes
        int input = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o " + txtTipo.getText() + " " + txtNome.getText() + "?");
        // 0=yes, 1=no, 2=cancel
        if (input == 0) {
            System.out.println(input);
            if (txtMatricula.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor selecionar o usuário que deseja excluir!");
            } else {
                UsuarioDAO dao = new UsuarioDAO();
                if (dao.delete(txtTipo.getText(), txtMatricula.getText())) {
                    JOptionPane.showMessageDialog(null, "Matricula (" + txtMatricula.getText() + ") excluída do sistema!");
                    limpaCampos();
                    readUsers();
                } else {
                    JOptionPane.showMessageDialog(null, "Exclusão falhou!");
                    limpaCampos();
                    readUsers();
                }
            }
        }
    }

    private void resetSenha() {
        if (txtMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor selecionar o usuário!");
        } else {
            UsuarioDAO dao = new UsuarioDAO();
            if (dao.resetSenha(txtTipo.getText(), txtMatricula.getText())) {
                JOptionPane.showMessageDialog(null, "Senha do " + txtTipo.getText() + "  matricula (" + txtMatricula.getText() + ") agora é 00000");
            } else {
                JOptionPane.showMessageDialog(null, "Alteração falhou!");
            }
        }
    }

    private void atualizaUser() {
        if (txtMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor selecionar o usuário!");
        } else {
            UsuarioDAO dao = new UsuarioDAO();
            if (dao.update(txtTipo.getText(), txtNome.getText(), txtMatricula.getText(), txtEmail.getText(), txtGrupo.getText())) {
                JOptionPane.showMessageDialog(null, "Dados do " + txtTipo.getText() + " " + txtNome.getText() + " atualizados!");
                limpaCampos();
                readUsers();
            } else {
                JOptionPane.showMessageDialog(null, "Alteração falhou!");
                limpaCampos();
                readUsers();
            }
        }
    }

    private void alteraGrupo() {
        if (txtMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor selecionar o usuário!");
        } else {
            if (!"Auditado".equals(txtTipo.getText())) {
                JOptionPane.showMessageDialog(null, "Somente para Auditados");
            } else {

                Object[] options = {"SJP05", "SJP06", "SJP07", "SJP08", "SJP09", "Dolci", "Flexo", "Administrativo", "Almoxarifado", "Logística", "Manutenção"};
                int x = JOptionPane.showOptionDialog(null, "Alterar o grupo de trabalho para:", "Escolha",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                //pegaGrupo(x);

                UsuarioDAO dao = new UsuarioDAO();
                if (dao.update(txtTipo.getText(), txtNome.getText(), txtMatricula.getText(), txtEmail.getText(), pegaGrupo(x))) {
                    JOptionPane.showMessageDialog(null, "Grupo do " + txtTipo.getText() + " " + txtNome.getText() + " alterado!");
                    limpaCampos();
                    readUsers();
                } else {
                    JOptionPane.showMessageDialog(null, "Alteração falhou!");
                    limpaCampos();
                    readUsers();
                }

            }
        }
    }

}

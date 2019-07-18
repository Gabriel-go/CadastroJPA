package cadastro.View;

import cadastro.CadatroDao.CadastroDao;
import cadastro.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edt_endereco = new java.awt.TextField();
        edt_nome = new java.awt.TextField();
        edt_id = new java.awt.TextField();
        edt_telefone = new java.awt.TextField();
        edt_email = new java.awt.TextField();
        btn_editar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_inserir = new javax.swing.JButton();
        btn_gravar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Email:");

        jLabel5.setText("Telefone:");

        edt_endereco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edt_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_enderecoActionPerformed(evt);
            }
        });

        edt_nome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_nomeActionPerformed(evt);
            }
        });

        edt_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edt_id.setEnabled(false);
        edt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_idActionPerformed(evt);
            }
        });
        edt_id.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                edt_idTextValueChanged(evt);
            }
        });

        edt_telefone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edt_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_telefoneActionPerformed(evt);
            }
        });

        edt_email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_emailActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_inserir.setText("Inserir");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_inserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_gravar))
                    .addComponent(edt_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edt_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edt_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(edt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)))
                                    .addComponent(edt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(edt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_consultar)
                    .addComponent(btn_inserir)
                    .addComponent(btn_editar)
                    .addComponent(btn_gravar)
                    .addComponent(btn_excluir))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edt_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_enderecoActionPerformed

    private void edt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_nomeActionPerformed

    private void edt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_idActionPerformed
    }//GEN-LAST:event_edt_idActionPerformed

    private void edt_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_telefoneActionPerformed

    private void edt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_emailActionPerformed

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
       
        CadastroDao cadastroDao = new CadastroDao();
        Cliente cliente = new Cliente();
        
        //Verifica se o campo esta vazio
        if (! edt_id.getText().toString().equals("")){
            //Se não estiver vazio ele ira popular o obj
            cliente.setId(Integer.parseInt(edt_id.getText()));
        }
                
        cliente.setEmail(edt_email.getText());
        cliente.setEndereco(edt_endereco.getText());
        cliente.setNome(edt_nome.getText());
        cliente.setTelefone(edt_telefone.getText());
        
        try {
            cliente = cadastroDao.salvar(cliente);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
       HabilitaCampos();
       edt_nome.requestFocus();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        String id = "0";
        limparCampos();
        id = JOptionPane.showInputDialog(this, "Insira o id cliente");
        
        CadastroDao cadastroDao = new CadastroDao();
        Cliente cliente = new Cliente();
        
        try {
            cliente = cadastroDao.consulta(Integer.parseInt(id));
            
            edt_endereco.setText(cliente.getEndereco());
            edt_email.setText(cliente.getEmail());
            edt_id.setText(String.valueOf(cliente.getId()));
            edt_nome.setText(cliente.getNome());
            edt_telefone.setText(cliente.getTelefone());
            
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesabilitaCampos();
            
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        limparCampos();
        HabilitaCampos();
        edt_nome.requestFocus();        
    }//GEN-LAST:event_btn_inserirActionPerformed

    private void edt_idTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_edt_idTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_idTextValueChanged

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        CadastroDao cadastroDao = new CadastroDao();
        Cliente cliente = new Cliente();
        
        cadastroDao.remover(Integer.parseInt(edt_id.getText()));
        limparCampos();
        DesabilitaCampos();
    }//GEN-LAST:event_btn_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
        
    }
    
    private void limparCampos(){
        edt_email.setText("");
        edt_endereco.setText("");
        edt_id.setText("");
        edt_nome.setText("");
        edt_telefone.setText("");
    }
    
    private void DesabilitaCampos(){
        edt_email.enable(false);
        edt_endereco.enable(false);
        //edt_id.enable(false);
        edt_nome.enable(false);
        edt_telefone.enable(false);
    }
    
    private void HabilitaCampos(){
        edt_email.enable(true);
        edt_endereco.enable(true);
        //edt_id.enable(true);
        edt_nome.enable(true);
        edt_telefone.enable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_inserir;
    private java.awt.TextField edt_email;
    private java.awt.TextField edt_endereco;
    private java.awt.TextField edt_id;
    private java.awt.TextField edt_nome;
    private java.awt.TextField edt_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

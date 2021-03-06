package TelasCruds;

import ClassesEntidades.Marca;
import TelasPesquisa.PesquisaMarca;
import ValgaSis.Banco;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author jucabnu
 */
public class CrudMarca extends javax.swing.JFrame {

    /**
     * Creates new form crudMarca
     */
    public CrudMarca() {
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

        jButton16 = new javax.swing.JButton();
        jLabelDesc = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        jLabelCod = new javax.swing.JLabel();
        campoCod = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        botaoGravar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();

        jButton16.setText("Mostrar");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Marca");

        jLabelDesc.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabelDesc.setText("Descrição:");

        campoDescricao.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        jLabelCod.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabelCod.setText("Cód. Marca:");

        campoCod.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        campoCod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCodFocusLost(evt);
            }
        });

        botaoPesquisar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.gif"))); // NOI18N
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });
        botaoPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                botaoPesquisarFocusLost(evt);
            }
        });

        botaoGravar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        botaoGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apply.gif"))); // NOI18N
        botaoGravar.setText("Gravar");
        botaoGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGravarActionPerformed(evt);
            }
        });

        botaoLimpar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Abort.gif"))); // NOI18N
        botaoLimpar.setText("Cancelar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoExcluir.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.gif"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoSair.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Door.gif"))); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCod, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDesc, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPesquisar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCod)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimpar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSair)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void campoRecebeCodMarca(Object o) {
        campoCod.setText(String.valueOf(o));
    }

    //  **************************************************
    //  **************** GRAVAR / ALTERAR ****************
    //  **************************************************    
    private void botaoGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGravarActionPerformed

        Marca m = new Marca();

        try {
            if (campoCod.getText().equals("")) {
            } else {
                Banco.selectMarca(Integer.parseInt(campoCod.getText()));
            }
            if (campoCod.getText().equals("")) {
                System.out.println("Teste: " + m.getCod_marca());
                // GRAVAR : INSERT
                m.setDes_marca(campoDescricao.getText());
                Banco.insertMarca(m);
                JOptionPane.showMessageDialog(null, "Marca cadastrada com sucesso!");
            } else {
                // ALTERAR : UPDATE            
                m.setCod_marca(Integer.parseInt(campoCod.getText()));
                m.setDes_marca(campoDescricao.getText());
                Banco.updateMarca(m);
                JOptionPane.showMessageDialog(null,
                        "As alterações foram gravadas com sucesso!");
            }
        } catch (NumberFormatException | HeadlessException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Formato inválido informado em algum dos campos ou"
                    + "\n" + "campo obrigatório deixado em branco."
                    + "\n" + "Favor reiniciar o cadastro."
                    + "\n" + "(Error Exception: " + e.getMessage());
            botaoLimparActionPerformed(evt);
        }

    }//GEN-LAST:event_botaoGravarActionPerformed

    //  **************************************************
    //  *************** LIMPAR / CANCELAR ****************
    //  **************************************************    
    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoCod.setText("");
        campoDescricao.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    //  **************************************************
    //  ********************* DELETE *********************
    //  **************************************************    
    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed

        Banco.deleteRegistro("cod_marca", "tab_marcas", campoCod.getText());
        botaoLimparActionPerformed(evt); // limpa os campos
        JOptionPane.showMessageDialog(null, "Marca excluida com sucesso");
    }//GEN-LAST:event_botaoExcluirActionPerformed

    //  **************************************************
    //  ********************* FECHAR *********************
    //  **************************************************
    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    //  **************************************************
    //  ******************** MOSTRAR *********************
    //  **************************************************
    private void campoCodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodFocusLost

        // MOSTRAR : SELECT / TAB
        try {
            if (campoCod.getText().equals("")) {
            } else {
                Marca marc = Banco.selectMarca(Integer.parseInt(campoCod.getText()));
                campoDescricao.setText(marc.getDes_marca());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Informe apenas número para o campo de código!"
                    + "\n" + ""
                    + "\n" + "Favor reiniciar o cadastro."
                    + "\n" + "(Error Exception: " + e.getMessage());
            botaoLimparActionPerformed(null);
        }
    }//GEN-LAST:event_campoCodFocusLost

    //  **************************************************
    //  ******************** PESQUISA ********************
    //  **************************************************
    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed

        PesquisaMarca tela = new PesquisaMarca();
        tela.instancia(this);
        tela.setVisible(true);

    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_botaoPesquisarFocusLost

        campoCodFocusLost(evt);
    }//GEN-LAST:event_botaoPesquisarFocusLost

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
            java.util.logging.Logger.getLogger(CrudMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudMarca().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoGravar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTextField campoCod;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelDesc;
    // End of variables declaration//GEN-END:variables
}

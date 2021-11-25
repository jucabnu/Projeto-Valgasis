/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TelasCruds;

import TelasReports.ReportClientes;
import TelasReports.ReportMarcas;
import TelasReports.ReportModelos;
import TelasReports.ReportVeiculos;
import TelasReports.ReportVendas;
import ValgaSis.About;

/**
 *
 * @author jucabnu
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jLabelMostraSobre = new javax.swing.JLabel();
        jLabelMostraLogo = new javax.swing.JLabel();
        jMenuBarMain = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuCliente = new javax.swing.JMenuItem();
        jMenuVeiculo = new javax.swing.JMenuItem();
        jMenuModelo = new javax.swing.JMenuItem();
        jMenuMarca = new javax.swing.JMenuItem();
        jMenuVendas = new javax.swing.JMenu();
        jMenuVenda = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuClienteR = new javax.swing.JMenuItem();
        jMenuVeiculoR = new javax.swing.JMenuItem();
        jMenuMarcaR = new javax.swing.JMenuItem();
        jMenuModeloR = new javax.swing.JMenuItem();
        jMenuVendaR = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ValgaSis | Gestão 0.8");
        setIconImages(null);

        jLabelMostraSobre.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabelMostraSobre.setText("ValgaSis por Jucabnu | 2013");

        jLabelMostraLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo valgasis.gif"))); // NOI18N

        jMenuCadastros.setText("Cadastros");
        jMenuCadastros.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuCadastros.setName(""); // NOI18N

        jMenuCliente.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Male.gif"))); // NOI18N
        jMenuCliente.setText("Clientes");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuCliente);

        jMenuVeiculo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Taxi.gif"))); // NOI18N
        jMenuVeiculo.setText("Veículos");
        jMenuVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVeiculoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuVeiculo);

        jMenuModelo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Database.gif"))); // NOI18N
        jMenuModelo.setText("Modelos");
        jMenuModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModeloActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuModelo);

        jMenuMarca.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Database.gif"))); // NOI18N
        jMenuMarca.setText("Marcas");
        jMenuMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMarcaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuMarca);

        jMenuBarMain.add(jMenuCadastros);

        jMenuVendas.setText("Vendas");
        jMenuVendas.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        jMenuVenda.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Accounting.gif"))); // NOI18N
        jMenuVenda.setText("Efetuar Venda");
        jMenuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendaActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuVenda);

        jMenuBarMain.add(jMenuVendas);

        jMenuRelatorios.setText("Relatórios");
        jMenuRelatorios.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        jMenuClienteR.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuClienteR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.gif"))); // NOI18N
        jMenuClienteR.setText("Clientes");
        jMenuClienteR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteRActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuClienteR);

        jMenuVeiculoR.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuVeiculoR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.gif"))); // NOI18N
        jMenuVeiculoR.setText("Veículos");
        jMenuVeiculoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVeiculoRActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuVeiculoR);

        jMenuMarcaR.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuMarcaR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.gif"))); // NOI18N
        jMenuMarcaR.setText("Marcas");
        jMenuMarcaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMarcaRActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuMarcaR);

        jMenuModeloR.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuModeloR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.gif"))); // NOI18N
        jMenuModeloR.setText("Modelos");
        jMenuModeloR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModeloRActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuModeloR);

        jMenuVendaR.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuVendaR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.gif"))); // NOI18N
        jMenuVendaR.setText("Vendas");
        jMenuVendaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendaRActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuVendaR);

        jMenuBarMain.add(jMenuRelatorios);

        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        jMenuAbout.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/About.gif"))); // NOI18N
        jMenuAbout.setText("Sobre");
        jMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuAbout);

        jMenuBarMain.add(jMenuAjuda);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBarMain.add(jMenuSair);

        setJMenuBar(jMenuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelMostraSobre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelMostraLogo)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabelMostraLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabelMostraSobre)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     private Image icone() {    
     return new javax.swing.ImageIcon(getClass().getResource(
     "C:/Users/jucabnu/Documents/NetBeansProjects/TCCValgaSis8_130613_1/src/icone.ico")).getImage();    
     }   */
    // setIconImage(new ImageIcon(getClass().getResource("C:/Users/jucabnu/Documents/NetBeansProjects/TCCValgaSis8_130613_1/src/icone.ico")).getImage());  
    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
        CrudCliente telaCliente = new CrudCliente();
        telaCliente.setVisible(true);
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVeiculoActionPerformed
        CrudVeiculo telaVeiculo = new CrudVeiculo();
        telaVeiculo.setVisible(true);
    }//GEN-LAST:event_jMenuVeiculoActionPerformed

    private void jMenuModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModeloActionPerformed
        CrudModelo telaModelo = new CrudModelo();
        telaModelo.setVisible(true);
    }//GEN-LAST:event_jMenuModeloActionPerformed

    private void jMenuMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMarcaActionPerformed
        CrudMarca telaMarca = new CrudMarca();
        telaMarca.setVisible(true);
    }//GEN-LAST:event_jMenuMarcaActionPerformed

    private void jMenuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendaActionPerformed
        CrudVenda telaVenda = new CrudVenda();
        telaVenda.setVisible(true);
    }//GEN-LAST:event_jMenuVendaActionPerformed

    private void jMenuClienteRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteRActionPerformed
        ReportClientes telaClienteR = new ReportClientes();
        telaClienteR.setVisible(true);
    }//GEN-LAST:event_jMenuClienteRActionPerformed

    private void jMenuVeiculoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVeiculoRActionPerformed
        ReportVeiculos telaVeiculoR = new ReportVeiculos();
        telaVeiculoR.setVisible(true);
    }//GEN-LAST:event_jMenuVeiculoRActionPerformed

    private void jMenuMarcaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMarcaRActionPerformed
        ReportMarcas telaMarcaR = new ReportMarcas();
        telaMarcaR.setVisible(true);
    }//GEN-LAST:event_jMenuMarcaRActionPerformed

    private void jMenuModeloRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModeloRActionPerformed
        ReportModelos telaModeloR = new ReportModelos();
        telaModeloR.setVisible(true);
    }//GEN-LAST:event_jMenuModeloRActionPerformed

    private void jMenuVendaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendaRActionPerformed
        ReportVendas telaVendaR = new ReportVendas();
        telaVendaR.setVisible(true);
    }//GEN-LAST:event_jMenuVendaRActionPerformed

    private void jMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutActionPerformed
        About about = new About();
        about.setVisible(true);
    }//GEN-LAST:event_jMenuAboutActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked

        System.exit(0);
        //this.dispose();
    }//GEN-LAST:event_jMenuSairMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelMostraLogo;
    private javax.swing.JLabel jLabelMostraSobre;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAbout;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarMain;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuClienteR;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuMarca;
    private javax.swing.JMenuItem jMenuMarcaR;
    private javax.swing.JMenuItem jMenuModelo;
    private javax.swing.JMenuItem jMenuModeloR;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem jMenuVeiculo;
    private javax.swing.JMenuItem jMenuVeiculoR;
    private javax.swing.JMenuItem jMenuVenda;
    private javax.swing.JMenuItem jMenuVendaR;
    private javax.swing.JMenu jMenuVendas;
    // End of variables declaration//GEN-END:variables
}
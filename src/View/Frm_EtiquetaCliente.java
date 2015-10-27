/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cidade;
import Util.Conexao;
import Util.GeraRelatorios;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_EtiquetaCliente extends javax.swing.JFrame {

    ResultSet rs;
    Statement st;
    Conexao con;
    Cidade cidade;
    List<Cidade> cidades = new ArrayList<>();

    public Frm_EtiquetaCliente() {
        initComponents();
        setVisible(true);
        carregaCidades();
        lb_loading.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbx_cidades = new javax.swing.JComboBox();
        btn_gerar = new javax.swing.JButton();
        lb_loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Etiqueta de Clientes");

        jLabel1.setText("Cidades *:");

        btn_gerar.setText("Gerar");
        btn_gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarActionPerformed(evt);
            }
        });

        lb_loading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loading.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_cidades, 0, 336, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lb_loading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(106, 106, 106)
                        .addComponent(btn_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbx_cidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_loading, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarActionPerformed
        gerar();
    }//GEN-LAST:event_btn_gerarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_EtiquetaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_EtiquetaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_EtiquetaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_EtiquetaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_EtiquetaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gerar;
    private javax.swing.JComboBox cbx_cidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_loading;
    // End of variables declaration//GEN-END:variables

    private void carregaCidades() {
        try {
            con = new Conexao();
            st = con.getConexao();
            rs = st.executeQuery("select distinct(s.CIDADE) from cliente c inner join cidades s on c.CODCIDADE=s.CODCIDADE");
            cbx_cidades.removeAllItems();
            cbx_cidades.addItem("Selecione uma Cidade");
            while (rs.next()) {
                cbx_cidades.addItem(rs.getString("cidade"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void gerar() {
        Thread acao;
        acao = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lb_loading.setVisible(true);
                    Map parameters = new HashMap();
                    if (cbx_cidades.getSelectedIndex() == 0) {
                        parameters.put("cidade", "%%");
                    } else {
                        parameters.put("cidade", cbx_cidades.getSelectedItem().toString());
                    }
                    GeraRelatorios geraRelatorios = new GeraRelatorios();
                    if (geraRelatorios.imprimirRelatorioSQLNoRelatorio(parameters, "Etiqueta 10 x 2.5.jasper","Relatório de Clientes por Cidade") == false) {
                        geraRelatorios.imprimirRelatorioSQLNoRelatorio(parameters, "src/Relatorios/Etiqueta 10 x 2.5.jasper","Relatório de Clientes por Cidade");
                        lb_loading.setVisible(false);
                    } else {
                        lb_loading.setVisible(false);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        );
        acao.start();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Util.Conexao;
import java.io.PrintWriter;
import java.sql.Statement;
import Util.PropertiesManager;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_Conexao extends javax.swing.JFrame {

    static Frm_Principal p;
    static Statement st;
    static ResultSet rs;
    static Conexao con;
    PrintWriter pw;
    PropertiesManager props;
    Conexao conexao;
    String diretorio;

    public Frm_Conexao() {
        initComponents();
        setVisible(true);
        carregaDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_ip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_banco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cnpj = new javax.swing.JFormattedTextField();
        btn_buscar = new javax.swing.JButton();
        btn_testar = new javax.swing.JButton();
        btn_gravar = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        btn_testar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração de Conexão");

        pnl_fundo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("IP:");

        txt_ip.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Banco *:");

        jLabel6.setText("CNPJ*:");

        try {
            txt_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_buscar.setText("...");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addComponent(txt_banco)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );

        btn_testar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/executar.png"))); // NOI18N
        btn_testar.setText("Testar");
        btn_testar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testarActionPerformed(evt);
            }
        });

        btn_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        status.setForeground(new java.awt.Color(0, 51, 153));

        btn_testar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carregar.png"))); // NOI18N
        btn_testar1.setText("Carregar");
        btn_testar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_testar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_testar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_testar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_gravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_testar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_testarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testarActionPerformed
        validaCampos();
    }//GEN-LAST:event_btn_testarActionPerformed

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        gravaDadosConexao();
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buscaImagem();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_testar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testar1ActionPerformed
        carregarCNPJ();
    }//GEN-LAST:event_btn_testar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Conexao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_testar;
    private javax.swing.JButton btn_testar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JLabel status;
    private javax.swing.JTextField txt_banco;
    private javax.swing.JFormattedTextField txt_cnpj;
    private javax.swing.JTextField txt_ip;
    // End of variables declaration//GEN-END:variables

    private void carregaDados() {
        props = new PropertiesManager();
        txt_banco.setText(props.ler("diretorio"));
        txt_ip.setText(props.ler("ip"));
        txt_cnpj.setText(props.ler("cnpj"));
    }

    private void validaCampos() {
        props = new PropertiesManager();
        if (txt_ip.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "IP inválido!");
            txt_ip.requestFocus();
        } else {
            if (txt_banco.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Banco inválido!");
                txt_banco.requestFocus();
            } else {
                if (txt_cnpj.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "CNPJ inválido!");
                    txt_cnpj.requestFocus();
                } else {
                    if (testaConexao(txt_ip.getText(), txt_banco.getText(), "SYSDBA", "masterkey") != null) {
                        status.setText("Conexão bem Sucedida!");
                    } else {
                        status.setText("Sem Conexão!");
                        JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados!");
                    }
                }
            }
        }
    }

    private void gravaDadosConexao() {
        if (testaConexao(txt_ip.getText(), txt_banco.getText(), "SYSDBA", "masterkey") != null) {
            try {
                props = new PropertiesManager();
                props.altera("ip", txt_ip.getText());
                props.altera("diretorio", txt_banco.getText());
                if (!txt_cnpj.getText().replace(".", "").replace("/", "").replace("-", "").trim().isEmpty()) {
                    props.altera("cnpj", txt_cnpj.getText());
                }
                JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar os dados de conexão!\n" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Antes de gravar você precisa conseguir estabelecer conexão com o banco de dados!");
        }

    }

    private Statement testaConexao(String ip, String banco, String usuario, String senha) {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:firebirdsql://"
                    + ip + ":3050/" + banco,
                    usuario,
                    senha);
            st = con.createStatement();
            return st;
        } catch (Exception e) {
            return null;
        }
    }
    
    private void buscaImagem() {
        JFileChooser c = new JFileChooser();
        c.showOpenDialog(this);//abre o arquivo  
        File file = c.getSelectedFile();//abre o arquivo selecionado  
        Path path = Paths.get(file.getAbsolutePath());
        diretorio = path.toString();
        if (diretorio.endsWith(".FB")) {
            txt_banco.setText(diretorio.replace("\\", "/"));
        } else {
            JOptionPane.showMessageDialog(this, "Extenção do arquivo selecionado inválido!\n ");
        }
    }

    private void carregarCNPJ() {
        try {
            st=con.getConexao();
            rs=st.executeQuery("select * from filiais");
            if(rs.next()){
                txt_cnpj.setText(rs.getString("cnpj"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o CNPJ!");
        }
    }
}

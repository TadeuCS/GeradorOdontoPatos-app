/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Produto;
import Util.Conexao;
import Util.GeraRelatorios;
import Util.TableConfig;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Tadeu
 */
public class Frm_Principal extends javax.swing.JFrame {

    Statement st;
    ResultSet rs;
    Conexao con;
    List<Cliente> clientes = new ArrayList<>();
    List<Produto> produtos = new ArrayList<>();
    List<Cliente> clientesSelecionados = new ArrayList<>();
    Cliente cliente;
    Produto produto;
    GeraRelatorios geraRelatorios;

    public Frm_Principal() {
        initComponents();
        setVisible(true);
        listaClientes();
        carregaProdutos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_filtroProdutos = new javax.swing.JTextField();
        txt_filtroProdutosSelecionados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_produtosSelecionados = new javax.swing.JTable();
        btn_adicionarProduto = new javax.swing.JButton();
        btn_adicionarTodosProdutos = new javax.swing.JButton();
        btn_removerTodosProdutos = new javax.swing.JButton();
        btn_removerProduto = new javax.swing.JButton();
        btn_gerarRelatorioProdutos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_clientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_filtroClientes = new javax.swing.JTextField();
        txt_filtroClientesSelecionados = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_adicionarCliente = new javax.swing.JButton();
        btn_adicionarTodosClientes = new javax.swing.JButton();
        btn_removerTodosClientes = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb_clientesSelecionados = new javax.swing.JTable();
        btn_gerarRelatorioProdutos1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerador de Etiqueta personalizada de Clientes e Produtos da ODONTO PATOS");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Referência", "Descrição", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_produtos);
        if (tb_produtos.getColumnModel().getColumnCount() > 0) {
            tb_produtos.getColumnModel().getColumn(0).setMinWidth(75);
            tb_produtos.getColumnModel().getColumn(0).setPreferredWidth(75);
            tb_produtos.getColumnModel().getColumn(0).setMaxWidth(75);
            tb_produtos.getColumnModel().getColumn(1).setMinWidth(100);
            tb_produtos.getColumnModel().getColumn(1).setPreferredWidth(100);
            tb_produtos.getColumnModel().getColumn(1).setMaxWidth(100);
            tb_produtos.getColumnModel().getColumn(3).setMinWidth(100);
            tb_produtos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tb_produtos.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel1.setText("Filtro:");

        txt_filtroProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroProdutosKeyReleased(evt);
            }
        });

        txt_filtroProdutosSelecionados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroProdutosSelecionadosKeyReleased(evt);
            }
        });

        jLabel2.setText("Filtro:");

        tb_produtosSelecionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Referência", "Descrição", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtosSelecionados.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tb_produtosSelecionados);
        if (tb_produtosSelecionados.getColumnModel().getColumnCount() > 0) {
            tb_produtosSelecionados.getColumnModel().getColumn(0).setMinWidth(75);
            tb_produtosSelecionados.getColumnModel().getColumn(0).setPreferredWidth(75);
            tb_produtosSelecionados.getColumnModel().getColumn(0).setMaxWidth(75);
            tb_produtosSelecionados.getColumnModel().getColumn(1).setMinWidth(100);
            tb_produtosSelecionados.getColumnModel().getColumn(1).setPreferredWidth(100);
            tb_produtosSelecionados.getColumnModel().getColumn(1).setMaxWidth(100);
            tb_produtosSelecionados.getColumnModel().getColumn(3).setMinWidth(100);
            tb_produtosSelecionados.getColumnModel().getColumn(3).setPreferredWidth(100);
            tb_produtosSelecionados.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        btn_adicionarProduto.setText(">");

        btn_adicionarTodosProdutos.setText(">>");

        btn_removerTodosProdutos.setText("<<");

        btn_removerProduto.setText("<");

        btn_gerarRelatorioProdutos.setText("Gerar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtroProdutos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_adicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_adicionarTodosProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(btn_removerProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_removerTodosProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtroProdutosSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_gerarRelatorioProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_filtroProdutosSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_filtroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_adicionarProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_adicionarTodosProdutos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_removerProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_removerTodosProdutos)
                                .addGap(44, 44, 44)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_gerarRelatorioProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Etiqueta de Produtos", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tb_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Telefone", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_clientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tb_clientes);
        if (tb_clientes.getColumnModel().getColumnCount() > 0) {
            tb_clientes.getColumnModel().getColumn(0).setMinWidth(75);
            tb_clientes.getColumnModel().getColumn(0).setPreferredWidth(75);
            tb_clientes.getColumnModel().getColumn(0).setMaxWidth(75);
            tb_clientes.getColumnModel().getColumn(1).setMinWidth(100);
            tb_clientes.getColumnModel().getColumn(1).setPreferredWidth(100);
            tb_clientes.getColumnModel().getColumn(1).setMaxWidth(100);
            tb_clientes.getColumnModel().getColumn(3).setMinWidth(100);
            tb_clientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            tb_clientes.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel3.setText("Filtro:");

        txt_filtroClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroClientesKeyReleased(evt);
            }
        });

        txt_filtroClientesSelecionados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroClientesSelecionadosKeyReleased(evt);
            }
        });

        jLabel4.setText("Filtro:");

        btn_adicionarCliente.setText(">");
        btn_adicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarClienteActionPerformed(evt);
            }
        });

        btn_adicionarTodosClientes.setText(">>");
        btn_adicionarTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarTodosClientesActionPerformed(evt);
            }
        });

        btn_removerTodosClientes.setText("<<");
        btn_removerTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerTodosClientesActionPerformed(evt);
            }
        });

        btn_remover.setText("<");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        tb_clientesSelecionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Telefone", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_clientesSelecionados.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tb_clientesSelecionados);
        if (tb_clientesSelecionados.getColumnModel().getColumnCount() > 0) {
            tb_clientesSelecionados.getColumnModel().getColumn(0).setMinWidth(75);
            tb_clientesSelecionados.getColumnModel().getColumn(0).setPreferredWidth(75);
            tb_clientesSelecionados.getColumnModel().getColumn(0).setMaxWidth(75);
            tb_clientesSelecionados.getColumnModel().getColumn(1).setMinWidth(100);
            tb_clientesSelecionados.getColumnModel().getColumn(1).setPreferredWidth(100);
            tb_clientesSelecionados.getColumnModel().getColumn(1).setMaxWidth(100);
            tb_clientesSelecionados.getColumnModel().getColumn(3).setMinWidth(100);
            tb_clientesSelecionados.getColumnModel().getColumn(3).setPreferredWidth(100);
            tb_clientesSelecionados.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        btn_gerarRelatorioProdutos1.setText("Gerar");
        btn_gerarRelatorioProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarRelatorioProdutos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtroClientes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_adicionarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_adicionarTodosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(btn_remover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_removerTodosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtroClientesSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_gerarRelatorioProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_filtroClientesSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_filtroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_adicionarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_adicionarTodosClientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_remover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_removerTodosClientes)
                                .addGap(44, 44, 44)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_gerarRelatorioProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Etiqueta de Clientes", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_filtroProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroProdutosKeyReleased
        TableConfig.filtrar(tb_produtos, txt_filtroProdutos);
    }//GEN-LAST:event_txt_filtroProdutosKeyReleased

    private void txt_filtroProdutosSelecionadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroProdutosSelecionadosKeyReleased
        TableConfig.filtrar(tb_produtosSelecionados, txt_filtroProdutosSelecionados);
    }//GEN-LAST:event_txt_filtroProdutosSelecionadosKeyReleased

    private void txt_filtroClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroClientesKeyReleased
        TableConfig.filtrar(tb_clientes, txt_filtroClientes);
    }//GEN-LAST:event_txt_filtroClientesKeyReleased

    private void txt_filtroClientesSelecionadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroClientesSelecionadosKeyReleased
        TableConfig.filtrar(tb_clientesSelecionados, txt_filtroClientesSelecionados);
    }//GEN-LAST:event_txt_filtroClientesSelecionadosKeyReleased

    private void btn_adicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarClienteActionPerformed
        if (tb_clientes.getSelectedRowCount() == 1) {
            transfereDados(tb_clientes, tb_clientesSelecionados, clientes, clientesSelecionados);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha de cada vez para Adicionar!");
        }
    }//GEN-LAST:event_btn_adicionarClienteActionPerformed

    private void btn_adicionarTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarTodosClientesActionPerformed
        while (tb_clientes.getRowCount() > 0) {
            transfereDados(tb_clientes, tb_clientesSelecionados, clientes, clientesSelecionados);
        }
    }//GEN-LAST:event_btn_adicionarTodosClientesActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        if (tb_clientes.getSelectedRowCount() == 1) {
            transfereDados(tb_clientesSelecionados,tb_clientes,clientesSelecionados,clientes);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha de cada vez para Remover!");
        }
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_removerTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerTodosClientesActionPerformed
        while (tb_clientesSelecionados.getRowCount() > 0) {
            transfereDados(tb_clientesSelecionados, tb_clientes, clientesSelecionados, clientes);
        }
    }//GEN-LAST:event_btn_removerTodosClientesActionPerformed

    private void btn_gerarRelatorioProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarRelatorioProdutos1ActionPerformed
        gerar();
    }//GEN-LAST:event_btn_gerarRelatorioProdutos1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionarCliente;
    private javax.swing.JButton btn_adicionarProduto;
    private javax.swing.JButton btn_adicionarTodosClientes;
    private javax.swing.JButton btn_adicionarTodosProdutos;
    private javax.swing.JButton btn_gerarRelatorioProdutos;
    private javax.swing.JButton btn_gerarRelatorioProdutos1;
    private javax.swing.JButton btn_remover;
    private javax.swing.JButton btn_removerProduto;
    private javax.swing.JButton btn_removerTodosClientes;
    private javax.swing.JButton btn_removerTodosProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tb_clientes;
    private javax.swing.JTable tb_clientesSelecionados;
    private javax.swing.JTable tb_produtos;
    private javax.swing.JTable tb_produtosSelecionados;
    private javax.swing.JTextField txt_filtroClientes;
    private javax.swing.JTextField txt_filtroClientesSelecionados;
    private javax.swing.JTextField txt_filtroProdutos;
    private javax.swing.JTextField txt_filtroProdutosSelecionados;
    // End of variables declaration//GEN-END:variables

    private void transfereDados(JTable tb_origem, JTable tb_destino, List<Cliente> origem, List<Cliente> destino) {
        try {
            destino.add(origem.get(tb_origem.getSelectedRow()));
            origem.remove(tb_origem.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao transferir cliente!\n" + e);
        } finally {
            carregaClientes(origem, tb_origem);
            carregaClientes(destino, tb_destino);
        }
    }

    private void carregaClientes(List<Cliente> lista, JTable tabela) {
        try {
            TableConfig.limpaTabela(tabela);
            for (Cliente cliente : lista) {
                String[] linha = new String[]{cliente.getCodigo(), cliente.getNome(), cliente.getTelefone(), cliente.getCidade()};
                TableConfig.getModel(tabela).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados da Lista de Clientes!\n" + e);
        }
    }

    private void listaClientes() {
        try {
            con = new Conexao();
            st = con.getConexao();
            rs = st.executeQuery("");
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getString("numero"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCep(rs.getString("cep"));
                cliente.setCodigo(rs.getString("codigo"));
                cliente.setTelefone(rs.getString("codigo"));
                clientes.add(cliente);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar os Clientes!\n" + e);
        }
    }

    private void carregaProdutos() {
        try {
            con = new Conexao();
            st = con.getConexao();
            rs = st.executeQuery("select * from produto");
            while (rs.next()) {
                produto = new Produto();
                produto.setCodprod(rs.getString("codprod"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setReferencia(rs.getString("referencia"));
                produto.setPreco(Double.parseDouble(rs.getString("preco")));
                produtos.add(produto);
                String[] linha = new String[]{
                    rs.getString("codprod"),
                    rs.getString("descricao"),
                    rs.getString("referencia"),
                    rs.getString("preco")
                };
                TableConfig.getModel(tb_produtos).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar os Produtos!\n" + e);
        }
    }

    private void gerar() {
        geraRelatorios=new GeraRelatorios();
        geraRelatorios.imprimirByListaByClientes("relatorio", null, clientesSelecionados);
    }
}

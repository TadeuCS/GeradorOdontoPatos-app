package Util;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TableConfig extends DefaultTableModel {

    public static DefaultTableModel getModel(JTable tabela) {
        return (DefaultTableModel) tabela.getModel();
    }

    public static void limpaTabela(JTable tabela) {
        try {
            DefaultTableModel model = getModel(tabela);
            while (0 < model.getRowCount()) {
                model.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void filtrar(JTable table, JTextField filtro) {
        TableRowSorter sorter = new TableRowSorter(table.getModel());
        table.setRowSorter(sorter);
        String texto = filtro.getText();
        try {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Valor Não Encontrado!!!", "AVISO - Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

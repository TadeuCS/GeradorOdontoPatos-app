package Util;

import java.text.DecimalFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

public class Mascaras {
    
    public static void setMascaraMoeda(JFormattedTextField field){
        DecimalFormat dFormat = new DecimalFormat("###,###,##0.00");
        NumberFormatter formatter = new NumberFormatter(dFormat);
        formatter.setFormat(dFormat);
        formatter.setAllowsInvalid(false);
        field.setFormatterFactory(new DefaultFormatterFactory(formatter));
    }
    public static void setMascaraCPF(JFormattedTextField field,String texto) {
        try {
            if (texto.length() <=11) {
                field.setValue(null);
                MaskFormatter cpf = new MaskFormatter("###.###.###-##");
                field.setFormatterFactory(
                        new DefaultFormatterFactory(cpf));
            } else {
                field.setValue(null);
                MaskFormatter cnpj = new MaskFormatter("##.###.###/####-##");
                field.setFormatterFactory(
                        new DefaultFormatterFactory(cnpj));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao trocar a máscara do campo CPF");
        }
    }
}

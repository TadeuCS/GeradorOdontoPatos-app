package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class PropertiesManager {

    //altere de acordo com o nome do arquivo properties criado
    static String file = "config.properties";
    FileOutputStream fos;
    FileInputStream fis;
    Properties properties = new Properties();
    String tipo;

    public PropertiesManager() {
        carregaProperties();
    }

    private String getCaminho(String tipo) {
        File file = new File(this.file);
        //altere de acordo com o diretorio do seu arquivo properties
        if (tipo.equals("IDE") == true) {
            return file.getAbsolutePath().replace(File.separatorChar, '/').replaceAll(this.file, "").replaceAll("/store", "").concat("src\\Util\\" + this.file); //caminho pra ide    
        } else {
            return file.getAbsolutePath().replace(File.separatorChar, '/').replaceAll(this.file, "") + this.file; //caminho pro compilador
        }
    }

    private void carregaProperties() {
        try {
            //Criamos um objeto FileOutputStream
            //Setamos o arquivo que será lido
            fis = new FileInputStream(getCaminho("IDE"));
            properties.load(fis);
            tipo = "IDE";
        } catch (Exception ex) {
            try {
                fis = new FileInputStream(getCaminho("COMPILADOR"));
                properties.load(fis);
                tipo = "COMPILADOR";
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao localizar o arquivo.\n" + ex.getMessage());
            }
        }
    }

    public void altera(String campo, String valor) {
        try {
            fos = new FileOutputStream(getCaminho(tipo));
            //altera do campo
            properties.setProperty(campo, valor);
            //grava os dados no arquivo
            properties.store(fos, campo);
            fos.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Escrever no arquivo." + e.getMessage());
        }
    }

    public String ler(String campo) {
        //Captura o valor da propriedade, através do nome da propriedade(Key)
        return properties.getProperty(campo);
    }
}

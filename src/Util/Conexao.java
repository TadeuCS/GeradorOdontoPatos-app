package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {

    PropertiesManager prop;
    Connection con;
    Statement st;

    public Conexao() {
        prop = new PropertiesManager();
    }


    public Statement getConexao() {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            con = DriverManager.getConnection(
                    "jdbc:firebirdsql://" + prop.ler("ip") + ":3050/" + prop.ler("diretorio"),
                    "SYSDBA",
                    "masterkey");
            st = con.createStatement();
            return st;
        } catch (Exception e) {
            return null;
        }
    }

}

package lista;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JeanPedro
 */
public class ConexaoBD {
    
    private Connection con;

    public Connection getCon() {
        return con;
    }
   
    
    private ConexaoBD() {
        try {
            //1- registrar a classe principal do driver do PostgreSQL
            Class.forName("org.postgresql.Driver");
            //2 - Definir a URL JDBC para conecar ao BD 
            String url = "jdbc:postgresql://localhost/adressbuch";
            //3 - Cria uma conexão com o BD 
            con = DriverManager.getConnection(url,"postgres","masterkey");        
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static ConexaoBD getInstance() {
        return ConexaoJDBCHolder.INSTANCE;
    }
    
    private static class ConexaoJDBCHolder {
        private static final ConexaoBD INSTANCE = new ConexaoBD();
    }
}

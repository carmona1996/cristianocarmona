package assistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SystemConnector {
    
    public static Connection getConexao() throws SQLException{
        
        final String url ="jdbc:mysql://localhost/assistencia?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "12345678";
        try{
            System.out.println("Aguarde....\n"
                    + "Conectando ao Database..."); // MENSAGEM PRA TER CERTEZA
            
            // chama o método auxiliar para criar o banco de dados
            criarBancoDeDados();
            
            return DriverManager.getConnection(url,usuario,senha); 
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    // método auxiliar para criar o banco de dados
    private static void criarBancoDeDados() throws SQLException {
        Connection conexao = null;
        Statement stmt = null;
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true&user=root&password=12345678");
            stmt = conexao.createStatement();
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS assistencia");
        } finally {
            if (stmt != null) stmt.close();
            if (conexao != null) conexao.close();
        }
    }
}

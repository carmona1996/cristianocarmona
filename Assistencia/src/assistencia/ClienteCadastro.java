package assistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ClienteCadastro {
    public void ClienteCadastramento()throws SQLException{
        Connection conexao = SystemConnector.getConexao();
        
        String sqlCheck = "SELECT COUNT(*) as count FROM information_schema.tables "
                + "WHERE table_schema = 'assistencia' "
                + "AND table_name = 'clientes'";
        Statement stmtCheck = conexao.createStatement();
        ResultSet rsCheck = stmtCheck.executeQuery(sqlCheck);
        rsCheck.next();
        int count = rsCheck.getInt("count");
        
        if (count ==0 ){

            //CRIAR A TABELA CASO NÃO EXISTA ( PRIMEIRA VEZ QUE ABRIR O SISTEMA )
            String sql ="CREATE TABLE IF NOT EXISTS clientes("
                    + "codigo INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(50) NOT NULL,"
                    + "prefixo VARCHAR(3) NOT NULL,"
                    + "telefone VARCHAR(9) NOT NULL,"
                    + "endereco VARCHAR(50) NOT NULL"
                    + ")";
            Statement stmt = conexao.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Table Criada");
    
        }
        
        rsCheck.close();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Favor Inserir o nome do Cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Inserir o Prefixo do Telefone: ");
        int prefixo = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha pendente
        System.out.println("Insira o Telefone: ");
        int telefone = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha pendente
        System.out.println("Insira o endereço: ");
        String endereco = scanner.nextLine();
        
        String sql = "INSERT INTO clientes(nome,prefixo,telefone,endereco) VALUES (?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,nome);
        stmt.setInt(2, prefixo);
        stmt.setInt(3, telefone);
        stmt.setString(4, endereco);
        stmt.execute();
        stmt.close();
        
    }
}

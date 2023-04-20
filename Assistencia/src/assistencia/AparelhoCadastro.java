package assistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AparelhoCadastro {
    public void AparelhoCadastramento()throws SQLException{
        Connection conexao = SystemConnector.getConexao();
        
        String sqlCheck = ("SELECT COUNT(*) as count FROM information_schema.tables "
                + "WHERE table_schema = 'assistencia'"
                + "AND table_name = 'aparelhos' ");
        
        Statement stmtCheck = conexao.createStatement();
        ResultSet rsCheck = stmtCheck.executeQuery(sqlCheck);
        rsCheck.next();
        int count = rsCheck.getInt("count");
        
        if (count == 0){
            String sql ="CREATE TABLE IF NOT EXISTS aparelhos ("
                    + "codigo INT AUTO_INCREMENT PRIMARY KEY,"
                    + "modelo VARCHAR(50) NOT NULL,"
                    + "marca VARCHAR(10) NOT NULL,"
                    + "tipo VARCHAR(10) NOT NULL,"
                    + "defeito VARCHAR(255) NOT NULL"
                    + ")";
            Statement stmt = conexao.createStatement();  
            stmt.executeUpdate(sql);
        }
        
        rsCheck.close();
        
    Scanner scanner = new Scanner(System.in);
    System.out.print("Insira o modelo: ");
    String modelo = scanner.nextLine();
    System.out.print("Insira a marca: ");
    String marca = scanner.nextLine();
    System.out.print("Insira o tipo: ");
    String tipo = scanner.nextLine();
    System.out.print("Insira o defeito: ");
    String defeito = scanner.nextLine();

        
        String sql = "INSERT INTO aparelhos(modelo,marca,tipo,defeito) VALUES (?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,modelo);
        stmt.setString(2, marca);
        stmt.setString(3,tipo);
        stmt.setString(4, defeito);
        stmt.execute();
        stmt.close();
    }
}

package assistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ClienteAlterar {
    public void ClienteAlteracao()throws SQLException {
        Scanner scanner = new Scanner(System.in);
         
        String selectid = "SELECT * FROM clientes WHERE codigo = ?";
        String selectname ="SELECT * FROM clientes WHERE nome LIKE ?";
        Connection conexao = SystemConnector.getConexao();
        
        System.out.print("[1] ID\n"
                + "[2] NOME\n"
                + "Escolha uma Alternativa: ");
        int opcaoAlterar = scanner.nextInt();
        if (opcaoAlterar == 1){
            PreparedStatement stmt = conexao.prepareStatement(selectid);
            System.out.println("Digite o ID: ");
            int idAlterar = scanner.nextInt();
            stmt.setInt(1, idAlterar);
            ResultSet r = stmt.executeQuery();
            
            if(r.next()){
               // ClienteCadastro c = new Id(r.getInt(1), r.getString(0));
            }
            
            
        }else if(opcaoAlterar == 2){
         //   PreparedStatement stmt = conexao.prepareStatement(selectname);       
        }
    
    }
}

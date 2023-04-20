/*package assistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/*import java.util.Scanner;

public class EmissaoOrdem {
    public void EmissaoOrdem() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Captando Ultimo Cliente e Aparelho");
        
        Connection conexao = SystemConnector.getConexao();
        
        String sqlUser = "SELECT codigo,nome FROM clientes ORDER BY codigo DESC LIMIT 1;";
        
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sqlUser);
        
        List<ClienteCadastramento> clientes = new ArrayList<>();
        if(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            clientes.add(new ClienteCadastramento(codigo,nome));
        }

        
        
        
        
    }
}
*/
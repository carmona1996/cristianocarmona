package assistencia;

import java.sql.SQLException;
import java.util.Scanner;

public class SubMenuCadastro {
        public void  menuCadastro() throws SQLException{ 
        Scanner scanner = new Scanner(System.in);
        ClearScreen clearScreen = new ClearScreen();
        clearScreen.wipeScreen();
        
        int cadOpcao;
        do{
        
            System.out.println("+++++++++++++++++ MARRETA TECHNOLOGY +++++++++++++++++\n"
                        + "++++++++++++++++ CADASTRAMENTO ++++++++++++++++\n"
                            + "[1] CLIENTES \n"
                            + "[2] APARELHOS \n"
                            + "[3] RETORNAR\n");
            System.out.print("Digite uma opção valida: ");
            cadOpcao = scanner.nextInt();
            switch (cadOpcao){
                case 1:
                    ClienteCadastro clienteCadastro = new ClienteCadastro();
                    clienteCadastro.ClienteCadastramento();
                    break;
                case 2:
                    AparelhoCadastro aparelhoCadastro = new AparelhoCadastro();
                    aparelhoCadastro.AparelhoCadastramento();
                    break;
}
        } while (cadOpcao != 3);

    }
}

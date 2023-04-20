package assistencia;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuAssistencia {
    public static void main(String[] args) throws SQLException{
    
        Scanner scanner = new Scanner(System.in);
        int opcao;
        ClearScreen clearScreen = new ClearScreen();

        
        do {
            clearScreen.wipeScreen();
            System.out.println("++++++++++++++++ BEM VINDO AO SISTEMA ++++++++++++++++\n"
                    + "+++++++++++++++++ MARRETA TECHNOLOGY +++++++++++++++++\n"
                    + "[1] CADASTROS \n"
                    + "[2] CONSULTAS \n"
                    + "[3] EMISSÃO DE OS\n"
                    + "[4] ALTERAR\n"
                    + "[5] EXCLUSÃO\n"
                    + "[6] FECHAR SISTEMA\n");
            System.out.print("Favor digite uma opção valida: ");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1://cadastro
                    SubMenuCadastro subMenuCadastro = new SubMenuCadastro();
                    subMenuCadastro.menuCadastro();
                case 2://consuta
                    
                case 3://emissao de os
                   // EmissaoOrdem emissaoOrdem = new EmissaoOrdem();
                    //emissaoOrdem.EmissaoOrdem();
                case 4://alterar    
                case 5://exclusao    
            }
            
        } while (opcao != 6);
        System.out.println("Fechando....");    
        scanner.close();


    }
}

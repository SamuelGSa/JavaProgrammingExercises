package personal.geradorDeSenhas;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;


public class GeradorDeSenhas {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int escolha;
        do {
        System.out.println("*** GERADOR DE SENHAS ***");
        System.out.println("Digite: \n" +
                "* 1 = SENHA NUMERICA 5 DIGITOS \n" +
                "* 2 = SENHA MODERADA \n" +
                "* 3 = HELP");

        System.out.print(">>> ");
        escolha = scanner.nextInt();

        var senha = criaSenha(escolha);
        System.out.println("Sugestão de Senha: " + senha);


        }while (escolha != 0);
        System.out.println("Obrigado e volte Sempre! <3");



    }

    public static String criaSenha(Integer escolha){
        String senha = "";

        if (escolha.equals(1)){
            Random gerador = new Random();
            senha = String.valueOf(gerador.nextInt(100000));
        }

        if (escolha.equals(2)){
            var senhaUUID = UUID.randomUUID().toString();
            senha = senhaUUID.replace("-","");
        }

        return senha;
    }
}

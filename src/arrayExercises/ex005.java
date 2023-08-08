package arrayExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex005 {

//    5. Escreva um programa Java para testar se uma matriz contém um valor específico .

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.asList(4,5,13,17,22,55,99,354);

        Integer num1;
        do {
            System.out.println("Verifique se o número desejado está na lista. \n" +
                    "Digite seu número ou pressione 0 para sair: ");

             num1 = scanner.nextInt();

            if (listOfNumbers.contains(num1)) {
                System.out.println("O Número: " + num1 + " está presente no Array");
            }

            if (!num1.equals(0)) {
                System.out.println("O número " + num1 + " não está na lista.");

            }

        }while (num1 != 0);
        System.out.println("Obrigado por usar o nosso aplicativo");

    }

}

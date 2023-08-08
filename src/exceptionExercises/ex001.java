package exceptionExercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ex001 {

//    1. Escreva um programa Java que lance uma exceção e a capture usando um bloco try-catch.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.asList(4, 5, 13, 17, 22, 55, 99, 354);

        Integer num1;
        try {

            do {
                System.out.println("Verifique se o número desejado está na lista. \n" +
                        "Digite seu número ou pressione 0 para sair: ");

                num1 = scanner.nextInt();

                if (listOfNumbers.contains(num1)) {
                    System.out.println("O Número: " + num1 + " está presente no Array");
                }

                else if (!num1.equals(0)) {
                    System.out.println("O número " + num1 + " não está na lista.");

                }

            } while (num1 != 0);
            System.out.println("Obrigado por usar o nosso aplicativo");
        }catch (InputMismatchException e){
            System.out.println("São permitidos apenas números!");
            throw new EntradaNaoSuportadaException("Entrada não permitida!");

        }
    }

}

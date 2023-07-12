package basicExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex152 {

//    152. Escreva um programa Java que aceite quatro inteiros do usuário e
//    imprima igual se todos os quatro forem iguais, e não igual caso contrário.
//
//    Saída de amostra :
//    Insira o primeiro número: 25
//    Insira o segundo número: 37
//    Insira o terceiro número: 45
//    Insira o quarto número: 23
//    Os números não são iguais!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.print("Digite o quarto número: ");
        int num4 = scanner.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

    }


}

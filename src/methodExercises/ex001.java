package methodExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex001 {

//    1. Escreva um método Java para encontrar o menor número entre três números.
//    Dados de teste:
//    Insira o primeiro número: 25
//    Insira o segundo número: 37
//    Insira o terceiro número: 29
//    Saída esperada:
//
//    O menor valor é 25,0

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        Integer num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        Integer num2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        Integer num3 = scanner.nextInt();

        System.out.println("O menor número entre eles é: " + menorNumero(num1,num2,num3));
    }
    public static Integer menorNumero(Integer num1, Integer num2, Integer num3){
        List<Integer> numeros = Arrays.asList(num1,num2,num3);

        return numeros.stream().sorted().findFirst().get();
    }
}

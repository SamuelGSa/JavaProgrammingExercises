package methodExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex002 {

//    2. Escreva um método Java para calcular a média de três números.
//    Dados de teste:
//    Insira o primeiro número: 25
//    Insira o segundo número: 45
//    Insira o terceiro número: 65
//    Saída esperada:
//
//    O valor médio é 45,0

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();

        System.out.print("Digite o primeiro numero: ");
        notas.add(scanner.nextInt());

        System.out.print("Digite o segundo numero: ");
        notas.add(scanner.nextInt());

        System.out.print("Digite o terceiro numero: ");
        notas.add(scanner.nextInt());

        System.out.println("Notas Digitadas: " + notas);
        System.out.println("A Média é: " + media(notas));
    }

    private static Integer media(List<Integer> notas) {
        Integer soma = 0;
        for ( var nota : notas){
            soma += nota;
        }
        return soma /notas.size();
    }



}

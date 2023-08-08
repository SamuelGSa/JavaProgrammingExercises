package arrayExercises;

import java.util.Arrays;
import java.util.List;

public class ex004 {

//    4. Escreva um programa Java para calcular o valor médio dos elementos do array.

    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(20, 30, 25, 35, -16, 60, -100);

        int soma = 0;

        for (int i : listOfNumbers){
            soma += i;
        }

        var media = soma / listOfNumbers.size();
        System.out.println("A média dos valores do Array é: " + media);

    }
}

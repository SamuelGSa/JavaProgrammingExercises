package arrayExercises;

import java.util.Arrays;
import java.util.List;

public class ex002 {

//    2. Escreva um programa Java para somar valores de uma matriz.

    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(1,2,3,5,6);

        int soma = 0;
        for (int i : listOfNumbers) {

            soma += i;
        }
        System.out.println("A soma dos valores é: " + soma);

    }

}

package dataTypesExercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class ex002 {

//    2. Escreva um programa Java que leia um número em polegadas e o converta em metros.
//            Nota: Uma polegada é 0,0254 metros.
//    Dados de teste
//    Insira um valor para polegadas: 1000
//    Saída esperada :
//            1000,0 polegadas é 25,4 metros

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero em polegadas: ");
        double polegada = scanner.nextInt();

        System.out.println(polegada + " polegagas é " + polegadasEmMetros(polegada) + "metros");
    }
    public static BigDecimal polegadasEmMetros(double polegada){
        return BigDecimal.valueOf( 0.0254*polegada);
    }


}

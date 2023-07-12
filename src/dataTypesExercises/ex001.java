package dataTypesExercises;

import java.util.Scanner;

public class ex001 {

//1. Escreva um programa Java para converter a temperatura de Fahrenheit para graus Celsius.
//    Dados de teste
//    Insira um grau em Fahrenheit: 212
//    Saída esperada :
//    212,0 graus Fahrenheit é igual a 100,0 em Celsius


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma temperatura em Fahrenheit: ");
        double entrada = scanner.nextInt();

        System.out.println(entrada + "°F Convertido para Celsius é : " + conversorDeTemperatura(entrada) + "°C");
    }
    public static double conversorDeTemperatura(double entrada){


        double conversor = (entrada -32) / 1.8;

        return conversor;
    }


}

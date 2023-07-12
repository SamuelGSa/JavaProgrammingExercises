package basicExercises;

public class ex151 {

//151. Escreva um programa Java para encontrar o valor de uma expressão especificada.
//    a) 101 + 0) / 3
//    b) 3,0e-6 * 10000000,1
//    c) verdadeiro && verdadeiro
//    d) falso && verdadeiro
//    e) (falso && falso) || (verdadeiro && verdadeiro)
//    f) (falso || falso) && (verdadeiro && verdadeiro)
//
//    Saída Esperada :
//    (101 + 0) / 3)-> 33
//    (3.0e-6 * 10000000.1)-> 30.0000003
//    (verdadeiro && verdadeiro)-> verdadeiro
//    (falso && verdadeiro)-> falso
//    ((falso && falso) || ( verdadeiro && verdadeiro))-> verdadeiro
//    (falso || falso) && (verdadeiro && verdadeiro)-> falso

    public static void main(String[] args) {

        var a = (101 + 0) / 3;
        System.out.println(a);

//        var b = 3,0e-6 * 10000000,1;

        var c = true && true;
        System.out.println(c);

        var d = false && true;
        System.out.println(d);

        var e = (false && false) || (true && true);
        System.out.println(e);

        var f = (false && false) && (true && true);
        System.out.println(f);

    }



}

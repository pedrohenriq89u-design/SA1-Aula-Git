import java.util.Scanner;

public class Exercicio2 {

    static void main () {
        Scanner sc = new Scanner (System.in);

        int numero = 1;
        while (numero != 0) {
        IO.println("Digite um numero: ");
        numero = sc.nextInt();

           if (numero % 2 == 0) {
               IO.println("O numero é par");
           }else {
               IO.println(" O numero é impar");
           }
        }

    }
}

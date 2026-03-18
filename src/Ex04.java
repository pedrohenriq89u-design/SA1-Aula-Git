import java.util.Scanner;

public class Ex04 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        double passos;

        IO.println("Quantos passos você deu?");
        passos = sc.nextDouble();
        if (passos >= 10000) {
            IO.println(" Sua meta foi atingida e você ultrapassou: ");
            IO.println(passos - 10000);
        } else if (passos < 10000) {
            IO.println("Sua meta não foi atingida");




        }
    }
}
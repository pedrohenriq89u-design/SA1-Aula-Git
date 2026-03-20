import java.util.Scanner;

public class Ex07 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int numero;
        IO.println("Me diga sua nota:");
        numero = sc.nextInt();

        if (numero >= 7) {
            IO.println("Você foi aprovado");
        } else {
            if (numero <= 6) {
                IO.println("Você foi reprovado");
            }
        }
    }
}

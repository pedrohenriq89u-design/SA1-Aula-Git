import java.util.Scanner;

public class Ex15 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Quantas calorias foram consumidas?");
        double total = sc.nextDouble();

        if (total <= 2000) {
            IO.println("Está dentro do limite ");

        } else if (total > 2000) {
            IO.println("Você está fora do limite e ultrapassou: ");
            IO.println(total - 2000);

        }
    }
}
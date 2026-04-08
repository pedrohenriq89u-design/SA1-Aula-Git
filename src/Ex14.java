import java.util.Scanner;

public class Ex14 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Qual o desempenho do dia?");
        double total = sc.nextDouble();

        if (total < 5000) {
            IO.println("Você não atingiu a meta e faltou: ");
            IO.println(total - 5000);
        } else if (total > 5000) {
            IO.println("Você alcançou a meta e ultrapassou: ");
            IO.println(total - 5000);
        } else if (total == 5000) {
            IO.println("Meta alcançada com sucesso");
        }
    }
}
import java.util.Scanner;

public class Ex12 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Qual o total de suas aulas?");
        int total = sc.nextInt();
        IO.println("Quantas aulas já assistiu?");
        int assistidas = sc.nextInt();
        double percentual = (total / assistidas) * 10;
        String resultado = String.format("%.1f", percentual);

        IO.println("Você tem " + resultado + " % de aulas assistidas.");
    }
}

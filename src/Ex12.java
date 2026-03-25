import java.util.Scanner;

public class Ex12 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Qual o total de suas aulas?");
        int total = sc.nextInt();
        IO.println("Quantas aulas já assistiu?");
        int assistidas = sc.nextInt();
        double percentual = (total / assistidas) * 100;
        String resultado = String.format("%.1f", percentual);

        IO.println("Você tem " + resultado + " % de aulas assistidas.");

        if (percentual <= 50) {
            IO.println(" Você ainda está no começo do curso");
        } else if (percentual >= 51 & percentual <= 99) {
            IO.println("Você está indo bem");
        } else if (percentual == 100) {
            IO.println("Parabéns curso concluído");

        }
    }
}
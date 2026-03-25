import java.util.Scanner;

public class Ex13 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Qual o total de dados disponiveis?");
        double limite = sc.nextDouble();
        IO.println("Quanto você já utilizou?");
        double usado = sc.nextDouble();

        double percentual = (usado * 100.0) / limite;

        if (percentual < 80) {
            IO.println("Uso dentro do limite");
        } else if (percentual < 100 & percentual >=81) {
            IO.println("Alerta: você está próximo do limite");
        } else if (percentual >= 100) {
            IO.println("Limite ultrapassado");
        }
    }
}
import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Ex05 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        double guardado;
        IO.println("Quanto você conseguiu guardar?");
        guardado = sc.nextDouble();
        if (guardado >= 500) {
            IO.println(" Sua meta foi atingida ");
        } else if (guardado < 500) {
            IO.println("Sua meta não foi atingida e faltou:");
            IO.println(guardado - 500);

        }
    }
}
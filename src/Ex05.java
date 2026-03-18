import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Ex05 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        double guardado;
        IO.println("Quanto você conseguiu guardar?");
        guardado = sc.nextDouble();
        if (guardado >= 500) {
            IO.println(" Sua meta foi atingida e você guardou mais: ");
            IO.println(guardado - 500);
        } else if (guardado < 500) {
            IO.println("Sua meta não foi atingida");

        }
    }
}
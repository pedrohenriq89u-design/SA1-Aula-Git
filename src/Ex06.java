import java.util.Scanner;

public class Ex06 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        double horas;
        IO.println("Quantas horas você estudou?");
        horas = sc.nextDouble();
        if (horas >= 40) {
            IO.println(" Sua meta foi atingida ");
        } else if (horas < 40) {
            IO.println("Sua meta não foi atingida e faltou:");
            IO.println(horas - 40);

        }
    }
}
import java.util.Scanner;

public class Ex09 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Double numero;
        IO.println("Digite o valor da sua compra?");
        numero = sc.nextDouble();

        if (numero >= 100.00) {
            IO.println("Vossa senhoria tem direito ao frete grátis ");
        } else {
            IO.println("Vossa senhoria não tem frete grátis adicione mais produtos ");
            IO.println("Faltam: " );
            IO.println(numero - 100.00);


        }
    }
}
import java.util.Scanner;

public class Ex09 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        IO.println("Digite o valor de vossa compra");
        double valor = sc.nextDouble();
        if (valor >= 100.00) {
            IO.println("Vossa senhoria tem frete grátis");
        } else {
            IO.println("Vossa senhoria não tem direito a frte grátis");
            IO.println("Faltam: ");
            IO.println(valor - 100.00);


        }
    }
}
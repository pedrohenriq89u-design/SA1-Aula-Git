import java.util.Scanner;

public class Ex10 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        IO.println("Me diga quantas páginas já leu?");
        int paginas = sc.nextInt();

        double percentual = (paginas / 300.0) * 100;

        String valorFormatado = String.format("%.2f", percentual);
        IO.println("Você leu " + valorFormatado + "% do seu livro!");

    }
}

import java.util.Scanner;

public class Ex11 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double totalArquivo = 2.0;

        IO.println("Quanto do arquivo de 2GB já foi baixado (em GB)?");
        double baixar = sc.nextDouble();

        double percentual = (baixar / totalArquivo) * 100;

        String resultado = String.format("%.1f", percentual);

        IO.println("Download " + resultado + "% concluído.");
    }
}

import java.util.Scanner;

public class Ex08 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int idade;
        IO.println("Qual sua idade?");
        idade = sc.nextInt();

        if (idade >= 18) {
            IO.println("Vocẽ pode entrar");
        } else {
            if (idade < 18) {
                IO.println("Vocẽ não pode entrar");
            }

        }
    }
}

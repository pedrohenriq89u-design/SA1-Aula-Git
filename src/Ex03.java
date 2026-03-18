import java.util.Scanner;

public class Ex03 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double pontuacao;
        String nome;
        String jogo;

        IO.println("Qual seu nickname?");
        nome = sc.nextLine();
        IO.println("Qual seu jogo favorito?");
        jogo = sc.nextLine();
        IO.println("Qual sua pontuação atual?");
        pontuacao = sc.nextDouble();
        IO.println("Informações do seu perfil:");
        IO.println("Nickname: " + nome);
        IO.println("Jogo Favorito: " + jogo);
        IO.println("Pontuação atual: " + pontuacao);

    }
}
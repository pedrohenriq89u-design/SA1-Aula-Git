import java.util.Scanner;

public class Ex02 {

    static void main(){

        Scanner sc = new Scanner(System.in);
        double preco;
        String nome;
        String pedido;

        IO.println("Qual seu nome?");
        nome = sc.nextLine();
        IO.println("Qual o prato desejado?");
        pedido = sc.nextLine();
        IO.println("Qual o valor do prato?");
        preco = sc.nextDouble();
        IO.println("As informações do seu pedido são:");
        IO.println("Nome do cliente: " + nome);
        IO.println("O pedido é: " + pedido);
        IO.println("O valor é: " + preco);

    }


}

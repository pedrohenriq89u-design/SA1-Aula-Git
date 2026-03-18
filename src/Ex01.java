import java.util.Scanner;

public class Ex01 {


    static  void main() {

     Scanner sc = new Scanner(System.in);
     int idade;
     String nome;
     String curso;

        IO.println("Digite seu nome:");
     nome = sc.nextLine();
        IO.println("Qual seu curso?");
        curso = sc.nextLine();
        IO.println("Qual sua idade?");
        idade = sc.nextInt();
        IO.println("Suas informações são:");
        IO.println("Seu nome é: " + " " +  nome + " " +  "Sua idade é: " + " " +  idade +
                " "  + "Seu curso é:" + " " + curso);
    }
}
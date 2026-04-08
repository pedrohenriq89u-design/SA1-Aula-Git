import java.util.Scanner;

public class Exercicio4 {

    static void main(){

        Scanner sc = new Scanner(System.in);

        IO.println("Digite um numero: ");
        int numerousuario = sc.nextInt();
        int resultado = 0;
        int contador = 1;

        while (contador <= numerousuario){
            IO.println(resultado);
            IO.println(contador);
            resultado = resultado + contador;
            contador++;

        }
        IO.println(resultado);
    }
}

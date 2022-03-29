import java.util.Scanner;

//Faça um programa que leia três valores inteiros e mostre sua soma.

public class Exercicio2 {

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 números para eu fazer a soma deles:");

        System.out.print("\nPrimeiro Número: ");
        int numero1 = entrada.nextInt();

        System.out.print("\nSegundo Número: ");
        int numero2 = entrada.nextInt();

        System.out.print("\nTerceiro Número: ");
        int numero3 = entrada.nextInt();

        int soma = numero1 + numero2 + numero3;

        System.out.println("---------------------------------------");
        System.out.println("A soma dos números informados é: " +soma);
    }
}

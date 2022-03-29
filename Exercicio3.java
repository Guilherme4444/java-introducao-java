import java.util.Scanner;

//Faça um programa que calcula o ano de nascimento de uma pessoa a partir de sua idade e do ano atual.

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();

        int AnoAtual;
        AnoAtual = 2022;
        int nascimento;
        nascimento = AnoAtual - idade;
        System.out.println("Seu Ano de Nascimento é: " + nascimento);


    }

}

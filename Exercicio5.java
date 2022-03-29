import java.util.Scanner;

//Faça um programa que leia a cotação do dólar. Em seguida, imprima o valor correspondente em reais.

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float valor;
        System.out.print("Digite um valor em dólares: ");
        valor = entrada.nextFloat();

        float dolar = 4.98f;

        float conversao = dolar * valor;
        System.out.println(valor + "dolares são " + conversao + " reais");
    }
    
}

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite uma temperatura em Graus Celsius para converte-la em Fahrenheit: ");
        Double Celsius = entrada.nextDouble();

        Double conversao = Celsius * 9/5 + 32;

        System.out.println("Temperatura convertida é igual a: " + conversao + "°F");
    }
    
}

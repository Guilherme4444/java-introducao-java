import java.util.Scanner;

//leia uma velocidade em km/h (quilômetros por hora) e apresente convertida em m/s (metros por segundo). A fórmula de conversão é M = K/36, sendo K a velocidade em km/h e M em m/s.

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um valor para velocidade: ");
        float valorVelocidade = entrada.nextInt();
        float conversao;
        conversao = valorVelocidade / 36;

        System.out.println("Esta velocidade covertida em metros por segundo é igual a: " + conversao + " M/S");
    }
    
}

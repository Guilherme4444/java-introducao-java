import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        float premio = 780.000f;
        float ganhador1 = (46 * premio)/100;
        float ganhador2 = (32 * premio)/100;
        float ganhador3 = (22 * premio)/100;

        System.out.println("O ganhador 1 ganhará: " + ganhador1 + "00 mil reais");
        System.out.println("O ganhador 2 ganhará: " + ganhador2 + "00 mil reais");
        System.out.println("O ganhador 3 ganhará: " + ganhador3 + "00 mil reais");
    }
    
}

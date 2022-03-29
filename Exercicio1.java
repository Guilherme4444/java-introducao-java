import java.util.Scanner;

//Faça um programa que leia um número inteiro e retorne seu antecessor e seu sucessor.

public class Exercicio1 {

    public static void main(String[] args){

    int Numero;
    Numero = 10;
    int Antecessor;
    Antecessor = Numero - 1;
    int Sucessor;
    Sucessor = Numero + 1;

    System.out.println("Número Escolhido: "+Numero+"\n");
    System.out.println("Número Sucessor: "+Sucessor+"\n");
    System.out.println("Número Antecessor: "+Antecessor+"\n");
    }
}

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        int numeros = 0;
        int numerosPares = 0;
        int numerosImpares = 0;

        do {
            System.out.println("Entre com um numero ou 0 para sair: ");
            numeros = lerDados.nextInt();

            if (numeros % 2 == 0 && numeros != 0) numerosPares++;
            if (numeros % 2 != 0 && numeros != 0) numerosImpares++;

        } while (numeros != 0);

        System.out.println("Quantidade de numero pares inserisdos: " + numerosPares);
        System.out.println("Quantidade de numero imapres inserisdos: " + numerosImpares);
    }
}

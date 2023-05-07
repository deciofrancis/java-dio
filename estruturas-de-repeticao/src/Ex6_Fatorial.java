import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        int fatorial;
        int numeroFatorial;

        System.out.println("Entre com o numero para calcular o fatorial: ");
        fatorial = lerDados.nextInt();
        numeroFatorial = fatorial--;
        for (int i = fatorial; i >= 1; i--) {
            numeroFatorial = numeroFatorial * i;           
        }
        System.out.println(numeroFatorial); 
    }
}
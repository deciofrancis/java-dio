import java.util.Scanner;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorMedia {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int mediaNumero = 0;
    
        for(int i = 0; i < 5; i++){
            System.out.println("Entre com um numero2: ");
            numero = lerDados.nextInt();

            if (numero > maiorNumero) maiorNumero = numero;
            
            mediaNumero = numero + mediaNumero;
        }
    
        mediaNumero = mediaNumero / 5;
    
        System.out.println("Maior numero: " +  maiorNumero);
        System.out.println("Media numero: " + mediaNumero);  
    }    
}

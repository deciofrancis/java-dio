/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] numeosArray = {0, 1, 2, 3, 4, 5};
        
        for (int i = numeosArray.length - 1; i < numeosArray.length; i--) {
            System.out.println(numeosArray[i]);
        }
    }
}

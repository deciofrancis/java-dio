import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeEIdade {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        
        String nomeAluno;
        int idadeAluno;

        while (true) {
            System.out.println("Nome do aluno: ");
            nomeAluno = lerDados.next();
            if (nomeAluno.equals("0")) break;

            System.out.println("Idade do aluno: ");
            idadeAluno = lerDados.nextInt();
        }
    }
}

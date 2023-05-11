public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio calculadora:");
        Calculadora.soma(3, 4);

        System.out.println("\nMensagem de saudacao:");
        MensagemSaudacoes.obterSaudacao(9);
        MensagemSaudacoes.obterSaudacao(23);

        System.out.println("\nEmprestimo:");
        Emprestimo.calcular(10, 2);
        Emprestimo.calcular(100, 5);
        Emprestimo.calcular(100, 3);
    }
}

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

        System.out.println("\nArea dos Quadrilateros Notaveis:");
        QuadrilaterosNotaveis.area(4);
        QuadrilaterosNotaveis.area(5, 4);
        QuadrilaterosNotaveis.area(4, 2, 4);

        System.out.println("\nArea dos Quadrilateros Notaveis retornos:");
        
        double areaQuadrado = QuadrilaterosNotaveisReturn.area(5);
        System.out.println("A area do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilaterosNotaveisReturn.area(4, 3);
        System.out.println("A area do quadrado: " + areaRetangulo);

        double areaTrapezio = QuadrilaterosNotaveisReturn.area(6, 4, 5);
        System.out.println("A area do trapezio: " + areaTrapezio);

    }
}

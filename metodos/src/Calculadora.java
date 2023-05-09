public class Calculadora {
    public static void soma(double numero1, double numero2){
        double somaNumeros = numero1 + numero2;
        System.out.print("A soma dos numeros: " + numero1 + " + " + numero2 + " = " + somaNumeros);
    }

    public static void subtracao(double numero1, double numero2){
        double subtracaoNumeros = numero1 - numero2;
        System.out.print("A subtracao dos numeros: " + numero1 + " - " + numero2 + " = " + subtracaoNumeros);
    }

    public static void multiplicacao(double numero1, double numero2){
        double multiplicacaoNumeros = numero1 * numero2;
        System.out.print("A multiplicacao dos numeros: " + numero1 + " x " + numero2 + " = " + multiplicacaoNumeros);
    }

    public static void divisao(double numero1, double numero2){
        double divisaoNumeros = numero1 / numero2;
        System.out.print("A multiplicacao dos numeros: " + numero1 + " / " + numero2 + " = " + divisaoNumeros);
    }
}

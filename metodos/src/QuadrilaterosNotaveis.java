public class QuadrilaterosNotaveis {
    public static void area(double lado){
        System.out.println("A area do quadrado: " + lado * lado);
    }

    public static void area(double base, double altura){
        System.out.println("A area do quadrado: " + base * altura);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("A area do trapezio: " + ((baseMaior + baseMenor) * altura) / 2);
    }
}

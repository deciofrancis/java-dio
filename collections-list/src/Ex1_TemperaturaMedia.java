import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Ex1_TemperaturaMedia {
    public static void main(String[] args) throws Exception {

        Scanner lerTemperaturas = new Scanner(System.in);
        
        List<Double> temperaturas = new ArrayList<Double>();

        int counter = 0;

        while (true) {
            if (counter == 6 ) break;

            System.out.println("Digite temperatura media:");
            double temp = lerTemperaturas.nextDouble();
            temperaturas.add(temp);
            counter ++;

        }

        lerTemperaturas.close();

        System.out.println("Array com as temperaturas inseridas:");
        System.out.println(temperaturas.toString());

        Iterator<Double> iterator = temperaturas.iterator();
        double somaTemperaturas = 0d;

        while (iterator.hasNext()) {
            double next = iterator.next();
            somaTemperaturas += next;
        }

        double mediaTemperaturas = somaTemperaturas/temperaturas.size();
        System.out.println("Media das temperaturas:");
        System.out.println(mediaTemperaturas);

        Iterator<Double> iterator2 = temperaturas.iterator();

        counter = 0;

        while (iterator2.hasNext()) {
            double temp = iterator2.next();
            if(temp > mediaTemperaturas) {
                switch (counter) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n ", temp);
                        break;
                    case (2):
                        System.out.printf("3 - marco: %.1f\n ", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n ", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n ", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n ", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            counter ++;
        }
    }
}
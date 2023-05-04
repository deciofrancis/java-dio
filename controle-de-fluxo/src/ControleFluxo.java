import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner lerNumeroMes = new Scanner(System.in);

        int numeroMes;

        System.out.println("Digite um numero para saber o mes correspondende:\n");

        numeroMes = lerNumeroMes.nextInt();

        if(numeroMes == 1){
            System.out.println("Janeiro");
        } else if (numeroMes == 2){
            System.out.println("Fevereiro");
        }else if (numeroMes == 3){
            System.out.println("Marco");
        }else if (numeroMes == 4){
            System.out.println("Abril");
        }else if (numeroMes == 5){
            System.out.println("Maio");
        }else if (numeroMes == 6){
            System.out.println("Junho");
        }else if (numeroMes == 7){
            System.out.println("Julho");
        }else if (numeroMes == 8){
            System.out.println("Agosto");
        }else if (numeroMes == 9){
            System.out.println("Setembro");
        }else if (numeroMes == 10){
            System.out.println("Outubro");
        }else if (numeroMes == 11){
            System.out.println("Novembro");
        }else if (numeroMes == 12){
            System.out.println("Dezembro");
        }else{
            System.out.println("Numero nao corresponde a nenhum mes");
        }

        if(numeroMes == 6){
            System.out.println("Ferias");
        } else if(numeroMes == 12){
            System.out.println("Ferias");
        } else if(numeroMes == 1){
            System.out.println("Ferias");
        }


        Scanner lerNomeMes = new Scanner(System.in);

        System.out.println("Digite o nome do mes para saber seu numero:\n");
        
        String nomeMes = lerNomeMes.next();

        switch (nomeMes) {
            case "Janeiro":
                System.out.println("1");
                break;
            case "Fevereiro":
                System.out.println("2");
                break;
            case "Marco":
                System.out.println("3");
                break;
            case "Abril":
                System.out.println("4");
                break;
            case "Maio":
                System.out.println("5");
                break;
            case "Junho":
                System.out.println("6");
                break;
            case "Julho":
                System.out.println("7");
                break;
            case "Agosto":
                System.out.println("8");
                break;
            case "Setembro":
                System.out.println("9");
                break;
            case "Outubro":
                System.out.println("10");
                break;
            case "Novembro":
                System.out.println("11");
                break;
            case "Dezembro":
                System.out.println("12");
                break;
            default:
                System.out.println("Palavra nao corresponde a nenhum mes");
                break;
        }
    }
}

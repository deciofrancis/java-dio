import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Ex2_Crime {
    public static void main(String[] args) {
        Scanner lerRespostas = new Scanner(System.in);

        List<String> respostas = new ArrayList<String>();

        System.out.println("Responda sim ou nao para as perguntas!");
        System.out.println("Telefonou para a vitima?");
        String respostasPerguntas = lerRespostas.next();
        respostas.add(respostasPerguntas);

        System.out.println("Esteve no local do crime?");
        respostasPerguntas = lerRespostas.next();
        respostas.add(respostasPerguntas);

        System.out.println("Mora perto da vitima?");
        respostasPerguntas = lerRespostas.next();
        respostas.add(respostasPerguntas);

        System.out.println("Devia para a vitima?");
        respostasPerguntas = lerRespostas.next();
        respostas.add(respostasPerguntas);

        System.out.println("Ja trabalhou com a vitima?");
        respostasPerguntas = lerRespostas.next();
        respostas.add(respostasPerguntas);

        lerRespostas.close();

        System.out.println("Respostas:");
        System.out.println(respostas.toString());

        
        Iterator<String> iterator = respostas.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            String next = iterator.next();

            if(next.contains("s")){
                counter ++;
            }
            
        }

        switch(counter) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
    
}

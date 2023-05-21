import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 Crie um dicionário e relacione os estados e suas populações;
 Substitua a população do estado do RN por 3.534.165;
 Confira se o estado PB está no dicionário, caso não adicione: PB -
4.039.277;
Exiba a população PE;
 */

public class Ex5_Populacao {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populaçãoEstadosNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populaçãoEstadosNE);

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populaçãoEstadosNE.put("RN", 3534165);
        System.out.println(populaçãoEstadosNE);

        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        populaçãoEstadosNE.put("PB", 4039277);
        System.out.println(populaçãoEstadosNE);

        System.out.println("Exiba a população do estado PE: " + populaçãoEstadosNE.get("PE"));
    }
}

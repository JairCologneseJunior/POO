package POO.at4;
import java.util.Scanner;
public class CodigoIdades {
    public void pessoaMaisVelha(){
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        int[] idades = new int[3];
        int idadeMaisNova = 0;
        String nomeDaPessoaMaisNova = "";
        int idadeMaisVelha = 0;
        String nomeDaPessoaMaisVelha = "";

       for (int i =0; i<3;i++){
           System.out.println("digite os nomes");
       nomes[i] = sc.next();
           System.out.println("digite as idades");
        idades[i] = sc.nextInt();
        }
       for (int i = 0; i < 3; i++){
           if (idades[i]< idadeMaisVelha){
               idadeMaisNova = idades[i];
             nomeDaPessoaMaisNova = nomes[i];
           }if (idades[i]>idadeMaisNova){
               idadeMaisVelha = idades[i];
               nomeDaPessoaMaisVelha = nomes[i];
           }
       }
        System.out.println("Pessoa Mais nova Nome: " + nomeDaPessoaMaisNova);
        System.out.println("Pessoa Mais nova Idade: " + idadeMaisNova);
        System.out.println("Pessoa Mais velha Nome : " + nomeDaPessoaMaisVelha);
        System.out.println("Pessoa Mais velha Idade: " + idadeMaisVelha);
    }
}

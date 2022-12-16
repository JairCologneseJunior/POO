package POO.at4;

import java.util.Scanner;

public class comparacaoDeIdades {
    public static void main(String[] args) {
        CodigoIdades id = new CodigoIdades();
        Scanner ler = new Scanner(System.in);
      do {

        id.pessoaMaisVelha();
          System.out.println("Deseja continuar vendo as idades? \n S/N");

      }while (ler.nextLine().equalsIgnoreCase("s"));
    }
}

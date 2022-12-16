package POO.at2;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner rj = new Scanner(System.in);
        Codiguin codiguin = new Codiguin();
        do {
            codiguin.Entrada();
            codiguin.cauculadora();
            System.out.printf("Deseja continuar usando a calc S ou N");
        } while (rj.nextLine().equalsIgnoreCase("S"));



    }
}

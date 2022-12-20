package POO.cartao;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
Codiguin cod = new Codiguin();


//usuario dige saldo
        //setSaldo
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nuemro da sua conta exemplo (XXXXXXXXX) :");
        cod.setNumconta(ler.nextDouble());
        System.out.println("Digite seu saldo");
        cod.setSaldo(ler.nextDouble());
        System.out.println("Digite seu debito");
        cod.setDebito(ler.nextDouble());
        System.out.println("Digite a quantidade de credito que você tem");
        cod.setCredito(ler.nextDouble());
        System.out.println( "Seu saldo atual é:" +cod.ifes());
    }
}


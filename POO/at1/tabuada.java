package POO.at1;

import java.util.Scanner;

public class tabuada {    //NOME DA CLASSE
                  Scanner ler = new Scanner(System.in);
    int numero;   // DEFINOÇÂO DOS ATRIBUTOS

    int op;

    int resultado;

    public void caucularTabuada(){//DEFINIÇAO DO METODOS
        for (op = 1; op < 10; op++){
            resultado = numero*op;
            System.out.println(numero+ "x"+ op +"=" +resultado );
        }

    }
    public void entradaDados(){
        System.out.printf("Digite um numero");
        numero = ler.nextInt();
    }
}


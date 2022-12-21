package POO.Geometria.ju;

import java.util.Scanner;

public class Acervo extends Livro {
    public int quantidade;
    public String editora;
    Scanner ler = new Scanner(System.in);
    public void entradaDados(){
        System.out.println("Digite a quantidade de livros ");
        quantidade= ler.nextInt();
        System.out.println("digite a editora");
        editora = ler.nextLine();
    }
    //Sorescrita
    //Sobrescrita e a sobreposiçao de metos e assinaturas e nomes iguais mas de classes
    // diferentes sendo herdados da classe mae
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Quantidade:" + quantidade);
        System.out.println("Editora:" + editora);
    }

}

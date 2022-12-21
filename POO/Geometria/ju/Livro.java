//Clesse ABSTRATA classe java que nao pode ser instanciada ous seja nao e possivel criar um objeto
// dela. A ideia e que sejam gerados apenas objetos
package POO.Geometria.ju;
import java.util.Scanner;

public class Livro {
    public String nome;
    public String autor;

    Scanner ler =new Scanner(System.in);
    public void entradaDados(){
        System.out.println("informe o nome do livro");
        nome = ler.nextLine();
        System.out.println("informe o nome do autor");
        autor = ler.nextLine();
    }
    public void imprimeDados(){
        System.out.println("Livros " + nome);
        System.out.println("Autor " + autor);
    }

}

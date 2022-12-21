//Construir uma aplicação de cauculo de notas de um
// aluno sabendo que ele pode se aluno da univille ou da ufsc
// que pussui formas de avaliação diferentes
//herança: possibilidade de reutilizar os atributos emos metodos em
// outra classes.é possivel  fazer uma herança unica,
// nao existe herança multiplano java mas uma classe pode gerar
// outras
package POO.aluno;

import java.util.Scanner;

public class aluno {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        AlunoUFS aluno1 = new AlunoUFS();
        System.out.println("digite seu nome");
        aluno1.setNomeAluno(ler.nextLine());
        System.out.println("digite a 1 notas aluno ufsc:");
        aluno1.setProva1(ler.nextDouble());
        System.out.println("digite a 2 notas aluno ufsc:");
        aluno1.setProva2(ler.nextDouble());

        System.out.println(aluno1.toString());
        aluno1.calcMedia();

        AlunoUniville aluno2 = new AlunoUniville();


        System.out.println("digite a 1 notas aluno Univille:");
        aluno2.setNota1(ler.nextDouble());
        System.out.println("digite a 2 notas aluno Univille:");
        aluno2.setNota2(ler.nextDouble());
        System.out.println("digite a 3 notas aluno Univille:");
        aluno2.setNota3(ler.nextDouble());
        System.out.println(aluno2.toString());
        aluno2.calccMedia();
    }
}

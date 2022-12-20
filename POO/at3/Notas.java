package POO.at3;

import java.util.Scanner;

public class Notas {
    //    EXERCÍCIO 03: Criar uma aplicação que simule um boletim escolar. O programa deve solicitar o nome,
    //    três notas e calcular a média aritmética. O programa deve mostrar se o aluno está APROVADO (média>=7),
    //    EM RECUPERAÇÃO
    //    (média entre 6.9 e 6.0) ou REPROVADO (média<6). Crie pelo menos dois métodos, um com retorno e outro sem
    //    retorno. Língua Portuguesa, Matemática, Biologia, Física, Química, Artes, Educação Física,Língua Inglesa, Filosofia, Geografia, História e Sociologia
    public static void main(String[] args){
       CodigoNotas cod = new CodigoNotas();
       Scanner ler = new Scanner(System.in);

        System.out.println("Digite a materia a qual queira saber a media ");
         cod.setMateria(ler.nextLine());
        System.out.println("Digite a nota do seu primeiro trimestre");
        cod.setNum1(ler.nextDouble());
        System.out.println("Digite a nota do seu segndo trimestre");
        cod.setNum2(ler.nextDouble());
        System.out.println("Digite a nota do seu terceiro trimestre");
        cod.setNum3(ler.nextDouble());
           cod.calculadorDeMedia();






    }
}



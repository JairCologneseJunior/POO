package POO.at3;

import java.util.Scanner;

public class CodigoNotas {

    public void calculadorDeMedia(){
        Scanner ler =new Scanner(System.in);
        System.out.println("Digite a materia a qual queira saber a media ");
        String materia = ler.nextLine();
        System.out.println("Digite a nota do seu primeiro trimestre");
        double num1 = ler.nextFloat();
        System.out.println("Digite a nota do seu segndo trimestre");
        double num2 = ler.nextFloat();
        System.out.println("Digite a nota do seu terceiro trimestre");
        double num3 = ler.nextFloat();
        double result = 0;
        if ("Matematica".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Portugues".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Biologia".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Fisica".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Quimica".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Artes".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Educação Fisica".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Ingles".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Filosofia".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Geografia".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Historia".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;
        }
        else if ("Sociologia".equalsIgnoreCase( materia)){
            result = (num1 + num2 + num3)/3;


        }


        if (result > 7 ){
            System.out.println("voce passou na materia "+materia+" e sua media foi "+ result);
        } else if (result < 7) {
            System.out.println("voce nao passou na materia"+materia+"e sua media foi "+ result);
        }

    }

    }





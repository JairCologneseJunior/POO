package POO.at3;

import java.util.Scanner;

public class CodigoNotas {

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    Scanner ler = new Scanner(System.in);

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

      private String materia ;

      private double num1  ;

      private double num2 ;

      private double num3 ;
      private double result = 0;
      public void calculadorDeMedia() {




      if ("Matematica".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Portugues".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Biologia".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Fisica".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Quimica".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Artes".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Educação Fisica".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Ingles".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Filosofia".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Geografia".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Historia".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;
      } else if ("Sociologia".equalsIgnoreCase(materia)) {
          result = (num1 + num2 + num3) / 3;


      }


      if (result > 7) {
          System.out.println("voce passou na materia " + materia + " e sua media foi " + result);
      } else if (result < 7) {
          System.out.println("voce nao passou na materia" + materia + "e sua media foi " + result);
      }

  } }







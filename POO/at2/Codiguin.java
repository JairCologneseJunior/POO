package POO.at2;

import java.util.Scanner;

public class Codiguin {
Scanner ler= new Scanner(System.in);
double num1;
double num2;

int num3;
double num4;
double resultado = 0;
public void Entrada(){
    System.out.printf("Digite o 1 numero:");
num1 = ler.nextDouble();
    System.out.printf("Digite o 2 numero:");
    num2 = ler.nextDouble();
    System.out.printf("1 somar: \n2 subtair: \n3 dividir: \n4 multiplicar:");
    num3 = ler.nextInt();
}
public void cauculadora(){
 switch (num3) {
        case 1:
            resultado = num1 + num2;
            break;
        case 2:
            resultado = num1 - num2;
            break;
        case 3:
            resultado = num1 / num2;
            break;
        case 4:
            resultado= num1 * num2;
            break;
    }
        System.out.println("Resultado é igual"+"\t"+ resultado);
}




}


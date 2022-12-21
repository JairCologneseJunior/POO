
//SOBRECARGA (OVERLOAD)
//É a possibilidade de reutulixar metodos com o mesmo nome
//mas cm "Assinaturas" diferentes dentro na mesma classe
//E uma das formas de se ultilizar o Polimorfismo(muitas formas)

package POO.Geometria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Geometria g = new Geometria();
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva o valor do raio: ");
        double r = ler.nextDouble();
        System.out.println("Area calculada:" + g.calcular(r));
        System.out.println("informe os dois lados do triangolo");
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        System.out.println("Area do trinagolo" + g.calcular(a,b));
}
}

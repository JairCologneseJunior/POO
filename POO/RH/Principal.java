package POO.RH;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//Empregado
        Pessoa pes = new Pessoa();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome");
        pes.setNome(ler.nextLine());
        System.out.println("Digite seu telefone");
        pes.setTelefone(ler.nextDouble());
        System.out.println("Digite sua data de admissão ");
        pes.setDatAdimissao(ler.nextDouble());

        Empregado emp = new Empregado();
        System.out.println("Emprgado digite o seu salario");
        emp.setSalario(ler.nextDouble());
        System.out.println(pes.toString());
        System.out.println(emp.toString());
// Desenvolvedor
        Scanner ler2 = new Scanner(System.in);
        System.out.println("Dev digite seu nome");
        pes.setNome(ler2.nextLine());
        System.out.println("Digite seu telefone");
        pes.setTelefone(ler2.nextDouble());
        System.out.println("Digite sua data de admissão ");
        pes.setDatAdimissao(ler2.nextDouble());


        Desenvonvedor dev = new Desenvonvedor();
        System.out.println("dev digite a quandidade de horas que você Trablha semanalmente ");
        dev.setHoras(ler2.nextDouble());
        System.out.println(pes.toString());
        System.out.println(dev.toString());
        dev.calculoSalarioDev();
//Gerente
        Scanner ler3= new Scanner(System.in);

        System.out.println("Digite seu nome");
        pes.setNome(ler3.nextLine());
        System.out.println("Digite seu telefone");
        pes.setTelefone(ler3.nextDouble());
        System.out.println("Digite sua data de admissão ");
        pes.setDatAdimissao(ler3.nextDouble());

        Gerente ger = new Gerente();
        System.out.println("Digite seu salario");
        ger.setSalario(ler3.nextDouble());
        System.out.println("Digite a quantidade de horas que voce trabalha");
        ger.setHoras(ler3.nextDouble());
        System.out.println("Digite a quantia de dias que vc trabalha");
        ger.setDias(ler3.nextDouble());
        System.out.println(pes.toString());
        System.out.println(ger.toString());
        ger.salDev();
    }
}

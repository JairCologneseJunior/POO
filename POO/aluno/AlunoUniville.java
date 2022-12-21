package POO.aluno;

public class AlunoUniville extends Codigo {
    private double nota1;
    private double nota3;
    private double nota2;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "AlunoUniville{" +
                "nota1=" + nota1 +
                ", nota3=" + nota3 +
                ", nota2=" + nota2 +
                '}';
    }
    public double calccMedia(){
        double media = (nota1+(nota2*2)+(nota3*3))/6;
        if (media>=6){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

    return 0;
    }
}

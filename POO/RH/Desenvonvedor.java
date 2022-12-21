package POO.RH;

public class Desenvonvedor {

private double resultSal = 0;
    private double horas;

    public double getResultSal() {
        return resultSal;
    }

    public void setResultSal(double resultSal) {
        this.resultSal = resultSal;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
public void calculoSalarioDev(){
double resultSal = this.horas * 255;
    System.out.println("Seu salario é:" + resultSal);


}

    @Override
    public String toString() {
        return "Desenvonvedor{" +
                "horas=" + horas +
                '}';
    }
}

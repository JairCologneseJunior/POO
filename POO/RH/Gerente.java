package POO.RH;

public class Gerente {
    private double salario;
    private double horas;
    private double dias;
    private double result = 0;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                ", horas=" + horas +
                ", dias=" + dias +
                '}';
    }

    public void salDev(){
        result = this.salario* this.horas* this.dias;
        System.out.println("o salario é " + result);
    }
}

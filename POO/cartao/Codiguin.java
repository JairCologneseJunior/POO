package POO.cartao;

import java.util.Scanner;

public class Codiguin {

    private double numconta;
    private double saldo;

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    private double saldoAtual;
    private double debito;
    private double credito;

    public double getNumconta() {
        return numconta;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public void setNumconta(double numconta) {
        this.numconta = numconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }


    public double ifes(){
    saldoAtual =  saldo-(debito+credito);
    return saldoAtual;
    }






}

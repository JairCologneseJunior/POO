package POO.RH;

public class Pessoa {
    private String nome;
    private double telefone;
    private double datAdimissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public double getDatAdimissao() {
        return datAdimissao;
    }

    public void setDatAdimissao(double datAdimissao) {
        this.datAdimissao = datAdimissao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", datAdimissao=" + datAdimissao +
                '}';
    }
}

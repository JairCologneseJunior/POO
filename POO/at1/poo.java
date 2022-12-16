package POO.at1;
//ORIENTAÇÂO A OBJETOS
//Surgiu da necessidade de se construir programas mais complexos
//com menos linhas de codigo,  ultilizando conseitos

//pessoa: Nome, endereço, telefone, bairro, cidade,
//Aluno: Turma, serie, turno,
//FUNCIONARIOS: matricula , dataEntrada, horario

//CLASSES: e um modelo base onde e definido as caracteristicas e propriedades.
//CARACTERISTICA=FUNÇÂO e PROPRIEDADES + VARIAVEIS
//VARIAVES = ATRIBUTOS ; FUNÇÂO = METODOS
public class poo {
    public static void main(String[] args) {
//        Scanner ler = new Scanner(System.in);
        //CRIAÇÂO DE OBJETOS DE CLASSE
        //CRIAÇAO DE OBJETO TAB< DA CLASSE TABUADA
        //TODA VEZ QUE VOCE QUISER"USAR" UMA CLASSE, VOCE è OBIGADO A CRIAR um ojt
        tabuada tab = new tabuada();
//
        tab.entradaDados();
        tab.caucularTabuada();
    }
}

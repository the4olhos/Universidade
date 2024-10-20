package Classes;

import Classes_Abstratas.Pessoa;

// Classe Aluno que extende de Pessoa
public class Aluno extends Pessoa {
    //Atributos
    private String matricula;
    private Professor orientador;

    //Construtor
    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    //Metodo para exibir dados do Aluno
    @Override
    public void exibirDados() {
        System.out.println("Aluno: " + nome +
                "\nCPF: " + cpf +
                "\nMatrícula': " + matricula);
    }
    //Metodo para setar um orientador
    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }
    //Metodos Acessores
    public String getMatricula() {
        return matricula;
    }


}
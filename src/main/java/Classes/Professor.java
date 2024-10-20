package Classes;

import Classes_Abstratas.Pessoa;

import java.util.ArrayList;
import java.util.List;

//Classe Professor
public class Professor extends Pessoa {
    //Atributo
    private String departamento;
    private List<Aluno> alunosOrientados;

    //Construtor
    public Professor(String nome, String cpf, String departamento) {
        super(nome, cpf);
        this.departamento = departamento;
        this.alunosOrientados = new ArrayList<>();
    }

    //Metodo para exibir os dados do professor
    @Override
    public void exibirDados() {
        System.out.println("________________________________________" +
                "\nProfessor: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nDepartamento: " + this.getDepartamento() +
                "\n________________________________________");

            System.out.println("Alunos Orientados:");
            for (Aluno aluno : alunosOrientados) {
                System.out.println(aluno.getNome());
        }
    }

    //Metodo para adicionar alunos orientados por esse professor
    public void adicionarAluno(Aluno aluno) {
        alunosOrientados.add(aluno);
        aluno.setOrientador(this);
    }

    //Metodos Acessores
    public String getDepartamento() {
        return departamento;
    }
}


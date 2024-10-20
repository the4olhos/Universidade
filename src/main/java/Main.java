import Classes.Aluno;
import Classes.Departamento;
import Classes.Professor;
import Classes.Universidade;

// Exemplo de uso do sistema de gerenciamento da universidade
public class Main {
    public static void main(String[] args) {
        // Criando uma lista de professores de Engenharia
        Professor prof1 = new Professor("Paulo", "01727045232", "Engenharia");
        Professor prof2 = new Professor("Gustavo", "7483194055", "Engenharia");
        Professor[] profsEngenharia = {prof1, prof2};

        // Criando uma lista de professores de Matematica
        Professor prof3 = new Professor("Marcelo", "07927855232", "Matemática");
        Professor prof4 = new Professor("Tiago", "84930675644", "Matemática");
        Professor[] profsMatematica = {prof3, prof4};

        // Criando departamento de Engenharia e adicionando a lista de professores de engenharia
        Departamento engenharia = new Departamento("Engenharia", profsEngenharia);

        // Criando departamento de Matematica e adicionando a lista de professores de matematica
        Departamento matematica = new Departamento("Matemática", profsMatematica);
        //Criando uma lista de de departamentos
        Departamento[] departamentos = {engenharia, matematica};
        // Criando uma universidade e adicionando a lista de departamentos
        Universidade unifil = new Universidade("Universidade Federal", departamentos);

        Aluno aluno1 = new Aluno("Pedro", "48392040378", "241072142");
        Aluno aluno2 = new Aluno("Arthur", "824584930550", "543067180");

        // Associando alunos a seus orientadores
        prof1.adicionarAluno(aluno1);
        prof3.adicionarAluno(aluno2);
        // Gerando relatório da unifil
        unifil.gerarRelatorio();
    }
}

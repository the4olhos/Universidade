package Classes;

//Classe Departamento
public class Departamento {
    //Atributos
    private String nome;
    private Professor[] professores;

    //Construtor
    public Departamento(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    //Metodo para exibir o nome e os professores desse departamento
    public void exibirDados() {
        System.out.println("Departamento: " + nome);
        for (Professor prof : professores) {
            prof.exibirDados();
        }
    }
}

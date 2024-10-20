package Classes;

// Classe Universidade
public class Universidade {
    //Atributos
    private String nome;
    private Departamento[] departamentos;

    //Construtor
    public Universidade(String nome, Departamento[] departamentos) {
        this.nome = nome;
        this.departamentos = departamentos;
    }

    //Metodo para exibir o nome e os departamentos dessa universidade
    public void gerarRelatorio() {
        System.out.println( "________________________________________" +
                "\nRelatório da Universidade: " + nome);
        for (Departamento departamento : this.departamentos) {
            departamento.exibirDados();
        }
    }
}

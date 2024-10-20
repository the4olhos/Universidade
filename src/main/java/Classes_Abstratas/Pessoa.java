package Classes_Abstratas;

//Classe abstrata Pessoa
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected String cpf;

    //Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Metodos Acessores
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    //Metodo Abstrato
    public abstract void exibirDados();
}


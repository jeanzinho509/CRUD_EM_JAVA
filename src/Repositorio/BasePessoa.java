package Repositorio;

public abstract class BasePessoa implements MPessoa {
    private String nome;

    public BasePessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
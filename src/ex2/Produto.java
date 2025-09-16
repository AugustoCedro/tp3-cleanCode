package ex2;

public final class Produto {
    private final Double preco;
    private final String nome;

    public Produto(Double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
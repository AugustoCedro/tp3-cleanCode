package ex1;

public final class Produto {

    private final int id;
    private final String nome;
    private final double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Produto alterarPreco(double preco) {
        return new Produto(this.id, this.nome, preco);
    }
    public Produto alterarNome(String nome) {
        return new Produto(this.id, nome, this.preco);
    }
}

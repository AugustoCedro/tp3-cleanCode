public final class Produto {

    private final int id;
    private final String nome;
    private final double preco;
    private final int quantidade;


    public Produto(int id, String nome, double preco, int quantidade) {
        if(preco <= 0 || quantidade < 0){
            throw new IllegalArgumentException("Erro ao criar produto");
        }
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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
        return new Produto(this.id, this.nome, preco,this.quantidade);
    }
    public Produto alterarNome(String nome) {
        return new Produto(this.id, nome, this.preco,this.quantidade);
    }
}

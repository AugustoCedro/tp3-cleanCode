package ex2;

public class Ajuste {
    public Produto aplicarDesconto(Produto produto) {
        double novoPreco = produto.getPreco() - 10;
        return new Produto(novoPreco, produto.getNome());
    }
}
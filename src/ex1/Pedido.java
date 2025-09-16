package ex1;

import java.util.ArrayList;
import java.util.List;

public final class Pedido {

    private final int id;
    private final List<Produto> produtos;
    private final Status status;

    public Pedido(int id, List<Produto> produtos, Status status) {
        this.id = id;
        this.produtos = produtos;
        this.status = status;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Pedido adicionarProduto(Produto produto) {
        List<Produto> produtos = this.produtos;
        produtos.add(produto);
        return new Pedido(this.id, produtos, this.status);
    }

    public Pedido atualizarStatus(Status status) {
        return new Pedido(this.id, this.produtos, status);
    }


}

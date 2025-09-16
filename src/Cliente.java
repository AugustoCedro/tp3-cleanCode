import ex1.Pedido;

import java.util.List;

public final class Cliente {

    private final int id;
    private final String nome;
    private final List<Pedido> pedido;

    public Cliente(int id, String nome, List<Pedido> pedido) {
        this.id = id;
        this.nome = nome;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }

    public Cliente adicionarPedido(Pedido pedido) {
        List<Pedido> pedidos = this.pedido;
        pedidos.add(pedido);
        return new Cliente(this.id, this.nome, this.pedido);
    }


}

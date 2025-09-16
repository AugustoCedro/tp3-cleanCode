import ex1.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Registro {

    private String descricao;
    private int quantidade;
    private LocalDateTime criadoEm;
    private BigDecimal valorMonetario;
    private Status status;

    public Registro(String descricao, int quantidade, LocalDateTime criadoEm, BigDecimal valorMonetario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.criadoEm = criadoEm;
        this.valorMonetario = valorMonetario;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public BigDecimal getValorMonetario() {
        return valorMonetario;
    }
}

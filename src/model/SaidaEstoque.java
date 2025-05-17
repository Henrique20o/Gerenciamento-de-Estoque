package model;

import java.time.LocalDateTime;

public class SaidaEstoque {
    private long id;
    private long produto;
    private String motivo;
    private LocalDateTime data;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProduto() {
        return produto;
    }

    public void setProduto(long produto) {
        this.produto = produto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}

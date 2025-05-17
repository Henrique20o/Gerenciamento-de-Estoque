package model;

public class Produto {
    private long id;
    private String nome;
    private long categoria;
    private double preco;
    private long quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getIdcategoria() {
        return categoria;
    }

    public void setIdcategoria(long idcategoria) {
        this.categoria = idcategoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }
}

package padaria;

public class Produto {
    private long codigo;
    private double preco;
    private String descricao;
    private String dataValidade;
    private int quantidade;

    public Produto(long codigo, double preco, String descricao, String dataValidade, int quantidade) throws Exception {
        if(preco<0) throw new Exception("Preço negativo");
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
        this.dataValidade = dataValidade;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int disponivel) {
        this.quantidade = disponivel;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", preco=" + preco + ", descricao=" + descricao + ", dataValidade=" + dataValidade + ", disponivel=" + quantidade + '}';
    }

}

package VisitorMethod;

public class Brinquedo implements Produto {

    private float preco;
    private String nome;
    private String faixaEtaria;

    public Brinquedo(float preco, String nome, String faixaEtaria) {
        this.preco = preco;
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirBrinquedo(this);
    }

}

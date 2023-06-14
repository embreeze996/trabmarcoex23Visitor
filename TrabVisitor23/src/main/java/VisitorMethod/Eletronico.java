package VisitorMethod;

public class Eletronico implements Produto {

    private float preco;
    private String nome;
    private float precoSeguro;

    public Eletronico(float preco, String nome, float precoSeguro) {
        this.preco = preco;
        this.nome = nome;
        this.precoSeguro = precoSeguro;
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public float getPrecoSeguro() {
        return precoSeguro;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirEletronico(this);
    }

}
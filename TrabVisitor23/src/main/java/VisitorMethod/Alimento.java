package VisitorMethod;

public class Alimento implements Produto {

    private float preco;
    private String nome;
    private LojaConveniencia lojaConveniencia;

    public Alimento(float preco, String nome,LojaConveniencia lojaConveniencia) {
        this.preco = preco;
        this.nome = nome;
        this.lojaConveniencia = lojaConveniencia;
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getLojaConveniencia() {
        return this.lojaConveniencia.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAlimento(this);
    }

}
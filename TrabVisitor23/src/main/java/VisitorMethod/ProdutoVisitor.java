package VisitorMethod;
public class ProdutoVisitor implements Visitor {

    public String exibir(Produto produto) {
        return produto.aceitar(this);
    }

    @Override
    public String exibirAlimento(Alimento alimento) {
        return "Alimento{" +
                "preco=" + alimento.getPreco() +
                ", nome='" + alimento.getNome() + '\'' +
                ", LojaConveniencia=" + alimento.getLojaConveniencia() +
                '}';
    }

    @Override
    public String exibirBrinquedo(Brinquedo brinquedo) {
        return "Brinquedo{" +
                "preco=" + brinquedo.getPreco() +
                ", nome='" + brinquedo.getNome() + '\'' +
                ", faixaEtaria='" + brinquedo.getFaixaEtaria() + '\'' +
                '}';
    }

    @Override
    public String exibirEletronico(Eletronico eletronico) {
        return "Eletronico{" +
                "preco=" + eletronico.getPreco() +
                ", nome='" + eletronico.getNome() + '\'' +
                ", precoSeguro=" + eletronico.getPrecoSeguro() +
                '}';
    }
}
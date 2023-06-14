package VisitorMethodTest;

import VisitorMethod.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoVisitorTest {

    @Test
    void deveExibirAlimento() {
        Alimento alimento = new Alimento(20.0f, "Batata Chips", new LojaConveniencia("Mercado do seu Zé"));

        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Alimento{preco=20.0, nome='Batata Chips', LojaConveniencia=Mercado do seu Zé}", visitor.exibir(alimento));
    }

    @Test
    void deveExibirBrinquedo() {
        Brinquedo brinquedo = new Brinquedo(30.0f, "Baralho de Uno", "A partir de 07 anos de idade");

        ProdutoVisitor visitor = new  ProdutoVisitor();
        assertEquals("Brinquedo{preco=30.0, nome='Baralho de Uno', faixaEtaria='A partir de 07 anos de idade'}", visitor.exibir(brinquedo));
    }

    @Test
    void deveExibirEletronico() {
        Eletronico eletronico = new Eletronico(4500.0f, "Sansung Galaxy 22", 500.0f);

        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Eletronico{preco=4500.0, nome='Sansung Galaxy 22', precoSeguro=500.0}", visitor.exibir(eletronico));
    }

}
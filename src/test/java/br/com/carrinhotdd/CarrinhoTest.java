package br.com.carrinhotdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarrinhoTest {

    @Test
    void adicionarItemDeveAumentarOTotal() {

        Carrinho carrinho = new Carrinho();

        Produto produto = new Produto(
                "Camiseta",
                50.0,
                10
        );

        carrinho.adicionarItem(produto, 2);

        assertEquals(100.0, carrinho.calcularTotal());
    }
}

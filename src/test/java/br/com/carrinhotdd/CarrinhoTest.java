package br.com.carrinhotdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarrinhoTest {

    @Test
    void naoDeveAdicionarQuantidadeMaiorQueEstoque() {

        Carrinho carrinho = new Carrinho();

        Produto produto = new Produto(
                "Camiseta",
                50.0,
                5
        );

        assertThrows(
                EstoqueInsuficienteException.class,
                () -> carrinho.adicionarItem(produto, 6)
        );
    }
}

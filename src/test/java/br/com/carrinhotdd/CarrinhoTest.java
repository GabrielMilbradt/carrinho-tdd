package br.com.carrinhotdd;

import br.com.carrinhotdd.exceptions.EstoqueInsuficienteException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarrinhoTest {

    @Test
    void removerItemDeveReduzirOTotal()
            throws EstoqueInsuficienteException {

        Carrinho carrinho = new Carrinho();

        Produto produto = new Produto(
                "Camiseta",
                50.0,
                10
        );

        carrinho.adicionarItem(produto, 2);

        assertEquals(100.0, carrinho.calcularTotal());

        carrinho.removerItem(produto);

        assertEquals(0.0, carrinho.calcularTotal());
    }
}

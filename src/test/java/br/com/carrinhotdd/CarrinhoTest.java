package br.com.carrinhotdd;

import br.com.carrinhotdd.exceptions.CupomJaAplicadoException;
import br.com.carrinhotdd.exceptions.EstoqueInsuficienteException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarrinhoTest {

    @Test
    void aplicarCupomDeveReduzirTotal()
            throws EstoqueInsuficienteException,
            CupomJaAplicadoException {

        Carrinho carrinho = new Carrinho();

        Produto produto = new Produto(
                "Camiseta",
                100.0,
                10
        );

        carrinho.adicionarItem(produto, 1);

        Cupom cupom = new Cupom(
                "DESCONTO10",
                10
        );

        carrinho.aplicarCupom(cupom);

        assertEquals(90.0, carrinho.calcularTotal());
    }
}

package br.com.carrinhotdd;

import br.com.carrinhotdd.exceptions.CarrinhoVazioException;
import br.com.carrinhotdd.exceptions.CupomJaAplicadoException;
import br.com.carrinhotdd.exceptions.EstoqueInsuficienteException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarrinhoTest {

    @Test
    void naoDeveFinalizarCarrinhoVazio() {

        Carrinho carrinho = new Carrinho();

        assertThrows(
                CarrinhoVazioException.class,
                () -> carrinho.finalizarCompra()
        );
    }
}

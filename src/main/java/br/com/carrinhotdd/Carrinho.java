package br.com.carrinhotdd;

import br.com.carrinhotdd.exceptions.EstoqueInsuficienteException;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<ItemCarrinho> itens = new ArrayList<>();

    public void removerItem(Produto produto) {

        itens.removeIf(
                item -> item.getProduto() == produto
        );
    }

    public void adicionarItem(Produto produto, int quantidade)
            throws EstoqueInsuficienteException {

        if (quantidade > produto.getEstoque()) {
            throw new EstoqueInsuficienteException(
                    "Estoque insuficiente."
            );
        }

        itens.add(new ItemCarrinho(produto, quantidade));
    }

    public double calcularTotal() {

        double total = 0.0;

        for (ItemCarrinho item : itens) {
            total += item.getProduto().getPreco()
                    * item.getQuantidade();
        }

        return total;
    }
}
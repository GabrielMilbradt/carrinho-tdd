package br.com.carrinhotdd;

import br.com.carrinhotdd.exceptions.CupomJaAplicadoException;
import br.com.carrinhotdd.exceptions.EstoqueInsuficienteException;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> itens = new ArrayList<>();
    private Cupom cupom;

    public void aplicarCupom(Cupom cupom) throws CupomJaAplicadoException {
        this.cupom = cupom;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemCarrinho item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }

        if (cupom != null) {
            total = total - (total * cupom.getPercentualDesconto() / 100);
        }

        return total;
    }

    public void removerItem(Produto produto) {
        itens.removeIf(item -> item.getProduto() == produto);
    }

    public void adicionarItem(Produto produto, int quantidade) throws EstoqueInsuficienteException {
        if (quantidade > produto.getEstoque()) {
            throw new EstoqueInsuficienteException("Estoque insuficiente.");
        }
        itens.add(new ItemCarrinho(produto, quantidade));
    }
}
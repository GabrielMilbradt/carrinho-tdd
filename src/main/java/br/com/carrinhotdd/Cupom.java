package br.com.carrinhotdd;

public class Cupom {

    private String codigo;
    private double percentualDesconto;

    public Cupom(String codigo, double percentualDesconto) {
        this.codigo = codigo;
        this.percentualDesconto = percentualDesconto;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }
}
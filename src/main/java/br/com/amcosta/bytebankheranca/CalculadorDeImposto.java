package br.com.amcosta.bytebankheranca;

public class CalculadorDeImposto {
    private double soma;

    void calcular(Tributavel imposto) {
        this.soma += imposto.getValorImposto();
    }

    double getSoma() {
        return this.soma;
    }
}

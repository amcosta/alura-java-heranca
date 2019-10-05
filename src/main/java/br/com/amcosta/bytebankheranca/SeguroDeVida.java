package br.com.amcosta.bytebankheranca;

public class SeguroDeVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 30;
    }
}

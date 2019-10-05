package br.com.amcosta.bytebankheranca;

public class ContaCorrente extends Conta implements Tributavel {

    ContaCorrente(int agencia, int conta) {
        super(agencia, conta);
    }

    @Override
    void sacar(double valor) throws Exception {
        valor += valor * 0.2;
        super.sacar(valor);
    }

    @Override
    public double getValorImposto() {
        return 10;
    }
}

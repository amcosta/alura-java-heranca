package br.com.amcosta.bytebankheranca;

public class ContaCorrente extends Conta {

    ContaCorrente(int agencia, int conta) {
        super(agencia, conta);
    }

    @Override
    void sacar(double valor) throws Exception {
        valor += valor * 0.2;
        super.sacar(valor);
    }
}

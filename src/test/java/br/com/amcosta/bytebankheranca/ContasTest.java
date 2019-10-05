package br.com.amcosta.bytebankheranca;

import org.junit.Assert;
import org.junit.Test;

public class ContasTest {
    @Test
    public void testTestaTransferencia() {
        Conta cc = new ContaCorrente(123, 12345);
        Conta cp = new ContaPoupanca(123, 1234);

        cc.depositar(100);
        cp.depositar(100);
        try {
            cc.transferir(10, cp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Assert.assertEquals("", 90 - 10 * 0.2, cc.getSaldo(), 0.00001);
        Assert.assertEquals("", 110, cp.getSaldo(), 0.00001);
    }
}

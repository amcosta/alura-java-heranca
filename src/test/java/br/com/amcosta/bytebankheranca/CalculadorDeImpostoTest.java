package br.com.amcosta.bytebankheranca;

import org.junit.Assert;
import org.junit.Test;

public class CalculadorDeImpostoTest {
    @Test
    public void testCalcularImposto() {
        Tributavel cc = new ContaCorrente(123, 12345);
        Tributavel sv = new SeguroDeVida();

        CalculadorDeImposto calculador = new CalculadorDeImposto();
        calculador.calcular(cc);
        calculador.calcular(sv);

        Assert.assertEquals("", 40, calculador.getSoma(), 0.00001);
    }
}

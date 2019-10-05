package br.com.amcosta.bytebankheranca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ControleBonificacaoTest {
    private ControleBonificacao controlador;

    @Before
    public void setUp() {
        this.controlador = new ControleBonificacao();
    }

    @Test
    public void testDeveRetornarOTotalDeBonificacoes() {
        this.controlador.registra(new EditorVideo());
        this.controlador.registra(new Designer());
        Assert.assertEquals("", 350, this.controlador.getSoma(), 0.00001);
    }
}

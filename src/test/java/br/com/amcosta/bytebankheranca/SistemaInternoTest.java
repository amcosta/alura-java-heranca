package br.com.amcosta.bytebankheranca;

import org.junit.Assert;
import org.junit.Test;

public class SistemaInternoTest {
    @Test
    public void testDeveVerificarOAcessoAoSistemaInterno() {
        Gerente gerente = new Gerente();
        gerente.setSenha(222);

        Administrador administrador = new Administrador();
        administrador.setSenha(1234);

        Cliente cliente = new Cliente();
        cliente.setSenha(222);

        SistemaInterno si = new SistemaInterno();
        Assert.assertTrue(si.autenticar(gerente));
        Assert.assertFalse(si.autenticar(administrador));
        Assert.assertTrue(si.autenticar(cliente));
    }
}

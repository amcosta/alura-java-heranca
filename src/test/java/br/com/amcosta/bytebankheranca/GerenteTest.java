package br.com.amcosta.bytebankheranca;

import org.junit.Assert;
import org.junit.Test;

public class GerenteTest {

    private Gerente construirGerente(String nome, String cpf, double salario) {
        Gerente gerente = new Gerente();

        gerente.setCpf(cpf);
        gerente.setNome(nome);
        gerente.setSalario(salario);

        return gerente;
    }

    @Test
    public void testVerificarGerente() {
        Gerente gerente = this.construirGerente("Gerente 1", "12312312312", 2000);
        Assert.assertEquals("", "Gerente 1", gerente.getNome());
        Assert.assertEquals("", "12312312312", gerente.getCpf());
        Assert.assertEquals("", 2000, gerente.getSalario(), 0.00001);

        gerente.setSenha(123);
        Assert.assertTrue(gerente.autenticar(123));
    }

    @Test
    public void testVerificarBonificacao() {
        Gerente gerente = this.construirGerente("Gerente 1", "12312312312", 2000);
        Assert.assertEquals("", 2000, gerente.getBonificacao(), 0.00001);
    }
}

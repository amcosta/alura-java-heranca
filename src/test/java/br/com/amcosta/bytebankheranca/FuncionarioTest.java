package br.com.amcosta.bytebankheranca;

import org.junit.Assert;
import org.junit.Test;

public class FuncionarioTest {

    private Funcionario construirFuncionario(String nome, String cpf, double salario) {
        Funcionario funcionario = new Funcionario();

        funcionario.setCpf(cpf);
        funcionario.setNome(nome);
        funcionario.setSalario(salario);

        return funcionario;
    }

    @Test
    public void testVerificarBonificacao() {
        Funcionario funcionario = this.construirFuncionario("Funcionario 1", "12312312312", 1000);
        Assert.assertEquals("", 100, funcionario.getBonificacao(), 0.00001);
    }
}

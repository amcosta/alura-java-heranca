package br.com.amcosta.bytebankheranca;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }
}

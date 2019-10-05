package br.com.amcosta.bytebankheranca;

public class Cliente implements Autenticavel {

    private final Autenticador autenticador;

    Cliente() {
        this.autenticador = new Autenticador();
    }

    @Override
    public boolean autenticar(int senha) {
        return this.autenticador.autenticar(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}

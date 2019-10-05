package br.com.amcosta.bytebankheranca;

public class SistemaInterno {

    private int senha = 222;

    public boolean autenticar(Autenticavel usuario) {
        return usuario.autenticar(this.senha);
    }
}

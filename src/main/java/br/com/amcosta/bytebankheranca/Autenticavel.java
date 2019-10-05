package br.com.amcosta.bytebankheranca;

public interface Autenticavel {

    abstract boolean autenticar(int senha);

    abstract void setSenha(int senha);
}

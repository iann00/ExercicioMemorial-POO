package com.company.models;

public class Auth {
    public String usuario;
    public String senha;

    public Auth(String usuario, String senha) {
        this.usuario = usuario;
        this.senha   = senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
}

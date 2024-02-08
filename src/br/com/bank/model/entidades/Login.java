package br.com.bank.model.entidades;

public class Login {
    private String email;
    private String senha;
    private String numeroTelefone;

    public Login(String email, String senha, String numeroTelefone) {
        this.email = email;
        this.senha = senha;
        this.numeroTelefone = numeroTelefone;
    }

    public Login(Login login) {
        this.email = login.email;
        this.senha = login.senha;
        this.numeroTelefone = login.numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    @Override
    public String toString() {
        return "Login{" +
                "email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}

public abstract class Usuario {

    protected String nome;
    protected String login;
    protected String senha;

    public void fazerLogin(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
}

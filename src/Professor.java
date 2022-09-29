import java.util.Scanner;

public class Professor extends Usuario implements Funcionario {

    public Professor(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    public Professor(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void fazerLogin(String login, String senha) {
        super.fazerLogin(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        if (this.senha.equals("123"))
            return true;
        else
            return false;

    }
    Scanner entrada = new Scanner(System.in);
    public void publicarNota(Aluno aluno) {
        System.out.println("Digite a nota do aluno " + aluno.nome);
        float nota = entrada.nextFloat();
        aluno.setNota(nota);
    }
}

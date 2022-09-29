public class Aluno extends Usuario {

    private int matricula;
    private String curso;
    private float nota;

    public float getNota(){
        return this.nota;
    }

    public void setNota(float nota){
        this.nota = nota;
    }

    public Aluno(String nome, int matricula, String curso, String login, String senha) {
        super(nome, login, senha);
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String login, String senha) {
        super(login, senha);
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    @Override
    public void fazerLogin(String login, String senha) {
        super.fazerLogin(login, senha);
    }

}

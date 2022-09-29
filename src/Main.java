import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            Aluno alunos[] = new Aluno[500];
            Professor professores[] = new Professor[500];

            System.out.println("Digite 1 para Logar, 2 para fazer um cadatro ou 0 para sair");
            int x = entrada.nextInt();
            int i = 0;
            int j = 0;
            int a = 0;

            while (x != 0) {
                switch (x) {
                    case 1: {
                        System.out.println("digite 1 para logar como aluno, 2 para logar como professor ou 0 para sair");
                        int y = entrada.nextInt();
                        while (y != 0) {
                            boolean aux1 = false;
                            switch (y) {
                                case (1): {
                                    System.out.println("Digite as informacoes de login: ");
                                    System.out.println("Digite seu login: ");
                                    String login = entrada.next();
                                    System.out.println("Digite sua senha: ");
                                    String senha = entrada.next();
                                    boolean aux = false;
                                    Aluno aluno = new Aluno(login, senha);

                                    for (int k = 0; k < alunos.length; k++) {
                                        if (alunos[k] != null) {
                                            if (aluno.login.equals(alunos[k].login)
                                                    && aluno.senha.equals(alunos[k].senha)) {
                                                aux = true;
                                                a = k;
                                            }
                                        }
                                    }
                                    if (aux == true) {
                                        System.out.println("Logado com sucesso!\n");
                                        System.out.println("Digite 1 para ver suas informações ou 0 para sair: ");
                                        x = entrada.nextInt();
                                        while (x != 0) {
                                            if (x == 1) {
                                                System.out.println("Nome: " + alunos[a].nome);
                                                System.out.println("Matricula " + alunos[a].getMatricula());
                                                System.out.println("Curso: " + alunos[a].getCurso());
                                                System.out.println("Nota: " + alunos[a].getNota());
                                                x = 0;
                                            } else {
                                                System.out.println("Valor Invalido");
                                            }
                                            System.out.println("Digite 1 para ver suas informações ou 0 para sair: ");
                                            x = entrada.nextInt();
                                            if(x == 0)
                                             y = x;
                                        }

                                    } else {
                                        System.out.println("Login ou senha invalida");
                                        System.out.println(
                                                "digite 1 para logar como aluno, 2 para logar como professor ou 0 para sair");
                                        y = entrada.nextInt();
                                    }
                                    break;
                                }
                                case (2): {
                                    System.out.println("Digite as informacoes de login: ");
                                    System.out.println("Digite seu login: ");
                                    String login = entrada.next();
                                    System.out.println("Digite sua senha: ");
                                    String senha = entrada.next();

                                    boolean aux = false;
                                    int k;
                                    Professor professor = new Professor(login, senha);
                                    for (k = 0; k < professores.length; k++) {
                                        if (professores[k] != null) {
                                            if (professor.login.equals(professores[k].login)
                                                    && professor.senha.equals(professores[k].senha)
                                                    && professores[k].autenticar(senha) == true)
                                                aux = true;

                                        }
                                    }
                                    if (aux == true) {
                                        System.out.println("Logado com sucesso!\n");
                                        aux1 = true;
                                        System.out.println(
                                                "Digite 1 para ver alunos, 2 para dar nota a aluno ou 0 para sair: ");
                                        x = entrada.nextInt();
                                        while (x != 0) {
                                            switch (x) {
                                                case 1: {
                                                    for (int l = 0; l < alunos.length; l++) {
                                                        if (alunos[l] != null)
                                                            System.out.println("nome: " + alunos[l].nome + ", curso: "
                                                                    + alunos[l].getCurso() + ", matricula: "
                                                                    + alunos[l].getMatricula() + ", nota: "
                                                                    + alunos[l].getNota());
                                                    }

                                                    break;
                                                }
                                                case 2: {
                                                    System.out.println("Para Qual aluno voce quer dar nota? ");
                                                    for (int l = 0; l < alunos.length; l++) {
                                                        if (alunos[l] != null)
                                                            System.out.println(l + 1 + ". " + alunos[l].nome
                                                                    + ", matricula: " + alunos[l].getMatricula() + "\n");
                                                    }
                                                    System.out.println("digite o numero correspondente ao aluno: ");
                                                    x = entrada.nextInt();
                                                    professor.publicarNota(alunos[x - 1]);
                                                    System.out.println("Nota publicada");

                                                    break;
                                                }
                                                default: {
                                                    System.out.println("Digite um valor valido");
                                                    break;
                                                }

                                            }
                                            System.out.println(
                                                    "Digite 1 para ver alunos, 2 para dar nota a aluno ou 0 para sair: ");
                                            x = entrada.nextInt();

                                        }
                                    } else {
                                        System.out.println("Login ou senha invalida");
                                        System.out.println(
                                                "digite 1 para logar como aluno, 2 para logar como professor ou 0 para sair");
                                        y = entrada.nextInt();
                                    }
                                    break;
                                }
                                default: {
                                    System.out.println("Digite um valor valido");
                                    System.out.println(
                                            "digite 1 para logar como aluno, 2 para logar como professor ou 0 para sair");
                                    y = entrada.nextInt();
                                    break;
                                }
                            }
                            if (aux1)
                                y = 0;
                        }
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "digite 1 para criar conta de aluno, 2 para criar conta de professor ou 0 para sair");
                        int z = entrada.nextInt();
                        while (z != 0) {
                            boolean aux1 = false;
                            switch (z) {
                                case (1): {
                                    System.out.println("Digite as informacoes de um aluno: ");
                                    System.out.println("Digite seu nome: ");
                                    String nome = entrada.next();
                                    System.out.println("Digite sua matricula: ");
                                    int matricula = entrada.nextInt();
                                    System.out.println("Digite seu curso: ");
                                    String curso = entrada.next();
                                    System.out.println("Digite seu login: ");
                                    String login = entrada.next();
                                    System.out.println("Digite sua senha: ");
                                    String senha = entrada.next();

                                    Aluno aluno = new Aluno(nome, matricula, curso, login, senha);
                                    alunos[i] = aluno;
                                    alunos[i].fazerLogin(alunos[i].login, alunos[i].senha);
                                    i++;
                                    System.out.println("Conta criada com sucesso!");
                                    aux1 = true;
                                    break;
                                }
                                case (2): {
                                    System.out.println("Digite as informacoes de um professor: ");
                                    System.out.println("Digite seu nome: ");
                                    String nome = entrada.next();
                                    System.out.println("Digite seu login: ");
                                    String login = entrada.next();
                                    System.out.println("Digite sua senha de professor: ");
                                    String senha = entrada.next();

                                    Professor professor = new Professor(nome, login, senha);
                                    if (professor.autenticar(senha)) {
                                        professores[j] = professor;
                                        professores[j].fazerLogin(professores[j].login, professores[j].senha);
                                        j++;
                                        System.out.println("Conta criada com sucesso!");
                                        aux1 = true;
                                    } else {
                                        System.out.println("Senha de professor invalida");
                                        System.out.println(
                                                "digite 1 para criar conta de aluno, 2 para criar conta de professor ou 0 para sair");
                                        z = entrada.nextInt();
                                    }
                                    break;
                                }
                                default: {
                                    System.out.println("Digite um valor valido");
                                    System.out.println(
                                            "digite 1 para criar conta de aluno, 2 para criar conta de professor ou 0 para sair");
                                    z = entrada.nextInt();
                                    break;
                                }
                            }
                            if (aux1)
                                z = 0;
                        }
                        break;
                    }
                    default: {
                        System.out.println("Digite um valor valido");
                        break;
                    }
                }
                System.out.println("Digite 1 para Logar, 2 para fazer um cadatro ou 0 para sair");
                x = entrada.nextInt();
            }
        }

    }

}

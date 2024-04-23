package br.com.fiap.listapresenca;

// A classe Aluno estende a classe Pessoa, indicando que Aluno é um tipo específico de Pessoa.
public class Aluno extends Pessoa {

    // Atributos específicos da classe Aluno.
    private String rm;   // Registro do aluno.
    private String curso; // Curso em que o aluno está matriculado.

    // Construtor da classe Aluno. Recebe os atributos específicos e os comuns (nome, idade, sexo).
    public Aluno(String nome, int idade, String sexo, String rm, String curso) {
        // Chama o construtor da classe base (Pessoa) com os atributos comuns.
        super(nome, idade, sexo);
        // Inicializa os atributos específicos da classe Aluno.
        this.rm = rm;
        this.curso = curso;
    }

    // Sobrescreve o método abstrato cadastrar da classe base (Pessoa).
    @Override
    public void cadastrar() {
        System.out.println("Aluno " + this.nome + " cadastrado com sucesso.");
        // Aqui você incluiria a lógica de cadastro, como salvar no banco de dados, etc.
    }

    // Métodos getters e setters para os atributos específicos de Aluno.
    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

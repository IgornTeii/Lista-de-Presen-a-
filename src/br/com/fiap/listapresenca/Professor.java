package br.com.fiap.listapresenca;

public class Professor extends Pessoa {
    private String inscricao;
    private String disciplina;

    public Professor(String nome, int idade, String sexo, String inscricao, String disciplina) {
        super(nome, idade, sexo); // Inicializa os atributos herdados da classe Pessoa.
        this.inscricao = inscricao; // Inicializa o atributo específico de Professor.
        this.disciplina = disciplina; // Inicializa o atributo específico de Professor.
    }

    @Override
    public void cadastrar() {
        // Implementação específica do cadastro para Professor.
        System.out.println("Professor " + getNome() + " cadastrado com sucesso.");
    }

    // Getters e setters para inscricao e disciplina.
    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

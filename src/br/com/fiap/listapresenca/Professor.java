package br.com.fiap.listapresenca;

public class Professor extends Pessoa {
    private String inscricao;
    private String disciplina;

    public Professor(String nome, int idade, String sexo, String inscricao, String disciplina) {
        super(nome, idade, sexo);
        this.inscricao = inscricao;
        this.disciplina = disciplina;
    }

    @Override
    public void cadastrar() {
        System.out.println("Professor " + getNome() + " cadastrado com sucesso.");
    }

    @Override
    public void registrarPresenca() {
        System.out.println("Presença do professor " + getNome() + " registrada.");
    }

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

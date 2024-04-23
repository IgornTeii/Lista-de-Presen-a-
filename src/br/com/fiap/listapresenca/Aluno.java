package br.com.fiap.listapresenca;

public class Aluno extends Pessoa {

    private String rm;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String rm, String curso) {
        super(nome, idade, sexo);
        this.rm = rm;
        this.curso = curso;
    }

    @Override
    public void cadastrar() {
        System.out.println("Aluno " + this.nome + " cadastrado com sucesso.");

    }

    @Override
    public void registrarPresenca() {
        System.out.println("Presença do aluno " + getNome() + " registrada.");

    }

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

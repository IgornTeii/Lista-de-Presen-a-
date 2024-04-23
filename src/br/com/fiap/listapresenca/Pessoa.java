package br.com.fiap.listapresenca;

public abstract class Pessoa {
  protected String nome;
  protected int idade;
  protected String sexo;

  public Pessoa(String nome, int idade, String sexo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
  }

  public abstract void cadastrar();

  public abstract void registrarPresenca();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getSexo() {
    return sexo;
  }

}


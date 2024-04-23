package br.com.fiap.listapresenca;

public abstract class Pessoa {
  //Campos protegidos: são acessíveis dentro da própria classe e por classes que a estendem.
  protected String nome;
  protected int idade;
  protected String sexo;

  public Pessoa(String nome, int idade, String sexo) {
    this.nome = nome; // 'this' é usado para referenciar o campo da instância atual.
    this.idade = idade;
    this.sexo = sexo;
  }
  //Método abstrato cadastrar: será implementado pelas subclasses.
  public abstract void cadastrar();

  public abstract void registrarPresenca();

  //Getters e setters para nome, idade e sexo. Estes permitem o acesso seguro aos campos.
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome; // Atualiza o nome da instância atual.
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade; // Atualiza a idade da instância atual.
  }

  public void setSexo(String sexo) {
    this.sexo = sexo; // Atualiza o sexo da instância atual.
  }

  public String getSexo() {
    return sexo;
  }

}


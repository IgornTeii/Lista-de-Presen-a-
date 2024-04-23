package br.com.fiap.teste;

import br.com.fiap.listapresenca.Aluno;
import br.com.fiap.listapresenca.Professor;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Nome do Aluno", 20, "Masculino", "20202020", "Engenharia de Software");
        Professor professor = new Professor("Nome do Professor", 40, "Masculino", "20202021", "Matemática");

        aluno.cadastrar();
        professor.cadastrar();

        aluno.registrarPresenca();
        professor.registrarPresenca();
    }
}

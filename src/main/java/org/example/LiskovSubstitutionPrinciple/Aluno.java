package org.example.LiskovSubstitutionPrinciple;


import java.util.List;

public class Aluno extends Pessoa{

    private int nroMatricula;
    private List<String> materias;

    private String turma;

    public Aluno(String nome, String cpf, int idade, int nroMatricula, List<String> materias, String turma) {
        super(nome, cpf, idade);
        this.nroMatricula = nroMatricula;
        this.materias = materias;
        this.turma = turma;
    }

    public int getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(int nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}

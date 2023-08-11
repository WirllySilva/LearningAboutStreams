package Streams;

public class Aluno {

    private String nome;
    private double nota;
    private boolean aprovado;


    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        this.aprovado = true;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean getAprovado() {
        return this.aprovado;
    }
    
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}

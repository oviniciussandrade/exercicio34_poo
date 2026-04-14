package model;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

    private String curso;

    public static final String cursoPadrao = "Sistemas de Informação";
    
    public Aluno() {
        this("", "", 0);
    }

    public Aluno(String curso, String nome, int idade) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void leitura() {
        super.leitura();
        setCurso(JOptionPane.showInputDialog("Qual o seu curso? ", cursoPadrao));

    }

    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "Você cursa " + getCurso());

    }

    @Override
    public String getNomeFormatado() {
       return nome.toUpperCase();
    }
}

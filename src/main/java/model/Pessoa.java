package model;

import javax.swing.JOptionPane;

public abstract class Pessoa {

    public String nome;
    private int idade;
    
    public abstract String getNomeFormatado(
    
    );

    public Pessoa() {
        this(" ", 0);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Diga seu nome: "));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Quantos anos tem? ")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Seu nome é " + getNome());
        JOptionPane.showMessageDialog(null, "Você tem " + getIdade() + " anos de idade ");

    }

}

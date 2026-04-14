package model;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {

    private double salario;
    private String titulo;
    
    public static final String tituloPadrao = "Doutor";

    public Professor() {
        this(0, "", "", 0);
    }

    public Professor(double salario, String titulo, String nome, int idade) {
        super(nome, idade);
        this.salario = salario;
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void leitura() {
        super.leitura();
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Diga seu salário: ")));
        setTitulo(JOptionPane.showInputDialog("Informe seu titulo: ", tituloPadrao));
    }

    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "Seu salário é = " + getSalario());
        JOptionPane.showMessageDialog(null, "Seu titulo é: " + getTitulo());
    }

    @Override
    public String getNomeFormatado() {
       return titulo + " " + nome;
    }
}

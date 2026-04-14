
import model.Pessoa;
import model.Aluno;
import model.Professor;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog("Você é Professor ou Aluno? ");

        char cliente = entrada.charAt(0);

        switch (cliente) {

            case 'a':
            case 'A':
                Aluno aluno = new Aluno();
                aluno.leitura();
                JOptionPane.showMessageDialog(null, " Seu nome é : " + aluno.getNomeFormatado() + "\n Seu curso é: " + aluno.getCurso());
                
                break;

            case 'p':
            case 'P':

                Professor prof = new Professor();
                prof.leitura();
                JOptionPane.showMessageDialog(null, " Você é o: " + prof.getNomeFormatado());
                break;

        }
    }
}

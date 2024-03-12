import javax.swing.JOptionPane;

public class Atividade1 {

public static void main(String args[]) {

    
    String nomedofuncionario = JOptionPane.showInputDialog("Digite o nome do funcionario");
    double valorPhora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora"));
    double horasTrabalhadas= Double.parseDouble(JOptionPane.showInputDialog("Insira as horas trabalhadas")) ;
    double valorTotalareceber= (valorPhora * horasTrabalhadas);

    
     
     
     
     System.out.println("seu nome é "         + nomedofuncionario+
    		              "\nVocê recebe: "     + valorPhora       + " por hora"+
    		              "\nVocê tem: "        + horasTrabalhadas +
    		              "\nSeu salário: R$ "  + valorTotalareceber);
     
     
     
	}}
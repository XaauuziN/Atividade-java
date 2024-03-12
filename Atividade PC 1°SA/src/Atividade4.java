import javax.swing.JOptionPane;

public class Atividade4 {

public static void main(String args[]) {

     double valoremR$ = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor em R$:")); 
          double dolar = (valoremR$ / 4.89);
          JOptionPane.showMessageDialog(null, "Valor em U$" + dolar);
	}} 
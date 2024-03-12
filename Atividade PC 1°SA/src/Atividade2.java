import javax.swing.JOptionPane;

public class Atividade2 {

public static void main(String args[]) {

     double valorCm = Double.parseDouble (JOptionPane.showInputDialog ("Digite o comprimento em cm:")); 
          double metros = (valorCm / 100);
          JOptionPane.showMessageDialog(null, "centimetros" + valorCm
                                                                          +"\nValor em metros" +metros);
	}}  
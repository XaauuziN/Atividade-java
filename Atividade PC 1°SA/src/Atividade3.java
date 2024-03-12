import javax.swing.JOptionPane;

public class Atividade3 {

    public static void main(String args[]) {
    
         double valorG = Double.parseDouble (JOptionPane.showInputDialog ("Digite o peso em gramas:")); 
              double kg = (valorG / 1000);
              JOptionPane.showMessageDialog(null, "Gramas" + valorG
                                                                              +"\nPeso em quilos" + kg);
        }}
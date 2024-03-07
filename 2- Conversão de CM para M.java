package aula.um.e.dois;

import javax.swing.JOptionPane;

public class Exemplos {

public static void main(String args[]) {

     double valorCm = Double.parseDouble (JOptionPane.showInputDialog ("Digite o comprimento em cm:")); 
          double metros = (valorCm / 100);
          JOptionPane.showMessageDialog(null, "centimetros" + valorCm
                                                                          +"\nValor em metros" +metros);
	}}  		 

package aula.um.e.dois;

import javax.swing.JOptionPane;

public class Exemplos {

public static void main(String args[]) {

     double valoremR$ = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor em R$:")); 
          double dolar = (valoremR$ / 4.89);
          JOptionPane.showMessageDialog(null, "Valor em U$" + dolar);
	}}  		 

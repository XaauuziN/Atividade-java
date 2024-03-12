package aula.um.e.dois;

import javax.swing.JOptionPane;

public class Exemplos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto:");
        double valorProduto = scanner.nextDouble();
        
        Produto produto = new Produto(valorProduto);
        produto.calcularLucro();
        
        System.out.println("Valor do lucro: R$" + produto.getLucro());
        System.out.println("Preço de venda: R$" + produto.getPrecoVenda());
        
        scanner.close();
    }
}

class Produto {
    private double valorProduto;
    private double lucro;
    private double precoVenda;
    private static final double LUCRO_PERCENTUAL = 0.3; // 30%

    public Produto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void calcularLucro() {
        lucro = valorProduto * LUCRO_PERCENTUAL;
        precoVenda = valorProduto + lucro;
    }

    public double getLucro() {
        return lucro;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
}
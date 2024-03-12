import javax.swing.JOptionPane;

public class Atividade5 {

    public static void main(String[] args) {
        double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));

        Produto produto = new Produto(valorProduto);
        produto.calcularLucro();

        JOptionPane.showMessageDialog(null,
                "Valor do lucro: R$ " + produto.lucro +
                        "\nPreço de venda: R$ " + produto.precoVenda);
    }
}

class Produto {
    double valorProduto;
    double lucro;
    double precoVenda;
    static final double LUCRO_PERCENTUAL = 0.3; // 30%

    public Produto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void calcularLucro() {
        lucro = valorProduto * LUCRO_PERCENTUAL;
        precoVenda = valorProduto + lucro;
    }
}

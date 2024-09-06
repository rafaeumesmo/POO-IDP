package BombaCombustivel;
public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros > quantidadeCombustivel) {
            System.out.println("Quantidade de combustível insuficiente.");
        } else {
            quantidadeCombustivel -= litros;
            System.out.println("Você abasteceu " + litros + " litros.");
        }
    }

    public void abastecerPorLitro(double litros) {
        double valor = litros * valorLitro;
        if (litros > quantidadeCombustivel) {
            System.out.println("Quantidade de combustível insuficiente.");
        } else {
            quantidadeCombustivel -= litros;
            System.out.println("Você precisa pagar R$ " + valor);
        }
    }

    public void alterarValor(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void alterarCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}

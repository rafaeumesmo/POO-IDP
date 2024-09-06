public class Item {
    String nome;
    double preco;
    boolean isProduto;

    public Item(String nome, double preco, boolean isProduto) {
        this.nome = nome;
        this.preco = preco;
        this.isProduto = isProduto;
    }

    public double calcularISS() {
        return isProduto ? 0 : preco * 0.073;
    }

    public double calcularICMS() {
        return preco * 0.132;
    }

    public double calcularIPI() {
        return isProduto ? preco * 0.219 : 0;
    }

    public double calcularTotal() {
        return preco + calcularISS() + calcularICMS() + calcularIPI();
    }

    public void exibirDetalhes() {
        System.out.println("Item: " + nome);
        System.out.println("Preço Original: R$ " + preco);
        System.out.println("ISS: R$ " + calcularISS());
        System.out.println("ICMS: R$ " + calcularICMS());
        System.out.println("IPI: R$ " + calcularIPI());
        System.out.println("Preço Total: R$ " + calcularTotal());
    }
}
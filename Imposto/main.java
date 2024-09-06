public class main {
    public static void main(String[] args) {
        Item produto = new Item("Notebook", 3000.00, true);
        Item servico = new Item("Consultoria", 1500.00, false);

        System.out.println("Operação com Produto:");
        produto.exibirDetalhes();

        System.out.println("\nOperação com Serviço:");
        servico.exibirDetalhes();
    }
}
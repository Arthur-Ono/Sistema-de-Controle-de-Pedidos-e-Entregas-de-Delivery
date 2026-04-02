public class Produto {

    static int counter = 1;
    int idProduto;
    String nome;
    double preco;
    String categoria;
    int estoque;

    public Produto(String nome, double preco, String categoria, int estoque) {
        this.idProduto = counter++;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;
    }
}

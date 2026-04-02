package ClassesPrincipais;

public class ItemPedido {

    int quantidade;
    double subtotal;
    Produto produto;


    public ItemPedido(int quantidade, double subtotal, Produto produto) {
        this.quantidade = quantidade;
        this.subtotal = subtotal;
        this.produto = produto;
    }

    public double calcularSubtotal(){
        System.out.println(this.produto.preco * this.quantidade);
        return this.produto.preco * this.quantidade;
    }

}

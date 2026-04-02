package ClassesPrincipais;

import Estruturas.Lista;

public class Pedido {
    static int counter = 1;
    int idPedido;
    Cliente cliente;
    String status;
    double valorTotal;
    String enderecoEntrega;
    Lista<ItemPedido> listaDeItens;

    public Pedido(Cliente cliente, String status,
                  double valorTotal, String enderecoEntrega,
                  Lista<ItemPedido> listaDeItens) {
        this.cliente = cliente;
        this.idPedido = counter++;
        this.status = status;
        this.valorTotal = valorTotal;
        this.enderecoEntrega = enderecoEntrega;
        this.listaDeItens = listaDeItens;
    }


}

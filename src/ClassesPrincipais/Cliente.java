package ClassesPrincipais;

import Estruturas.Lista;

public class Cliente {
    static int counter = 1;
    int idCliente;
    String nome;
    int telefone;
    String endereco;

    public Cliente(String nome, int telefone, String endereco) {
        this.idCliente = counter ++;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    // Métodos ppode mexer ai a vontade
    Lista clientesTeste = new Lista<>(); // pode pagar isso aqui


}

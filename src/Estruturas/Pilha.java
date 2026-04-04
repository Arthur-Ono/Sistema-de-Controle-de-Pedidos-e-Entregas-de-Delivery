package Estruturas;

public class Pilha<T> {

    private Nodes<T> topo;
    private int quantidade;

    public Pilha() {
        this.topo = null;
        this.quantidade = 0;
    }

    public void push(T data) {
        Nodes<T> novo = new Nodes<>(data);
        novo.next = topo;
        topo = novo;
        quantidade++;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T dado = topo.data;
        topo = topo.next;
        quantidade--;
        return dado;
    }

    public T topo() {
        if (isEmpty()) {
            return null;
        }

        return topo.data;
    }

    public T peek() {
        return topo();
    }

    public int size() {
        return quantidade;
    }

    public boolean isEmpty() {
        return quantidade == 0;
    }

    public void clear() {
        topo = null;
        quantidade = 0;
    }

    public void exibir() {
        Nodes<T> atual = topo;
        while (atual != null) {
            System.out.println(atual.data);
            atual = atual.next;
        }
    }
}

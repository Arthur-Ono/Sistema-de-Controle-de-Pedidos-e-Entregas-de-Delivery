package Estruturas;

public class NodesDE<T> {

    T data;
    NodesDE<T> next;
    NodesDE<T> previous;

    public NodesDE(T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }


}

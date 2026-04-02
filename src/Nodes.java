public class Nodes<T> {

    T data;
    Nodes<T> next;

    public Nodes(T data) {
        this.data = data;
        this.next = null;
    }
}

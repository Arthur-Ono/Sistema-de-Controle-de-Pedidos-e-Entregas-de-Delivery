//Nodes da lista esqueci de nomear corretamente :p
// MAS TA FUNCIONAL É ISSO O QUE IMPORTA NE

package Estruturas;

public class Nodes<T> {

    T data;
    Nodes<T> next;

    public Nodes(T data) {
        this.data = data;
        this.next = null;
    }
}

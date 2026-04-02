package Estruturas;

public class ListaDE<T> {

    NodesDE<T> head;
    NodesDE<T> tail;
    int quantidade;

    public ListaDE(NodesDE<T> head, NodesDE<T> tail, int quantidade) {
        this.head = head;
        this.tail = tail;
        this.quantidade = quantidade;
    }

    public void insertHead(T data){
        NodesDE<T> temp = new NodesDE<>(data);
        if (isEmpty()){
            head = temp;
            tail = temp;
        }
        else if(head == tail){
            temp.next = head;
            temp=head.previous;
            temp=head;
        }
    }

    public void insertTail(T data){}

    public void insertAt(int onde, T data){}

    public void removeHead(){}

    public void removeTail(){}

    public void removeAt(int onde){}

    public void removeValue(T data){}

    public T get(int onde){
        return  null;
    }

    public int indexOf(T data){
        return -1;
    }

    public boolean contains(T data){
        return true;
    }
    public int size(){
        return -1;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void displayForward(){}  // Imprimir do início ao fim

    public void displayBackward(){} // Imprimir do fim ao início (a vantagem da Dupla!)

    public void clear(){}

}

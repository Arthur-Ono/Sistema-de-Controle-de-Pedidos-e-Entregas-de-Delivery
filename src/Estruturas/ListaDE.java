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
    //métodos de adição
    public void insertHead(T data){
        NodesDE<T> temp = new NodesDE<>(data);
        if (isEmpty()){
            head = temp;
            tail = temp;
        }
        else if(head == tail){
            temp.next = head;
            head.previous = temp;
            head = temp;
        }
        quantidade++;

    }
    public void insertTail(T data){
        NodesDE<T> temp = new NodesDE<>(data);
        if (isEmpty()){
            head = temp;
            tail = temp;
        }
        else if(head == tail){
            temp.previous = tail;
            tail.next = temp;
            tail = temp;
        }
        quantidade++;
    }
    public void insertAt(int onde, T data){

        if (onde<0 || onde > quantidade){
            System.out.println("Índice errado");
            return;

        }
        else if (onde == 0){
            insertHead(data);
            return;
        }
        else if(onde == quantidade){
            insertTail(data);
            return;
        }

        //aquiii eu só quis malucar e deixar otimizado....

        int num = quantidade/2;// java arredonda para baixo quando se trata de 'int', não tem erro isso aqui

        NodesDE<T> newNodes = new NodesDE<>(data);
        NodesDE<T> temp = head;

        //para última metade
        if (onde>num){
            temp=tail;
            for (int i = 0; i < (quantidade - 1) - onde ; i++) {
                temp = temp.previous;
            }
            newNodes.next = temp;
            newNodes.previous = temp.previous;
            temp.previous.next = newNodes;
            temp.previous = newNodes;
        }
        //para primeira metade
        else {
            for (int i = 0; i < onde-1; i++) {
                temp = temp.next;
            }
            newNodes.previous = temp;
            newNodes.next = temp.next;
            temp.next.previous = newNodes;
            temp.next = newNodes;
        }
        quantidade++;
    }

    //métodos de remoção
    public void removeHead(){
        if(isEmpty()){
            System.out.println("Fila vazia!");
            return;
        }
        if (tail==head){
            head = null;
            tail = null;
        }
        else {
            head = head.next;
            head.previous = null;
        }
        quantidade --;
    }
    public void removeTail(){
        if(isEmpty()){
            System.out.println("Fila vazia!");
            return;
        }
        if (tail==head){
            head = null;
            tail = null;
        }
        else {
            tail = tail.previous;
            tail.next=null;
        }
        quantidade --;
    }
    public void removeAt(int onde){

        if (onde<0 || onde > quantidade){
            System.out.println("Índice errado");
            return;
        }
        else if (onde == 0){
            removeHead();
            return;
        }
        else if(onde == quantidade){
            removeTail();
            return;
        }

        NodesDE<T> temp;
        int num = quantidade / 2;
        // Aprendi a otimizar :p foram SÓ 30 minutinhos pensando
        // eu NÃO vou refazer o insertAt sabendo que poderia melhorar ele...
        // eu acho.....
        if (onde > num){
            temp = tail;
            for (int i = 0; i < (quantidade - 1) - onde; i++) {
                temp = temp.previous;
            }
        }
        else {
            temp = head;
            for (int i = 0; i < onde ; i++) {
                temp = temp.next;
            }
        }
        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
        quantidade--;

    }
    public void removeValue(T data){
        if(isEmpty()){
            System.out.println("Fila vazia");
            return;
        }

        NodesDE<T> temp = head;
        while (temp!=null){
            if(temp.data.equals(data)){
                if (temp==head){
                    removeHead();
                    temp= head;
                    continue;
                } else if (temp == tail) {
                    removeTail();
                    break;
                }
                else {
                    temp.previous.next = temp.next;
                    temp.next.previous = temp.previous;

                    quantidade--;

                }
            }
            temp = temp.next;
        }

    }

    //métodos de busca e acesso
    public T get(int onde){
        if (onde < 0 || onde >= quantidade) {
            System.out.println("Índice errado!");
            return null;
        }
        NodesDE<T> temp;
        int num = quantidade/2;
        if(onde> num){
            temp = tail;
            for (int i = 0; i < (quantidade-1) - onde; i++) {
                temp = temp.previous;
            }
        }
        else {
            temp = head;
            for (int i = 0; i < onde ; i++) {
                temp = temp.next;
            }
        }
        return  temp.data;
    }
    public int indexOf(T data){
        if (isEmpty()){
            System.out.println("Lista vazia");
            return -1;
        }

        NodesDE<T> temp = head;
        int cade = 0;

        while (temp!=null){
            if (temp.data.equals(data)){
                return cade;
            }
            temp=temp.next;
            cade++;
        }
        return -1;
    }
    public boolean contains(T data){
        if (isEmpty()){
            System.out.println("Lista vazia");
            return false;
        }

        NodesDE<T> temp = head;
        while(temp!=null){
            if (temp.data.equals(data)){
                return true;
            }
            temp = temp.next;
        }
        return false;

        // poderia ser feito em UMA linha com
        // return indexOf(data) !=-1;
        // mas queria treinar :p
    }

    //métodos de utilidade
    public int size(){
        return quantidade;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void displayForward(){
        if (isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        NodesDE<T> temp = head;
        System.out.print("Frente: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        if (isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        NodesDE<T> temp = tail;
        System.out.print("Trás: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }
    public void clear(){
        head = null;
        tail = null;
        quantidade = 0;
    }

}

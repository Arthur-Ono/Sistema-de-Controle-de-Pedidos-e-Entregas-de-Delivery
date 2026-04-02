package Estruturas;

public class Lista<T> {

    int quantidade;
    Nodes<T> head;


    public Lista() {
        this.quantidade = 0;
        this.head = null;
    }
    //métodos de adição
    public void insertHead(T data){
        Nodes<T> temp = new Nodes<>(data);
        temp.next = head;
        head=temp;
        quantidade++;
    }
    public void insertAt(int onde,T data){

        if (onde<0 || onde > quantidade){
            System.out.println("Índice errado");
            return;
        }
        if (onde == 0){
            insertHead(data);
        }
        else {
            Nodes<T> newNodes = new Nodes<>(data);
            Nodes<T> temp = head;
            for (int i = 0; i < onde-1; i++) {
                temp = temp.next;
            }
            newNodes.next = temp.next;
            temp.next = newNodes;
        }
        quantidade++;
    }

    //métodos de remoção
    public void removeHead(){
        if (isEmpty()){
            System.out.println("Estruturas.Lista vazia");
            return;
        }
        head = head.next;
        quantidade--;
    }
    public void removeAt(){
        if (isEmpty()){
            System.out.println("Estruturas.Lista vazia");
            return;
        }
    }
    public void removeValue(T data){
        Nodes<T> temp = head;
        if (isEmpty()){
            System.out.println("Estruturas.Lista vazia");
            return;
        }
        while (head !=null && head.data.equals(data)){
            head = head.next;
            quantidade--;
        }
        while (temp!=null && temp.next!=null){
            if (temp.next.data.equals(data)){
                temp.next=temp.next.next;
                quantidade--;
            }
            else {
                temp = temp.next;
            }
        }
    }

    //métodos de busca e acesso
    public void searchValue(){}
    public Nodes get(int onde){
        if (isEmpty()){
            System.out.println("Estruturas.Lista vazia");
            return null;
        }

        Nodes<T> temp = head;
        for (int i = 0; i < onde- 1; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data.toString());
        return temp;
    }
    public void contains(T data){
        if (isEmpty()){
            System.out.println("Estruturas.Lista vazia");
            return;
        }
        Nodes<T> temp = head;
        int quant = 0;
        while (temp!=null){
            if (temp == data){
                quant++;
            }
            temp = temp.next;
        }
        if (quant == 0){
            System.out.println("Sem valores encontrados");
        }
        else{
            System.out.println("Contém " + quant + " item(s) com esse valor");
        }
    }

    //métodos de utilidade e estado
    public boolean isEmpty(){
        return head==null;
    }
    public int size(){
        System.out.println("Tamanho: " + this.quantidade);
        return quantidade;
    }
    public void clear(){
        head = null;
        quantidade =0;
    }
    public void exibir(){
        Nodes<T> temp = head;
        while (temp!= null){
            System.out.println(temp.toString());
            temp = temp.next;
        }

    }



}

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

    public void insertAt(T data){}
    //métodos de remoção
    public void removeHead(){}

    public void removeAt(){}
    public void removeValue(){}
    //métodos de busca e acesso
    public void searchValue(){}
    public void get(){}
    public void contains(){}
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
    }
    public void exibir(){
        Nodes<T> temp = head;
        while (temp!= null){
            System.out.println(temp.toString());
            temp = temp.next;
        }

    }



}

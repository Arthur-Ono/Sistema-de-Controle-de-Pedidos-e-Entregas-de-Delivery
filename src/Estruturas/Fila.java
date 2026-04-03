package Estruturas;

public class Fila<T> {

	Nodes<T> head;
    Nodes<T> tail;
	int quantidade;

	public Fila() {
		this.head = null;
		this.tail = null;
		this.quantidade = 0;
	}

	public void queue(T data) {
		Nodes<T> novo = new Nodes<>(data);

		if (isEmpty()) {
			head = novo;
			tail = novo;
		} else {
			tail.next = novo;
			tail = novo;
		}

		quantidade++;
	}


	public T dequeue() {
		if (isEmpty()) {
			return null;
		}

		T dado = head.data;
		head = head.next;
		quantidade--;

		if (head == null) {
			tail = null;
		}

		return dado;
	}

	public T frente() {
		if (isEmpty()) {
			return null;
		}
		return head.data;
	}

	public T peek() {
		return frente();
	}

	public int size() {
		return quantidade;
	}

	public boolean isEmpty() {
		return quantidade == 0;
	}

	public void clear() {
		head = null;
		tail = null;
		quantidade = 0;
	}

	public void exibir() {
		Nodes<T> atual = head;
		while (atual != null) {
			System.out.println(atual.data);
			atual = atual.next;
		}
	}
}

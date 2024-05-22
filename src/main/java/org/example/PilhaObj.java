package org.example;

// Implementação genérica da Pilha - aceita qualquer tipo de objeto
public class PilhaObj<T> {
    private T[] pilha;
    private int topo;

    public PilhaObj(int capacidade) {
        this.topo = -1;
        this.pilha = (T[]) new Object[capacidade];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == pilha.length - 1;
    }

    // push: adiciona um elemento ao topo da pilha
    public void push(T elemento) {
        if (isFull()) {
            throw new IllegalStateException("A pilha está cheia!");
        } else {
            pilha[++topo] = elemento;
        }
    }

    // pop: remove o elemento do topo da pilha e o retorna
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vázia!");
        } else {
            return pilha[topo--];
        }
    }

    // peek: retorna o elemento do topo da pilha sem removê-lo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vázia!");
        } else {
            return pilha[topo];
        }
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("A pilha está vázia!");
        } else {
            System.out.println("""
                    +---------------------------------------------+
                                         Pilha
                    +---------------------------------------------+
                    """);
            for (int i = topo; i >= 0; i--) {
                System.out.println(pilha[i]);
            }
        }
    }

    public int getTopo() {
        return topo;
    }
}

public class Stack<T extends Comparable<T>> {
    private Node<T> top;
    private int nItems;

    // O(1)
    public void push(T data) {
        nItems++;

        if (top == null) {
            top = new Node<>(data);
        }
        else {
            Node<T> oldTop = top;
            top = new Node<>(data);
            top.setNext(oldTop);
        }
    }

    // O(1)
    public T pop() {
        if (top == null) {
            System.out.println("Exeception: Pop with empty stack");
            return null;
        }
        else {
            nItems--;

            Node<T> oldTop = top;
            top = top.getNext();
            return oldTop.getData();
        }
    }

    // O(1)
    public T peek() {
        return (top == null) ? null : top.getData();
    }

    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        return (top == null);
    }
}
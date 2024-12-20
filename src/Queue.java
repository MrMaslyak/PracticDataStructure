public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;


    public void enqueue(T t) {
        Node<T> node = new Node<>(t);
        if (head == null) {
            head = node;
        }
        if (tail!= null){
            tail.next = node;
        }
        tail = node;
    }

    public T peek() {
        return head.value;
    }

    public void dequeue() {
        head = head.next;
        if (head == null) {
            tail = null;
        }

    }


    public static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

}

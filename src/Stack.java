public class Stack<T> {

    private Node<T> head;


    public T peek() {
        return head.value;
    }

    public T pop() {
        T value = head.value;
        head = head.next;
        return value;

    }

    public void push(T t){
        Node<T> node = new Node<>(t);
        node.next = head;
        head = node;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    public static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}

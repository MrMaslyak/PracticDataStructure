import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
       // stackDemo();
        queueDemo();
    }


    public static void stackDemo(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("List Stack: " + stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Empty this Stack?: " + stack.isEmpty());
        stack.push(22);
        System.out.println("List Stack: " + stack);
        System.out.println(stack.peek());

    }


    public static void queueDemo(){
        Queue<String> queue = new Queue<>();

        queue.enqueue("Hello");
        queue.enqueue("World");
        queue.enqueue("!");

        System.out.println("Peek: " + queue.peek());
        queue.dequeue();
        System.out.println("Peek: " + queue.peek());

    }
}
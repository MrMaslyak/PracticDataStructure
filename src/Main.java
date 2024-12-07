public class Main {
    public static void main(String[] args) {
        stackDemo();
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
        stack.push(22);
        System.out.println("List Stack: " + stack);

    }
}
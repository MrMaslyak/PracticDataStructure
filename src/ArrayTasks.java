public class ArrayTasks {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArray(array);
    }

    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i : array) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

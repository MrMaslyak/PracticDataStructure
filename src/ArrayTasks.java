import java.util.ArrayList;
import java.util.Objects;

public class ArrayTasks {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array2 = {2, 3, 4};
       reverseArray(array);
       sumArray(array);
       findMax(array);
       findMin(array);
       rotateArray(array, 5);
       getUniqueElements(array);
        compressArray(array);
        System.out.println(arePermutations(array, array2));
        union(array, array2);

    }

    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i : array) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void sumArray(int[] array) {
        int count = 0;
        for (int i : array) {
            count += i;
        }
        System.out.println("Summary array: " + count);
    }

    public static void findMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maximum value: " + max);
    }

    public static void findMin (int[] array){
        int min = array[0];
        for (int i : array) {
            if (i < min){
                min = i;
            }
        }
        System.out.println("Minimal value: " + min);
    }

    public static void rotateArray(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int newIndex = (i + k) % arr.length;
            System.out.print(arr[newIndex] + " ");
        }
        System.out.println();
    }

    public static void getUniqueElements(int[] arr){
        ArrayList <Integer> uniqueList = new ArrayList<>();
        for (int i : arr){
            if (uniqueList.contains(i)){
                uniqueList.remove((Integer) i);
            }
            if (!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        for (int i : uniqueList){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void compressArray(int[] arr) {
        ArrayList<String> compressedList = new ArrayList<>();
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
            } else {
                compressedList.add(arr[i] + "(" + count + ")");
                count = 1;
            }
        }

        System.out.println(String.join(", ", compressedList));
    }

    public static boolean arePermutations(int[] arr1, int[] arr2){

        if (arr1.length != arr2.length){
            return false;
        }
        for (int i : arr1){
            boolean found = false;
            for (int j : arr2){
                if (i == j){
                    found = true;
                    break;
                }
            }
            if (!found){
                return false;
            }
        }
        return true;

    }

    public static void  union(int[] arr1, int[] arr2){
        ArrayList <Integer> unionList = new ArrayList<>();
        for (int i : arr1){
            if (!unionList.contains(i)){
                unionList.add(i);
            }
        }
        for (int i : arr2){
            if (!unionList.contains(i)){
                unionList.add(i);
            }
        }
        for (int i : unionList){
            System.out.print(i + " ");
        }
    }

}

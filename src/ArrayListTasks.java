import java.util.ArrayList;

public class ArrayListTasks {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 10; i >= 0; i--) {
            list2.add(i);
        }


        System.out.print(list + " ");
        reverseList(list);
        removeEvenNumbers(list);
        findSecondMaxElement(list);
        removeDuplicates(list);
        alternateLists(list, list2);
        swapMinMax(list);
    }

    public static void reverseList(ArrayList<Integer> list) {
        System.out.println();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void removeEvenNumbers(ArrayList<Integer> list) {
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    public static void findSecondMaxElement(ArrayList<Integer> list) {
        int max = list.getFirst();
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        list.remove((Integer) max);
        System.out.println("Second max element: " + max);
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i : list) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }
        System.out.println(uniqueList);
    }

    public static void alternateLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> newList = new ArrayList<>();
        newList.addAll(list1);
        newList.addAll(list2);
        newList.sort(Integer::compareTo);
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }

    public static void  swapMinMax(ArrayList<Integer> list){
        int min = 0;
        int max = 0;
        for (int i : list) {
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        int minIndex = list.indexOf(min);
        int maxIndex = list.indexOf(max);
        list.set(minIndex, max);
        list.set(maxIndex, min);
        System.out.println(list);
    }


}

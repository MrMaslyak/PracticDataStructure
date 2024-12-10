import java.util.HashMap;
import java.util.HashSet;

public class HashTasks {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(countCharacterFrequency(str));
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        System.out.println(findUniqueNumbers(arr));
    }


    public static HashMap<Character, Integer> countCharacterFrequency(String str){
        HashMap <Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : str.toCharArray()){
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        return charFrequencyMap;
    }

    public static HashSet<Integer> findUniqueNumbers(int[] arr){
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int i : arr){
            uniqueNumbers.add(i);
        }
        return uniqueNumbers;
    }

    
}

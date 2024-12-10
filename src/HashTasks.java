import java.util.HashMap;
import java.util.HashSet;

public class HashTasks {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(countCharacterFrequency(str));
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        System.out.println(findUniqueNumbers(arr));
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1, str2));
        String text = "This is a sample text. This text is a sample. text text";
        System.out.println(countWordFrequency(text));
        System.out.println(findDuplicates(arr));
        System.out.println(findMostFrequentWord(text));
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

    public static boolean areAnagrams(String str1, String str2){
        HashSet <Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for (char c : str1.toCharArray()){
            set1.add(c);
        }
        for (char c : str2.toCharArray()){
            set2.add(c);
        }
        return set1.equals(set2);
    }

    public static HashMap<String, Integer> countWordFrequency(String text){
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words){
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        return wordFrequencyMap;
    }

    public static HashSet<Integer> findDuplicates(int[] arr){
        HashSet <Integer> duplicates = new HashSet<>();
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int i : arr){
            if (!uniqueNumbers.add(i)){
                duplicates.add(i);
            }
        }
        return duplicates;
    }

    public static String findMostFrequentWord(String text){

        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words){
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        String mostFrequentWord = "";
        int maxFrequency = 0;
        for (HashMap.Entry<String, Integer> entry : wordFrequencyMap.entrySet()){
            if (entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        return mostFrequentWord;
    }

    
}

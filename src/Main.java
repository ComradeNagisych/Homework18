import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(n -> n % 2 == 0);
        System.out.println(nums);
        System.out.println("Задача №2");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums2.removeIf(n -> n % 2 != 0);
        Set<Integer> uniqueDigits = new HashSet<>();
        uniqueDigits.addAll(nums2);
        System.out.println(uniqueDigits);
        System.out.println("Задача №3");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(strings);
        System.out.println(uniqueWords);
        System.out.println("Задача №4");
        List<String> strings2 = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> words = new HashMap<>();
        for (String s : strings2) {
            if (!words.containsKey(s)) {
                words.put(s, 1);
            } else {
                words.put(s, words.get(s) + 1);
            }
        }
        System.out.println(words.values());

    }
}
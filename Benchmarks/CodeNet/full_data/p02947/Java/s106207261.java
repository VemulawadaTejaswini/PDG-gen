import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        long result = 0;
        boolean[] isAnagram = new boolean[n];
        for (int i = 0; i < s.length; i++) {
            if (isAnagram[i] == true) {
                continue;
            }
            int midResult = 0;
            for (int j = i + 1; j < s.length; j++) {
                if (anagramChecker(s[i], s[j])) {
                    isAnagram[j] = true;
                    midResult++;
                }
            }
            for (int j = midResult; j > 0; j--) {
                result += j;
            }
        }
        System.out.println(result);
        sc.close();
    }

    public static boolean anagramChecker(String str1, String str2) {
        Map<Character, Integer> map1 = new TreeMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (!map1.keySet().contains(str1.charAt(i))) {
                map1.put(str1.charAt(i), 1);
            } else {
                map1.put(str1.charAt(i), map1.get(str1.charAt(i)) + 1);
            }
        }
        Map<Character, Integer> map2 = new TreeMap<>();
        for (int i = 0; i < str2.length(); i++) {
            if (!map2.keySet().contains(str2.charAt(i))) {
                map2.put(str2.charAt(i), 1);
            } else {
                map2.put(str2.charAt(i), map2.get(str2.charAt(i)) + 1);
            }
        }
        return map1.equals(map2); 
    }
}
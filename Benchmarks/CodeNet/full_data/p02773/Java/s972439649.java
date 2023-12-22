import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> countWord = new HashMap<>();
        Set<String> results = new TreeSet<>();
        int maxNum = 1;
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            if(countWord.containsKey(str)) {
                int num = countWord.get(str) + 1;
                countWord.put(str, num);
                maxNum = Math.max(maxNum, num);
            }
            else countWord.put(str, 1);
        }
        for(String key : countWord.keySet()) {
            if(countWord.get(key) == maxNum) results.add(key);
        }

        for(String ans : results) System.out.println(ans);
    }
}
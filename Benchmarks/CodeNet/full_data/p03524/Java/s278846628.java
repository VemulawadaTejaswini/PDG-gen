import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer v : map.values()) {
            max = Math.max(max, v);
            min = Math.min(min, v);
        }
        if (map.size() >= 3 && max - min <= 1) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}

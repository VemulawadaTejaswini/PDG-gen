import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            int value = 1;
            if (map1.containsKey(S.charAt(i))) {
                value += map1.get(S.charAt(i));
            }
            map1.put(S.charAt(i), value);
            value = 1;
            if (map2.containsKey(T.charAt(i))) {
                value += map2.get(T.charAt(i));
            }
            map2.put(T.charAt(i), value);
        }
        int[] num1 = new int[Math.max(map1.size(), map2.size())];
        int[] num2 = new int[Math.max(map1.size(), map2.size())];
        int i = 0;
        for (int value : map1.values()) {
            num1[i] = value;
            i++;
        }
        i = 0;
        for (int value : map2.values()) {
            num2[i] = value;
            i++;
        }
        Arrays.sort(num1);
        Arrays.sort(num2);
        boolean ok = true;;
        for (int j = 0; j < num1.length; j++) {
            if (num1[j] != num2[j]) {
                ok = false;
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
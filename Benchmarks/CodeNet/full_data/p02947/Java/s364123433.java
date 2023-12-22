import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> count = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sort(in.next());
            if (count.containsKey(s)) {
                count.replace(s, count.get(s) + 1);
            } else {
                count.put(s, 1);
            }
        }
        long res = 0;
        for (Map.Entry<String, Integer> kv : count.entrySet()) {
            res += (long)kv.getValue() * (long)(kv.getValue() - 1) / 2;
        }

        System.out.println(res);
    }


    private static String sort(String text) {
        char[]chars = text.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

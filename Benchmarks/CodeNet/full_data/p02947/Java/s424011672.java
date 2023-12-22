import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = toSortedString(sc.next());
        }
        Map<String, Counter> map = new HashMap<>();
        long c = 0L;
        for (int i = 0 ; i < n; i++) {
            if (map.containsKey(s[i])) {
                c += map.get(s[i]).increment();
            } else {
                map.put(s[i], new Counter());
            }
        }
        System.out.println(c);
    }
    private static String toSortedString(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
    private static class Counter {
        private long c = 1L;
        private long increment() {
            return this.c++;
        }
    }
}

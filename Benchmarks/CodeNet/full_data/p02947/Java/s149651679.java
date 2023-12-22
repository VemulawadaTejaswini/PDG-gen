import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Map<String, Long> m = new HashMap<>();
        for (int i = 0; i < N; i++) {
            char[] c = sc.nextLine().toCharArray();
            Arrays.sort(c);
            String k = new String(c);
            if (m.get(k) == null) {
                m.put(k, 1L);
            } else {
                m.put(k, m.get(k) + 1);
            }
        }
        long ans = 0;
        for (Long v : m.values()) {
            ans += v * (v - 1) / 2;
        }

        System.out.println(ans);
    }
}

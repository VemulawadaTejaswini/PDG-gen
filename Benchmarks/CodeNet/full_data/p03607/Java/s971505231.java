import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Long> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(a[i])) {
                m.put(a[i], 0L);
            } else {
                m.put(a[i], 1L);
            }
        }

        long ans = 0;
        for (Entry<Integer, Long> ent : m.entrySet()) {
            ans += ent.getValue();
        }
        System.out.println(ans);
    }
}


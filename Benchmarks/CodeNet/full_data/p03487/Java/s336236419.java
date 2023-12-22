import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        int N = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if (!m.containsKey(n)) {
                m.put(n, 1);
            } else {
                m.put(n, m.get(n) + 1);
            }
        }
        int cnt = 0;
        for (Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getKey() > e.getValue()) {
                cnt += e.getValue();
            } else if (e.getKey() < e.getValue()) {
                cnt += e.getValue() - e.getKey();
            }
        }

        System.out.println(cnt);
    }
}

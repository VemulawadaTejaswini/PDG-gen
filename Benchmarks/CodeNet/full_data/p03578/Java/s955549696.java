import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        Map<Long, Long> d = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long y = scan.nextLong();
            long cnt = d.getOrDefault(y, 0L);
            d.put(y, cnt + 1);
        }
        int M = scan.nextInt();
        Map<Long, Long> t = new HashMap<>();
        for (int i = 0; i < M; i++) {
            long y = scan.nextLong();
            long cnt = t.getOrDefault(y, 0L);
            t.put(y, cnt + 1);
        }
        for (long x : t.keySet()) {
            long cnt1 = t.getOrDefault(x, 0L);
            long cnt2 = d.getOrDefault(x, 0L);
            if (cnt2 < cnt1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

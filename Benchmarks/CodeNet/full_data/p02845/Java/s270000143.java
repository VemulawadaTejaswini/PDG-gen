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
        long ans = 1;
        HashMap<Long, Long> map = new HashMap<>();
        map.put(0L, 0L);
        map.put(1L, 0L);
        map.put(2L, 0L);
        for (int i = 0; i < N; i++) {
            long A = scan.nextLong();
            long count = 0;
            long index = 0;
            for (long j = 0; j < 3; j++) {
                if (map.get(j) == A) {
                    count += 1;
                    index = j;
                }
            }
            ans *= count;
            ans %= 1000000007;
            map.put(index, map.get(index) + 1);
        }
        System.out.println(ans);
    }
}

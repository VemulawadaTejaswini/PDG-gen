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
        int M = scan.nextInt();
        List<Key> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int keys = 0;
            for (int j = 0; j < b; j++) {
                keys |= pow(scan.nextInt() - 1);
            }
            Key key = new Key(i, a, b, keys);
            list.add(key);
        }
        list.sort(new KeyComparator());
        int max = pow(N)-1+1;
        int[] dp = new int[max];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < M; i++) {
            Key key = list.get(i);
            if (i == 0) {
                dp[key.keys] = key.cost;
                continue;
            }
            int[] next_dp = new int[max];
            Arrays.fill(next_dp, Integer.MAX_VALUE);
            next_dp[0] = 0;
            for (int j = 0; j < max; j++) {
                next_dp[j] = Math.min(next_dp[j], dp[j]);
                if (dp[j] == Integer.MAX_VALUE) {
                    continue;
                }
                next_dp[j | key.keys] = Math.min(next_dp[j | key.keys], dp[j] + key.cost);
            }
            dp = next_dp;
        }
        if (dp[max-1] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[max-1]);
        }
    }
    private int pow(int N) {
        if (N == 0) {
            return 1;
        }
        if (N % 2 == 1) {
            return 2 * pow(N - 1);
        }
        int half = pow(N / 2);
        return half * half;
    }
    class Key {
        int id;
        int cost;
        int keys;
        Key(int id, int cost, int total, int keys) {
            this.id = id;
            this.cost = cost;
            this.keys = keys;
        }
    }
    class KeyComparator implements Comparator<Key> {
        @Override
        public int compare(Key o1, Key o2) {
            if (o1.cost != o2.cost) {
                return Integer.compare(o1.cost, o2.cost);
            }
            return Integer.compare(o1.id, o2.id);
        }
    }
}

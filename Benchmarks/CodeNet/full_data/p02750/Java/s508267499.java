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
        int T = scan.nextInt();
        List<Pair> zero_list = new ArrayList<>();
        List<Pair> non_zero_list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            Pair p = new Pair(a, b);
            if (a == 0) {
                zero_list.add(p);
            } else {
                non_zero_list.add(p);
            }
        }

        zero_list.sort(new ZeroPairComparator());
        long[] z = new long[zero_list.size()+1];
        for (int i = 1; i <= zero_list.size(); i++) {
            z[i] = z[i-1] + zero_list.get(i-1).b + 1;
        }
        TreeMap<Long, Integer> zero_tree = new TreeMap<>();
        for (int i = 0; i < z.length; i++) {
            zero_tree.put(z[i], i);
        }

        non_zero_list.sort(new NonZeroPairComparator());
        long[] dp = new long[32];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        int len = non_zero_list.size();
        for (int i = 0; i < len; i++) {
            long[] next_dp = new long[32];
            Arrays.fill(next_dp, Long.MAX_VALUE);
            Pair p = non_zero_list.get(i);
            for (int j = 30; 0 <= j; j--) {
                if (dp[j] == Long.MAX_VALUE)  {
                    next_dp[j] = Math.min(next_dp[j], Long.MAX_VALUE);
                    continue;
                }
                long time = dp[j] + 1 + p.a * (dp[j] + 1) + p.b;
                if (T < time) {
                    next_dp[j] = Math.min(next_dp[j], Long.MAX_VALUE);
                    continue;
                }
                next_dp[j+1] = Math.min(next_dp[j+1], Math.min(dp[j+1],time));

                next_dp[j] = Math.min(next_dp[j], dp[j]);
            }
            dp = next_dp;
        }
        long ans = 0;
        for (int i = 0; i <= 31; i++) {
            if (T < dp[i]) {
                continue;
            }
            long count = i;
            long x = zero_tree.floorKey(T - dp[i]);
            ans = Math.max(ans, count + zero_tree.get(x));
        }
        System.out.println(ans);
    }

    class Pair {
        long a;
        long b;
        Pair(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }

    class ZeroPairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            return Long.compare(o1.b, o2.b);
        }
    }

    class NonZeroPairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            double x1 = (double) o1.a / ((double) o1.b + 1);
            double x2 = (double) o2.a / ((double) o2.b + 1);
            return -Double.compare(x1, x2);
        }
    }
}

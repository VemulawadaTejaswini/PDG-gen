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
        int H = scan.nextInt();
        int N = scan.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Pair p = new Pair(scan.nextInt(), scan.nextInt());
            list.add(p);
        }
        //list.sort(new PairComparator());
        long[] dp = new long[30000+1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < H; i++) {
            if (dp[i] == Long.MAX_VALUE) {
                continue;
            }
            for (int j = 0; j < N; j++) {
                Pair p = list.get(j);
                dp[i + p.A] = Math.min(dp[i + p.A], dp[i]+p.B);
            }
        }
        long answer = Long.MAX_VALUE;
        for (int i = H; i <= 30000; i++) {
            answer = Math.min(answer, dp[i]);
        }
        System.out.println(answer);
    }
    class Pair {
        int A;
        int B;
        Pair(int A, int B) {
            this.A = A;
            this.B = B;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.A != o2.A) {
                return Integer.compare(o1.A, o2.A);
            }
            return Integer.compare(o1.B, o2.B);
        }
    }
}

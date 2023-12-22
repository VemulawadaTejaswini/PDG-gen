import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
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
        int[] time = new int[6001];
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Pair p = new Pair(scan.nextInt(), scan.nextInt());
            list.add(p);
        }
        list.sort(new PairComparator());
        Arrays.fill(time, Integer.MIN_VALUE);
        time[0] = 0;
        for (int i = 0; i < N; i++) {
            int[] next_time = Arrays.copyOfRange(time, 0, time.length);
            Pair p = list.get(i);
            for (int j = 0; j < T; j++) {
                if (time[j] == Integer.MIN_VALUE) {
                    continue;
                }
                next_time[j+p.A] = Math.max(next_time[j+p.A], time[j]+p.B);
            }
            time = next_time;
        }
        int ans = 0;
        for (int i = 0; i < 6001; i++) {
            ans = Math.max(ans, time[i]);
        }
        System.out.println(ans);
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

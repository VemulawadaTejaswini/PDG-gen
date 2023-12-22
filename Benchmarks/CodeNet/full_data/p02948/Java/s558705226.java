
import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[][] dp;
    int MAX_M = 100000;
    int MAX_N = 100000;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> ba = new ArrayList<ArrayList<Integer>>(M) {
            {
                for (int i = 0; i < M; i++) {
                    add(new ArrayList<Integer>() {
                    });
                }
            }
        };
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A-- <= M) {
                ba.get(A).add(B);
            }
        }
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < M; i++) {
            pq.addAll(ba.get(i));
            if (!pq.isEmpty()) {
                ans += pq.poll();
            }
        }
        System.out.println(ans);
    }
}

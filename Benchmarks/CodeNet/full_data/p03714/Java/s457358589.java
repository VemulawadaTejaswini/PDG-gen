import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        int N = sc.nextInt();
        PriorityQueue<Long> left = new PriorityQueue<>();
        PriorityQueue<Long> right = new PriorityQueue<>(Comparator.reverseOrder());
        long[] center = new long[N];

        long sumLeft = 0;
        for (int i = 0; i < N; i++) {
            long x = sc.nextLong();
            left.add(x);
            sumLeft += x;
        }

        for (int i = 0; i < N; i++) {
            center[i] = sc.nextLong();
        }

        long sumRight = 0;
        for (int i = 0; i < N; i++) {
            long x = sc.nextLong();
            right.add(x);
            sumRight += x;
        }

        long[] max = new long[N + 1];
        max[0] = sumLeft;
        for (int i = 0; i < N; i++) {
            sumLeft += center[i];
            left.add(center[i]);
            sumLeft -= left.poll();
            max[i + 1] = sumLeft;
        }

        long[] min = new long[N + 1];
        min[N] = sumRight;
        for (int i = N - 1; i >= 0; i--) {
            sumRight += center[i];
            right.add(center[i]);
            sumRight -= right.poll();
            min[i] = sumRight;
        }

        long ans = -Long.MAX_VALUE;
        for (int i = 0; i <= N; i++) {
            ans = Math.max(ans, max[i] - min[i]);
        }
        System.out.println(ans);
    }
}
import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        long limit = 10000000000001000L;
        long k = sc.nextLong();
        if (k == 0) {
            System.out.println(2);
            System.out.println(1 + " " + 1);
            return;
        }

        long N = 50;
        long[] ans = new long[(int)N];
        long times = 0;
        Arrays.fill(ans, 0);
        for (int i = 0; i < N; i++) {
            if (N * (k - times) > limit) {
                times += limit / N;
                ans[i] = N * (limit / N);
            }
            else {
                ans[i] = N * (k - times);
                times = k;
            }

            if (times == k) {
                break;
            }
        }

        System.out.print(ans[0]);
        for (int i = 1; i < N; i++) {
            System.out.print(" " + ans[i]);
        }
    }
}
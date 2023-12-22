import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        long[] A = new long[N];
        long[] ans = new long[2 * N];
        long Ans = 0;
        Arrays.fill(ans, 0);
        A[0] = sc.nextLong();
        for (int i = 1; i < N; i++) {
            A[i] = sc.nextLong() + A[i - 1];
        }
        for (int i = 0; i < N; i++) {
            A[i] = (A[i] % M);

        }
        Arrays.sort(A);
        int c = 1;
        for (int i = 1; i < N; i++) {
            if (A[i] == A[i - 1]) {
                c++;
            } else {
                Ans += c * (c - 1) / 2;
                c = 1;
            }
        }
        Ans += c * (c - 1) / 2;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                Ans++;
            }
        }
        System.out.println(Ans);
    }
}

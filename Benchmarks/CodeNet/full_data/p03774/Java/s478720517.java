import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] a = new long[N];
        long[] b = new long[N];
        long[] c = new long[M];
        long[] d = new long[M];
        long[] distance = new long[N];
        Arrays.fill(distance, 999999999);
        long[] ans = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }
        for (int i = 0; i < M; i++) {
            c[i] = sc.nextLong();
            d[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (distance[i] > (Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]))) {
                    distance[i] = (Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]));
                    ans[i] = j + 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(ans[i]);
        }
    }
}
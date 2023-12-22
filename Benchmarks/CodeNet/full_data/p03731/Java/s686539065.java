import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long T = sc.nextLong();
        long[] t = new long[N];
        int G = 0;
        t[0] = sc.nextLong();
        for (int i = 1; i < N; i++) {
            t[i] = sc.nextLong();
            if (t[i] - t[i - 1] > T) {
                G += t[i] - t[i - 1] - T;
            }
        }
        System.out.println(t[N - 1] + T - G);
    }
}
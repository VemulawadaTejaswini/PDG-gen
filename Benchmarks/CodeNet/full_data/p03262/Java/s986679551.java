import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] x = new int[N];
        int a = 0;
        int b = 0;
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            if (i > 0 && x[i - 1] < X && x[i] > X) {
                a = X - x[i - 1];
                b = x[i] - X;
            }
        }
        if (N == 1 || x[0] > X) {
            System.out.println(Math.abs(x[0] - X));
            return;
        }
        if (x[N - 1] < X) {
            System.out.println(Math.abs(x[N - 1] - X));
            return;
        }
        System.out.println(a < b ? a : b);

    }
}
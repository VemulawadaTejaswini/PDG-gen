import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] x = new long[N];
        long[] y = new long[N];
        boolean check = false;
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            if (i > 0 && (Math.abs(x[i]) + Math.abs(y[i])) % 2 != (Math.abs(x[i - 1]) + Math.abs(y[i - 1])) % 2) {
                check = true;
            }
        }
        if (check) {
            System.out.println("-1");
            return;
        }
        int m = 0;
        if ((Math.abs(x[0]) + Math.abs(y[0])) % 2 == 0) {
            m = 20;
        } else {
            m = 19;
        }
        System.out.println(m);
        for (int i = 0; i < m; i++) {
            System.out.print("1 ");
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            int nx = 0;
            int ny = 0;
            for (int j = 0; j + Math.abs(x[i]) + Math.abs(y[i]) < m; j += 2) {
                System.out.print("RL");
            }
            while (true) {
                if (nx < x[i]) {
                    System.out.print("R");
                    nx++;
                    continue;
                }
                if (nx > x[i]) {
                    System.out.print("L");
                    nx--;
                    continue;
                }
                if (ny < y[i]) {
                    System.out.print("U");
                    ny++;
                    continue;
                }
                if (ny > y[i]) {
                    System.out.print("D");
                    ny--;
                    continue;
                }
                break;
            }
            System.out.println();
        }
        System.out.println();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int[] heights = new int[N];
                boolean allSame = true;
                for (int i = 0; i < N; i++) {
                    if (h[i] >= 1) {
                        heights[i] = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
                        // ★ここの判定条件が違っていると思う。。
                        if (i >= 1) {
                            if (heights[i] != heights[i - 1]) {
                                allSame = false;
                                break;
                            }
                        }
                    }
                }
                if (allSame == true) {
                    System.out.print(cx + " " + cy + " " + heights[0]);
                    return;
                }
            }
        }
    }

    // Main
    public static void main(String[] args) {
        new Main.solve();
    }
}


import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        int A;
        int px[] = new int[H * W + 1];
        int py[] = new int[H * W + 1];
        int d[] = new int[H * W + 1];
        int ans = 0;
        Arrays.fill(px,0);
        Arrays.fill(py,0);
        Arrays.fill(d, 0);
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A = sc.nextInt();
                px[A] = i;
                py[A] = j;
            }
        }
        for (int i = D + 1; i < H * W; i++) {
            d[i] = d[i - D] + (int) Math.abs(px[i] - px[i - D]) + (int) Math.abs(py[i] - py[i - D]);
        }
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            System.out.println(d[R] - d[L]);
        }
    }
}
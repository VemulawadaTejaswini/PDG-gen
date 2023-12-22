import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int D = scan.nextInt();
        int[][] A = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        long[][] original = new long[H*W+1][2];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                original[A[i][j]][0] = i;
                original[A[i][j]][1] = j;
            }
        }
        long[] s = new long[H*W+1];
        for (int i = 1; i <= H * W-D; i++) {
            s[i+D] += s[i];
            s[i+D] += Math.abs(original[i+D][0]-original[i][0]);
            s[i+D] += Math.abs(original[i+D][1]-original[i][1]);
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int L = scan.nextInt();
            int R = scan.nextInt();
            System.out.println(s[R]-s[L]);
        }
    }
}

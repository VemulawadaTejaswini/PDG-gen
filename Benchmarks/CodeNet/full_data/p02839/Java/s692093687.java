import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] A = new int[H][W];
        int[][] B = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                B[i][j] = scan.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                max = Math.max(max, Math.abs(A[i][j]-B[i][j]));
            }
        }
        if (max == 0) {
            System.out.println(0);
            return;
        }
        int limit = max*160+1;
        boolean[][] prev = null;
        for (int i = 0; i < H; i++) {
            boolean[][] next = new boolean[W][limit];
            for (int j = 0; j < W; j++) {
                Arrays.fill(next[j], false);
            }
            for (int j = 0; j < W; j++) {
                int abs = Math.abs(A[i][j]-B[i][j]);
                if (i == 0) {
                    if (j == 0) {
                        next[j][abs] = true;
                    } else {
                        for (int k = 0; k < limit; k++) {
                            if (k+abs<limit) {
                                next[j][k + abs] = next[j][k + abs] | next[j - 1][k];
                            }
                            if (Math.abs(k-abs)<limit) {
                                next[j][Math.abs(k - abs)] = next[j][Math.abs(k - abs)] | next[j - 1][k];
                            }
                        }
                    }
                    continue;
                }
                if (j == 0) {
                    for (int k = 0; k < limit; k++) {
                        if (k+abs<limit) {
                            next[j][k + abs] = next[j][k + abs] | prev[j][k];
                        }
                        if (Math.abs(k-abs)<limit) {
                            next[j][Math.abs(k - abs)] = next[j][Math.abs(k - abs)] | prev[j][k];
                        }
                    }
                } else {
                    for (int k = 0; k < limit; k++) {
                        if (k+abs<limit) {
                            next[j][k + abs] = next[j][k + abs] | prev[j][k];
                            next[j][k + abs] = next[j][k + abs] | next[j-1][k];
                        }
                        if (Math.abs(k-abs)<limit) {
                            next[j][Math.abs(k - abs)] = next[j][Math.abs(k - abs)] | prev[j][k];
                            next[j][Math.abs(k - abs)] = next[j][Math.abs(k - abs)] | next[j - 1][k];
                        }
                    }
                }
            }
            prev = next;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = 0; k < limit; k++) {
            if (prev[W-1][k]) {
                ans = k;
                break;
            }
        }
        System.out.println(ans);
    }
}

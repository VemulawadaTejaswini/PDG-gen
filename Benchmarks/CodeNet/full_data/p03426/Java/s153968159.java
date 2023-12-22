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
        int A[][] = new int[H][W];
        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int Q = sc.nextInt();
        int L[] = new int[Q];
        int R[] = new int[Q];
        for (int i = 0; i < Q; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        level:
        for (int a = 0; a < Q; a++) {
            ans = 0;
            int i, j = 0;
            lavel:
            for (i = 0; i < H; i++) {
                for (j = 0; j < W; j++) {
                    if (A[i][j] == L[a]) {
                        if (A[i][j] == R[a]) {
                            System.out.println("0");
                            continue level;
                        }
                        break lavel;
                    }
                }
            }
            ravel:
            while (A[i][j] != R[a]) {
                L[a] += D;
                for (int x = 0; x < H; x++) {
                    for (int y = 0; y < W; y++) {
                        if (A[x][y] == L[a]) {
                            ans += Math.abs(i - x) + Math.abs(j - y);
                            i = x;
                            j = y;
                            continue ravel;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
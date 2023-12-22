import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] a = new int[H][W];
        int c = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        String[] S = new String[H * W];
        if (c % 2 == 0) {
            System.out.println();
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (j < W - 1 && a[i][j] % 2 == 1) {
                    a[i][j]--;
                    a[i][j + 1]++;
                    S[c] = ((i + 1) + " " + (j + 1) + " " + (i + 1) + " " + (j + 2));
                    c++;
                } else if (j == W - 1 && a[i][j] % 2 == 1 && i != H - 1) {
                    a[i][j]--;
                    a[i + 1][j]++;
                    S[c] = ((i + 1) + " " + (j + 1) + " " + (i + 2) + " " + (j + 1));
                    c++;
                }
            }
        }
        System.out.println(c);
        for (int i = 0; i < c; i++) {
            System.out.println(S[i]);
        }
    }

}
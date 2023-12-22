import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] g = new int[15][15];
        // 初期化
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                g[i][j] = -1;
            }
        }
        // 証言
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt();
                g[i][x] = y;
            }
        }
        int ans = 0;
        for (int i = 0; i < (1 << n); ++i) {
            int[] d = new int[n];
            for (int j = 0; j < n; j++) {
                if ((i >> j & 1) == 1) {
                    d[j] = 1;
                }
            }
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (d[j] == 1) {
                    for (int k = 0; k < n; k++) {
                        if (g[j][k] == -1) continue;
                        if (g[j][k] != d[k]) flag = false;
                    }
                }
            }
            if (flag) {
                ans = Math.max(ans, Integer.bitCount(i));
            }
        }
        System.out.println(ans);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        for (int i = 0; i < h; i++) {
            String sa = sc.next();
            for (int j = 0; j < w; j++) {
                s[i][j] = sa.charAt(j);
            }
        }
        int[][] hc = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(hc[i], 0);
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] == '.') {
                    if (j == 0) {
                        hc[i][j] = 1;
                    } else {
                        hc[i][j] = hc[i][j - 1] + 1;
                    }
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = w - 1; j >= 0; j--) {
                if (s[i][j] == '.') {
                    if (j < w - 1) {
                        if (hc[i][j] < hc[i][j + 1]) {
                            hc[i][j] = hc[i][j + 1];
                        }
                    }
                }
            }
        }
        int[][] wc = new int[w][h];
        for (int i = 0; i < w; i++) {
            Arrays.fill(wc[i], 0);
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (s[j][i] == '.') {
                    if (j == 0) {
                        wc[i][j] = 1;
                    } else {
                        wc[i][j] = wc[i][j - 1] + 1;
                    }
                }
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = h - 1; j >= 0; j--) {
                if (s[j][i] == '.') {
                    if (j < h - 1) {
                        if (wc[i][j] < wc[i][j + 1]) {
                            wc[i][j] = wc[i][j + 1];
                        }
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans = Math.max(ans, hc[i][j] + wc[j][i] - 1);
            }
        }
        System.out.println(ans);
    }
}

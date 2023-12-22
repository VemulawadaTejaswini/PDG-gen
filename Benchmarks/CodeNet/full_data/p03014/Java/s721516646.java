import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map_s = new char[h][];
        for (int i = 0; i < h; i++) {
            char[] m = sc.next().toCharArray();
            map_s[i] = m;
        }
        boolean[][] map = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map_s[i][j] == '.')
                    map[i][j] = true;
            }
        }
        int[][] num_v = new int[h][w];
        int[][] num_h = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j]) {
                    num_v[i][j] = 1;
                    num_h[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w - 1; j++) {
                if (map[i][j + 1]) {
                    num_h[i][j + 1] += num_h[i][j];
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = w - 1; j > 0; j--) {
                if (map[i][j - 1]) {
                    num_h[i][j - 1] = Math.max(num_h[i][j - 1], num_h[i][j]);
                }
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h - 1; j++) {
                if (map[j + 1][i]) {
                    num_v[j + 1][i] += num_v[j][i];
                }
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = h - 1; j > 0; j--) {
                if (map[j - 1][i]) {
                    num_v[j - 1][i] = Math.max(num_v[j - 1][i], num_v[j][i]);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                max = Math.max(num_v[i][j] + num_h[i][j] - 1, max);
            }
        }
        System.out.println(max);

    }
}
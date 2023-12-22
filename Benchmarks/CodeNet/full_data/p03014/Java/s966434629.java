import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
        }

        int[][] row = new int[h][w];
        for (int r = 0; r < h; r++) {
            int cnt = 0;
            int start = 0;
            for (int c = 0; c < w; c++) {
                if (s[r][c] == '.') {
                    cnt++;
                    continue;
                }
                for (int i = start; i < c; i++) {
                    row[r][i] = cnt;
                }
                cnt = 0;
                start = c + 1;
            }
            if (start != w) {
                for (int i = start; i < w; i++) {
                    row[r][i] = cnt;
                }
            }
        }
        int[][] col = new int[h][w];
        for (int c = 0; c < w; c++) {
            int cnt = 0;
            int start = 0;
            for (int r = 0; r < h; r++) {
                if (s[r][c] == '.') {
                    cnt++;
                    continue;
                }
                for (int i = start; i < r; i++) {
                    col[i][c] = cnt;
                }
                cnt = 0;
                start = r + 1;
            }
            if (start != h) {
                for (int i = start; i < h; i++) {
                    col[i][c] = cnt;
                }
            }
        }

        int ans = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans = Math.max(ans, row[i][j] + col[i][j] - 1);
            }
        }
        System.out.println(ans);
    }

}

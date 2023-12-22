import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());

        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                s[i][j] = str.substring(j, j + 1);
            }
        }
        int[][] cnt = new int[h + 1][w + 1];
        for (int i = 0; i <= h; i++) {
            cnt[i][0] = 9999;
        }
        for (int i = 0; i <= w; i++) {
            cnt[0][i] = 9999;
        }
        cnt[0][1] = 0;
        cnt[1][0] = 0;
        if (s[0][0].equals("#")) {
            cnt[1][1] = 1;
        }
        for (int j = 1; j < w; j++) {
            cnt[1][j + 1] = cnt[1][j];
            if (!s[0][j - 1].equals(s[0][j])) {
                cnt[1][j + 1]++;
            }
        }
        for (int j = 1; j < h; j++) {
            cnt[j + 1][1] = cnt[j][1];
            if (!s[j - 1][0].equals(s[j][0])) {
                cnt[j + 1][1]++;
            }
        }

        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                if (!s[i][j].equals(s[i][j - 1])) {
                    cnt[i + 1][j]++;
                }
                if (!s[i][j].equals(s[i - 1][j])) {
                    cnt[i][j + 1]++;
                }
                cnt[i + 1][j + 1] = Math.min(cnt[i + 1][j], cnt[i][j + 1]);
            }
        }
        System.out.println((cnt[h][w] + 1) / 2);
        sc.close();
    }
}
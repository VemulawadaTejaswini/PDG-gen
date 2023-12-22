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
        int[][] cnt = new int[h][w];
        if (s[0][0].equals("#")) {
            cnt[0][0] = 1;
        }
        for (int j = 1; j < w; j++) {
            cnt[0][j] = cnt[0][j - 1];
            if (!s[0][j].equals(s[0][j - 1])) {
                cnt[0][j]++;
            }
        }
        for (int j = 1; j < h; j++) {
            cnt[j][0] = cnt[j - 1][0];
            if (!s[j][0].equals(s[j - 1][0])) {
                cnt[j][0]++;
            }
        }

        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                int a = cnt[i][j - 1];
                int b =  cnt[i - 1][j];

                if (!s[i][j].equals(s[i][j - 1])) {
                a++;
                }
                if (!s[i][j].equals(s[i - 1][j])) {
                    b++;
                }
                cnt[i][j] = Math.min(a, b);

            }

        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(cnt[i][j]);
            }
            System.out.println();
        }

        System.out.println((cnt[h - 1][w - 1] + 1) / 2);
        sc.close();
    }
}
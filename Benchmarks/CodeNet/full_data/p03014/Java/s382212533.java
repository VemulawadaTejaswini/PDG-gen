import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
        }

        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] == '#') {
                    continue;
                }
                int cnt = 1;
                for (int r = i + 1; r < h; r++) {
                    if (s[r][j] == '#') {
                        break;
                    }
                    cnt++;
                }
                for (int r = i - 1; r >= 0; r--) {
                    if (s[r][j] == '#') {
                        break;
                    }
                    cnt++;
                }
                for (int c = i + 1; c < w; c++) {
                    if (s[i][c] == '#') {
                        break;
                    }
                    cnt++;
                }
                for (int c = i - 1; c >= 0; c--) {
                    if (s[i][c] == '#') {
                        break;
                    }
                    cnt++;
                }
                max = Math.max(max, cnt);
            }
        }
        System.out.println(max);
    }

}

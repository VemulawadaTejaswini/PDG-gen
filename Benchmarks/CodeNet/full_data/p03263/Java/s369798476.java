import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] d = new int[h + 1][w + 1];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                d[i][j] = sc.nextInt();
            }
        }

        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i == h && j == w) {
                    continue;
                }
                int x = i;
                int y = 0;
                if (i % 2 == 1) {
                    y = j;
                } else {
                    y = w - j + 1;
                }
                if (d[x][y] % 2 == 0) {
                    continue;
                }
                if ((y == w && x % 2 == 1)) {
                    ans.add(String.format("%d %d %d %d", x, y, x + 1, y));
                    // System.out.printf("%d %d %d %d %n", x, y, x + 1, y);
                    d[x + 1][y]++;
                } else if ((y == 1 && x % 2 == 0)) {
                    ans.add(String.format("%d %d %d %d", x, y, x + 1, y));
                    // System.out.printf("%d %d %d %d %n", x, y, x + 1, y);
                    d[x + 1][y]++;
                } else if ((x % 2 == 1)) {
                    ans.add(String.format("%d %d %d %d", x, y, x, y + 1));
                    // System.out.printf("%d %d %d %d %n", x, y, x, y + 1);
                    d[x][y + 1]++;
                } else if ((x % 2 == 0)) {
                    ans.add(String.format("%d %d %d %d", x, y, x, y - 1));
                    // System.out.printf("%d %d %d %d %n", x, y, x, y - 1);
                    d[x][y - 1]++;
                }
            }
        }

        System.out.println(ans.size());
        for (String s : ans) {
            System.out.println(s);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] c = new char[H][W];
        boolean[][] bb = new boolean[H][W];

        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                c[i][j] = s.charAt(j);
            }
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (c[i][j] != '#') {
                    continue;
                }

                boolean b = false;
                for (int k = 0; k < 4; k++) {
                    int x = j + dx[k];
                    int y = i + dy[k];

                    if (x < 0 || x > W - 1) continue;
                    if (y < 0 || y > H - 1) continue;

                    if (c[y][x] == '#') {
                        b = true;
                        bb[i][j] = true;
                        break;
                    }
                }
                if (!b) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}
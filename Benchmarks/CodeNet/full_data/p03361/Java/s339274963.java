import java.util.*;

public class Main {

    static int H;
    static int W;
    static char[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        
        map = new char[H][W];

        for (int i = 0; i < H; i++) {
            map[i] = sc.next().toCharArray();
        }

        for (int y = 0; y < H; y++) {
            for (int x = 0; x < W; x++) {
                if (map[y][x] == '#') {
                    boolean isOk = false;
                    if (find(x + 1, y)) {
                        isOk = true;
                    }
                    if (find(x - 1, y)) {
                        isOk = true;
                    }
                    if (find(x, y + 1)) {
                        isOk = true;
                    }
                    if (find(x, y - 1)) {
                        isOk = true;
                    }

                    if (!isOk) {
                        System.out.println("No");
                        return;
                    }
                }

            }
        }

        System.out.println("Yes");
    }

    public static boolean find(int x, int y) {
        if (x < 0 || y < 0 || x >= W || y >= H) {
            return false;
        }

        return map[y][x] == '#';
    }
}

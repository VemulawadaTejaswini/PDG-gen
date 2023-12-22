import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            map[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] == '.') {
                    int count = count(map, i, j);
                    System.out.print(count);
                } else {
                    System.out.print(map[i][j]);
                }
            }

            System.out.println();
        }
    }

    int count(char[][] map, int y, int x) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (y == 0 && i == -1
                    || x == 0 && j == -1
                    || y == map.length - 1 && i == 1
                    || x == map[y +i].length - 1 &&j == 1) {
                    continue;
                }

                if (map[y + i][x +j] == '#') {
                    count++;
                }
            }
        }
        return count;
    }
}
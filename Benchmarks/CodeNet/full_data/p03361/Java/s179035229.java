import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h + 2][w + 2];
        for (int i = 0; i < h; i++) {
            Arrays.fill(map[i], '.');
        }
        for (int i = 1; i <= h; i++) {
            char[] lineChars = sc.next().toCharArray();
            for (int j = 1; j <= w; j++) {
                map[i][j] = lineChars[j - 1];
            }
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < w; j++) {
                if (map[i][j] == '#' && map[i + 1][j] == '.' && map[i - 1][j] == '.' && map[i][j + 1] == '.'
                        && map[i][j - 1] == '.') {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}
import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] grid = new char[H][W];
        String line = "";
        for (int i = 0; i < H; i++) {
            line = sc.next();
            for (int j = 0; j < W; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        sc.close();

        int tmp = -1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (grid[i][j] == '.') {
                    grid[i][j] = '0';
                } else if (grid[i][j] == '#') {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k < 0 || k >= H || l < 0 || l >= W) {
                                continue;
                            }

                            switch (grid[k][l]) {
                            case '#':
                                break;
                            case '.':
                                grid[k][l] = '1';
                                break;
                            default:
                                grid[k][l] = (char) (Character.getNumericValue(grid[k][l]) + 1 + '0');
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

    }
}
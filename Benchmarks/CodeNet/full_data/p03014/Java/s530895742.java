import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int HEIGHT;
    int WIDTH;

    private void solve() {
        Scanner sc = new Scanner(System.in);
        HEIGHT = sc.nextInt();
        WIDTH = sc.nextInt();

        char[][] masu = new char[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            String S = sc.next();
            char[] S_Array = S.toCharArray();
            int j = 0;
            for (char ch : S_Array) {
                masu[i][j] = ch;
                j++;
            }
        }
        int ans = 0;
        int[][] left  = getLeft(masu);
        int[][] right = getRight(masu);
        int[][] down  = getDown(masu);
        int[][] up    = getUp(masu);
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                int tmp = left[i][j] + right[i][j] + up[i][j] + down[i][j] - 3;
                ans = Math.max(ans, tmp);
            }
        }
        System.out.print(ans);
    }

    private int[][] getLeft(char[][] masu) {
        int[][] left = new int[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (masu[i][j] == '#') {
                    left[i][j] = 0;
                }
                else if (j == 0) {
                    left[i][j] = 1;
                }
                else {
                    left[i][j] = left[i][j - 1] + 1;
                }
            }
        }
        return left;
    }

    private int[][] getRight(char[][] masu) {
        int[][] right = new int[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = WIDTH - 1; j >= 0; j--) {
                if (masu[i][j] == '#') {
                    right[i][j] = 0;
                }
                else if (j == WIDTH - 1) {
                    right[i][j] = 1;
                }
                else {
                    right[i][j] = right[i][j + 1] + 1;
                }
            }
        }
        return right;
    }

    private int[][] getUp(char[][] masu) {
        int[][] up = new int[HEIGHT][WIDTH];
        for (int j = 0; j < WIDTH; j++ ) {
            for (int i = HEIGHT - 1; i >= 0 ; i--) {
                if (masu[i][j] == '#') {
                    up[i][j] = 0;
                }
                else if (i == HEIGHT - 1) {
                    up[i][j] = 1;
                }
                else {
                    up[i][j] = up[i + 1][j] + 1;
                }
            }
        }
        return up;
    }
    private int[][] getDown(char[][] masu) {
        int[][] down = new int[HEIGHT][WIDTH];
        for (int j = 0; j < WIDTH; j++ ) {
            for (int i = 0; i < HEIGHT; i++) {
                if (masu[i][j] == '#') {
                    down[i][j] = 0;
                }
                else if (i == 0) {
                    down[i][j] = 1;
                }
                else {
                    down[i][j] = down[i - 1][j] + 1;
                }
            }
        }
        return down;
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}

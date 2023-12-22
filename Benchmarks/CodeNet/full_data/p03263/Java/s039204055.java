import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] board = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        ArrayList<String> ans = new ArrayList<String>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W - 1; j++) {
                right(i, j, board, ans);
            }
            if (++i < H) {
                down(i - 1, W - 1, board, ans);
                for (int j = W - 1; j > 0; --j) {
                    left(i, j, board, ans);
                }
                if (i + 1 < H) {
                    down(i, 0, board, ans);
                }
            }
        }
        System.out.println(ans.size());
        for (String str : ans) {
            System.out.println(str);
        }
    }

    static void right(int i, int j, int[][] board, ArrayList<String> ans) {
        if (board[i][j] % 2 != 0) {
            board[i][j + 1]++;
            ans.add((i + 1) + " " + (j + 1) + " " + (i + 1) + " " + (j + 2));
        }
    }

    static void left(int i, int j, int[][] board, ArrayList<String> ans) {
        if (board[i][j] % 2 != 0) {
            board[i][j - 1]++;
            ans.add((i + 1) + " " + (j + 1) + " " + (i + 1) + " " + (j));
        }
    }

    static void down(int i, int j, int[][] board, ArrayList<String> ans) {
        if (board[i][j] % 2 != 0) {
            board[i + 1][j]++;
            ans.add((i + 1) + " " + (j + 1) + " " + (i + 2) + " " + (j + 1));
        }
    }
}
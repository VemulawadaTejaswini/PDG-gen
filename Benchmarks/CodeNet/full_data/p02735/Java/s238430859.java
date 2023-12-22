import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();

        int[][] board = new int[H][W];
        String row = sc.next();
        for (int j = 0; j < W; j++) {
            int cost = '.' == row.charAt(j) ? 0 : 1;
            if (j != 0) {
                cost += board[0][j - 1];
            }
            board[0][j] = cost;
        }
        for (int i = 1; i < H; i++) {
            row = sc.next();
            for (int j = 0; j < W; j++) {
                int cost = '.' == row.charAt(j) ? 0 : 1;
                if (j == 0) {
                    cost += board[i - 1][j];
                } else {
                    cost += board[i - 1][j] < board[i][j - 1] ? board[i - 1][j] : board[i][j - 1];
                }
                board[i][j] = cost;
            }
        }
        System.out.println(board[H - 1][W - 1]);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), w = in.nextInt();
        in.nextLine();
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            board[i] = in.nextLine().toCharArray();
        }
        int count = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == '#') {
                    count++;
                }
            }
        }
        if (count == h + w - 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}

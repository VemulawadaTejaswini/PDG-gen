import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dx [] = {1, 1, 0, -1, -1, -1, 0, 1};
        int dy [] = {0, 1, 1, 1, 0, -1, -1, -1};
        char[][] board = new char [50][50];
        int H = sc.nextInt();
        int W = sc.nextInt();

        for (int i=0; i<H; i++) {
            String s = sc.next();
            for(int j=0; j<W; j++) {
                board[i][j] = s.charAt(j); 
            }
        }

        for (int i=0; i<H; i++) {
            for(int j=0; j<W; j++) {
                if (board[i][j] == '.') {
                    int cnt = 0;
                    for (int k = 0; k < 8; k++) {
                        int x = i + dx[k];
                        int y = j + dy[k];
                        if (x >= 0 && x < H && y >= 0 && y < W && board[x][y] == '#') cnt++;
                    }
                    board[i][j] = (char) ('0' + cnt);
                }
            }
        }

        for (int i=0; i<H; i++) {
            for(int j=0; j<W; j++) {
                System.out.print(board[i][j]); 
            }
            System.out.println();
        }
    }
}
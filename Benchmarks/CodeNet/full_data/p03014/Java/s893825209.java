import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int H = 0;
        int W = 0;

        int[][] board;
        try (Scanner sc = new Scanner(System.in)) {
            H = sc.nextInt();
            W = sc.nextInt();
            board = new int[H][W];
            for (int i = 0; i < H; i++) {
                String s = sc.next();

                int w = 0;
                for (char c : s.toCharArray()) {
                    if (c == '#') {
                        board[i][w] = -1;
                    } else {
                        board[i][w] = 0;
                    }
                    w++;
                }
            }
        }
        //横
        int[][] boardW = new int[H][W];
        //縦
        int[][] boardH = new int[H][W];

        //横のライトのマスを各マス計算
        for (int h = 0; h < H; h++) {
            int temp1 = 0;
            int temp2 = 0;
            for (int w = 0; w < W; w++) {

                if (board[h][w] == 0) {
                    temp2 = w;
                }
                if (board[h][w] == 0 && w != W - 1) {
                    continue;
                }
                int max = (temp2 - temp1) + 1;
                //temp1～temp2までをmaxで更新する
                for (int n = temp1; n <= temp2; n++) {
                    if(board[h][n] == -1 ){
                        boardH[h][n] = 0;
                        continue;
                    }
                    boardW[h][n] = max;
                }
                temp1 = w + 1;
                temp2 = w + 1;

            }
        }

        //縦のライトのマスを各マス計算
        for (int w = 0; w < W; w++) {
            int temp1 = 0;
            int temp2 = 0;
            for (int h = 0; h < H; h++) {

                if (board[h][w] == 0) {
                    temp2 = h;
                }
                if (board[h][w] == 0 && h != H-1) {
                    continue;
                }
                int max = (temp2 - temp1) + 1;

                //temp1～temp2までをmaxで更新する
                for (int n = temp1; n <= temp2; n++) {
                    if(board[n][w] == -1 ){
                        boardH[n][w] = 0;
                        continue;
                    }
                    boardH[n][w] = max;
                }
                temp1 = h +1;
                temp2 = h +1;

            }
        }
        //
        int max = 0;
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                /*
                System.out.println("h,w:"+h+","+w);
                System.out.println("boardH:"+boardH[h][w]);
                System.out.println("boardW:"+boardW[h][w]);
                */
                int temp = (boardH[h][w] + boardW[h][w])-1;
                if (max < temp) {
                    max = temp;
                }
            }
        }
        System.out.println(max);

    }

}

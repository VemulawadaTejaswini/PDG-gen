import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] card = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                card[i][j] = sc.nextInt();
            }
        }

        boolean[][] open = new boolean[3][3];
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int call = sc.nextInt();

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (card[j][k] == call) {
                        open[j][k] = true;
                    }
                }
            }
        }
        sc.close();
        
        System.out.println(isBingo(open) ? "Yes" : "No");

    }

    static boolean isBingo(boolean[][] card) {

        //たて
        loop: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (card[i][j]) {
                    continue;
                } else {
                    continue loop;
                }
            }
            return true;
        }

        //よこ
        loop: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (card[j][i]) {
                    continue;
                } else {
                    continue loop;
                }
            }
            return true;
        }
        
        // ななめ
        if(card[0][0]&&card[1][1]&&card[2][2]) {
            return true;
        }
        if(card[0][2]&&card[1][1]&&card[2][0]) {
            return true;
        }
        
        return false;

    }

}

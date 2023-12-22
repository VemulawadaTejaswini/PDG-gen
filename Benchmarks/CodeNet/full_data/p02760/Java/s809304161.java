import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] board = new int[3][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        
        int k = sc.nextInt();
        while (k-- > 0) {
            int num = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == num) {
                        board[i][j] = -1;
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (board[i][0] == -1 && board[i][1] == -1 && board[i][2] == -1) {
                System.out.println("Yes");
                return;
            }
            if (board[0][i] == -1 && board[1][i] == -1 && board[2][i] == -1) {
                System.out.println("Yes");
                return;
            }
        }
        
        if (board[0][0] == -1 && board[1][1] == -1 && board[2][2] == -1) {
            System.out.println("Yes");
            return;
        }
        
        if (board[0][2] == -1 && board[1][1] == -1 && board[2][0] == -1) {
            System.out.println("Yes");
            return;
        }
        
        System.out.println("No");
        
    }
}

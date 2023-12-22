import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] board = new char[r + 2][c + 2];
        
        for (char[] b : board) {
            Arrays.fill(b, '.');
        }
        
        for (int i = 1; i <= r; i++) {
            String str = sc.next();
            for (int j = 1; j <= c; j++) {
                board[i][j] = str.charAt(j - 1);
            }
        }
        
        boolean canClear = true;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!check(board, i, j)) {
                    canClear = false;
                    break;
                }
            }
            
            if (!canClear) break;
        }
        
        if (canClear) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static boolean check(char[][] board, int i, int j) {
        // 自身の上下左右マスに#があればtrue
        
        if (board[i][j] == '.') return true;
        if (board[i - 1][j] == '#') return true;
        if (board[i + 1][j] == '#') return true;
        if (board[i][j - 1] == '#') return true;
        if (board[i][j + 1] == '#') return true;
        return false;
    }
}

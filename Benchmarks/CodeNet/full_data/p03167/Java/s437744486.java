import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] board = new int[rows][cols]; 
        scan.nextLine(); // read the new line char.

        for(int i = 0 ; i < rows ; i++){
            String s = scan.nextLine();
            for(int j = 0 ; j < cols ; j++) {
                board[i][j] = (s.charAt(j) == '#') ? -1 : 0;
            }
        }

        //Now board is ready. lets do the 2 way dfs.
        //dfs(board, 0, 0);
        System.out.println(dfs(board, 0, 0));//board[rows-1][cols-1]);
    }

    private static int dfs(int[][] board, int row, int col) {
        if(row >= board.length || row < 0 || col >= board[row].length || col < 0 || board[row][col] == -1) {
            return 0;
        }
        if(board[row][col] > 0) {
            return board[row][col];
        }
        if(row == board.length-1 && col == board[row].length-1) {
            return 1;
        }
        board[row][col] = (dfs(board, row+1, col) + dfs(board, row, col+1))%1000000007;
        return board[row][col];
    }
}

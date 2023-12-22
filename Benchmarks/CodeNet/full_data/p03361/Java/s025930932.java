import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
		for(int i = 0; i < R; i++)
          		grid[i] = sc.next().toCharArray();

        for(int i = 0; i < R; i++)
          	for(int j = 0; j < C; j++)
              if(grid[i][j] == '#') 
                if(adjacentBlack(grid, i, j, R, C) == 0) {
                	 System.out.println("No");
                  	 return;
                }
        System.out.println("Yes");
    }
  
  	 private static int adjacentBlack(char[][] gird, int row, int col, int R, int C) {
     	int[] rows = new int[]{1, -1, 0, 0};
        int[] cols = new int[]{0, 0, -1, 1};
       	int cnt = 0;
        for(int i = 0; i < rows.length; i++) {
        	int nextRow = row + rows[i];
            int nextCol = col + cols[i];
            if(0 <= nextRow && nextRow < R && 0 <= nextCol && nextCol < C && gird[nextRow][nextCol] == '#')
				cnt++;
        }
       return cnt;
     }
}
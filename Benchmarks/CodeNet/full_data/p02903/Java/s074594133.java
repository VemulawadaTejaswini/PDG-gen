import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] grid = new int[h][w];
        for(int i = 0; i < a; i++) {
        	for(int j = 0; j < b; j++) {
        		grid[i][j] = 1;
        	}
        }
        for(int i = b; i < h; i++) {
        	for(int j = a; j < w; j++) {
        		grid[i][j] = 1;
        	}
        }
        for(int i = 0; i < h; i++)
        	for(int j = 0; j < w; j++)
        		if(j == w - 1)
        			System.out.println(grid[i][j]);
        		else
        			System.out.print(grid[i][j] + " ");
    }
}

import java.lang.Math;
import java.io.*;
import java.util.*;
public class Main{
	static int minCost(int cost[][], int m, int n) 
    { 
        int i, j; 
        int tc[][]=new int[m+1][n+1]; 
  
        tc[0][0] = cost[0][0]; 
  
        for (i = 1; i <= m; i++) 
            tc[i][0] = tc[i-1][0] + cost[i-1][0]; 
  
        for (j = 1; j <= n; j++) 
            tc[0][j] = tc[0][j-1] + cost[0][j-1]; 
  
        for (i = 1; i <= m; i++) 
            for (j = 1; j <= n; j++) 
                tc[i][j] = Math.min(tc[i-1][j],tc[i][j-1]) + cost[i-1][j-1]; 
  
        return tc[m][n]; 
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] grid = new int[h][w];
		for(int i=0;i<h;++i){
			String s = sc.next();
			for(int j=0;j<w;++j){
				if (s.charAt(j) == '.')
					grid[i][j] = 0;
				else
					grid[i][j] = 1;
			}
		}
		System.out.println(minCost(grid,h,w));
	}
}
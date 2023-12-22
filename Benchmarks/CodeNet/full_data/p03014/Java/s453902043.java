import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    static char[][] grid;
    static int [][] dp_x;
    static int [][] dp_y;
    static int H;
    static int W;

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] HW = br.readLine().split(" ");
        H = Integer.parseInt(HW[0]);
        W = Integer.parseInt(HW[1]);
        
        grid = new char[H][W];
        dp_x = new int[H][W];
        dp_y = new int[H][W];
        
        for(int i = 0; i < H; i++){
            grid[i] = br.readLine().toCharArray();
        }
        
        int max = 0; 
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if ( grid[i][j] == '.' ){
                    max = Math.max(max, dfs(i, j));
                } else if (grid[i][j] == '#' ){
                    dp_x[i][j] = -1;
                    dp_y[i][j] = -1;
                }
            }
        }
        
        System.out.println(max);
    }
    
    static int dfs(int x, int y){
        int X = 1;
        int Y = 1;
        int rx = x;
        int ry = y;
        if ( x - 1 >= 0 && dp_x[x-1][y] != -1 ){
            X = dp_x[x-1][y];
            dp_x[x][y] = dp_x[x-1][y];
        } else {
            while ( rx < H && grid[rx][y] == '.' ){
                rx++;
            }
            X = rx - x;
            dp_x[x][y] = X;
        }
        
        if ( y - 1 >= 0 && dp_y[x][y-1] != -1 ){
            Y = dp_y[x][y-1];
            dp_y[x][y] = dp_y[x][y-1];
        } else {
            while ( ry < W && grid[x][ry] == '.' ){
                ry++;
            }
            Y = ry - y;
            dp_y[x][y] = Y;
        }
        
        return X + Y - 1;
    }
}

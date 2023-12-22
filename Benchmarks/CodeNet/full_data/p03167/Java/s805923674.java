

import java.util.Scanner;

public class Main {
    public static int[][] memo;
    public static char[][] grid;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        memo = new int[h+1][w+1];
        grid = new char[h+1][w+1];
        for(int i = 1; i <= h; i++){
            String row = scanner.next();
            for(int j = 1; j <= w; j++){
                memo[i][j] = 0;
                grid[i][j] = row.charAt(j-1);
            }
        }
        memo[1][1] = 1;
        System.out.println(grid(h,w));
    }

    public static int grid(int h, int w){
        if(h<1||w<1) return 0;
        if(grid[h][w]=='#') return 0;
        if(memo[h][w]!=0) return memo[h][w];
        int res = 0;
        res += grid(h-1, w) % 1000000007;
        res += grid(h, w-1) % 1000000007;
        memo[h][w] = res % 1000000007;
        return res % 1000000007;
    }
}

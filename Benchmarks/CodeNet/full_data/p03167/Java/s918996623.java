import java.util.*;

public class Main {
    private static final int MOD = (int) (1e9+7);
    private static int rows;
    private static int columns;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();
        columns = scanner.nextInt();
        char[][] grid = new char[rows][columns];
        for(int i = 0 ; i<rows ; ++i){
            grid[i] =scanner.next().toCharArray();
        }
        int res = 0;
        res = solve(grid,0,0);
        System.out.println(res);
    }
    private static int solve(char[][] grid,int x, int y){
        int res = 0;
        if(x>=rows||y>=columns||grid[x][y]=='#')
            return 0;
        if(x==rows-1 && y == columns-1)
            return 1;
        res = solve(grid, x+1,y)%MOD+solve(grid, x,y+1)%MOD;
        return res%MOD;
    }
}

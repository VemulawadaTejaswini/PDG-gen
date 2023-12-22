import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int ans = 0;
    static final int MOD = (int)1e9 + 7;
    public static void main(String[] args) {
        int H = sc.nextInt(), W = sc.nextInt();
        char[][] maze = new char[H + 1][W + 1];
        int[][] f = new int[H + 1][W + 1];
        f[1][1] = 1;
        for(int i = 1; i <= H; i ++){
            String s = sc.next();
            for(int j = 1; j <= W; j ++){
                maze[i][j] = s.charAt(j - 1);
            }
        }
        for(int i = 1; i <= H; i ++){
            for(int j = 1; j <= W; j ++){
                if(i == 1 && j == 1)continue;
                if(maze[i][j] == '.')f[i][j] = (f[i - 1][j] + f[i][j - 1]) % MOD;
            }
        }
        System.out.println(f[H][W]);
    }
}
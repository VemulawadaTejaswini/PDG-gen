import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] a = new int[H+2][W+2];
        int[][] b = new int[H+2][W+2];
        boolean[][][] dp = new boolean[H+1][W+1][((H+W)*80)+1];
        for(int i = 0; i<H+2; i++) {
            for(int j = 0; j<W+2; j++) {
                if(i==0||j==0||i==H+1||j==W+1) {
                    a[i][j] = -1;
                    continue;
                }
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<H+2; i++) {
            for(int j = 0; j<W+2; j++) {
                if(i==0||j==0||i==H+1||j==W+1) {
                    b[i][j] = -1;
                    continue;
                }
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i<H+1; i++) {
            for(int j = 1; j<W+1; j++) {
                if(i==1 && j ==1) {
                    int ini = Math.abs(a[i][j] - b[i][j]);
                    dp[i][j][ini] = true;
                }
                for(int k = 0; k<((H+W)*80); k++) {
                    if(i==1 && j ==1) {
                        continue;
                    }
                    if(a[i][j-1]>=0 && dp[i][j-1][k] == true) {
                        int plus = k + Math.abs(a[i][j] - b[i][j]);
                        int minus = Math.abs(k - Math.abs(a[i][j] - b[i][j]));
                        dp[i][j][plus] = true;
                        dp[i][j][minus] = true;
                    }
                    if(a[i-1][j]>=0 && dp[i-1][j][k] == true) {
                        int plus = k + Math.abs(a[i][j] - b[i][j]);
                        int minus = Math.abs(k - Math.abs(a[i][j] - b[i][j]));
                        dp[i][j][plus] = true;
                        dp[i][j][minus] = true;
                    }
                }
            }
        }
        for(int k = 0; k<((H+W)*80); k++) {
            if(dp[H][W][k]) {
                System.out.println(k);
                break;
            }
        }
    }
}
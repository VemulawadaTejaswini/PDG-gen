import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] list = new int[N];
        for(int i=0;i<N;i++){
            list[i] = Integer.parseInt(sc.next());
        }
        int[][] dp = new int[2][N];
        dp[0][0] = list[0];
        dp[1][0] = list[1];
        for(int i=1;i<N;i++){
            dp[0][i] = gcd(list[i], dp[0][i-1]);
            dp[1][i] = Math.max(gcd(list[i],dp[1][i-1]), dp[0][i-1]);
        }
        System.out.println(Math.max(dp[0][N-1], dp[1][N-1]));
    }
    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
}

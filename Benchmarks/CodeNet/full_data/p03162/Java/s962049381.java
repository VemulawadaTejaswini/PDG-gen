import java.util.*;
import java.io.*;

public class Main {
    static int[] swim;
    static int[] bugs;
    static int[] hw;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new FileWriter("vacation.in");
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("vacation.out");

        int n = sc.nextInt();
        swim = new int[n+1];
        bugs = new int[n+1];
        hw = new int[n+1];
        dp = new int[n+1][3];
        for(int x = 0; x<n+1; x++){
            Arrays.fill(dp[x], Integer.MIN_VALUE);
        }
        for(int x = 1; x<n+1; x++){
            swim[x] = sc.nextInt();
            bugs[x] = sc.nextInt();
            hw[x] = sc.nextInt();
        }

        System.out.println(Math.max(Math.max(hap(n, 0), hap(n, 1)), hap(n, 2)));

    }

    public static int hap(int n, int act){
        if(dp[n][act] != Integer.MIN_VALUE)
            return dp[n][act];
        if(n == 0)
            return dp[n][act] = 0;
        if(act == 0){
            return dp[n][act] = Math.max(hap(n-1, 1) + bugs[n], hap(n-1,2) + hw[n]);
        }
        else if(act == 1){
            return dp[n][act] = Math.max(hap(n-1, 0) + swim[n], hap(n-1,2) + hw[n]);
        }
        else
            return dp[n][act] = Math.max(hap(n-1, 0) + swim[n], hap(n-1,1) + bugs[n]);
    }
}

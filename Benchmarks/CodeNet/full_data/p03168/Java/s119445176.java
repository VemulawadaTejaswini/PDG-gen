import java.util.*;
import java.io.*;
public class Main {
    public static double dp[][] = new double[3005][3005];
    public static double arr[];
    public static double solve(int i , int x){
        if(x == 0) return 1;
        if(i == 0) return 0;

        // System.out.println( i + " " + x);

        if(dp[i][x] > -0.9) return dp[i][x];

        return dp[i][x] = (arr[i-1] * solve(i - 1 , x - 1)) + ((1 - arr[i-1]) * solve(i-1 , x));
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        arr = new double[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextDouble();
        }
        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(solve(n , (n+1)/2));
    }
}
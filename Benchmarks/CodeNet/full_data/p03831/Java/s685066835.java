import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();   
        }
        int[] dp = new int[n];
        for(int i = 1; i < n; i++){
            dp[i] = Math.min(dp[i-1] + a * (ar[i] - ar[i - 1]), 
                    dp[i-1] + b);
        }
        System.out.println(dp[n - 1]);
    }
}

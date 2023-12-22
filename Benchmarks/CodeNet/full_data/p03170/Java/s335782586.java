import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] sizes = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            sizes[i] = scan.nextInt();
        }

        // now we play the game in DP.
        boolean[] dp = new boolean[k+1];
        dp[0] = false;
        for(int i = 1 ; i <= k ; i++) {
            // we have to collect all statuses from sizes.
            boolean result = true;
            for(int j = 0 ; j < n ; j++) {
                if(i - sizes[j] >= 0) {
                    result = result && dp[i-sizes[j]]; // if all are false - we would have result = false.
                }
            }
            dp[i] = !result; // if all are false - we would win for sure.
        }
        System.out.println(dp[k] ? "First" : "Second");
    }
}

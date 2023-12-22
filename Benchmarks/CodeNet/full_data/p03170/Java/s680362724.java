import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        boolean[] dp = new boolean[k+1];
        dp[0] = false;
        for(int i = 1; i <= k; i++){
            for(int j = 0; j < n; j++){
                if(i < a[j]){
                    break;
                }else{
                    dp[i] = !dp[i - a[j]];
                    if(dp[i])
                        break;
                }
            }
        }
        System.out.println(dp[k] ? "First" : "Second");
    }
}

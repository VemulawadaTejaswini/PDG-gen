import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        int[] a = new int[N];
        for(int i = 0; i < N; i++) h[i] = sc.nextInt();
        for(int i = 0; i < N; i++) a[i] = sc.nextInt();
        //dp[i] ：一番右に残る花の高さがｉとなるときの美しさの総和の最大値
        long[] dp = new long[N+1];
        long ans = 0L;
        int idx = 0;
        for(int i = 0; i < N; i++){
            if(h[i] > h[idx]) {
                dp[h[i]] = ans + a[i];
                ans = dp[h[i]];
                idx = i;
            }else{
                for(int j = h[i]; j > 0; j--){
                    dp[h[i]] = Math.max(dp[h[i]], dp[j] + a[i]);
                    if(j < h[i] && dp[j] == ans) break;
                }
                ans = Math.max(ans, dp[h[i]]);
            }
        }
        System.out.println(ans);
        sc.close();
    }

}

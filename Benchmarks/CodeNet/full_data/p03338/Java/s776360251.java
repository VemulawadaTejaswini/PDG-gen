import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        sc.close();
        int[] alp = new int[26];
        int[] cnt = new int[N];
        for(int i = 0; i < N; i++){
            char s = S.charAt(i);
            alp[s - 97]++;
            cnt[i] = alp[s - 97];
        }
        int[] dp = new int[N+1];
        int ans = 0;
        for(int i = 0; i < N; i++){
            char s = S.charAt(i);
            if(cnt[i] == 1 && alp[s - 97] > 1) dp[i+1] = dp[i] + 1;
            else if(cnt[i] == 1 && alp[s - 97]== 1) dp[i+1] = dp[i];
            else if(cnt[i] > 1 && cnt[i] < alp[s - 97]) dp[i+1] = dp[i];
            else dp[i+1] = dp[i] -1;
            ans = Math.max(ans, dp[i+1]);
        }
        System.out.println(ans);

    }

}

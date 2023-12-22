import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        String S = sc.next();
        
        int[] dp = new int[N];
        dp[0] = 0;
        for(int i = 1; i < N; i++){
            if( S.charAt(i-1) == 'A' && S.charAt(i) == 'C' ){
                dp[i]++;
            }
            if(i != N-1) dp[i+1] = dp[i];
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Q; i++){
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            sb.append(dp[r] - dp[l]).append("\r\n");
        }
        
        System.out.println(sb.toString());
    }
}

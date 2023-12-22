import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        long[] a = new long[l];
        for(int i=0; i<l; i++) a[i] = sc.nextLong();

        long[][] dp = new long[l+1][5];
        Arrays.fill(dp[0], 0);

        for(int i=0; i<l; i++){
            long min1 = Math.min(dp[i][0], dp[i][1]);
            long min2 = Math.min(dp[i][2], min1);
            long min3 = Math.min(dp[i][3], min2);
            long min4 = Math.min(dp[i][4], min3);
            dp[i+1][0] = dp[i][0] + a[i];
            if(a[i] == 0){
                dp[i+1][1] = min1 + 2;
            }else{
                dp[i+1][1] = min1 + a[i]%2;
            }
            dp[i+1][2] = min2 + (a[i]+1)%2;
            if(a[i] == 0){
                dp[i+1][3] = min3 + 2;
            }else{
                dp[i+1][3] = min3 + a[i]%2;
            }
            dp[i+1][4] = min4 + a[i];
        }

        System.out.println(Arrays.stream(dp[l]).min().getAsLong());
    }
}
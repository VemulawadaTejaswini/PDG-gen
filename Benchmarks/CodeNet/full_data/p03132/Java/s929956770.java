import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int l= sc.nextInt();
		long[] a = new long[l];
		for(int i=0; i<l; i++) a[i] = sc.nextLong();
		
		long[][] dp = new long[l+1][2];
		
		dp[0][0] = dp[0][1] = 0;
		for(int i=0; i<l; i++) {
			long c = Math.abs(a[i] -1) % 2;
			dp[i+1][0] = Math.min(dp[i][0] + c, dp[i][1]);
			dp[i+1][1] = dp[i][1] + a[i];
		}
		
        out.println(Math.min(dp[l][0], dp[l][1]));
    }
}

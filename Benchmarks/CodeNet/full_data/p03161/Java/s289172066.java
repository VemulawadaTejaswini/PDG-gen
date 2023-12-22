import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(), k = in.nextInt();
		int[] a=new int[n];
		for (int i=0;i<n;++i) a[i]=in.nextInt();
		int[] dp = new int[n];
		for (int i=1;i<n;++i) {
                    dp[i] = dp[i-1] + Math.abs(a[i] - a[i-1]);
                    for(int j = 2; j <=k; j++) {
                        if(i - j < 0) {
                            break;
                     }
                    dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(a[i] - a[i-j]));
               }
        }
	System.out.println(dp[n-1]);
	}
}

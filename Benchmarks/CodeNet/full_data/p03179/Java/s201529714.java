import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		long mod=1000000007;
		long[][] dp=new long[n+1][n];
		long[] cum=new long[n+1];
		Arrays.fill(dp[1],1);
		for(int i=2; i<=n; i++){
			for(int j=1; j<=n-i+2; j++){
				cum[j]=(cum[j-1]+dp[i-1][j-1])%mod;
			}
			if(s.charAt(i-2)=='<'){
				for(int j=0; j<n-i+1;j++){
					dp[i][j]=(cum[n-i+2]-cum[j+1]+mod)%mod;
				}
			}else{
				for(int j=0; j<n-i+1;j++){
					dp[i][j]=cum[j+1];
				}
			}
		}
		System.out.println(dp[n][0]);
	}
}

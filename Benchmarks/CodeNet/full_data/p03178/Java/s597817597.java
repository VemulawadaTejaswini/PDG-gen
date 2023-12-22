import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String k=sc.next();
		int d=sc.nextInt();
		long mod=1000000007;
		long[][][] dp=new long[k.length()+1][d][2];
		//1がｋ未満
		dp[0][0][0]=1;
		for(int i=1; i<=k.length(); i++){
			int num=k.charAt(i-1)-'0';
			for(int j=0; j<d; j++){
				dp[i][(j+num)%d][0]=dp[i-1][j][0];
				for(int t=9; t>=0; t--){
					dp[i][(j+t)%d][1]=(dp[i][(j+t)%d][1]+dp[i-1][j][1])%mod;
					if(t<num){
						dp[i][(j+t)%d][1]=(dp[i][(j+t)%d][1]+dp[i-1][j][0])%mod;
					}
				}
			}
		}
		System.out.println((dp[k.length()][0][0]+dp[k.length()][0][1]-1+mod)%mod);
	}
}

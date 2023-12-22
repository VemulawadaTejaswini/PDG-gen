import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Main{
static int mod=(int)1e9+7;
static long dp[][]=new long[3001][3001];
public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		char s[]=scn.next().toCharArray();
		dp[n][0]=(s[n-2]=='>')?1:0;
		dp[n][1]=(s[n-2]=='<')?1:0;
		for(int i=n-1;i>=2;i--){
			int tot=n-i+1;
			for(int g=0;g<=tot;g++){
				if(g==0){
					dp[i][g]=0;
					if(s[i-2]=='<'){
						continue;
					}
					for(int j=1;j<=tot;j++){
						dp[i][g]=(dp[i][g]+dp[i+1][tot-j])%mod;
					}
				}
				else{
					if(s[i-2]=='<'){
						dp[i][g]=(dp[i][g-1]+dp[i+1][g-1])%mod;
					}
					else{
						dp[i][g]=(dp[i][g-1]-dp[i+1][g-1]+mod)%mod;
					}
				}
				
				
			}
			
		}
		long ans=0;
		for(int i=1;i<=n;i++){
			ans=(ans+dp[2][n-i])%mod;
		}
		System.out.println(ans);

	}

}
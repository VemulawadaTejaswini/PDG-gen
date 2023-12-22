import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int n=0;n<N;n++) a[n]=sc.nextInt();
        int[] b = new int[N];
        for(int n=0;n<N;n++) b[n]=sc.nextInt();
        
        int cost = 0;
        
        int[][] dp = new int[51][51];
        final int INF = 100;
        //dp[a][b]: max k to a->b
        for(int A=0;A<=50;A++)for(int B=0;B<=50;B++)dp[A][B]=INF;
        for(int A=0;A<=50;A++) dp[A][A]=0;
        for(int A=1;A<=50;A++) dp[A][0]=1;
        for(int k=1;k<=50;k++){
        	for(int A=0;A<=50;A++)for(int B=0;B<=50;B++){
        	    if(dp[A][B]>=k && dp[A%k][B]<=k) dp[A][B]=k;
        	}
        }
        
        BigInteger ans = BigInteger.ZERO;
        
        for(int k=50;k>=1;k--){
        	boolean used = false;
        	for(int n=0;n<N;n++){
        	    if(dp[a[n]][b[n]]==k){
        	        
        	        used = true;
        	    }
        	}
        	if(used){
        	    ans = ans.add(BigInteger.ONE.shiftLeft(k));
        	    for(int n=0;n<N;n++){
        	    	if(dp[a[n]][b[n]]>=dp[a[n]%k][b[n]]){a[n]=a[n]%k;}
        	    }
        	}
        }
        for(int n=0;n<N;n++) if(dp[a[n]][b[n]]==INF) ans=new BigInteger("-1");
        
        System.out.println(ans);
    }
}
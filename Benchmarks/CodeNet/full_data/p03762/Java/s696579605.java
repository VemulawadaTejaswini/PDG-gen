
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
		Scanner  sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
	int n=sc.nextInt();
	int m=sc.nextInt();
	long x[]=new long[n];
	long y[]=new long[m];
	for(int i=0;i<n;i++) {
		x[i]=sc.nextLong();
	}
	for(int i=0;i<m;i++) {
		y[i]=sc.nextLong();
	}
	Arrays.parallelSort(x);
	Arrays.parallelSort(y);
	
	long sum=0;
	for(int i=0;i<n;i++) {
		sum=(sum+i*x[i]-(n-1-i)*x[i])%mod;
			
		
	}
	long sum1=0;
	for(int i=0;i<m;i++) {
		sum1=(sum1+i*y[i]-(m-1-i)*y[i])%mod;
			
		
	}
	out.println((sum*sum1)%mod);
	out.flush();
	
}
	static long combi(int p,int q) {
		int dp[][]=new int[100001][3];
		for(int i=0;i<100001;i++) {
			dp[i][0]=1;
		}
	for(int i=0;i<3;i++) {
			dp[0][i]=0;
		}
	for(int i=1;i<10001;i++) {
		for(int j=0;j<=2;j++) {
			if(j==0||j==i) {
				dp[i][j]= 1;
			}else
			dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
		}
	}
	return dp[p][q];
	}
}
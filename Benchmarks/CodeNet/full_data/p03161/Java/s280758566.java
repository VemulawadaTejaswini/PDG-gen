
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s3=br.readLine().split(" ");
		int n=Integer.parseInt(s3[0].trim());
		int k=Integer.parseInt(s3[1].trim());
		String[] s=br.readLine().split(" ");
		int[] a=new int[n];
		int i=0;
		for(String s1:s) {
			a[i]=Integer.parseInt(s[i].trim());
			i++;
		}
		System.out.println(algo(a,n,k));
		
		
		

	}
	
	public static int algo(int[] a,int n,int k) {
		int[] dp=new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
//		dp[0]=0;
		dp[0]=0;
		for(int i=1;i<n;i++) {
			for(int k1=1;k1<=k;k1++) {
			if(i-k1>=0) {
				int x=dp[i-k1]+Math.abs(a[i]-a[i-k1]);
				dp[i]=Math.min(dp[i],x);
			}
			
			}
		}
		return dp[n-1];
		
	}
	
	
	
	

}

import java.util.Arrays;
import java.util.Scanner;

public class knap1 {
	public static int n,w;
	public static int [] wi,vi;
	public static int [][] dp;
	public static int maxpro(int pos,int rem)
	{   if(pos>=n)
			return dp[pos][rem]=0;
		if(dp[pos][rem]!=-1)
			return dp[pos][rem];
		int ex;
		int in=Integer.MIN_VALUE;
		if(rem-wi[pos]>=0)
			in=vi[pos]+maxpro(pos+1,rem-wi[pos]);
		ex=maxpro(pos+1,rem);
		return dp[pos][rem]=Math.max(in, ex);
	}
	
	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		w=in.nextInt();
		wi=new int[n];
		vi=new int[n];
		dp=new int[n+1][w+1];
		for(int i=0;i<n;i++)
			{ wi[i]=in.nextInt();
			  vi[i]=in.nextInt();
			}
		for(int i=0;i<=n;i++)
			Arrays.fill(dp[i],-1);
	
		System.out.println(maxpro(0,w));
	}

}

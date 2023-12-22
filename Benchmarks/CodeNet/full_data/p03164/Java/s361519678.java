import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static  long  w;
	public static int n;
	public static long  wi[],vi[];
	public static long [][] dp;
	public static long maxpro(int pos,long rem)
	{   if(pos>=n)
			return 0;
		if(dp[pos][(int) rem]!=-1)
			return dp[pos][(int) rem];
		long ex;
		long in=Integer.MIN_VALUE;
		if(rem-wi[pos]>=0)
			in=vi[pos]+maxpro(pos+1,rem-wi[pos]);
		ex=maxpro(pos+1,rem);
		//System.out.println("dp["+pos+"]["+rem+"]="+Math.max(in, ex));
		return dp[pos][(int) rem]=Math.max(in, ex);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		w=in.nextLong();
		wi=new long [n];
		vi=new long[n];
		dp=new long[n+1][(int) (w+1)];
		for(int i=0;i<n;i++)
			{ wi[i]=in.nextLong();
			  vi[i]=in.nextLong();
			}
		for(int i=0;i<=n;i++)
			Arrays.fill(dp[i],-1);
	
		System.out.print(maxpro(0,w));
	}

}

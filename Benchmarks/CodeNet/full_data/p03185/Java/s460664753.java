import java.util.*;
public class Main {
	static long[] h=new long[212345];
	static long[] dp=new long[212345];
	static boolean check(long H,int i,int j) {
		return dp[i]-dp[j]+h[i]*h[i]-h[j]*h[j]<(h[i]-h[j])*H*2;
	}
	static boolean check(int i,int j,int k) {
		long fi=dp[i]+h[i]*h[i];
		long fj=dp[j]+h[j]*h[j];
		long fk=dp[k]+h[k]*h[k];
		return (fi-fj)*(h[j]-h[k])>(fj-fk)*(h[i]-h[j]);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long C=in.nextLong();
		for (int i=0;i<n;++i) h[i]=in.nextLong();
		int[] deq=new int[n];
		int st=0,ed=0;
		deq[ed++]=0;
		for (int i=1;i<n;++i) {
			while (st+1<ed&&check(h[i],deq[st+1],deq[st])) ++st;
			dp[i]=dp[deq[st]]+(h[i]-h[deq[st]])*(h[i]-h[deq[st]])+C;
			while (st+1<ed&&check(deq[ed-2],deq[ed-1],i)) --ed;
			deq[ed++]=i;
		}
		System.out.println(dp[n-1]);
	}
}
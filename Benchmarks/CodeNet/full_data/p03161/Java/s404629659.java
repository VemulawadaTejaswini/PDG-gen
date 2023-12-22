import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;++i) {
			h[i]=sc.nextInt();
		}
		long cost[]=new long[n];
		Arrays.fill(cost, 1000000000L);
		cost[0]=0;
		for(int i=1;i<=k;++i) {
			cost[i]=Math.abs(h[i]-h[0]);
		}
		for(int i=2;i<n;++i) {
			for(int j=1;j<=k;++j)
			cost[i]=Math.min(cost[i],cost[i-j]+Math.abs(h[i-j]-h[i]));
		}
		
		System.out.println(cost[n-1]);
	}
}

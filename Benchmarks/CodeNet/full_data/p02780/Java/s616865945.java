import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt(),K=sc.nextInt(),p[]=new int[N],sum[]=new int[N+1];
		for(int i=0;i<N;i++) {
			p[i]=sc.nextInt()+1;
			if(i==0)sum[i]=0;
			sum[i+1]=sum[i]+p[i];
		}
		double ans=0;
		for(int i=0;i<=N-K;i++) {
			ans=Math.max(ans,sum[i+K]-sum[i]);
		}
		System.out.println((double)ans/2);
	}
}
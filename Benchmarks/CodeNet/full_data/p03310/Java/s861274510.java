package ABC102D;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		long sum[] = new long[n+1];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextLong();
			sum[i+1] = sum[i]+a[i];
		}
		long ans = 900100100100100100L;

		for(int i=2; i<=n-2; i++) {
			long min = 900100100100100100L;
			long max = -1;
			int m1=f(sum, 0, i);
			int m2=f(sum, i, n);
			//System.out.printf("%d %d %d %d \n", sum[m1], sum[i]-sum[m1], sum[m2]-sum[i], sum[n]-sum[m2]);
			min = Math.min(min, Math.min(Math.min(sum[m1],  sum[i]-sum[m1]), Math.min(sum[m2]-sum[i], sum[n]-sum[m2])));
			max = Math.max(max, Math.max(Math.max(sum[m1],  sum[i]-sum[m1]), Math.max(sum[m2]-sum[i], sum[n]-sum[m2])));
			ans = Math.min(ans, Math.abs(max-min));
		}
		System.out.println(ans);
		sc.close();
	}

	public int f(long a[],  int s, int t) {
		int p = -1;
		int l=s+1;
		int r=t-1;
		long S = a[t]-a[s];
		while(l<=r) {
			int m=(l+r)/2;
			long x = a[m]-a[s];
			if(x<S-x) {
				l=m+1;
			}
			if(x==S-x) {
				p=m;
				break;
			}
			if(x>S-x) {
				r=m-1;
			}
		}
		if(p==-1) {
			if(Math.abs((a[l]-a[s])-(a[t]-a[l])) < Math.abs((a[r]-a[s])-(a[t]-a[r]))) {
				p=l;
			}else {
				p=r;
			}
		}
		return p;
	}
}

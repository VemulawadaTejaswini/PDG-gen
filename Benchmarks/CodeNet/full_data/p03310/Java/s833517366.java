
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}

		int sum[] = new int[n+1];
		for(int i=0; i<n; i++) {
			sum[i+1]=sum[i]+a[i];
		}

		int min = -1;
		int max = 1001001001;
		for(int i=2; i<=n-2; i++) {
			int f1=s(sum, (sum[i]+sum[1]));
			int v1=sum[f1]-sum[0];
			int v2=sum[i]-sum[f1];
			int f2=s(sum, (sum[n]+sum[i]));
			int v3=sum[f2]-sum[i];
			int v4=sum[n]-sum[f2];
			min = Math.max(min, Math.min(Math.min(v1, v2), Math.min(v3, v4)))  ;
			max = Math.min(max, Math.max(Math.max(v1, v2), Math.max(v3, v4)))  ;
		}
		System.out.println(Math.abs(min-max));
		sc.close();
	}

	private int s(int a[], int t) {
		int l = -1;
		int r = a.length;
		while(l+1<r) {
			int m = (l+r)/2;
			if(a[m]*2<t) {
				l=m;
			}else {
				r=m;
			}
		}
		if(Math.abs(t-a[l]*2)<=Math.abs(t-a[r]*2)) {
			return l;
		}else {
			return r;
		}
	}

}

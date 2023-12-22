import java.util.*;

public class Main {
	static class Test {
		long b, l, u;

		public Test(long b, long l, long u) {
			this.b = b;
			this.l = l;
			this.u = u;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextInt();
		Test[] t = new Test[N];
		
		for(int i=0; i<N; i++)
			t[i] = new Test(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		Arrays.sort(t, new Comparator<Test>() {
			public int compare(Test t1, Test t2) {
				return - Long.compare((X-t1.b)*t1.u + t1.b*t1.l, (X-t2.b)*t2.u + t2.b*t2.l); 
			}
		});
		
		long[] v = new long[N];
		long[] sum = new long[N+1];
		for(int i=0; i<N; i++) {
			v[i] = t[i].b*t[i].l + (X-t[i].b)*t[i].u;
			sum[i+1] = sum[i] + v[i];
		}
		
		long aoki = 0;
		for(int i=0; i<N; i++) {
			aoki += t[i].b*t[i].l;
		}
		
		long ans = X*N;
		int border = Arrays.binarySearch(sum, aoki);
		if(border >= 0) {
			ans = X*border;
		} else {
			border = - border-1;
			for(int i=0; i<border; i++) {
				long rest = aoki-(sum[border]-v[i]);
				if(rest<=0) {
					ans = Math.min(ans, X*(border-1));
				} else if(rest<=t[i].b*t[i].l) {
					ans = Math.min(ans, X*(border-1) + (rest+t[i].l-1)/t[i].l);
				} else {
					rest -= t[i].b*t[i].l;
					ans = Math.min(ans, X*(border-1) + t[i].b + (rest+t[i].u-1)/t[i].u);
				}
			}
			for(int i=border; i<N; i++) {
				long rest = aoki-(sum[border-1]);
				if(rest<=t[i].b*t[i].l) {
					ans = Math.min(ans, X*(border-1) + (rest+t[i].l-1)/t[i].l);
				} else {
					rest -= t[i].b*t[i].l;
					ans = Math.min(ans, X*(border-1) + t[i].b + (rest+t[i].u-1)/t[i].u);
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}

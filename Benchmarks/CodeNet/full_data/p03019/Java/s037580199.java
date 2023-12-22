import java.util.*;

public class Main {
	static class Test {
		int b, l, u;

		public Test(int b, int l, int u) {
			this.b = b;
			this.l = l;
			this.u = u;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		Test[] test = new Test[N];
		
		for(int i=0; i<N; i++)
			test[i] = new Test(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		Arrays.sort(test, new Comparator<Test>() {
			public int compare(Test t1, Test t2) {
				return - Long.compare(((long)X-t1.b)*t1.u + t1.b*t1.l, ((long)X-t2.b)*t2.u + t2.b*t2.l); 
			}
		});
		
		long aoki = 0;
		for(int i=0; i<N; i++) {
			aoki += (long)test[i].b*test[i].l;
		}
		
		long takahashi = 0;
		
		long ans = 0;
		for(int i=0; i<N; i++) {
			if(takahashi + (long)X * test[i].u < aoki + (long)test[i].b*(test[i].u-test[i].l)) {
				takahashi += (long)X * test[i].u;
				aoki += (long)test[i].b*(test[i].u-test[i].l);
				ans += X;
			} else {
				long min = X;
				long diff = aoki - takahashi;
				for(int j=i; j<N; j++) {
					if(diff <= (long)test[j].l*test[j].b) {
						min = Math.min(min, (diff+test[j].l-1)/test[j].l);
					}
					if(diff + (long)test[j].b*(test[j].u - test[j].l) <= test[j].u*X) {
						min = Math.min(min, (diff + (long)test[j].b*(test[j].u - test[j].l) + test[j].u - 1)/test[j].u);
					}
				}
				ans += min;
				break;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}

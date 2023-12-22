import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = (int)sc.nextLong();
		long x = sc.nextLong();
		long a[] = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		
		long ans = 0;
		
		for(int i = 0; i < N; i++) {
			long sum = 0;
			if(i == 0) {
				sum = a[0] + a[1];
				if(sum > x) {
					if(x < a[1]) {
						ans += a[1] - x;
						a[1] = x;
					} else {
						ans += a[1] + a[0] - x;
						a[1] = 0;
						a[0] = x;
					}
				}
				continue;
			}
			if(i == N - 1) {
				sum = a[N - 2] + a[N - 1];
				if(sum > x) {
					if(x < a[N - 1]) {
						ans += a[N - 1] - x;
						a[N - 1] = x;
					} else {
						ans += a[N - 1] + a[N - 2] - x;
						a[N - 1] = 0;
						a[N - 2] = x;
					}
				}
				continue;
			}
			
			sum = a[i] + a[i + 1];
			if(sum > x) {
				if(x < a[i + 1]) {
					ans += a[i + 1] - x;
					a[i + 1] = x;
				} else {
					ans += a[i + 1] + a[i] - x;
					a[i + 1] = 0;
					a[i] = x;
				}
			}
			
			sum = a[i - 1] + a[i];
			if(sum > x) {
				if(x < a[i]){
					ans += a[i] - x;
					a[i] = x;
				} else {
					ans += a[i] + a[i - 1] - x;
					a[i] = 0;
					a[i - 1] = x;
				}
			}
		}
		System.out.println(ans);
	}
}

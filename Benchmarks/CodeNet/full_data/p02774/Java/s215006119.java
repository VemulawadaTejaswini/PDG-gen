import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();

		long a[] = new long[n];
		for (int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long l = Long.MIN_VALUE;
		long r = Long.MAX_VALUE;
		while (l+1 < r){
			long x = (l + r) / 2;

			long tot = 0;
			for (int i=0; i<n; i++){
				if (a[i] < 0){
					int lSub = -1;
					int rSub = n;
					while (lSub + 1 < rSub){
						int c = (lSub + rSub) / 2;
						if (a[c]*a[i] < x) {
							rSub = c;
						} else {
							lSub = c;
						}
					}
					tot += n - rSub;
				} else {
					int lSub = -1;
					int rSub = n;
					while (lSub+1 < rSub) {
						int c = (lSub + rSub) / 2;
						if (a[c]*a[i] < x) {
							lSub = c;
						} else {
							rSub = c;
						}
					}
					tot += rSub;
				}
				if (a[i]*a[i] < x) {
					tot--;
				}
			}
			tot /= 2;
			if (tot < k){
				l = x;
			} else {
				r = x;
			}
		}
		System.out.println(l);
	}
}
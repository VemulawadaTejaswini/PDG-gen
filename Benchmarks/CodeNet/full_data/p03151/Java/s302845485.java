import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int n = sc.nextInt();
		int[] a = new int[n];
		long sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			sum -= b[i];
		}
		if(sum < 0) {
			System.out.println(-1);
			return;
		}
		int d[] = new int[n];
		for(int i = 0; i < n; i++) {
			d[i] = a[i] - b[i];
		}
		Arrays.sort(d);
		int i, ii;
		int diff = 0;
		for(i = 0; i < n; i++) {
			if(d[i] >= 0) break;
			diff += d[i];
		}
		for(ii = n - 1; ii >= 0; ii--) {
			if(diff >= 0) break;
			diff += d[ii];
		}
		System.out.println(i + (n - 1 - ii));
		
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}

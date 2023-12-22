
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		long max = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			max = Math.max(max, a[i]);
		}
		long ans = 0;
		for(long i = max + k; i > 0; i--) {
			long tmp = 0;
			for(int j = 0; j < n; j++) {
				tmp += a[j] % i;
			}
			if(tmp % i == 0 && tmp / 2 <= k) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);

	}

}

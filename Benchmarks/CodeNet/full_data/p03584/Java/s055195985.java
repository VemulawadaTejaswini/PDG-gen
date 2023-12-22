import java.util.Scanner;

/**
 * http://tenka1-2017.contest.atcoder.jp/tasks/tenka1_2017_d
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final long K = sc.nextLong();
		final long[] a = new long[N];
		final long[] b = new long[N];
		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}
		sc.close();
		
		long ans = 0;
		for (int j=0; j<N; j++) {
			if( (a[j] & K) == a[j] ) ans +=b[j];
		}
		
		for (int i = 0; i <= 30; i ++) {
			long bit = 1<<i;
			if ((K & bit) != 0) {
				long x = (K^bit)|(bit-1);
				long sum = 0;
				for (int j=0; j<N; j++) {
					if( (a[j] & x) == a[j] ) sum+=b[j];
				}
				ans = Math.max(sum, ans);
			}
		}
		 
		System.out.println(ans);
		
	}
	
}

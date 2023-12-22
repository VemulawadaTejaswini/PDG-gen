import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();

		long[] a = new long[A];
		long min_a = Long.MAX_VALUE / 2;
		for(int i=0; i<A; i++) {
			a[i] = sc.nextLong();
			min_a = Math.min(min_a, a[i]);
		}

		long[] b = new long[B];
		long min_b = Long.MAX_VALUE / 2;
		for(int i=0; i<B; i++) {
			b[i] = sc.nextLong();
			min_b = Math.min(min_b, b[i]);
		}

		long ans = min_a + min_b;
		for(int i=0; i<M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			long c = sc.nextLong();

			ans = Math.min(ans, a[x-1]+b[y-1]-c);
		}


		System.out.println(ans);
	}

}

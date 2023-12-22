import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] x = new long[N];
		long[] y = new long[N];
		long[] z = new long[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			z[i] = sc.nextLong();
		}
		long[] m = new long[3];
		for(int i = 0; i < 1<<3; i++) {
			long[] total = new long[N];
			long ans1 = 0;
			for(int j = 0; j < 3; j++) {
				if((1 & i >> j) == 1)
					m[j] = -1;
				else
					m[j] = 1;
			}
			for(int j = 0; j < N; j++)
				total[j] = m[0]*x[j]+m[1]*y[j]+m[2]*z[j];
			Arrays.sort(total);
			for(int j = N-1; j > N-M-1; j--)
				ans1 += total[j];
			ans = Math.max(ans, ans1);
		}
		System.out.println(ans);

	}

}

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String K = sc.next();
		int d = sc.nextInt();

		long f[] = new long[d];
		long g[] = new long[d];
		g[0] = 1;

		for (int j = 0; j < K.length(); j++) {
			int x = K.charAt(j) - '0';
			long f1[] = new long[d];
			long g1[] = new long[d];
			for (int i = 0; i < d; i++) {
				long sumF = 0;
				long sumG = 0;
				for (int k = 0; k < 10; k++)
					sumF = (sumF + f[(i + d - (k % d)) % d])%1000000007;
				for (int k = 0; k < x; k++)
					sumG = (sumG + g[(i + d - (k % d)) % d]) %1000000007;
				f1[i] = sumF + sumG;
				g1[i] = g[(i + d - (x % d)) % d];
			}
			f = f1;
			g = g1;
		}
		System.out.println((f[0]+g[0]+1000000006)%1000000007);

	}

}

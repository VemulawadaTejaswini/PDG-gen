import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[][] ab = new long[N][2];
		for (int i = 0; i < N; i++) {
			ab[i][0] = sc.nextLong();
			ab[i][1] = sc.nextLong();
		}
		Arrays.sort(ab, (x, y) -> Long.compare(x[0], y[0]));
		for (int i = 0; i < ab.length; i++) {
			if (ab[0][1] >= K) {
				System.out.println(ab[i][0]);
				return;
			} else {
				K -= ab[i][1];
			}
		}
	}
}

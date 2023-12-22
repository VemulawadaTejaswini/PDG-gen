import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long D = sc.nextLong();
		long A = sc.nextLong();
		long[][] XH = new long[N][2];
		for (int i = 0; i < N; i++) {
			XH[i][0] = sc.nextLong();
			XH[i][1] = sc.nextLong();
		}

		Arrays.sort(XH, (a, b) -> Long.compare(a[0], b[0]));

		long[] B = new long[N];
		long currentBomb = 0;
		long answer = 0;
		for (int i = 0; i < N; i++) {
			if (i > 0) currentBomb -= B[i - 1];

			if (XH[i][1] <= 0) continue;

			long nBomb = (XH[i][1] / A) + ((XH[i][1] % A > 0) ? 1 : 0);
			if (currentBomb >= nBomb) continue;
			answer += (nBomb - currentBomb);

			int l = i;
			int r = N;
			while (r - l > 1) {
				int m = (l + r) / 2;
				if (XH[m][0] <= 2 * D + XH[i][0]) {
					l = m;
				} else {
					r = m;
				}
			}
			B[l] += (nBomb - currentBomb);
			currentBomb = nBomb;
		}

		System.out.println(answer);
	}
}

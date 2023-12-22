package abc.abc117;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通りに作成したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long k = scanner.nextLong();
			int max = getMaxBit(k);
			int[] c = new int[max];
			long[] a = IntStream.range(0, n).mapToLong(i -> scanner.nextLong()).toArray();
			Arrays.stream(a)
					.forEach(ai -> IntStream.range(0, max).forEach(j -> c[j] += ((ai & (1L << j)) > 0) ? 1 : 0));
			long x = 0L;
			for (int i = 0; i < max; i++) {
				if (c[i] > n - c[i]) {
					// x_iは0
					;
				} else {
					// x_iは1
					if ((x + (1L << i)) > k) {
						break;
					} else {
						x += 1L << i;
					}
				}
			}
			long x2 = x;
			System.out.println(Arrays.stream(a).map(ai -> ai ^ x2).sum());
		}
	}

	/**
	 * kの最大のbitの箇所を取得する
	 * 
	 * @param k
	 * @return kの最大のbitの箇所
	 */
	private static int getMaxBit(long k) {
		int count = 0;
		while (k > 0) {
			count++;
			k >>= 1;
		}
		return count;
	}
}

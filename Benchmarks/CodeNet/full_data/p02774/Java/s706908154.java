import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		final long K = scanner.nextLong();
		long[] A = new long[N];

		int nega = 0;
		int posi = 0;

		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
			if (A[i] < 0)
				nega++;
			else if (A[i] > 0)
				posi++;
		}
		Arrays.parallelSort(A);

		//XがK番目に小さい<=>X未満のものはK個未満,X以下のものはK個以上
		//f(Y):=(Y以下のものの個数)
		//f(Y<X)<K,f(Y>=X)>=K

		long inf = -1000000000000000001l;
		long max = 1000000000000000000l;
		long mid;
		long value;
		while (max - inf > 1) {
			mid = (inf + max) / 2;
			value = countLeq(A, mid, N, nega, posi);

			//System.out.println(mid + "以下は" + value + "個");

			if (value < K) {
				inf = mid;
			} else {
				max = mid;
			}
		}

		System.out.println(max);
		return;
	}

	static long countLeq(long[] a, long product, int size, int nega, int posi) {

		long count = 0;

		if (product < 0) {

			int left = 0;
			int right = size - posi;
			while (left < nega) {
				if (a[left] * a[right] > product)
					if (right == size - 1)
						break;
					else
						right++;
				else {
					count += size - right;
					left++;
				}
			}

		} else {
			count += comb(size) - comb(nega) - comb(posi);
			if (product > 0) {
				//negative*negative
				int left = 0;
				int right = nega - 1;

				while (left < right) {
					if (a[left] * a[right] > product)
						left++;
					else {
						count += right - left;
						right--;
					}
				}
				//positive*positive
				left = size - posi;
				right = size - 1;

				while (left < right) {
					if (a[left] * a[right] > product)
						right--;
					else {
						count += right - left;
						left++;
					}
				}
			}
		}

		return count;
	}

	static long comb(int n) {
		return (long) n * (n - 1) / 2;
	}

}

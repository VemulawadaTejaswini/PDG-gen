import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static int Combination(int n, int k) {
		if (n == 0) {
			return n;
		} else {
			return Combination(n - 1, k - 1) + n;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		int a = 267327086;
		int m = 1000000007;
		Set<BigInteger> set = new HashSet<BigInteger>();
		//
		//		BigInteger result = BigInteger.valueOf(a);
		//		for (int i = 0; i < N; i++) {
		//			for (int j = 0; j < K; j++) {
		//
		//			}
		//			result = result.multiply(BigInteger.valueOf(K)).mod(BigInteger.valueOf(m));
		//			set.add(result);
		//		}
		BigInteger min = BigInteger.valueOf(1000);
		BigInteger max = BigInteger.valueOf(0);
		if (N < K) {
			System.out.println(1);
		} else {
			for (int i = K; i >= 1; i--) {//いくつ選ぶか
				BigInteger sum = BigInteger.valueOf((0 + N - i)).multiply(BigInteger.valueOf((N - i + 1) / 2))
						.mod(BigInteger.valueOf(m));//min
				if (min.compareTo(sum) > 0) {
					min = sum;
				}
				sum = BigInteger.valueOf(((N - i + 1) + N)).multiply(BigInteger.valueOf((N - i + 1) / 2))
						.mod(BigInteger.valueOf(m));
				if (max.compareTo(sum) < 0) {
					max = sum;
				}
				//			set.add(BigInteger.valueOf(max - min + 1));
			}

			//		System.out.println(set.size());
			System.out.println(max);
			System.out.println(min);
			System.out.println((max.subtract(min).add(BigInteger.valueOf(1).mod(BigInteger.valueOf(m)))));
		}
		/*	int n = 100;
			int m = 1000000007;
			BigInteger result = BigInteger.valueOf(10);

			for (int i = 0; i < n; i++) {
				result = result.multiply(BigInteger.valueOf(10));
				result = result.mod(BigInteger.valueOf(m));
				//			System.out.println(result);
			}
			System.out.println(result);
			*/
	}
}

import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		long k = sc.nextLong();
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		long maxSum =0;
		for (int i = 0; i < k; i++) {
			long tempSum=0;
			for (int j = 0; j < n; j++) {
				tempSum += xor(list.get(j),i);
			}
			maxSum = Math.max(tempSum, maxSum);
		}
		System.out.println(maxSum);
	}

	private static long xor(long x, long a) {
		return x ^ a;
	}

}

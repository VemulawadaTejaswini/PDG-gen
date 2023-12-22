import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kInput = sc.nextInt();
		int k = Math.min(kInput, n - kInput);
		ArrayList<Long> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		IntStream.rangeClosed(k - 1, n - 1).forEach(i -> map.put(i, nCk(i, k - 1, 1000000007)));
		long sumMax = 0;
		long sumMin = 0;
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		Collections.sort(list);

		for (int i = k - 1; i < n; i++) {
			long tmp = list.get(i) * map.get(i);
			sumMax = sumLong(sumMax, tmp);
		}
		for (int i = 0; i < n - k + 1; i++) {
			long tmp = list.get(i) * map.get(n - i - 1);
			sumMin = sumLong(sumMin, tmp);
		}
		long sum = sumMax - sumMin;
		print(sum >= 0 ? sum : sum + 1000000007);
		sc.close();
	}

	public static int nCk(int n, int k, int M) {
		long ret = 1;
		int min = Math.min(k, n - k);
		for (int i = 1; i <= min; i++) {
			ret = (ret * pow(i, M - 2, M)) % M;
		}
		for (int i = n - min + 1; i <= n; i++) {
			ret = (ret * i) % M;
		}
		return (int) ret;
	}

	// return a^b mod M O(logB)
	public static long pow(long a, long b, int M) {
		long ret = 1;
		long tmp = a;
		while (b > 0) {
			if ((b & 1) == 1)
				ret = (ret * tmp) % M;
			tmp = (tmp * tmp) % M;
			b = b >> 1;
		}
		return ret;
	}

	public static long sumLong(long long1, long long2) {
		return (long1 + long2) % 1000000007;
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}

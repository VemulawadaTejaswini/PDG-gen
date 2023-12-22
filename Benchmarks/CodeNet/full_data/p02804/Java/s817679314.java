import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		// IntStream.rangeClosed(k, n - 2).forEach(i -> map.put(i, nCk(i, k - 2,
		// 1000000007)));
		map.put(k - 2, nCk(k - 2, k - 2, 1000000007));
		for (int i = k - 1; i < n - 1; i++) {
			if (i - k > 2) {
				map.put(i, ((map.get(i - 1) * (i)) / (i - k - 2)) % 1000000007);
			} else {
				map.put(i, nCk(i, k - 2, 1000000007));
			}
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		for (int i = 0; i < n; i++) {
			for (int j = i + k - 1; j < n; j++) {
				int subtract = j - i;
				long weight = map.get(subtract - 1);
				sum = sumLong(sum, weight * (list.get(j) - list.get(i)));
			}
		}
		print(sum);
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
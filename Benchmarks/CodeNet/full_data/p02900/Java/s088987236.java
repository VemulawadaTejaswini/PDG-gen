import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ab = gcd(a, b);
		int n = (int) Math.sqrt(ab) + 2;
		boolean[] f = new boolean[n];
		Arrays.fill(f, false);

		Set<Integer> ad = divider(a, ab);
		Set<Integer> bd = divider(b, ab);
		long[] ds = new long[Math.min(ad.size(), bd.size())];
		int count = 0;
		for (int i = 2; i < f.length; i++) {
			if (ad.contains(i) && bd.contains(i)) {
				ds[count++] = i;
			}
		}

		//for (int i = 0; i < count; i++) {
		//	System.out.println(ds[i]);
		//}
		int answer = 1;
		for (int i = 0; i < count; i++) {
			if (ds[i] == 0) continue;
			answer++;
			for (int j = i + 1; j < count; j++) {
				if (ds[j] % ds[i] == 0) ds[j] = 0;
			}
		}
		System.out.println(answer);
	}


	private static Set<Integer> divider(long x, long max) {
		Set<Integer> a = new HashSet<>();
		for (long i = 1; i * i < x || i <= max; i++) {
			if (x % i == 0) a.add((int) i);
		}
		return a;
	}

	private static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}

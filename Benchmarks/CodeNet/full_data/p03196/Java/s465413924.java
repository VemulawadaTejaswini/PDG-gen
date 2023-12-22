import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long n = sc.nextLong();
		long p = sc.nextLong();
		if (n == 1) {
			System.out.println(p);
			return;
		}
		HashMap<Long, Integer> hm = new HashMap<>();
		long x = 2;
		int cnt;
		hm.put(p, 1);
		while (p >= x) {
			cnt = 0;
			while (p % x == 0) {
				cnt++;
				p = p / x;
			}
			if (cnt > 0) {
				hm.put(x, cnt);
			}
			if (x == 2) {
				x++;
			} else {
				x = x + 2;
			}
		}
		long ans = 1;
		long t;
		for (long i : hm.keySet()) {
			t = hm.get(i) / n;
			if (t > 0) {
				ans = ans * i * t;
			}
		}
		System.out.println(ans);
	}
}
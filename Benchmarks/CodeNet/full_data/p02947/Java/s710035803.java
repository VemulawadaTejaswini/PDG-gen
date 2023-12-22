import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		HashMap<Long, Long> map = new HashMap<>();
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			char[] cs = sc.next().toCharArray();
			int[] a = new int[cs.length];
			for (int j = 0; j < a.length; ++j)
				a[j] = cs[j] - 'a';
			Arrays.sort(a);
			long add = 0;
			for (int j = 0; j < a.length; ++j) {
				add = add * 26 + a[j];
			}
			if (map.containsKey(add)) {
				map.put(add, map.get(add) + 1);
			} else {
				map.put(add, (long) 1);
			}
		}
		long ans = 0;
		for (java.util.Map.Entry<Long, Long> entry : map.entrySet()) {
			long v = entry.getValue();
			ans += v * (v - 1) / 2;
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}

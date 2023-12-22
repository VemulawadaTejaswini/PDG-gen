import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeMap<Long, Long> x = new TreeMap<Long, Long>();
		long ans = 0;

		for (int i = 0; i < n; i++) {
			Long a = sc.nextLong();
			Long b = sc.nextLong();
			if (x.get(a) != null) {
				x.put(a, x.get(a) + b);
			} else {
				x.put(a, b);
			}
		}
		
		for (Long key:x.keySet()) {
			if (x.get(key) <= m) {
				ans += key * x.get(key);
				m -= x.get(key);
			} else {
				ans += key * m;
				break;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}

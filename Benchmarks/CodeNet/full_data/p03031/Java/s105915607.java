import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, Set> lists = new HashMap<>();
		for (int i = 1; i <= M; i++) {
			int kn = sc.nextInt();
			Set<Integer> set = new HashSet<>();
			for (int j = 1; j <= kn; j++) {
				set.add(sc.nextInt());
			}
			lists.put(i, set);
		}
		Map<Integer, Integer> pMap = new HashMap<>();
		for (int i = 1; i <= M; i++) {
			pMap.put(i, sc.nextInt());
		}
		sc.close();
		int max = (int) Math.pow(2, (double) N);
		int ans = 0;
		for (int i = 0; i < max; i++) {
			String binary = Integer.toBinaryString(i);
			int len = binary.length();
			Map<Integer, Integer> ls = new HashMap<>();
			for (int k = 1; k <= M; k++) {
				ls.put(k, 0);
			}
			for (int j = 1; j <= len; j++) {
				for (int k = 1; k <= M; k++) {
					int tmp = ls.get(k);
					if (binary.charAt(len - j) == '1') {
						if (lists.get(k).contains(j)) {
							ls.put(k, tmp + 1);
						}
					}
				}
			}
			boolean bl = true;
			for (int k = 1; k <= M; k++) {
				if (ls.get(k) % 2 != pMap.get(k)) {
					bl = false;
				}
			}
			if (bl) {
				ans++;
			}

		}
		System.out.println(ans);
	}
}
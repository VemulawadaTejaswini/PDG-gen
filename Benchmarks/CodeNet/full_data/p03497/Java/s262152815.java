import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int k = sc.nextInt();
		HashMap<Integer, Integer> hm = new HashMap<>();
		int a;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (hm.containsKey(a)) {
				hm.put(a, hm.get(a) + 1);
			} else {
				hm.put(a, 1);
			}
		}

		if (hm.size() <= k) {
			System.out.println(0);
		} else {
			int[] s = new int[hm.size()];
			int idx = 0;
			for (int i : hm.keySet()) {
				s[idx] = hm.get(i);
				idx++;
			}
			Arrays.sort(s);
			int ans = 0;
			for (int i = 0; i < hm.size() - k; i++) {
				ans += s[i];
			}
			System.out.println(ans);
		}

	}
}
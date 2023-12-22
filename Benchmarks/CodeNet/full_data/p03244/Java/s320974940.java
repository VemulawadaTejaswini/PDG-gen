import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		Map<Integer, Integer> mp1 = new HashMap<>();
		Map<Integer, Integer> mp2 = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				if (mp1.containsKey(v[i])) {
					mp1.put(v[i], mp1.get(v[i]) + 1);
				} else {
					mp1.put(v[i], 1);
				}
			} else {
				if (mp2.containsKey(v[i])) {
					mp2.put(v[i], mp2.get(v[i]) + 1);
				} else {
					mp2.put(v[i], 1);
				}
			}
		}
		int max1 = 0, max2 = 0;
		for (Integer val : mp1.values()) {
			max1 = Math.max(max1, val);
		}
		for (Integer val : mp2.values()) {
			max2 = Math.max(max2, val);
		}
		sc.close();
		System.out.println(n - max1 - max2);
	}
}

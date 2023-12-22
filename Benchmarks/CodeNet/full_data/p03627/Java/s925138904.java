import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static int acnt = 0, bcnt = 0;
	static boolean memo[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		HashMap<Integer, Integer> hm = new HashMap<>();
		int a, b = 0, c = 0;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (hm.containsKey(a)) {
				hm.put(a, hm.get(a) + 1);
			} else {
				hm.put(a, 1);
			}
		}
		for (int i : hm.keySet()) {
			if (hm.get(i) >= 2) {
				b = Math.max(b, i);
			}
		}
		if (hm.containsKey(b)) {
			hm.put(b, hm.get(b) - 2);
		}
		for (int i : hm.keySet()) {
			if (hm.get(i) >= 2) {
				c = Math.max(c, i);
			}
		}
		if (hm.containsKey(c)) {
			hm.put(c, hm.get(c) - 2);
		}
		System.out.println(b * c);
	}
}

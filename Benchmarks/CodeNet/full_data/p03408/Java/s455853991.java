import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> hm = new HashMap<>();
		String str;
		for (int i = 0; i < n; i++) {
			str = sc.next();
			if (hm.containsKey(str)) {
				hm.put(str, hm.get(str) + 1);
			} else {
				hm.put(str, 1);
			}
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			str = sc.next();
			if (hm.containsKey(str)) {
				hm.put(str, hm.get(str) - 1);
			} else {
				hm.put(str, -1);
			}
		}
		int max = 0;
		for (String s : hm.keySet()) {
			max = Math.max(max, hm.get(s));
		}
		System.out.println(max);
	}
}

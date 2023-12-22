import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> mp = new HashMap<>();
		int N = sc.nextInt();
		String s[] = new String[N];
		for (int i = 0; i < N; i++) {
			s[i] = sc.next();
			if (mp.containsKey(s[i])) {
				mp.put(s[i], mp.get(s[i]) + 1);
			} else {
				mp.put(s[i], 1);
			}
		}

		int M = sc.nextInt();
		String t[] = new String[M];
		for (int i = 0; i < M; i++) {
			t[i] = sc.next();
			if (mp.containsKey(t[i])) {
				mp.put(t[i], mp.get(t[i]) - 1);
			}
		}
		sc.close();

		int max = 0;
		for (Integer val : mp.values()) {
			max = Math.max(max, val);
		}
		System.out.println(max);
	}
}

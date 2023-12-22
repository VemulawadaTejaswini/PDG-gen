import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];
		Map<String, Integer> mp = new HashMap<>();

		for (int i = 0; i < N; i++) {
			s[i] = sc.next();
			char[] c = s[i].toCharArray();
			Arrays.sort(c);
			String key = new String(c);
			if (mp.containsKey(key)) {
				mp.put(key, mp.get(key) + 1);
			} else {
				mp.put(key, 1);
			}
		}
		sc.close();

		int ans = 0;

		for (Integer val : mp.values()) {
			ans += (val * (val - 1)) / 2;
		}
		System.out.println(ans);
	}
}

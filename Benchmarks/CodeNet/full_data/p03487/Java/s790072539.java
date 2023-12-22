import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Map<Integer, Integer> m = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			int c = 0;
			if (m.containsKey(a))
				c = m.get(a);
			m.put(a, c + 1);
		}
		int ans = 0;
		for (Integer i:m.keySet()) {
			int c = m.get(i);
			if (c < i)
				ans += c;
			else
				ans += c - i;
		}
		System.out.println(ans);
	}
}
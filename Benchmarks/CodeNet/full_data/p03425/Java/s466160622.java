import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String s[] = new String[N];
		Map<Character, Long> map = new HashMap<>();
		map.put('M', 0L);
		map.put('A', 0L);
		map.put('R', 0L);
		map.put('C', 0L);
		map.put('H', 0L);
		for (int i = 0; i < N; i++) {
			char c = sc.next().charAt(0);
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
		}
		int cnt = 0;
		int idx = 0;
		ArrayList<Long> w = new ArrayList<>();
		for (Entry<Character, Long> e : map.entrySet()) {
			if (e.getValue()!=0) {
				w.add(e.getValue());
				cnt++;
				idx++;
			}
		}
		if (cnt<=2) {
			System.out.println(0);
			return;
		}
		long ans = 0;
		if (cnt == 3) {
			for (int i = 0; i < w.size(); i++) {
				ans *= w.get(i);
			}
			System.out.println(ans);
			return;
		}

		if (cnt == 4) {
			long tmp = 1;
			for (int i = 0; i < w.size(); i++) {
				tmp *= w.get(i);
			}
			for (int i = 0; i < w.size(); i++) {
				ans += tmp/w.get(i);
			}
			System.out.println(ans);
		}

		if (cnt == 5) {
			long tmp = 1;
			for (int i = 0; i < w.size(); i++) {
				tmp *= w.get(i);
			}
			long d[] = new long[10];
			int index = 0;
			for (int i = 0; i < w.size(); i++) {
				for (int j = 0; j < w.size(); j++) {
					if (i<=j) {
						break;
					}
					d[index] = w.get(i)*w.get(j);
					index++;
				}
			}
			for (int i = 0; i < d.length; i++) {
				ans += tmp/d[i];
			}
			System.out.println(ans);
		}
	}
}

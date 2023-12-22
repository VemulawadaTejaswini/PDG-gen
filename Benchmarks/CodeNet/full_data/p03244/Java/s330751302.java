
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> a = new HashMap<>();
		Map<Integer, Integer> b = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if(i % 2 == 0) {
				if(a.containsKey(tmp)) {
					int val = a.get(tmp);
					a.put(tmp, val + 1);
				} else {
					a.put(tmp, 1);
				}
			} else {
				if(b.containsKey(tmp)) {
					int val = b.get(tmp);
					b.put(tmp, val + 1);
				} else {
					b.put(tmp, 1);
				}
			}
		}
		int ans = 0;
		int max = 0;
		for(Map.Entry<Integer, Integer> e : a.entrySet()) {
			max = Math.max(max, e.getValue());
		}
		ans += n / 2 - max;
		max = 0;
		for(Map.Entry<Integer, Integer> e : b.entrySet()) {
			max = Math.max(max, e.getValue());
		}
		ans += n / 2 - max;
		System.out.println(ans);
	}

}
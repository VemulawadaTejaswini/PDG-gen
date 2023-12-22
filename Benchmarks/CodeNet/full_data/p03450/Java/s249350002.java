
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, Map<Integer, Long>> list = new HashMap<>();
		for(int i = 1; i < n + 1; i++) {
			list.put(i, new HashMap<>());
		}
		boolean ans = true;
		for(int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			long d = sc.nextLong();
			Map<Integer, Long> lp = list.get(l);
			Map<Integer, Long> rp = list.get(r);
			if(lp.containsKey(r)) {
				if(lp.get(r) != d) {
					ans = false;
					break;
				}
			} else {
				lp.put(r, d);
			}
			if(rp.containsKey(lp)) {
				if(rp.get(l) != -d) {
					ans = false;
					break;
				}
			} else {
				rp.put(l, -d);
			}
			if(ans) {
				for(Map.Entry<Integer, Long> e : lp.entrySet()) {
					if(e.getKey() != r) {
						rp.put(e.getKey(), e.getValue() - d);
					}
				}
				for(Map.Entry<Integer, Long> e : rp.entrySet()) {
					if(e.getKey() != l) {
						lp.put(e.getKey(), e.getValue() + d);
					}
				}
			}
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

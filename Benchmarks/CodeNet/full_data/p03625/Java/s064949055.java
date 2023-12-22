import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		Map<Long, Integer> map = new HashMap<>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			long l = sc.nextLong();
			if(map.containsKey(l)) {
				map.put(l, map.get(l)+1);
			} else {
				map.put(l, 1);
			}
		}
		long l1 = 0;
		long l2 = 0;
		for(long lo : map.keySet()) {
			int a = map.get(lo);
			if(a >= 4) {
				l1 = Math.max(l1, lo);
				l2 = Math.max(l2, lo);
			} else if(a >= 2) {
				if(l1 > l2) {
					l2 = Math.max(l2, lo);
				} else {
					l1 = Math.max(l1, lo);
				}
			}
		}
		System.out.println(l1*l2);
	}
}
import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		HashMap<Long, Integer> map = new HashMap<>();
		map.put(0L, 1);
		for (int i = 0; i < n ; i++) {
			sum += sc.nextLong();
			Integer x = map.get(sum);
			if (x == null) {
				x = 0;
			}
			map.put(sum, x+ 1);
		}
		int count = 0;
		for (int x : map.values()) {
			if (x >= 2) {
				count += x * (x - 1) / 2;
			}
		}
		System.out.print(count);
	}
			
}

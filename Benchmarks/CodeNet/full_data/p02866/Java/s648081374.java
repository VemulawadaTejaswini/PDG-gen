import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = Long.valueOf(sc.nextLine());

		Map<Long, Long> map = new TreeMap<>();

		for (long i = 0L; i < n; i++) {
			Long input = sc.nextLong();
			if(input != 0L) {
				System.out.println(0);
				return;
			}
			Long c = map.getOrDefault(input, 0L);
			c++;
			map.put(input, c);
		}
		sc.close();
		if (!map.containsKey(0L)) {
			System.out.println(0L);
			return;
		}
		Long before = -1L;
		for (Long key : map.keySet()) {
			if (key != before + 1L) {
				System.out.println(0L);
				return;
			}
			before = key;
		}
		if (map.get(0L) != 1L) {
			System.out.println(0L);
			return;
		}
		Long size = (long) map.values().size();
		Long ans = 1L;
		for (long i = 0L; i < size - 1L; i++) {
			Long a = map.get(i);
			Long b = map.get(i + 1L);
			for (int j = 0; j < b; j++) {
				ans = (ans * a) % 998244353L;
			}
		}
		System.out.println(ans);
	}
}

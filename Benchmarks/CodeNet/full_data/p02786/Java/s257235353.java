import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Map<Long, Long> map = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		sc.close();
		System.out.println(solv(h));
	}

	public static long solv(long h) {

		if (h == 1) {
			return 1;
		}
		if (map.containsKey(h)) {
			return map.get(h);
		}
		map.put(h, solv(h / 2L) * 2L + 1L);
		return map.get(h);
	}
}

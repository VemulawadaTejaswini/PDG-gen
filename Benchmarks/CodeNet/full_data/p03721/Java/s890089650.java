import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		Map<Long,Long> map = new TreeMap<>();
		for(int i = 0; i < n; i++) {
			long key = sc.nextLong();
			long value = sc.nextLong();
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+value);
			} else {
				map.put(key, value);
			}
		}
		for(Long l : map.keySet()) {
			k -= map.get(l);
			if(k <= 0) {
				System.out.println(l);
				return;
			}
		}
	}
}
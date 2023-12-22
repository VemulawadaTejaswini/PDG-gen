import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int i = 0 ; i < n ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(map.containsKey(a)) {
				map.put(a, map.get(a) + b);
			} else {
				map.put(a, b);
			}
		}
		for(int key : map.keySet()) {
			k -= map.get(key);
			if(k <= 0) {
				System.out.println(key);
				return;
			}
		}
	}
}

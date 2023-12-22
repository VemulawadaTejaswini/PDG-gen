import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Map<Integer, Integer> map = new HashMap<>(N);
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (!map.containsKey(a)) {
				map.put(a, b);
			} else {
				int val = map.get(a);
				val += b;
				map.put(a, val);
			}
		}
		
		for (int i = 0; i <= 100_000; i++) {
			if (map.containsKey(i)) {
				K -= map.get(i);
			}
			
			if (K <= 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextInt();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(map.containsKey(a)) {
				int value = map.get(a);
				map.put(a, value + b);
			} else {
				map.put(a, b);
			}
		}
		
		int cnt = 0;
		for(int key : map.keySet()) {
			cnt += map.get(key);
			if(cnt >= K) {
				System.out.println(key);
				return;
			}
		}
	}
}

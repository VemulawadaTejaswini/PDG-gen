import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long K = Long.parseLong(sc.next());
		Map<Integer, Long> map = new TreeMap<Integer, Long>();
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(sc.next());
			long b = Long.parseLong(sc.next());
			if(map.containsKey(a)) {
				b += map.get(a);
			}
			map.put(a, b);
		}
		
		long cnt = 0;
		for(int key : map.keySet()) {
			cnt += map.get(key);
			if(cnt >= K) {
				System.out.println(key);
				return;
			}
		}
	}
}

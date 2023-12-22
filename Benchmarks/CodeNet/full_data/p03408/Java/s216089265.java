import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			if(map.get(str) == null) {
				map.put(str, 1);
			} else {
				int cnt = map.get(str);
				map.put(str, ++cnt);
			}
		}
		int M = Integer.parseInt(sc.next());
		for(int i = 0; i < M; i++) {
			String str = sc.next();
			if(map.get(str) == null) {
				map.put(str, -1);
			} else {
				int cnt = map.get(str);
				map.put(str, --cnt);
			}
		}
		
		int max = 0;
		for(int i : map.values()) {
			max = Math.max(max, i);
		}
		System.out.println(max);
	}
}

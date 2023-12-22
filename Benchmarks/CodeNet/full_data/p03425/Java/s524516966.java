import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String s[] = new String[N];
		Map<Character, Long> map = new HashMap<>();
		map.put('M', 0L);
		map.put('A', 0L);
		map.put('R', 0L);
		map.put('C', 0L);
		map.put('H', 0L);
		for (int i = 0; i < N; i++) {
			char c = sc.next().charAt(0);
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
		}
		int cnt = 0;
		int idx = 0;
		ArrayList<Long> w = new ArrayList<>();
		for (Entry<Character, Long> e : map.entrySet()) {
			if (e.getValue()!=0) {
				w.add(e.getValue());
				cnt++;
				idx++;
			}
		}
		if (cnt<=2) {
			System.out.println(0);
			return;
		}
		long ans = 0;
		if (cnt == 3) {
			ans = 1;
			for (int i = 0; i < w.size(); i++) {
				ans *= w.get(i);
			}
			System.out.println(ans);
			return;
		}

		if (cnt == 4) {
			long tmp = 1;
			for (int i = 0; i < w.size(); i++) {
				tmp *= w.get(i);
			}
			for (int i = 0; i < w.size(); i++) {
				ans += tmp/w.get(i);
			}
			System.out.println(ans);
		}

		int P []={0 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,2};
		int Q []={1 ,1 ,1 ,2 ,2 ,3 ,2 ,2 ,3 ,3};
		int R []={2 ,3 ,4 ,3 ,4 ,4 ,3 ,4 ,4 ,4};

		if (cnt == 5) {
			ans = 1;
			for (int i = 0; i < 10; i++) {
				ans = w.get(P[i])*w.get(Q[i])*w.get(R[i]);
			}
			System.out.println(ans);
		}
	}
}

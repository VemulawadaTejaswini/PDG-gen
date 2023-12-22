import java.util.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int prev = 0;
		int idx = 0;
		int last = 1;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x == prev) {
				continue;
			}
			int count;
			if (map.containsKey(x)) {
				count = (list.get(map.get(x)) + last) % MOD;
			} else {
				count = last;
			}
			map.put(x, idx);
			last = count;
			idx++;
			prev = x;
			list.add(count);
		}
		System.out.println(last);
	}
}

import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt(), t = 0, i = 0, ct = 0;
		Map<Integer, Integer> c = new HashMap<Integer, Integer>();
		while (N-->0) {
			int a = sc.nextInt();
			c.put(a, c.get(a)==null ? 1 : c.get(a)+1);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(c.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1,
				Map.Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		for (Map.Entry<Integer, Integer> e : list) if (++ct>K) t+=e.getValue();
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
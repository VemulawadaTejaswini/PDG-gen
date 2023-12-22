import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int N = sc.nextInt(), t = 0;
		while (N-->0) {
			int a = sc.nextInt();
			m.put(a, m.get(a)==null ? 1 : m.get(a)+1);
		}
		for (int e : m.keySet()) if (e!=m.get(e)) t+=(m.get(e)>e) ? m.get(e)-e : m.get(e);
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
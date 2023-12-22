import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(), s = sc.nextInt(), t=0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i=0; i<=K; i++) {
			for (int j=0; j<=K; j++) {
				m.put(i+j, m.get(i+j)==null ? 1 : m.get(i+j)+1);
			}
		}
		for (int k=0; k<=K; k++) if (m.containsKey(s-k)) t+=m.get(s-k);
		System.out.println(t);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}
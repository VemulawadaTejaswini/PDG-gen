import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Map<Integer, Integer> d = new HashMap<>();
		int cd = 1;
		for(int i = 0; i < n; i++) {
			int din = scan.nextInt();
			if(d.containsKey(din)) {
				cd = d.get(din) + 1;
			} else {
				cd = 1;
			}
			d.put(din, cd);
		}
		int m = scan.nextInt();
		
		Map<Integer, Integer> t = new HashMap<>();
		int ct = 1;
		for(int i = 0; i < m; i++) {
			int tin = scan.nextInt();
			if(t.containsKey(tin)) {
				ct = t.get(tin) + 1;
			} else {
				ct = 1;
			}
			t.put(tin, ct);
		}
		if(n < m) {
			System.out.println("NO");
			return;
		}
		for(var i : t.entrySet()) {
			if(!d.containsKey(i.getKey())) {
				System.out.println("NO");
				return;
			}
			if(d.get(i.getKey()) < i.getValue()) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}

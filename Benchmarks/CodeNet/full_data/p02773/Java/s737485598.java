import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Map<String, Integer> s = new TreeMap<>();
		int c = 0;
		int max = -1;
		for(int i = 0; i < n; i++) {
			String temp = scan.next();
			if(s.containsKey(temp)) {
				c = s.get(temp) + 1;
			} else {
				c = 1;
			}
			s.put(temp, c);
			max = Math.max(max, c);
		}
		for(var i : s.entrySet()) {
			if(i.getValue() == max) {
				System.out.println(i.getKey());
			}
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}

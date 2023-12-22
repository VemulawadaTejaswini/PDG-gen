import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int cnt = 0;
		int n = sc.nextInt();
		int q = sc.nextInt();
		int g[] = new int[n + 2];
		Arrays.fill(g, 1);
		g[0] = 0; g[n + 1] = 0;
		String s = sc.next();
		HashMap<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();
		for(int i = 1; i <= n; i++) {
			char t = s.charAt(i - 1);
			if(!map.containsKey(t)) {
				map.put(t, new ArrayList<Integer>());
			}
			map.get(t).add(i);
		}
		for(int i = 0; i < q; i++) {
			char t = sc.next().charAt(0);
			String d = sc.next();
			int a[] = Arrays.copyOf(g, n + 2);
			if(map.containsKey(t)) {
				for(int j : map.get(t)) {
					if(d.equals("L")) {
						g[j - 1] += a[j];
						g[j] -= a[j];
					}
					else {
						g[j + 1] += a[j];
						g[j] -= a[j];
					}
				}
			}
		}
		System.out.println(n - g[0] - g[n + 1]);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}

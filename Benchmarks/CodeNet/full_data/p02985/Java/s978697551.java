import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prepareFact();
		int num = sc.nextInt();
		int color = sc.nextInt();
		ArrayList<ArrayList<Integer>> connect = new ArrayList<>();
		for(int i = 0; i < num; i ++) {
			connect.add(new ArrayList<Integer>());
		}
		for(int i = 0; i < num - 1; i ++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			connect.get(a).add(b);
			connect.get(b).add(a);
		}
		if(num == 1) {
			System.out.println(color);
			return;
		}
		if(num == 2) {
			System.out.println(mod(color * (color - 1)));
			return;
		}
		if(color == 1) {
			System.out.println(0);
			return;
		}
		if(color == 2) {
			System.out.println(0);
			return;
		}

		long ans = color;
		boolean visited[] = new boolean[num];
		visited[0] = true;
		Deque<Integer> stack = new ArrayDeque<Integer>();
		for(int i = 0; i < connect.get(0).size(); i ++) {
			int crt = connect.get(0).get(i);
			stack.addLast(crt);
			visited[crt] = true;
		}
		ans = mod(ans * permuMod(color - 1, connect.get(0).size()));
		while(!stack.isEmpty()) {
			int root = stack.removeFirst();
			int count = 0;
			for(int i = 0; i < connect.get(root).size(); i ++) {
				int crt = connect.get(root).get(i);
				if(visited[crt]) { continue; }
				stack.addLast(crt);
				visited[crt] = true;
				count ++;
			}
			ans = mod(ans * permuMod(color - 2, count));
		}

		System.out.println(mod(ans));
	}

	static long MOD = (long)Math.pow(10, 9) + 7;
	public static long mod(long i) {
		return i % MOD + ((i % MOD) < 0 ? MOD : 0);
	}
	
	static long powerMod(long x, long y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x;
		} else if (y % 2 == 0) {
			long tmp = powerMod(x, y / 2);
			return mod(tmp * tmp);
		} else {
			long tmp = powerMod(x, y / 2);
			return mod(mod(tmp * tmp) * x);
		}
	}
	
	static long invMod(long x) {
		return powerMod(x, MOD - 2);
	}
	
	static int MAX_FACT = 200_100;
	static long factMod[] = new long[MAX_FACT];
	static void prepareFact() {
		factMod[0] = 1;
		for(int i = 1; i < MAX_FACT; i ++) {
			factMod[i] = mod(factMod[i - 1] * i);
		}
	}
	
	static long combiMod(int n, int r) {
		if(n < 0 || n < r) { return 0; }
		if(r == 0 || r == n) { return 1; }
		return mod(mod(factMod[n] * invMod(factMod[r])) * invMod(factMod[n - r]));
	}

	static long permuMod(int n, int r) {
		if(n < 0 || n < r) { return 0; }
		if(r == 0) { return 1; }
		return mod(factMod[n] * invMod(factMod[n - r]));
	}
}
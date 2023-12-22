import java.util.*;

public class Main {
	
	/*
	 * default function
	 * */	
	int ni() {
		return cin.nextInt();
	}
	
	long nl() {
		return cin.nextLong();
	}
	
	String line() {
		return cin.nextLine();
	}
	
	void println(String str) {	
		System.out.println(str);
	}
	
	void print(String str) {
		System.out.print(str);
	}
	
	/*
	 * default variable
	 */
	
	static final int MOD = 1000000007;
	
	Scanner cin = new Scanner(System.in);	
	String  output;
	
	public static void main(String[] args) {			
		new Main().run();						
	}
	
	/* default above */		
	public void run() {
			
		input();
		/* 
		 * start
		 */	
		
		int cnt = solve();
		
		/*
		 * finish
		 */
		
		output = (cnt % MOD) + "";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int N, M;
	
	Map<Integer, ArrayList<Node>> map;
	
	void input() {
		
		N = ni();
		M = ni();
		
		map = new HashMap<>();
		
		for (int i = 0; i <= N; i ++) {
			map.put(i, new ArrayList<>());
		}
		
		for (int i = 0; i < M; i ++) {
			int l = ni();
			int r = ni();
			int x = ni();
			
			map.get(r).add(new Node(l, x));
		}
	}
	
	boolean check(int r, int g, int b) {
		
		int k = Math.max(r, Math.max(g, b));
		
		for (Node node: map.get(k)) {
			
			int count = 0;
			
			if (r >= node.l) count ++;
			if (g >= node.l) count ++;
			if (b >= node.l) count ++;
			
			if (count != node.x) {
				return false;
			}
		}
		
		return true;
	}
	
	int solve() {
		
		long[][][] dp = new long[N + 2][N + 2][N + 2];
		long cnt = 0;
		
		
		dp[0][0][0] = 1;
		
		for (int r = 0; r <= N; r ++) {
			
			for (int g = 0; g <= N; g ++) {
			
				for (int b = 0; b <= N; b ++) {
					
					if (dp[r][g][b] == 0) {
						continue;
					}
					
					if (!check(r, g, b)) {
						dp[r][g][b] = 0;
						continue;
					}
					
					int k = Math.max(r, Math.max(g, b)) + 1;
					
					if (k - 1 == N) {
						cnt += dp[r][g][b]%MOD;
						cnt %= MOD;
					}
				
					dp[k][g][b] += dp[r][g][b]%MOD;
					dp[r][k][b] += dp[r][g][b]%MOD;
					dp[r][g][k] += dp[r][g][b]%MOD;				
				
				}
			}
		}
						
		return (int)cnt;
	}
	
}


class Node {
	
	public int l, x;
	
	public Node(int l, int x) {
		this.l = l;
		this.x = x;	
	}
}

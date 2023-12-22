import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		a = sc.next();
		b = sc.next();
		
		stringEdit();
		System.out.println(align);
	}

	static int INF = (int)1e9;
	static String a, b;
	static int score;
	
	static String align;
	static StringBuilder sb;
	static Pair[][] parent;
	public static void stringEdit() {
		int n = a.length(), m = b.length();
		int[][] dp = new int[n + 1][m + 1];
		dp[0][0] = 0;
		for(int i = 1; i <= n; i++)
			dp[i][0] = -i;
		for(int i = 1; i <= m; i++)
			dp[0][i] = -i;
		
		parent = new Pair[n + 1][m + 1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				int max = -INF;
				Pair p = new Pair();
				
				int op1 = score(i - 1, j - 1) + dp[i - 1][j - 1]; // match, mismatch
				if(op1 > max) {
					max = op1;
					p.x = i - 1;
					p.y = j - 1;
				}
				
				int op2 = score(-1, j - 1) + dp[i][j - 1]; // add space to a
				if(op2 > max) {
					max = op2;
					p.x = i;
					p.y = j - 1;
					
				}
				
				int op3 = score(i - 1, -1) + dp[i - 1][j]; // delete character from a
				if(op3 > max) {
					max = op3;
					p.x = i - 1;
					p.y = j;
				}
				
				parent[i][j] = p;
				dp[i][j] = max;
			}
		}
		
		score = dp[n][m];
		
		sb = new StringBuilder("");
		construct(n, m);
		align = sb.reverse().toString();
	}
	
	// Classical StringEdit: match = 2, don't match = -1, insert space = -1, delete char = -1
	// LCS: match = 1 (to count the length of the subsequence), don't match = -INF, insert space = delete char = 0
	// Palindromic subsequence: match = 1 (to count the length of the palindrome), don't match = -INF, insert space = 0, delete char = 0
		// one of the strings is going to be the word, the other will be the reverse of the word
	public static int score(int i, int j) {
		if(i == -1 || j == -1)
			return 0;
		if(a.charAt(i) == b.charAt(j))
			return 1;
		return -INF;
	}
	
	public static void construct(int i, int j) {
		if(parent[i][j] == null)
			return;
		Pair p = parent[i][j];
		if(p.x == i - 1) {
			if(p.y == j - 1) {
				sb.append(a.charAt(i - 1));
			}
		}
		construct(p.x, p.y);
	}
	
	public static class Pair {
		int x, y;
		
		public Pair() {}
	}
}

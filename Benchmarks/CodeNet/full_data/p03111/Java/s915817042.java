import java.util.Scanner;

public class Main {
	
	static final int INF = (int)Math.pow(10, 9);
	
	static int N;
	static int A;
	static int B;
	static int C;
	static int[] l;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		l = new int[N];
		
		for (int i = 0; i < N; i++) {
			l[i] = sc.nextInt();
		}
		
		System.out.println(dfs(0, 0, 0, 0));
	}
	
	static int dfs(int cur, int a, int b, int c) {
		if (cur == N) {
			if (Math.min(Math.min(a, b), c) > 0) {
				return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
			} else {
				return INF;
			}
		}
		
		int ret0 = dfs(cur + 1, a, b, c);
		int ret1 = dfs(cur + 1, a + l[cur], b, c) + 10;
		int ret2 = dfs(cur + 1, a, b + l[cur], c) + 10;
		int ret3 = dfs(cur + 1, a, b, c + l[cur]) + 10;
		
		return Math.min(Math.min(ret0, ret1), Math.min(ret2, ret3));
	}
}

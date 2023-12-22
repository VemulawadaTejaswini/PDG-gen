import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		Deque<int[]> q = new ArrayDeque<>();
		
		int[][] A = new int[H+2][W+2];
		for(int i=0;i<A.length;i++) {
			Arrays.fill(A[i], -1);
		}
		for(int i=1;i<=H;i++) {
			String s = sc.next();
			for(int j=1;j<=W;j++) {
				if(s.charAt(j-1) == '#') {
					q.add(new int[] {i,j, 0});
					A[i][j] = 0;
				}
			}
		}
		
		sc.close();
		
		while(!q.isEmpty()) {
			int[] yx = q.poll();
			int y = yx[0];
			int x = yx[1];
			int c = yx[2];

			if(y == 0 || y == H+1 || x==0 || x == W+1) {
				continue;
			}
			if(A[y][x] > 0) {
				//すでに処理済み。
				continue;
			}
			
			A[y][x] = c;
			q.add(new int[] {y+1, x, c+1});
			q.add(new int[] {y-1, x, c+1});
			q.add(new int[] {y, x+1, c+1});
			q.add(new int[] {y, x-1, c+1});
			
		}
		
		int ans = 0;
		for(int i=1;i<=H;i++) {
			for(int j=1;j<=W;j++) {
				ans = Math.max(ans, A[i][j]);
			}
		}
		
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
	
	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}

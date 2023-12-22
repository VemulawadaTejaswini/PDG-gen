import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int[][] a;
	static int maxC = 0;
	
	static void dfs(int h, int w, int c) {
		c += a[h][w];
		
		if (w == n - 1 && h == 1) {
			maxC = Math.max(maxC, c);
		}
		
		if (h < 1) {
			dfs(h + 1, w, c);
		}
		
		if (w < n - 1) {
			dfs(h, w + 1, c);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		a = new int[2][n];
		Arrays.setAll(a[0], i -> sc.nextInt());
		Arrays.setAll(a[1], i -> sc.nextInt());
		
		dfs(0, 0, 0);
		
		System.out.println(maxC);
	}
}

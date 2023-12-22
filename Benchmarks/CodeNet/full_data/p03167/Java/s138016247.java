import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int H;
	static int W;
	static char[][] grid;
	static long[][] memo;



	static void dp(int x, int y) {
		for (int i = 0; i < W; i++) {
			if (grid[0][i] == '#')
				break;
			memo[0][i] = 1;
		}
		for (int i = 0; i < H; i++) {
			if (grid[i][0] == '#')
				break;
			memo[i][0] = 1;
		}
		
		for(int i =1;i<H;i++) {
			for(int k = 1; k<W;k++) {
				if(grid[i][k] =='#') 
					continue;
				memo[i][k] = memo[i-1][k] + memo[i][k-1];
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		grid = new char[H][W];
		memo = new long[H ][W ];
		for (int i = 0; i < H; i++)
			grid[i] = sc.next().toCharArray();
		for (long[] i : memo)
			Arrays.fill(i, 0);
		dp(0, 0);
		System.out.println(memo[H-1][W-1] % ((int) 1e9 + 7));


	}

}
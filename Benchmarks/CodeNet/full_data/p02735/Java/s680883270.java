import java.util.Arrays;
import java.util.Scanner;

class Main {
	// フィールドのサイズ
	static int H;
	static int W;
	
	// マス移動
	static int[] dh = {0, 1};
	static int[] dw = {1, 0};
	
	// そのマスに到達するまでの最小黒マス個数
	static int[][] numBlack;
	
	// dfs試行回数
	static int cnt = 0;
	
	static void dfs(char[][] field, int h, int w, int b) {
		cnt++;
		if (field[h][w] == '#')
			b++;
		
		if (numBlack[h][w] != -1 && b >= numBlack[h][w])
			return;
		
		numBlack[h][w] = b;
		
		// printField(numBlack);
		
		for (int i = 0; i < 2; i++) {
			int nh = h + dh[i];
			int nw = w + dw[i];
			
			if (H <= nh || W <= nw)
				continue;
			
			dfs(field, nh, nw, b);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		
		numBlack = new int[H][W];
		for (int i = 0; i < H; i++)
			Arrays.fill(numBlack[i], -1);
		
		// printField(numBlack);
		
		char[][] field = new char[H][];
		for (int i = 0; i < H; i++) {
			field[i] = sc.next().toCharArray();
		}
		
		// printField(field);
		
		// 探索
		dfs(field, 0, 0, 0);
		
		// 結果
		int ans = numBlack[H - 1][W - 1];
		
		System.out.println(ans);
		
		// System.out.println("cnt:" + cnt);
		
		sc.close();
	}
	
	static void printField(char[][] f) {
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.print(f[i][j]);
			}
			System.out.println();
		}
	}
	
	static void printField(int[][] f) {
		System.out.println();
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.print(f[i][j]);
			}
			System.out.println();
		}
	}
}

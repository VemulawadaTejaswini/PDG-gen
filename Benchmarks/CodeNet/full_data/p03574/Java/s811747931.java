import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt(), i=0, j=0, n=H;
		char[][] g = new char[H][W];
		int[] row = {-1,1,0,0,-1,-1,1,1};
		int[] col = {0,0,-1,1,-1,1,-1,1};
		while (n-->0) {
			j=0;
			for (char ch : sc.next().toCharArray()) g[i][j++]=ch;
			i++;		
		}
		for (i=0; i<H; i++) {
			for (j=0; j<W; j++) {
				if (g[i][j]=='.') {
					int k = 0, t = 0;
					while (k<8) {
						if (i+row[k]>=0 && i+row[k]<H && j+col[k]>=0 && j+col[k]<W) {
							if (g[i+row[k]][j+col[k]]=='#') t++;
						}
						k++;
					}
					g[i][j] = (""+t).charAt(0);
				}
			}
		}
		for (char[] a: g) {
			for (char ch : a) System.out.print(ch);
			System.out.println();
		}
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
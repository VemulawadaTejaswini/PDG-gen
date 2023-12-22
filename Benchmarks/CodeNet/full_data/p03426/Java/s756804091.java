import java.util.Scanner;

public class Main {
	
// initial x=l:	l->(x + d)repeat -> r
	//magic point |x - i| + |y - j| when (x, y)<-(i, j) 
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(), d = sc.nextInt();
		int p[][] = new int[h * w + 1][2];
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				int a = sc.nextInt();
				p[a][0] = i;
				p[a][1] = j;
			}
		}
		int dis[] = new int[h * w + 1];
		for(int i = d + 1; i < h * w + 1; ++i) {
			dis[i] = dis[i - d] + Math.abs(p[i][0] - p[i - d][0]) + Math.abs(p[i][1] - p[i - d][1]);
		}
		int q = sc.nextInt(), ans = 0;
		for (int i = 0; i < q; ++i) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			ans = dis[r] - dis[l];
			System.out.println(ans);
		}
		sc.close();
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char a[][] = new char[H][W];
		for (int i=0;i<H;i++) {
			String s= sc.next();
			for (int j=0;j<W;j++) {
				a[i][j] = s.charAt(j);
			}
		}
		int c[][] = new int[H][W];
		if (a[0][0]=='#') {
			c[0][0] =1;
		}
		for (int i=1;i<H;i++) {
			if (a[i][0]!='#'||a[i-1][0]=='#') {
				c[i][0] = c[i-1][0];
			} else {
				c[i][0] = c[i-1][0] +1;
			}
		}
		for (int i=1;i<W;i++) {
			if (a[0][i]!='#'||a[0][i-1]=='#') {
				c[0][i] = c[0][i-1];
			} else {
				c[0][i] = c[0][i-1] +1;
			}
		}
		for (int i=1;i<H;i++) {
			for (int j=1;j<W;j++) {
				int left=c[i][j-1];
				int up = c[i-1][j];
				if (a[i][j]!='#') {
					c[i][j]=Math.min(c[i-1][j], c[i][j-1]);
				} else  {
					if (a[i-1][j] != '#') {
						up = c[i-1][j] +1;
					}
					if (a[i][j-1] != '#') {
						left = c[i][j-1] +1;
					}
					c[i][j]=Math.min(up,left);
				}
			}
		}
		System.out.println(c[H-1][W-1]);

	}


}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char c[][] = new char[H][W];
		for (int i=0;i<H;i++) {
			String str = sc.next();
			for (int j=0;j<str.length();j++) {
				c[i][j] = str.charAt(j);
			}
		}
		boolean b[][] = new boolean[H][W];
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				b[i][j] = true;
			}
		}
		for (int i=0;i<H;i++) {
			boolean isBlack = false;
			for (int j=0;j<W;j++) {
				if (c[i][j]=='#') {
					isBlack= true;
				}
			}
			if (isBlack = false) {
				for (int j=0;j<W;j++) {
					b[i][j] = false;
				}
			}
		}
		for (int i=0;i<W;i++) {
			boolean isBlack = false;
			for (int j=0;j<H;j++) {
				if (c[j][i]=='#') {
					isBlack= true;
				}
			}
			if (isBlack = false) {
				for (int j=0;j<H;j++) {
					b[j][i] = false;
				}
			}
		}
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				if (b[i][j]==true) {
					System.out.print(c[i][j]);
				}
			}
			System.out.println();
		}
	}
}
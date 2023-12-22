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
		for (int i=0;i<H;i++) {
			boolean isBlack= false;
			for (int j=0;j<W;j++) {
				isBlack= false;
				for (int k=0;k<H;k++) {
					if (c[k][j]=='#') {
						isBlack = true;
						break;
					}
				}
				if (isBlack==false) {
					continue;
				}
				isBlack= false;
				for (int k=0;k<W;k++) {
					if (c[i][k]=='#') {
						isBlack = true;
						break;
					}
				}
				if (isBlack==true ) {
					System.out.print(c[i][j]);
				}
			}
			if (isBlack==true) {
				System.out.println();
			}
		}
	}
}
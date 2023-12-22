import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean[][] a = new boolean[H][W];
		for(int i=0; i<H; i++) {
			String str = sc.next();
			for(int j=0; j<W; j++)
				a[i][j] = str.charAt(j)=='#';
		}

		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				char c = (i==0 || (j<H-1 && (j%2==0 || a[i][j]))) ? '#' : '.';
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				char c = (i==H-1 || (j>0 && (j%2==1 || a[i][j]))) ? '#' : '.';
				System.out.print(c);
			}
			System.out.println();
		}
		
		sc.close();
	}
}

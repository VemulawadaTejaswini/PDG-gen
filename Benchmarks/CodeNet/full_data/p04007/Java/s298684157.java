import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
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
				pw.print((i==0 || (i<H-1 && (j%2==0 || a[i][j]))) ? '#' : '.');
			}
			pw.println();
		}
		pw.println();
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				pw.print((i==H-1 || (i>0 && (j%2==1 || a[i][j]))) ? '#' : '.');
			}
			pw.println();
		}
		
		sc.close();
		pw.close();
	}
}

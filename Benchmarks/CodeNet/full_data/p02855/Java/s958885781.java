
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String s[][] = new String[H][W];
		int count = 1;
		int table[][] = new int[H][W];
		boolean[] row = new boolean[H];
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				s[i][j] = sc.next();
				table[i][j]=0;
			}
		}
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(s[i][j] == "#") {
					row[i] = true;
				}
			}
		}
		boolean first = false;;
		for(int i=0;i<H;i++) {
			if(row[i]) {

				for(int j=0;j<W;j++) {
					table[i][j] = count;
					if(s[i][j] == "#") {
						if(first) {
							count++;
							table[i][j] = count;
						}
						first = true;
					}
				}
				count++;
			}
		}
		for(int i=0;i<H;i++) {
			if(row[i]) {
				for(int j=0;j<W;j++) {
					if(i!=H-1) table[i][j] = table[i+1][j];
					else table[i][j] = table[i-1][j]; 
				}
			}
		}
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println("");
		}

		out.flush();
	}
}
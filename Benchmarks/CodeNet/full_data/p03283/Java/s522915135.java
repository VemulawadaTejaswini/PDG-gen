
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int x[][] = new int [n+1][n+1];
		int c[][] = new int [n+1][n+1];
		int d[][] = new int [n+1][n+1];
		for (int i=0;i<m;i++) 
			x[sc.nextInt()][sc.nextInt()]++;
		
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				c[i][j] = c[i][j-1]+x[i][j];
			}
		}
		
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) 
				d[i][j] = d[i-1][j]+c[i][j];
		}
		
		for (int i=0;i<k;i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			System.out.println(d[q][q] - d[p-1][q] - d[q][p-1] + d[p-1][p-1]);
		}

	}
}

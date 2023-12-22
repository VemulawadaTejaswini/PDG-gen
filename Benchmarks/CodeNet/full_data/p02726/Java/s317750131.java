import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;

		int[][] d = new int[n][n];
		for ( int i=0; i<n; i++ ) {
		for ( int j=0; j<n; j++ ) {
			if ( i==j ) {
				d[i][j] = 0;
			} else if ( i-j==1 || j-i==1 ) {
				d[i][j] = 1;
			} else if ( (i==x && j==y) || (i==y && j==x) ) {
				d[i][j] = 1;
			} else {
				d[i][j] = n;
			}
		}
		}

		for ( int k=0; k<n; k++ ) {
		for ( int i=0; i<n; i++ ) {
		for ( int j=0; j<n; j++ ) {
			d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
		}
		}
		}

		int[] c = new int[n];
		for ( int i=0; i<n; i++ ) {
		for ( int j=i+1; j<n; j++ ) {
			c[d[i][j]]++;
		}
		}

		for ( int i=1; i<n; i++ ) {
			System.out.println(c[i]);
		}
	}
}
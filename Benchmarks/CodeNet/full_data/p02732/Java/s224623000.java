import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] k = new int[n];
		int[] c0 = new int[n];
		int[] c1 = new int[n];
		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextInt() - 1;
			k[a[i]]++;
		}

		long c = 0;
		for ( int i=0; i<n; i++ ) {
			c0[i] = k[i]*(k[i]-1)/2;
			c = c + (long)c0[i];
			if ( k[i]!=0) {
				c1[i] = (k[i]-1)*(k[i]-2)/2;
			}
		}
		for ( int i=0; i<n; i++ ) {
			System.out.println(c-(long)c0[a[i]]+(long)c1[a[i]]);
		}

	}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int[] x = new int[n];

		for ( int i=0; i<n; i++ ) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);

		int[] p = new int[100];
		for ( int i= 0; i<100; i++ ) {
			p[i] = i*i;
		}

		int pmin = 100000000;
		for ( int m=x[0]; m<x[n-1]; m++ ) {
			int pm = 0;
			for ( int i=0; i<n; i++ ) {
				int d = Math.abs(x[i]-m);
				pm = pm + p[d];
			}
			pmin = Math.min(pmin, pm);
		}
		System.out.println(pmin);
	}
}
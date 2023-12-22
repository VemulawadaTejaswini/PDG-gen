import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];

		for ( int i=0; i<n; i++ ) {
			p[i] = sc.nextInt();
		}

		double s = 0.0 ;

		for ( int i=0; i<n-k+1; i++ ) {
			double t = 0.0 ;
			for ( int j=0; j<k; j++ ) {
				double u = ((double)p[i+j] + 1.0)/2.0 ;
				t = t + u ;
			}
			if ( t > s ) {
				s = t ;
			}
		}

		System.out.println(s);
	}
}
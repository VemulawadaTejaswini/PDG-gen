import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		float[] p = new float[n];

		for ( int i=0; i<n; i++ ) {
			p[i] = ((float)sc.nextInt() + 1f)/2f ;
		}

		float s = 0f ;

		for ( int i=0; i<n-k+1; i++ ) {
			float t = 0f ;
			for ( int j=0; j<k; j++ ) {
				t = t + p[i+j] ;
			}
			if ( t > s ) {
				s = t ;
			}
		}

		System.out.println(s);
	}
}
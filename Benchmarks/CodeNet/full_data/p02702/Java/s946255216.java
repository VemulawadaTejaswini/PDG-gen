import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int l = s.length();
		int[] a = new int[l];
		for ( int i=0; i<l; i++ ) {
			a[i] = Integer.valueOf(s.substring(i,i+1));
		}

		int[] b = new int[2019];

		long g = 0;
		for ( int i=0; i<l; i++ ) {
			int r = a[i];
			for ( int j=i+1; j<l; j++ ) {
				if ( b[r]==0 ) {
					b[r] = 2019 - (r*10)%2019;
				}
				if ( a[j] == b[r] ) g++;
				r = (r*10 + a[j])%2019;
			}
		}

		System.out.println(g);
	}
}
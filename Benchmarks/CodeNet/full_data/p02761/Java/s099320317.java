import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[m];
		char[] c = new char[m];
		for (int i=0; i<m; i++ ) {
			s[i] = sc.nextInt()-1;
			String cs = sc.next();
			c[i] = cs.charAt(0);
		}

		int g = -1;
		int mx = (int)Math.pow(10,n);
lb1:		for (int i=0; i<mx; i++ ) {
			String is = String.valueOf(i);
			if ( is.length() != n ) {
				continue;
			}
			int f = 1;
			for ( int j=0; j<m; j++ ) {
				if ( is.charAt(s[j])!=c[j] ) f = 0;
			}
			if ( f == 1 ) {
				g = i;
				break lb1;
			}
		}
		System.out.println(g);
		}
}
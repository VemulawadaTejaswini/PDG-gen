import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ptr = sc.nextInt();
		int pts = sc.nextInt();
		int ptp = sc.nextInt();
		String t = sc.next();

		int pt = 0;
		int[] a = new int[n];

		for ( int i=0; i<k; i++ ) {
			switch ( t.charAt(i) ) {
				case 'r': pt = pt + ptp; break;
				case 's': pt = pt + ptr; break;
				case 'p': pt = pt + pts; break;
				default: break;
			}
		}

		for ( int i=k; i<n; i++ ) {
			if ( t.charAt(i) == t.charAt(i-k) & a[i-k] == 0 ) {
				a[i] = 1;
				continue;
			}
			switch ( t.charAt(i) ) {
				case 'r': pt = pt + ptp; break;
				case 's': pt = pt + ptr; break;
				case 'p': pt = pt + pts; break;
				default: break;
			}
		}
		System.out.println(pt);
	}
}
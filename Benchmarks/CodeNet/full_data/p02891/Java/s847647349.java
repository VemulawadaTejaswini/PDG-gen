import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] s1 = s.toCharArray();
		char[] s2 = s.toCharArray();
		int n = s.length();
		int k = in.nextInt();
		in.close();

		if ( n == 1 ) {
			System.out.println(k / 2);
			return;
		}

		long cnt1 = 0;
		for ( int i = 1; i < n; i++ ) {
			if ( s1[i - 1] == s1[i] ) {
				// System.out.print(i + " ");
				s1[i] = '#';
				cnt1++;
			}
		}

		long cnt2 = 0;
		if ( s2[0] == s1[n - 1] ) {
			s2[0] = '#';
			cnt2++;
		}

		for ( int i = 1; i < n; i++ ) {
			if ( s2[i - 1] == s2[i] ) {
				s2[i] = '#';
				cnt2++;
			}
		}
		if ( s1[0] == s2[n - 1] ) {
			cnt2++;
		}
		// System.out.println(cnt1 + " " + cnt2);
		System.out.println(cnt1 * ((k + 1) / 2) + cnt2 * (k / 2));
	}
}
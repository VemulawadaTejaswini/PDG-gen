import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		sc.close();

		int ok = 0;
		int ng = 0;
		for ( int i = 0 ; i < N - 1 ; i++ ) {
			if ( S.charAt(i) == S.charAt(i + 1) ) {
				ok += 1;
			} else {
				ng += 1;
			}
		}
		if ( ng <= 2 * K ) {
			System.out.println( ok + ng );
		} else {
			System.out.println( ok + 2 * K);
		}
	}
}

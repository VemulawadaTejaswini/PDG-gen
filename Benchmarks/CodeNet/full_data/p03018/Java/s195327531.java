import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		char c[] = s.toCharArray();
		int cnt = 0;

		boolean undone = true;
		while ( undone ) {

			for ( int j = c.length - 1; 2 <= j; j-- ) {
				if ( c[j - 2] == 'A' && c[j - 1] == 'B' && c[j] == 'C' ) {
					c[j - 2] = 'B';
					c[j - 1] = 'C';
					c[j] = 'A';
					cnt++;
				}
			}

			undone = false;
			for ( int j = c.length - 1; 2 <= j; j-- ) {
				if ( c[j - 2] == 'A' && c[j - 1] == 'B' && c[j] == 'C' ) {
					undone = true;
					break;
				}
			}
		}

		System.out.println(cnt);
		in.close();
	}
}
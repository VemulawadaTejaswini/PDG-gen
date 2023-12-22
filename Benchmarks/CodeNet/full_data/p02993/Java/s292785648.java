import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = new char[4];
		s = in.next().toCharArray();

		for ( int i = 0; i + 1 < 4; i++ ) {
			if ( s[i] == s[i + 1] ) {
				System.out.println("Bad");
				return;
			}
		}
		
		System.out.println("Good");
		in.close();
	}
}
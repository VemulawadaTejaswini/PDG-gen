import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();

		String result = "Yes";
		for ( int i = 0; i < s.length; i += 2 ) {
			if ( s[i] == 'L' ) result = "No";
		}
		
		for ( int i = 1; i < s.length; i += 2 ) {
			if ( s[i] == 'R' ) result = "No";
		}

		System.out.println(result);
		in.close();
	}
}

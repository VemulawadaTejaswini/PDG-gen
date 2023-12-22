import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String base = in.next();
		base = base.replace("BC", "X");

		int cntA = 0;
		int answer = 0;
		
		char[] targ = base.toCharArray();
		System.out.println(targ);
		for ( int i = 0; i < targ.length; i++ ) {
			if ( targ[i] == 'A' ) cntA++;
			else if ( targ[i] == 'X' ) answer += cntA;
			else cntA = 0;
		}

		System.out.println(answer);
		in.close();
	}
}

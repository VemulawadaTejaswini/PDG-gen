import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(Main.abbrev(str));
		sc.close();
	}

	static String abbrev(String s) {
		// Ascii code for blank is 32
		StringBuilder sb = new StringBuilder();
		int len = s.length();
		sb.append(s.charAt(0));
		
		for (int i = 1; i < len; i++) {
			if ( s.charAt(i) == ' ' )
				sb.append(s.charAt(++i));
		}
		return sb.toString();
	}
}

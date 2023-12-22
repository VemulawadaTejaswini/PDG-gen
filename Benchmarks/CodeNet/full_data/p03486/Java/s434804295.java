import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = in.nextLine();
		int tLength = t.length();
		int sLength = s.length();

		int sscii = (int) s.charAt(0);
		int tscii = (int) t.charAt(0);
		
		for (int i = 0; i < s.length(); i++) {
			sscii = sscii < s.charAt(i) ? s.charAt(i) : sscii;
		}
		
		int prevsscii = sscii;
		while (s.length() > t.length()) {
			for (int i = 0; i < s.length(); i++) {
				sscii = sscii < s.charAt(i) ? s.charAt(i) : sscii;
			}
			if (sscii == prevsscii) {
				break;
			}
			s.replace((char) sscii, (char) 0);
			System.out.println((char)sscii);

		}
		
		for (int i = 0; i < t.length(); i++) {
			tscii = tscii < t.charAt(i) ? t.charAt(i) : tscii;
		}
		
		int prevtscii = tscii;
		while (t.length() > s.length()) {
			for (int i = 0; i < t.length(); i++) {
				tscii = tscii < t.charAt(i) ? t.charAt(i) : tscii;
			}
			if (tscii == prevtscii) {
				break;
			}
			t.replace((char) tscii, (char) 0);
		} 		
		
		System.out.println((char) sscii);
		System.out.println((char) tscii);
		
		if (sscii < tscii || (sscii == tscii && tLength != sLength)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");

		}
	}

}

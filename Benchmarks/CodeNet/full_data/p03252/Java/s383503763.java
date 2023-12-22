import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		char[] StoT = new char[26];
		char[] TtoS = new char[26];
		for (int i = 0; i < s.length(); i++) {
			// First Observation for every character in S they can only map to one unique
			// character of T
			if (StoT[s.charAt(i) - 'a'] != 0 && StoT[s.charAt(i) - 'a'] != t.charAt(i)) {
				System.out.println("No");
				return;
			}
			// Second Observation for every character in T they can only map to one unique
			// character of S
			if (TtoS[t.charAt(i) - 'a'] != 0 && TtoS[t.charAt(i) - 'a'] != s.charAt(i)) {
				System.out.println("No");
				return;
			}
			StoT[s.charAt(i) - 'a'] = t.charAt(i);
			TtoS[t.charAt(i) - 'a'] = s.charAt(i);
		}
		System.out.println("Yes");
	}
}
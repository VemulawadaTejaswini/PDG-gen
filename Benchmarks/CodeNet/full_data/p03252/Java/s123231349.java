import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		int N = s.length();
		TreeMap<Character, Character> StoT = new TreeMap<>();
		TreeMap<Character, Character> TtoS = new TreeMap<>();
		for (int i = 0; i < N; i++) {
			// First Observation for every character in S they can only map to one unique
			// character of T
			if (StoT.containsKey(s.charAt(i)) && StoT.get(s.charAt(i)) != t.charAt(i)) {
				System.out.println("No");
				return;
			}
			// Second Observation for every character in T they can only map to one unique
			// character of S
			if (TtoS.containsKey(t.charAt(i)) && TtoS.get(t.charAt(i)) != s.charAt(i)) {
				System.out.println("No");
				return;
			}
			StoT.put(s.charAt(i), t.charAt(i));
			TtoS.put(t.charAt(i), s.charAt(i));
		}
		System.out.println("Yes");
	}
}
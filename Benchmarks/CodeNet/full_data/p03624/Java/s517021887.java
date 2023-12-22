import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		String ans = solve();
		System.out.println(ans);
	}
	
	private static String solve() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		Map<Character, Boolean> flags = new TreeMap<>();
		String allChars = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < allChars.length(); i++) {
			flags.put(allChars.charAt(i), false);
		}
		
		for (int i = 0; i < str.length(); i++) {
			flags.put(str.charAt(i), true);
		}
		
		for (Character c : flags.keySet()) {
			if (flags.get(c) == false) return c.toString();
		}
		
		return "None";
	}
}
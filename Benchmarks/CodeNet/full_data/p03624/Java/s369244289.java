import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();
		Set<String> ss = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			ss.add(s.charAt(i) + "");
		}
		String[] sArray = ss.toArray(new String[0]);
		Arrays.sort(sArray);
		for (int i = 0; i < 26; i++) {
			char c = sArray[i].charAt(0);
			if (c - 'a' != i) {
				System.out.println(Character.toChars('a' + i));
				return;
			}
		}
		System.out.println("None");
	}
}
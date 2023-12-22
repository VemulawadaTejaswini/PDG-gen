import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] letters = scanner.nextLine().toCharArray();
		
		boolean[] exits = new boolean[26];
		Arrays.fill(exits, false);
		
		String ans = "yes";
		for (int i = 0; i < letters.length; i++) {
			if (exits[letters[i]-'a']) {
				ans = "no";
				break;
			}
			exits[letters[i]-'a'] = true;
		}
		System.out.println(ans);
		
		scanner.close();
	}
}
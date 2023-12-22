import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();

		int start = -1;
		int end = -1;

		int length = 2;
		for (int i = 0; i < s.length() - length; i++) {
			if (unbalanced(s.substring(i, i+length))) {
				start = i+1;
				end = i + length;
			}
			length++;
		}

		System.out.printf("%d %d\n", start, end);
	}

	public static boolean unbalanced(String s) {
		if (s.length() < 2) return false;
		else {
			int[] alpha = new int[26];	
			for (int i = 0; i < s.length(); i++) {
				alpha[s.charAt(i) - 'a']++;
			}
			Arrays.sort(alpha);

			if (alpha[25] > s.length() / 2) {
				return true;
			}
			else return false;
		}
	}
}
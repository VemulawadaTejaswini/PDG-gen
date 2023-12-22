import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int[] alfa = new int[26];
		for (int i=0; i<S.length(); i++) {
			char c = S.charAt(i);
			alfa[(int)(c-'a')] = 1;
		}
		for (int i=0; i<26; i++) {
			if (alfa[i] == 0) {
				System.out.println((char)(i+'a'));
				return;
			}
		}
		System.out.println("None");
	}
}

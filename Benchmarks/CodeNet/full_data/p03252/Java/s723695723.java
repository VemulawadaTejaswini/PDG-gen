import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		char[] t = sc.nextLine().toCharArray();
		int[] a = new int[26];
		int[] b = new int[26];
		for (int i = 0; i < s.length; i++) {
			a[s[i] - 'a']++;
		}
		for (int i = 0; i < t.length; i++) {
			b[t[i] - 'a']++;
		}

		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str;
		String[] s = new String[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			str = scan.next();
			char[] c = str.toCharArray();
			Arrays.sort(c);
			str = String.valueOf(c);
			s[i] = str;

		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (s[i].equals(s[j])) {
					count++;
				}
			}
		}
		System.out.print(count);
	}
}
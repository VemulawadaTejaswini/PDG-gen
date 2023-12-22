import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int ans = 0;

		String[] str = new String[100000];
		for (int i = 0; i < s.length(); i++) {
			if (i != 0 && s.substring(i, i + 1).equals(s.substring(i - 1, i))) {
				str[i - 1] += s.substring(i, i + 1);
			} else {
				str[i] = s.substring(i, i + 1);
				ans++;
			}
		}

		System.out.println(ans - 1);
	}
}
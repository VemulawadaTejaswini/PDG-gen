import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder ans = new StringBuilder(s);
		for (int i = ans.length() - 2; i >= 0; i--) {
			if (ans.charAt(i + 1) == 'B') {
				if (ans.charAt(i) == 'B' && i != 0) {
					ans.delete(i + 1, i + 2);
				} else if (ans.charAt(i) == 'B' && i == 0) {
					ans.delete(i, i + 2);
				} else {
					ans.delete(i, i + 2);
				}
			}
		}
		System.out.println(ans.toString());
		sc.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'B' || (i < s.length() - 1 && s.charAt(i + 1) == 'B')) {
				continue;
			}
			ans.append(s.charAt(i));
		}
		System.out.println(ans.toString());
		sc.close();
	}
}
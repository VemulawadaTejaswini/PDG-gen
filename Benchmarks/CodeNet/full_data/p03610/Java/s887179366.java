import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				String ss = String.valueOf(c[i]);
				ans += ss;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}

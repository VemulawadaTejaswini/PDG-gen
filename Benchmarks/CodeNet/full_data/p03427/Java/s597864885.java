import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String n = String.valueOf(N);
		boolean f = true;
		for (int i = 1; i < n.length(); i++) {
			if (n.charAt(i) != '9') {
				f = false;
			}
		}
		int ans = Integer.parseInt(n.substring(0, 1));
		for (int i = 1; i < n.length(); i++) {
			ans += 9;
		}
		if (f) {
			System.out.println(ans);
		} else {
			System.out.println(ans - 1);
		}
	}
}

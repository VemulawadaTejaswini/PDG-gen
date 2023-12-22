import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static boolean check(String s) throws IOException {
		int size = s.length();
		if (size % 2 == 1) {
			return false;
		} else {
			for (int i = 0; i < size / 2; i++) {
				if (s.charAt(i) != s.charAt(i + size / 2)) {
					return false;
				}
			}
			return true;
		}
	}

	public static void solve() throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int l = s.length();
		for (int i = 0; i < l; i++) {
			s = s.substring(0, l - 1);
			l = s.length();
			if (check(s) == true) {
				System.out.println(l);
				break;
			}
		}
	}

	public static void main(String[] args) {
		try {
			solve();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

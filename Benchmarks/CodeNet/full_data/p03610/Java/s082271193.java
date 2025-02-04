import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static final void solve() {
		try (Scanner cin = new Scanner(System.in)) {
			String str = cin.next();
			char[] array = str.toCharArray();
			StringBuilder sb = new StringBuilder(array.length / 2);

			for (int i = 0; i < array.length; i += 2) {
				sb.append(array[i]);
			}
			System.out.println(sb.toString());
		} finally {
		}
	}

}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n, ans = "Good";

		n = s.next();
		String m[] = n.split("");

		for (int i = 0; i < m.length - 1; i++) {
			if (m[i].equals(m[i + 1])) {
				ans = "Bad";
			}
		}
		System.out.println(ans);
	}
}

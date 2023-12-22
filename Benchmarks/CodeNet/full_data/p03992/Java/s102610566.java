import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner s) {
		String str = s.next();

		String before = str.substring(0, 4);
		String afeter = str.substring(4);

		System.out.println(before + " " + afeter);

	}
}

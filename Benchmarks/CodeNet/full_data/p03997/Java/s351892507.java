import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner s) {
		System.out.println((s.nextInt() + s.nextInt()) * s.nextInt() / 2);
	}
}

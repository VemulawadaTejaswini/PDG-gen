import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();

		if (Math.abs(a - b) <= d && Math.abs(b - c) <= d)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

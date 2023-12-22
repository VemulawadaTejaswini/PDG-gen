import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int X = scn.nextInt();
			final int Y = scn.nextInt();

			System.out.println(X + Y / 2);
		}
	}
}

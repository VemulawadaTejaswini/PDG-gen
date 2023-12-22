import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		String s = new String();

		// forth
		for (int ny = sy; ny < ty; ny++) {
			s += "U";
		}
		for (int nx = sx; nx < tx; nx++) {
			s += "R";
		}

		// back
		for (int ny = ty; ny > sy; ny--) {
			s += "D";
		}
		for (int nx = tx; nx > sx; nx--) {
			s += "L";
		}

		// forth again
		s += "L";
		for (int ny = sy; ny < ty + 1; ny++) {
			s += "U";
		}
		for (int nx = sx - 1; nx < tx; nx++) {
			s += "R";
		}
		s += "D";

		// back again
		s += "R";
		for (int ny = ty; ny > sy - 1; ny--) {
			s += "D";
		}
		for (int nx = tx + 1; nx > sx; nx--) {
			s += "L";
		}
		s += "U";

		System.out.println(s);
	}

}

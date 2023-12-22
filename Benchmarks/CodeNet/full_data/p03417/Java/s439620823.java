import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int row = stdin.nextInt();
		int column = stdin.nextInt();
		if (row >= 2) {
			row -= 2;
		}
		if (column >= 2) {
			column -= 2;
		}

		System.out.println(row * column);
	}

}

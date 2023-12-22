import java.util.Scanner;

public class ABCSwap {

	public static void Main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int save = 0;

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();

		save = x;
		x = y;
		y = save;

		save = z;
		z = y;
		y = save;

		scanner.close();

	}

}

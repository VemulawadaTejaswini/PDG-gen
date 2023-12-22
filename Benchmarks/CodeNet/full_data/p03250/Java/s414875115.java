import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.nextLine();

		int maxX = toIntStream(sc.nextLine()).max().getAsInt();
		int minY = toIntStream(sc.nextLine()).min().getAsInt();

		int lowerZ = Math.max(X + 1, maxX);
		int upperZ = Math.min(Y + 1, minY);;
		boolean found = false;
		for (int Z = lowerZ; Z <= upperZ; Z++) {
			if (isFulFilled(X, Y, Z, maxX, minY)) {
				found = true;
				break;
			}
		}
		System.out.println(found ? "No War" : "War");
		sc.close();
	}

	private static IntStream toIntStream(String line) {
		return Arrays.stream(line.split(" ", 0)).mapToInt(Integer::parseInt);
	}

	private static boolean isFulFilled(int X, int Y, int Z, int maxX, int minY) {
		if (X >= Z || Z > Y) {
			return false;
		}
		if (maxX >= Z || minY < Z) {
			return false;
		}
		return true;
	}
}
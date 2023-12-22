import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.nextLine();

		int maxX = Arrays.stream(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).max().getAsInt();
		int minY = Arrays.stream(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).min().getAsInt();

		int lowerZ = Math.max(X + 1, maxX);
		int upperZ = Math.min(Y + 1, minY);
		boolean found = false;
		for (int Z = lowerZ; Z <= upperZ; Z++) {
			if (X < Z || Z <= Y || maxX < Z || Z <= minY) {
				found = true;
				break;
			}
		}
		System.out.println(found ? "No War" : "War");
		sc.close();
	}
}
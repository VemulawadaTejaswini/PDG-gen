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
		System.out.println((Math.min(Y, minY) > Math.max(X, maxX) + 1) ? "No War" : "War");
		sc.close();
	}
}
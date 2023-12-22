import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int chocoAmount;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int X = s.nextInt();

		int[] race = new int[N];
		int donuts = 0;
		int result = 0;

		for (int i = 0; i < N; i++) {
			race[i] = s.nextInt();
			donuts += race[i];
		}
		int rest = X - donuts;
		Arrays.sort(race);

		if (race[0]<rest) {
			result = rest / race[0];
			System.out.println(result + N);
		} else {
			System.out.println(N);
		}
	}
}
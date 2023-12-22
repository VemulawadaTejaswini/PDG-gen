import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int[] scannerArray = new int[N];

		for (int index = 0; index < N; index++) {
			scannerArray[index] = scanner.nextInt();
		}

		Arrays.sort(scannerArray);

		double ans = scannerArray[0];

		for(int index =1; index < N; index++) {
			ans = (ans + scannerArray[index]) / 2;
		}
		log(ans);
	}

	private static void log(double str) {
		System.out.println(str);
	}

}


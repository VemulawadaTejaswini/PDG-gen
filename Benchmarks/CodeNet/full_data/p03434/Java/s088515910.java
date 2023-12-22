import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int N = s.nextInt();
		int[] card = new int[N];
		int alice = 0;
		int bob = 0;

		for (int i = 0; i < N; i++) {
			card[i] = s.nextInt();
		}
		Arrays.sort(card);

		for (int i = N - 1; 1<=i ; i--) {
			alice += card[i];
			if (1<=i) {
				bob += card[i-1];
			}
		}

		System.out.println(alice-bob);

	}
}

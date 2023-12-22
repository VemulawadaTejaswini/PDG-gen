import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long M = in.nextLong();
		if (N > M / 2) {
			System.out.println(M / 2);
		} else {
			System.out.println(N + (M - N * 2) / 4);
		}
		in.close();
	}
}
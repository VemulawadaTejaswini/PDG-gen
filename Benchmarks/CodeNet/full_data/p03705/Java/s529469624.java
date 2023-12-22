import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = in.nextInt(), A = in.nextInt(), B = in.nextInt();

		if (A == B && N == 1) {
			System.out.println("1");
		} else if (A > B || (N == 1 && A != B)){
			System.out.println("0");
		} else {
			int min = A * (N - 2);
			int max = B * (N - 2);
			System.out.println(max - min + 1);
		}

	}
}
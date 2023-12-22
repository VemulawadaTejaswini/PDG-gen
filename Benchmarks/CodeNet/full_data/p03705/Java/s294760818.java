import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		if (N < B - A + 1 || A > B) {
			System.out.println(0);
		} else {
			long min = B + A * (N - 1);
			long max = A + B * (N - 1);
			System.out.println(max - min + 1l);
		}
		in.close();
	}
}
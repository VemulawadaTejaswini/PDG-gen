import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int N = sc.nextInt();

		if (N == 100) {
			System.out.println(101 * (int)Math.pow(100, D));

		} else {
			System.out.println(N * (int)Math.pow(100, D));
		}
	}
}

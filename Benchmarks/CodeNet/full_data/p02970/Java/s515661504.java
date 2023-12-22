import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();
		int n = 0;
		int count = 0;

		for (int i = 0; i < N; i++) {
			n += 2 * D + 1;
			count++;

			if (n >= N) {
				System.out.print(count);
				break;
			}
		}
	}
}
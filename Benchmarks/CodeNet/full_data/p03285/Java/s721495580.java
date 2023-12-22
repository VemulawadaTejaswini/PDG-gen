import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i2 = 0; i2 <= 14; i2++) {
			for (int i1 = 0; i1 <= 25; i1++) {
				int n = N - (4 * i1 + 7 * i2);
				if (n == 0) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}
}
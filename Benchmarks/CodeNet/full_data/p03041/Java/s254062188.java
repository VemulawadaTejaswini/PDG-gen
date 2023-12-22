import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		char c[] = S.toCharArray();

		c[K - 1] = Character.toLowerCase(c[K - 1]);

		for (int i = 0; i < N; i++) {
			System.out.print(c[i]);
		}
	}
}

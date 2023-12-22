import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char c[] = S.toCharArray();
		int a = N;
		sc.close();

		for (int i = 0; i < N - 1; i++) {
			if (c[i] == c[i + 1]) {
				a--;
			}
		}
		System.out.println(a);
	}
}

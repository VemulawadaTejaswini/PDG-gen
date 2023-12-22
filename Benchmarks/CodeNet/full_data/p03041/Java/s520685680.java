import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		sc.close();
		char[] c = new char[N];

		for (int i = 0; i < N; i++) {
			c[i] = S.charAt(i);
		}
		if (c[K - 1] == 'A') {
			c[K - 1] = 'a';
		}
		if (c[K - 1] == 'B') {
			c[K - 1] = 'b';
		}
		if (c[K - 1] == 'C') {
			c[K - 1] = 'c';
		}
		for (int i = 0; i < N; i++) {
			System.out.print(c[i]);
		}
	}
}

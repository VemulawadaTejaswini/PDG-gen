import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int i, j, k;
		long sum = 0;
		for (i = 0; i < N; i++) {
			for (j = 0; j < i; j++) {
				for (k = 0; k < j; k++) {
					if (j - i != k - j) {
						char a = S.charAt(i);
						char b = S.charAt(j);
						char c = S.charAt(k);
						if ((a != b) && (b != c) && (c != a)) {
							sum++;
						}
					}
				}
			}
		}

		System.out.println(sum);
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int i = 0;
		int j = 0;
		int k = 0;
		long sum = 0;
		int r = 2;
		for (k = r; k < N; k++) {
			int p = 1;
			for (j = p; j < k; j++) {
				for (i = 0; i < j; i++) {
					if (j - i != k - j) {
						char a = S.charAt(i);
						char b = S.charAt(j);
						char c = S.charAt(k);
						if ((a != b) && (b != c) && (c != a)) {
							sum++;
						}
					}
				}
				p = i;
			}
			r = j;
		}

		System.out.println(sum);
	}
}

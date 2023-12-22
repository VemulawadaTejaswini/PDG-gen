import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String sa = makeString(a, b);
		String sb = makeString(b, a);

		String ans = sa.compareTo(sb) < 0 ? sa : sb;

		System.out.println(ans);

		sc.close();
	}

	static String makeString(int n, int m) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			sb.append(n);
		}
		return sb.toString();
	}

}

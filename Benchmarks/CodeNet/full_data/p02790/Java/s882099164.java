import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String sa = makeString(a);
		String sb = makeString(b);

		String ans = sa.compareTo(sb) < 0 ? sa : sb;

		System.out.println(ans);

		sc.close();
	}

	static String makeString(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(n);
		}
		return sb.toString();
	}

}

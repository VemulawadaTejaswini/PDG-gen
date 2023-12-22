import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt() - 1;
		String S = sc.next();

		char[] c = S.toCharArray();
		String low = String.valueOf(c[K]).toLowerCase();
		c[K] = low.toCharArray()[0];

		System.out.println(String.valueOf(c));

		sc.close();
	}
}

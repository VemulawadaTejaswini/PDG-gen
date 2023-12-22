import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		in.close();
		long num = 1;
		//べき乗について
		for (int i = 0; i < n - 1; i++) {
			num *= (k - 1);
		}

		long ans = num * k;
		System.out.println(ans);

	}
}
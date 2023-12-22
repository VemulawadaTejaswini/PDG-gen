import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int r = 1;

		int m = (int) Math.ceil(Math.log10(k) / Math.log10(2));
		for (int i = 0; i < m; i++) {
			r *= 2;
		}
		for (int i = m; i < n; i++) {
			r += k;
		}

		System.out.println(r);

	}

}

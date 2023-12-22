import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		while (n != 0 && m != 0) {
			n -= 1;
			m -= 2;
			cnt++;
		}
		if (m == 0) {
			System.out.println(cnt);
		}
		if (n == 0) {
			int p = m / 4;
			System.out.println(cnt + p);
		}
	}
}

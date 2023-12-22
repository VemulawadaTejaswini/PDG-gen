import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		if (n == 1) {
			System.out.println(1);
		} else {
			long i2 = 2;
			long i1 = 1;
			long ii = 0;
			for (int i = 2; i <= n; i++) {
				ii = i1 + i2;
				i2 = i1;
				i1 = ii;
			}
			System.out.println(ii);
		}

		sc.close();
	}
}
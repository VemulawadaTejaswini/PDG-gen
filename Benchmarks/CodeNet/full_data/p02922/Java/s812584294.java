import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int m = 1;

		B -= A;
		if (B < 0) {
			B = 0;
		}
		m += B / A;
		if (B % A != 0) {
			m++;
		}
		System.out.println(m);
		sc.close();

	}
}

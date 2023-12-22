import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		scan.close();

		int max;
		if (A > B && A > C) {
			max = A;
		} else if (B > A && B > C) {
			max = B;
		} else {
			max = C;
		}
		int dif = max * 3 - A - B - C;
		System.out.println(dif / 2 + (dif % 2 * 2));
	}
}

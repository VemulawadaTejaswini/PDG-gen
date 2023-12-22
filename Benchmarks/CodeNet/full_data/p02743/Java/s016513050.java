import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();

		if (A > 100000000 || B > 100000000 || C > 100000000) {
			A =A - 1;
			B =B - 1;
			C =C - 1;
		}

		if ((Math.sqrt(A) + Math.sqrt(B)) / Math.sqrt(C) < 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		double d = Math.pow(A, 2) - Math.pow(B, 2);
		double n = 2 * (A - B);
		if (d % n % 2 == 0) {
			System.out.println((int) (d / n));
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

}
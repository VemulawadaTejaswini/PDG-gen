import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = A + B;
		int ans = 0;

		if ( sum <= 24) {
			ans = sum;
		} else {
			ans = sum - 24;
		}
		System.out.println( ans );
	}
}
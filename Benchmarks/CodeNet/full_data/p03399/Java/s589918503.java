import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int ans1 = 0;
		int ans2 = 0;

		if ( A < B ) {
			ans1 = A;
		} else {
			ans1 = B;
		}

		if ( C < D ) {
			ans2 = C;
		} else {
			ans2 = D;
		}
		System.out.println( ans1 + ans2 );
	}
}
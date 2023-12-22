import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int ans = 0;

		if ( A == B ) {
			ans = C;
		} else if ( A == C ) {
			ans = B;
		} else {
			ans = A;
		}

		System.out.println( ans );
	}
}
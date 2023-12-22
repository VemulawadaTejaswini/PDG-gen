import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		String YES = "Yes";
		String NO = "No";
		String ans = NO;
		if ( A == B && A != C ) {
			ans = YES;
		} else if ( A == C && A != B ) {
			ans = YES;
		} else if ( B == C && A != B ) {
			ans = YES;
		}
		System.out.println(ans);
	}
}

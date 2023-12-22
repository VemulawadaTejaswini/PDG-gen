import java.util.Scanner;

public class Main {
	
	public static int max(int A, int B) {
		int ans = A;

		if (B > ans) {
			ans = B;
			B--;
		} else {
			A--;
		}

		if (A >= B) {
			ans += A;
		} else {
			ans += B;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int ans = max(A, B);
		System.out.println(ans);
		scanner.close();
	}
}

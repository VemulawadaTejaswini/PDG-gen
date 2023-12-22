import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int rem = A % B;
		boolean ans = false;
		for (int i = 0; i < 100; i++) {
			if (rem == C) {
				ans = true;
				break;
			}
			rem += A;
			rem %= B;
		}
		if (ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

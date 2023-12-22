import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int ans = 0;
		while (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {
			if (A == B && B == C) {
				ans = -1;
				break;
			}
			int tmpA = A;
			int tmpB = B;
			int tmpC = C;
			A = tmpB / 2 + tmpC / 2;
			B = tmpA / 2 + tmpC / 2;
			C = tmpA / 2 + tmpB / 2;
			ans++;
		}
		System.out.println(ans);
		in.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int ans = 0;

		if (N >= 2) {
			ans += (N * (N-1)) /2;
		}
		if (M >= 2) {
			ans += (M * (M-1)) /2;
		}

		System.out.println(ans);

	}
}
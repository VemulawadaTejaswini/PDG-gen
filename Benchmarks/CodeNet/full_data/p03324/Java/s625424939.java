import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int answer = 0;

		answer = D * 100 * N;


		if (D == 0) {
			System.out.println(N);
		} else {
			System.out.println(answer);
		}
	}
}

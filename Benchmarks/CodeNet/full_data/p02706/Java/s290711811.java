import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		for (int i = 0; i < M; i++) {
			N = N - scan.nextInt();
		}

		if (N >= 0) {
			System.out.println(N);
		} else {
			System.out.println("-1");
		}
		scan.close();
	}
}

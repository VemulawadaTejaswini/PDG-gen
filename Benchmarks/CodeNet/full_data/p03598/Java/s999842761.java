import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int K = sc.nextInt();
		sc.nextLine();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int xi = sc.nextInt();
			int total1 = (xi * 2);
			int total2 = 0;
			if (K - xi < 0) {
				total2 = ((xi - K) * 2);
			} else {
				total2 = ((K - xi) * 2);
			}
			if (total2 < total1) {
				sum += total2;
			} else {
				sum += total1;
			}
		}
		sc.close();
		System.out.println(sum);
	}
}
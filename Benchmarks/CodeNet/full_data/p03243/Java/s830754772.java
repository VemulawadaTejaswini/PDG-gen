import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		while (N < 1000) {
			if (N / 100 == ((N / 10) % 10) && N / 100 == N % 10) {
				System.out.println(N);
				break;
			}
			N += 1;
		}
	}
}
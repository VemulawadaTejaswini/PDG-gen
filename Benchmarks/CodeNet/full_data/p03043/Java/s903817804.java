import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		double result = 0;
		for(int i = 1; i <= N; i++) {
			double a = 1d / N;
			int total = i;
			while(total < K) {
				total *= 2;
				a = a * 0.5;
			}
			result += a;
		}
		System.out.println(result);
	}
}

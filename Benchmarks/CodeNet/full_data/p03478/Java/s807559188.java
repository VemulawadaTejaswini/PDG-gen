import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int A = s.nextInt();
		int B = s.nextInt();

		int sum = 0;
		int resultSum = 0;
		for (int i = 1; i <= N; i++) {
			int result1 = i / 10000;
			int result2 = i % 10000 / 1000;
			int result3 = i % 1000 / 100;
			int result4 = i % 100 / 10;
			int result5 = i % 10;
			resultSum = result1 + result2 + result3 + result4 + result5;

			if (A <= resultSum && resultSum <= B) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}

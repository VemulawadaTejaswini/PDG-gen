import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int min = 101;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int a = in.nextInt();
			sum += a;
			if (a % 10 != 0) {
				min = Math.min(min, a);
			}
		}
		System.out.println(sum % 10 != 0 ? sum : min == 101 ? 0 : sum - min);
		in.close();
	}
}
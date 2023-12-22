import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int res = 0;
		for (int i = 1; i <= N; i++) {
			int sum = 0;
			int value = i;
			while (value > 0) {
				sum += value % 10;
				value /= 10;
			}
			if (A <= sum && sum <= B) {
				res += i;
			}
		}
		System.out.print(res);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long num = 1;
		for (int i = 1; i <= N; i++) {
			num *= i;
			num %= (1000000000 + 7);
		}
		System.out.println(num);
	}
}

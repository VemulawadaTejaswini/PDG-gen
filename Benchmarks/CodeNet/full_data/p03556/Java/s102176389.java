import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long i = 1;
		for (; i * i <= n; i++) {
		}
		System.out.println((i - 1) * (i - 1));
	}
}

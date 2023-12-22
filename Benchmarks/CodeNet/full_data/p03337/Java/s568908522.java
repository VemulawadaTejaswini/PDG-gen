import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int tmp = Math.max(a * b, a + b);
		int max = Math.max(tmp, a - b);

		System.out.println(max);

	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int sum = 0;
		if (n >= 2) {
			sum += n * n / 2 - (n / 2);
		}
		if (m >= 2) {
			sum += m * m / 2 - (m / 2);
		}
		System.out.println(sum);
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = -1;
		int sum = 1;
		int ju = 10;

		while (d != 0) {
			d = n / ju;
			ju *= 10;
			sum += d;
		}

		if (n % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int b = sc.nextInt();
		int r = sc.nextInt();
		int sum = r + b;

		if (b == 0 || total == 0) {
			System.out.println(0);
			return;
		}

		if (total <= sum) {
			System.out.println(b);
			return;
		}

		int mod = total % sum;
		int temp = total - (mod * sum);

		if (b <= temp) {
			System.out.println(mod * b + b);
		} else {
			System.out.println(mod * b + temp);
		}

	}
}

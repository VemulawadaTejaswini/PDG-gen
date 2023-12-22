import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long H = sc.nextLong();
		long W = sc.nextLong();
		sc.close();

		if (H == 1 || W == 1) {
			System.out.println(1);
			return;
		}

		long total = H * W;
		if (total % 2 == 0) {
			System.out.println(total / 2);
		} else {
			System.out.println((int) Math.floor(total / 2) + 1);
		}

	}

}

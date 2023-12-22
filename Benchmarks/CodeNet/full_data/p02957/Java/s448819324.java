import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextInt();
		long b = in.nextInt();

		long sum = a + b;

		if(sum % 2 == 1) {
			System.out.println("IMPOSSIBLE");
			return;
		}

		System.out.println(sum / 2);

		return;
	}
}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		long sum =A * B *C;

		if (sum % 2 == 0) {
			System.out.println(0);
		}else {
			System.out.println(sum - ((A - 1) * B * C));
		}

	}

}

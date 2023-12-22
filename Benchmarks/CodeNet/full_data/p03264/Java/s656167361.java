import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		System.out.println(k % 2 == 0 ? (int)Math.pow(k/2, 2) : k/2 * (k/2 +1));
	}
}
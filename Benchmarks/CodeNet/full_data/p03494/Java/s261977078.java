import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int min = Integer.MAX_VALUE;
		int bit = 0;

		for (int i = 0; i < n; i++) {
			bit = scan.nextInt();
			min = Math.min(min, Integer.numberOfTrailingZeros(bit));
		}
		System.out.println(min);
	}
}

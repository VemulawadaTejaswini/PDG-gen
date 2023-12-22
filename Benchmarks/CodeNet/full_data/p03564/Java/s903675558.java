
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int sum = 1;
		for (int i = 0; i < n; i++) {
			if (sum > k) {
				sum += k;
			} else {
				sum *= 2;
			}
		}
		System.out.println(sum);


	}

}

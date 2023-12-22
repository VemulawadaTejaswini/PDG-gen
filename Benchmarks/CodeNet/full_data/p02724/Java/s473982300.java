import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n % 1000;
		if (n % 500 == 0) {
			System.out.println(n / 500 * 1000);
		} else {
			if (x % 5 == 0) {
				System.out.println(x / 5 * 5 + (n / 500 * 1000));
			} else if (x % 5 != 0) {
				System.out.println((x / 5) * 5 + (n / 500) * 1000);
			}
		}

	}

}

import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;
		int fx = 0;
		while (x > 0) {
			fx += x % 10;
			x /= 10;
		}
		if (n % fx == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

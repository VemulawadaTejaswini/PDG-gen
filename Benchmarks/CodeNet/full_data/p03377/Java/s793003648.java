
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = scanner.nextInt();
		scanner.close();
		if (a < x) {
			if (b >= (x - a)) {
				System.out.println("YES");
				System.exit(0);
			}else {
				System.out.println("NO");
				System.exit(0);
			}
		}
		if (a == x) {
			System.out.println("YES");
		}
		System.out.println("NO");
		
	}
}

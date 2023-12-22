
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		//距離
		int d = scanner.nextInt();
		
		if (Math.abs(a - c) <= d) {
			System.out.println("Yes");
		}else if (Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		scanner.close();

	}

}

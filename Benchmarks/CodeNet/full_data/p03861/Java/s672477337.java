
import java.util.Scanner;

public class Main {
	public static void Main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		if (a != 0) {
			System.out.println(b / x - (a-1) / x);
		} else {
			System.out.println(b / x + 1);
		}
	}
}

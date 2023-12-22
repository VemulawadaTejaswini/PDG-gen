import java.util.Scanner;

public class Main {
	public static void Main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		int c = 0;
		if (a != 0) {
			c =a / x;
		}
			System.out.println(b / x - c);
	}
}

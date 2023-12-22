import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = 0;
		for (int i = 1; i <= b; i++) {
			d = a*i % b;
			if (d == c) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}

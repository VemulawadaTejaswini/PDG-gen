import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int plus = a + b;
		int minus = a - b;
		int kakeru = a * b;
		System.out.println(Math.max(Math.max(plus, minus), kakeru));
	}
}

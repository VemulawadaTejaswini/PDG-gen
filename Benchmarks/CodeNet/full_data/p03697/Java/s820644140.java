import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a+b >= 10 ? "error" : a+b);
		scanner.close();
	}
}

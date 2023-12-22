import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 1 || a > b) {
			System.out.println("Alice");
		} else if (b == 1 || b > a) {
			System.out.println("Bob");
		} else if (a == b) {
			System.out.println("Draw");
		}
	}
}
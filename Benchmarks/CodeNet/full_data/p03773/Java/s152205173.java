import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (a + b > 24) System.out.println(a + b - 24);
		else System.out.println(a + b);
	}
} 
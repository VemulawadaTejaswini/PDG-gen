import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, t;
		Scanner scanner = new Scanner (System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		t = scanner.nextInt();
		
		System.out.println(b*(t/a));
	}
}
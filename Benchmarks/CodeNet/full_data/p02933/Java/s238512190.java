import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String s = scanner.next();
		System.out.println(a >= 3200 ? s : "red");
	}
}
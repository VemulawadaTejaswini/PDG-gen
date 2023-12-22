import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a+b;
		if (result >= 24) {
			result = result - 24;
			System.out.println(result);
		}
		else
			System.out.println(result);
	}
}

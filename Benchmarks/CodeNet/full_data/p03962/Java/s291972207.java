import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
		if (a == b & b == c) {
			System.out.println("1");
		} else if ((a == b & b != c) | (a == c & c != b) | (b == c & c != a)) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
		num.close();
	}
}

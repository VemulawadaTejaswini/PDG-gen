import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int A = s.nextInt();
		int B = s.nextInt();
		int n;
		int x = B - A;
		int y = A - 1;

		n = (x / y) + 1;
		System.out.println(n);
	}
}
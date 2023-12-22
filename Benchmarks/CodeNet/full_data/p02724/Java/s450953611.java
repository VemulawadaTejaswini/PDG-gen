import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int x500 = 0, x5 = 0;
		x500 = X / 500;
		X = X % 500;
		x5 = X / 5;
		System.out.println(x500 * 1000 + x5 * 5);
	}
}
